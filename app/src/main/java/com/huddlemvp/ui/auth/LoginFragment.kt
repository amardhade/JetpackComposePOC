package com.huddlemvp.ui.auth

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.huddlemvp.R
import com.huddlemvp.base.BaseFragment
import com.huddlemvp.data.api.*
import com.huddlemvp.data.model.ValidateEmailResponse
import com.huddlemvp.factory.ViewModelFactory
import com.huddlemvp.viewModels.AuthViewModel

class LoginFragment : BaseFragment() {

    val TAG = "auth: Login"
    private lateinit var mAuthViewModel: AuthViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "onCreateView")
        return inflater.inflate(R.layout.login_fragment, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated")

        initViews(view)
        initViewModels()

    }

    private fun initViewModels() {
        mAuthViewModel =
            ViewModelProvider(this, ViewModelFactory(ApiHelper(RetrofitBuilder.apiService)))
                .get(AuthViewModel::class.java)
    }

    private fun initViews(view: View) {
        val email = view.findViewById<TextView>(R.id.loginFragmentEmailEt)
        val password = view.findViewById<TextView>(R.id.loginFragmentPwdEt)
        password.visibility = View.GONE
        val loginBtn = view.findViewById<TextView>(R.id.loginFragmentLoginBtn)

        loginBtn.setOnClickListener {
            mAuthViewModel.let {
                mAuthViewModel.verifyEmail(email.text.toString().trim())
                    .observe(viewLifecycleOwner, Observer {
                        it?.let { resource ->
                            when (resource.status) {
                                Status.LOADING -> {
                                    Log.d("Response", "loading: ")
                                }
                                Status.SUCCESS -> {
                                    Toast.makeText(activity,"Success: ${resource.data?.email}", Toast.LENGTH_SHORT).show()
                                }
                                Status.API_ERROR -> {
                                    val errorMsg: String = ErrorCodes.getErrorMessage(requireContext(), resource.messageCode)
                                    Toast.makeText(activity,
                                        "Error: $errorMsg", Toast.LENGTH_SHORT).show()
                                }
                                Status.NETWORK_ERROR -> {
                                    Toast.makeText(activity,
                                        "Network Error: ${ resource.message }", Toast.LENGTH_SHORT).show()
                                }
                            }
                        }
                    })
            }
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView")
    }
}