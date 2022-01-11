package com.huddlemvp.data.api

import android.app.Activity
import android.content.Context
import com.huddlemvp.R

class ErrorCodes(context: Context) {

    companion object {
        private lateinit var mErrorCodes: HashMap<Int, Any>
        val PLAYER_INACTIVE = 776
        val PLAYER_EXPIRE = 784
        val PLAYER_DELETE = 793
        val UNKNOWN_ERROR_ID = 404

        fun getErrorMessage(context: Context, messageCode: Int): String {
            if (mErrorCodes.containsKey(messageCode))
                return mErrorCodes.getValue(messageCode) as String
            return context.resources.getString(R.string.something_went_wrong)
        }

        fun initErrorCodes(context: Context) {
            mErrorCodes = hashMapOf(UNKNOWN_ERROR_ID to context.resources.getString(R.string.something_went_wrong),
                776 to context.resources.getString(R.string.inactive_contact_manager),
                784 to context.resources.getString(R.string.inactive_contact_admin),
                793 to context.resources.getString(R.string.email_address_not_registered),
                707 to context.resources.getString(R.string.invalid_credentials),
                2002 to context.resources.getString(R.string.company_could_not_recognize_contact_admin),
                775 to context.resources.getString(R.string.email_address_not_registered),
                717 to context.resources.getString(R.string.email_id_n_pwd_doesnt_match),
                786 to context.resources.getString(R.string.not_associated_to_any_department),
                789 to context.resources.getString(R.string.not_associated_to_any_group),
                831 to context.resources.getString(R.string.password_has_been_reset),
                766 to context.resources.getString(R.string.prblm_with_sending_email)
//                123 to context.resources.getString(R.string.sso_first_name_nt_found),
//                124 to context.resources.getString(R.string.sso_last_name_nt_found),
//                125 to context.resources.getString(R.string.sso_username_name_nt_found),
//                785 to context.resources.getString(R.string.sso_username_name_nt_found_1),
//                126 to context.resources.getString(R.string.sso_email_nt_found),
//                127 to context.resources.getString(R.string.sso_email_is_invalid),
//                834 to context.resources.getString(R.string.feedback_successful),
//                2010 to context.resources.getString(R.string.failed_to_insert_que_feedback),
//                712 to context.resources.getString(R.string.req_game_does_nt_exist),
//                723 to context.resources.getString(R.string.unauthorize_game_access),
//                732 to context.resources.getString(R.string.req_game_does_nt_exist),
//                725 to context.resources.getString(R.string.req_game_does_nt_exist),
//                735 to context.resources.getString(R.string.game_missing_question),
//                721 to context.resources.getString(R.string.req_game_does_nt_exist),
//                722 to context.resources.getString(R.string.req_game_does_nt_exist),
//                835 to context.resources.getString(R.string.error_report_send_successfully),
//                100027 to context.resources.getString(R.string.req_game_does_nt_exist),
//                100036 to context.resources.getString(R.string.req_game_does_nt_exist),
//                820 to context.resources.getString(R.string.profile_updated_successfully),
//                761 to context.resources.getString(R.string.old_pwd_is_wrong),
//                763 to context.resources.getString(R.string.invalid_confirm_new_pwd),
//                764 to context.resources.getString(R.string.pwd_n_new_pwd_does_nt_match),
//                100003 to context.resources.getString(R.string.failed_to_update_profile),
//                778 to context.resources.getString(R.string.enter_new_pwd),
//                779 to context.resources.getString(R.string.enter_confirm_pwd),
//                780 to context.resources.getString(R.string.enter_new_n_confirm_pwd),
//                781 to context.resources.getString(R.string.enter_old_pwd),
//                1234567 to context.resources.getString(R.string.no_internet_connectivity),
//                100059 to context.resources.getString(R.string.old_pwd_is_wrong),
//                3000091 to context.resources.getString(R.string.invalid_link),
//                777 to context.resources.getString(R.string.not_a_valid_identifier),
//                757 to context.resources.getString(R.string.company_could_nt_recognize_with_this_slug),
//                420006 to context.resources.getString(R.string.vip_code_nt_found),
//                420007 to context.resources.getString(R.string.vip_code_expire),
//                301015 to context.resources.getString(R.string.email_already_in_use),
//                420002 to context.resources.getString(R.string.activation_link_expire),
//                420020 to context.resources.getString(R.string.activation_link_invalid),
//                420018 to context.resources.getString(R.string.email_not_activated),
//                131 to context.resources.getString(R.string.contest_no_more_live),
//                319029 to context.resources.getString(R.string.contest_no_more_live),
//                319027 to context.resources.getString(R.string.contest_no_more_live),
//                319107 to context.resources.getString(R.string.contest_no_more_live),
//                301 to context.resources.getString(R.string.contest_no_more_live),
//                456 to context.resources.getString(R.string.attempt_already_consumed),
//                440101 to context.resources.getString(R.string.req_game_does_nt_exist),
//                3000031 to context.resources.getString(R.string.max_limit_msg),
//                420021 to context.resources.getString(R.string.limited_access_expired)

            )
        }
    }
}