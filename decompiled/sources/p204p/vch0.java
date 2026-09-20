package p204p;

import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class vch0 implements xt91 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f240133a;

    /* JADX INFO: renamed from: b */
    public final st91 f240134b;

    /* JADX INFO: renamed from: c */
    public final zt91 f240135c;

    public vch0(int i, st91 st91Var, int i2) {
        this.f240133a = i2;
        String str = "ad_partners";
        String str2 = "data_saver_mode";
        switch (i2) {
            case 2:
                this.f240134b = st91Var;
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-settings-element-standard-navigation";
                yt91VarM50626j.f276052f = "22.0.0";
                yt91VarM50626j.f276053g = "20.0.5";
                switch (i) {
                    case 1:
                        str = "about_page";
                        break;
                    case 2:
                        str = "account_overview";
                        break;
                    case 3:
                        str = "account_page";
                        break;
                    case 4:
                        break;
                    case 5:
                        str = "address";
                        break;
                    case 6:
                        str = "advertisements_page";
                        break;
                    case 7:
                        str = "age_assurance";
                        break;
                    case 8:
                        str = "app_icon";
                        break;
                    case 9:
                        str = "app_language";
                        break;
                    case 10:
                        str = "apps_and_devices_page";
                        break;
                    case 11:
                        str = "apps_navigation_page";
                        break;
                    case 12:
                        str = "audio_quality_page";
                        break;
                    case 13:
                        str = "australia_online_safety_act";
                        break;
                    case 14:
                        str = "blocked_users_list";
                        break;
                    case 15:
                        str = "business_information";
                        break;
                    case 16:
                        str = "cancel_plan";
                        break;
                    case 17:
                        str = "car_page";
                        break;
                    case 18:
                        str = "car_thing";
                        break;
                    case 19:
                        str = "content_and_display_page";
                        break;
                    case 20:
                        str = "content_preferences_page";
                        break;
                    case 21:
                        str = "cookies";
                        break;
                    case 22:
                        str = "data_saver_page";
                        break;
                    case 23:
                        str = "data_saving_and_offline_page";
                        break;
                    case 24:
                        str = "debug_tools";
                        break;
                    case 25:
                        str = "device_picker";
                        break;
                    case 26:
                        str = "devices_page";
                        break;
                    case 27:
                        str = "employee_tools_page";
                        break;
                    case 28:
                        str = "equalizer";
                        break;
                    case 29:
                        str = "german_ownership_statement";
                        break;
                    case 30:
                        str = "initiate_graduation_page";
                        break;
                    case 31:
                        str = "languages_page";
                        break;
                    case 32:
                        str = "legal_contact_form";
                        break;
                    case 33:
                        str = "library_import";
                        break;
                    case 34:
                        str = "licenses";
                        break;
                    case 35:
                        str = "licensing_info";
                        break;
                    case 36:
                        str = "listening_activity_audience";
                        break;
                    case 37:
                        str = "local_files_page";
                        break;
                    case 38:
                        str = "login_methods";
                        break;
                    case 39:
                        str = "manage_apps";
                        break;
                    case 40:
                        str = "manage_playlists_privacy";
                        break;
                    case 41:
                        str = "media_quality_page";
                        break;
                    case 42:
                        str = "music_language";
                        break;
                    case 43:
                        str = "notice_at_collection";
                        break;
                    case 44:
                        str = "notifications_page";
                        break;
                    case 45:
                        str = "parental_controls_change_pin";
                        break;
                    case 46:
                        str = "parental_controls_create_account";
                        break;
                    case 47:
                        str = "parental_controls_page";
                        break;
                    case 48:
                        str = "personal_data_download";
                        break;
                    case 49:
                        str = "plan_manager_privacy_policy";
                        break;
                    case 50:
                        str = "platform_rules";
                        break;
                    case 51:
                        str = "playback_page";
                        break;
                    case 52:
                        str = "preferred_ad_categories";
                        break;
                    case 53:
                        str = "premium_plans_upsell";
                        break;
                    case 54:
                        str = "privacy_and_social_page";
                        break;
                    case 55:
                        str = "privacy_policy";
                        break;
                    case 56:
                        str = "profile_view_all_privacy_settings";
                        break;
                    case 57:
                        str = "report_bug";
                        break;
                    case 58:
                        str = "report_user_feedback";
                        break;
                    case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                        str = "request_graduation_page";
                        break;
                    case 60:
                        str = "scta_info";
                        break;
                    case 61:
                        str = "sensitive_ad_categories";
                        break;
                    case 62:
                        str = "storage_location";
                        break;
                    case 63:
                        str = "storage_page";
                        break;
                    case 64:
                        str = "support";
                        break;
                    case 65:
                        str = "terms_and_conditions";
                        break;
                    case 66:
                        str = "update_email";
                        break;
                    case 67:
                        str = "video_quality_page";
                        break;
                    case 68:
                        str = "voice_assistants_page";
                        break;
                    default:
                        throw null;
                }
                yt91VarM50626j.f276048b = str;
                this.f240135c = yt91VarM50626j.m94607a();
                return;
            case 3:
                this.f240134b = st91Var;
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-settings-element-standard-switch";
                yt91VarM50626j2.f276052f = "24.0.0";
                yt91VarM50626j2.f276053g = "20.0.5";
                switch (i) {
                    case 1:
                        break;
                    case 2:
                        str = "allow_audio_quality_downgrade";
                        break;
                    case 3:
                        str = "automix";
                        break;
                    case 4:
                        str = "autoplay";
                        break;
                    case 5:
                        str = "background_downloads";
                        break;
                    case 6:
                        str = "canvas";
                        break;
                    case 7:
                        str = "chats";
                        break;
                    case 8:
                        str = "chats_played_receipts";
                        break;
                    case 9:
                        str = "chats_saved_receipts";
                        break;
                    case 10:
                        str = "chats_seen_receipts";
                        break;
                    case 11:
                        str = "chats_show_suggestions";
                        break;
                    case 12:
                        str = "chats_show_up_in_suggestions";
                        break;
                    case 13:
                        str = "connect_in_background";
                        break;
                    case 14:
                        str = "create_button";
                        break;
                    case 15:
                        str = "data_saver_mode";
                        break;
                    case 16:
                        str = "device_broadcast_status";
                        break;
                    case 17:
                        str = "disable_personalized_recommendations";
                        break;
                    case 18:
                        str = "dj_voice_improvements";
                        break;
                    case 19:
                        str = "download_over_3g";
                        break;
                    case 20:
                        str = "dynamic_normalizer";
                        break;
                    case 21:
                        str = "explicit_content";
                        break;
                    case 22:
                        str = "feedback_sounds";
                        break;
                    case 23:
                        str = "gapless";
                        break;
                    case 24:
                        str = "hide_unplayable_songs";
                        break;
                    case 25:
                        str = "kids_family_exclude";
                        break;
                    case 26:
                        str = "larger_npb_video";
                        break;
                    case 27:
                        str = "list_privacy";
                        break;
                    case 28:
                        str = "local_files_library";
                        break;
                    case 29:
                        str = "mono_audio";
                        break;
                    case 30:
                        str = "music_videos";
                        break;
                    case 31:
                        str = "normalize_volume";
                        break;
                    case 32:
                        str = "offline_mode";
                        break;
                    case 33:
                        str = "offline_playback";
                        break;
                    case 34:
                        str = "on_the_fly_normalizer";
                        break;
                    case 35:
                        str = "other_videos";
                        break;
                    case 36:
                        str = "picture_in_picture";
                        break;
                    case 37:
                        str = "prevent_screen_lock_in_car";
                        break;
                    case 38:
                        str = "private_session";
                        break;
                    case 39:
                        str = "publish_list_to_profile";
                        break;
                    case 40:
                        str = "publish_listening_activity";
                        break;
                    case 41:
                        str = "reduce_distractions";
                        break;
                    case 42:
                        str = "shake_to_report_feedback";
                        break;
                    case 43:
                        str = "show_followers_following";
                        break;
                    case 44:
                        str = "show_local_devices_only";
                        break;
                    case 45:
                        str = "show_playlists_section_on_profile";
                        break;
                    case 46:
                        str = "show_recently_played_artists";
                        break;
                    case 47:
                        str = "show_unplayable_songs";
                        break;
                    case 48:
                        str = "silence_trimmer";
                        break;
                    case 49:
                        str = "smart_shuffle";
                        break;
                    case 50:
                        str = "video_podcasts_download_audio_only";
                        break;
                    case 51:
                        str = "video_podcasts_stream_audio_only";
                        break;
                    case 52:
                        str = "view_listening_activity";
                        break;
                    case 53:
                        str = "voice_assistant_suggestions";
                        break;
                    default:
                        throw null;
                }
                yt91VarM50626j2.f276048b = str;
                this.f240135c = yt91VarM50626j2.m94607a();
                return;
            default:
                this.f240134b = st91Var;
                zt91 zt91Var3 = zt91.f286105i;
                yt91 yt91VarM50626j3 = ihf1.m50626j();
                yt91VarM50626j3.f276054h = "music";
                yt91VarM50626j3.f276047a = "mobile-settings-element-standard-multiplechoice";
                yt91VarM50626j3.f276052f = "4.0.0";
                yt91VarM50626j3.f276053g = "20.0.5";
                switch (i) {
                    case 1:
                        break;
                    case 2:
                        str2 = "download_quality";
                        break;
                    case 3:
                        str2 = "metered_audio_stream_quality";
                        break;
                    case 4:
                        str2 = "metered_video_quality";
                        break;
                    case 5:
                        str2 = "non_metered_audio_stream_quality";
                        break;
                    case 6:
                        str2 = "non_metered_video_quality";
                        break;
                    case 7:
                        str2 = "remote_audio_stream_quality";
                        break;
                    case 8:
                        str2 = "volume_level";
                        break;
                    default:
                        throw null;
                }
                yt91VarM50626j3.f276048b = str2;
                this.f240135c = yt91VarM50626j3.m94607a();
                return;
        }
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        int i = this.f240133a;
        st91 st91Var = this.f240134b;
        zt91 zt91Var = this.f240135c;
        switch (i) {
            case 0:
                st91 st91Var2 = st91.f213865b;
                ArrayList arrayList = new ArrayList();
                if (st91Var != null) {
                    arrayList.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList, zt91Var, arrayList);
            case 1:
                st91 st91Var3 = st91.f213865b;
                ArrayList arrayList2 = new ArrayList();
                if (st91Var != null) {
                    arrayList2.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList2, zt91Var, arrayList2);
            case 2:
                st91 st91Var4 = st91.f213865b;
                ArrayList arrayList3 = new ArrayList();
                if (st91Var != null) {
                    arrayList3.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList3, zt91Var, arrayList3);
            case 3:
                st91 st91Var5 = st91.f213865b;
                ArrayList arrayList4 = new ArrayList();
                if (st91Var != null) {
                    arrayList4.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList4, zt91Var, arrayList4);
            case 4:
                st91 st91Var6 = st91.f213865b;
                ArrayList arrayList5 = new ArrayList();
                if (st91Var != null) {
                    arrayList5.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList5, zt91Var, arrayList5);
            case 5:
                st91 st91Var7 = st91.f213865b;
                ArrayList arrayList6 = new ArrayList();
                if (st91Var != null) {
                    arrayList6.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList6, zt91Var, arrayList6);
            case 6:
                st91 st91Var8 = st91.f213865b;
                ArrayList arrayList7 = new ArrayList();
                if (st91Var != null) {
                    arrayList7.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList7, zt91Var, arrayList7);
            case 7:
                st91 st91Var9 = st91.f213865b;
                ArrayList arrayList8 = new ArrayList();
                if (st91Var != null) {
                    arrayList8.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList8, zt91Var, arrayList8);
            case 8:
                st91 st91Var10 = st91.f213865b;
                ArrayList arrayList9 = new ArrayList();
                if (st91Var != null) {
                    arrayList9.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList9, zt91Var, arrayList9);
            case 9:
                st91 st91Var11 = st91.f213865b;
                ArrayList arrayList10 = new ArrayList();
                arrayList10.addAll(st91Var.f213866a);
                ofg1.m66846o(zt91Var, "location");
                arrayList10.add(zt91Var);
                return new st91(arrayList10);
            case 10:
                st91 st91Var12 = st91.f213865b;
                ArrayList arrayList11 = new ArrayList();
                arrayList11.addAll(st91Var.f213866a);
                ofg1.m66846o(zt91Var, "location");
                arrayList11.add(zt91Var);
                return new st91(arrayList11);
            case 11:
                st91 st91Var13 = st91.f213865b;
                ArrayList arrayList12 = new ArrayList();
                arrayList12.addAll(st91Var.f213866a);
                ofg1.m66846o(zt91Var, "location");
                arrayList12.add(zt91Var);
                return new st91(arrayList12);
            case 12:
                st91 st91Var14 = st91.f213865b;
                ArrayList arrayList13 = new ArrayList();
                arrayList13.addAll(st91Var.f213866a);
                ofg1.m66846o(zt91Var, "location");
                arrayList13.add(zt91Var);
                return new st91(arrayList13);
            case 13:
                st91 st91Var15 = st91.f213865b;
                ArrayList arrayList14 = new ArrayList();
                if (st91Var != null) {
                    arrayList14.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList14, zt91Var, arrayList14);
            case 14:
                st91 st91Var16 = st91.f213865b;
                ArrayList arrayList15 = new ArrayList();
                if (st91Var != null) {
                    arrayList15.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList15, zt91Var, arrayList15);
            case 15:
                st91 st91Var17 = st91.f213865b;
                ArrayList arrayList16 = new ArrayList();
                if (st91Var != null) {
                    arrayList16.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList16, zt91Var, arrayList16);
            case 16:
                st91 st91Var18 = st91.f213865b;
                ArrayList arrayList17 = new ArrayList();
                if (st91Var != null) {
                    arrayList17.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList17, zt91Var, arrayList17);
            case 17:
                st91 st91Var19 = st91.f213865b;
                ArrayList arrayList18 = new ArrayList();
                if (st91Var != null) {
                    arrayList18.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList18, zt91Var, arrayList18);
            case 18:
                st91 st91Var20 = st91.f213865b;
                ArrayList arrayList19 = new ArrayList();
                if (st91Var != null) {
                    arrayList19.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList19, zt91Var, arrayList19);
            case 19:
                st91 st91Var21 = st91.f213865b;
                ArrayList arrayList20 = new ArrayList();
                arrayList20.addAll(st91Var.f213866a);
                ofg1.m66846o(zt91Var, "location");
                arrayList20.add(zt91Var);
                return new st91(arrayList20);
            case 20:
                st91 st91Var22 = st91.f213865b;
                ArrayList arrayList21 = new ArrayList();
                if (st91Var != null) {
                    arrayList21.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList21, zt91Var, arrayList21);
            case 21:
                st91 st91Var23 = st91.f213865b;
                ArrayList arrayList22 = new ArrayList();
                if (st91Var != null) {
                    arrayList22.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList22, zt91Var, arrayList22);
            case 22:
                st91 st91Var24 = st91.f213865b;
                ArrayList arrayList23 = new ArrayList();
                if (st91Var != null) {
                    arrayList23.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList23, zt91Var, arrayList23);
            case 23:
                st91 st91Var25 = st91.f213865b;
                ArrayList arrayList24 = new ArrayList();
                if (st91Var != null) {
                    arrayList24.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList24, zt91Var, arrayList24);
            default:
                st91 st91Var26 = st91.f213865b;
                ArrayList arrayList25 = new ArrayList();
                if (st91Var != null) {
                    arrayList25.addAll(st91Var.f213866a);
                }
                return xl81.m91404m(zt91Var, "location", arrayList25, zt91Var, arrayList25);
        }
    }

    public vch0(Integer num, String str, st91 st91Var) {
        this.f240133a = 13;
        this.f240134b = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-smart-shuffle-track-row-recs";
        yt91VarM50626j.f276052f = "2.0.0";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276049c = num;
        yt91VarM50626j.f276050d = str;
        this.f240135c = yt91VarM50626j.m94607a();
    }

    public vch0(st91 st91Var, int i) {
        this.f240133a = i;
        switch (i) {
            case 4:
                this.f240134b = st91Var;
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "mobile-settings-item-deletecache";
                yt91VarM50626j.f276052f = "1.0.0";
                yt91VarM50626j.f276053g = "20.0.5";
                this.f240135c = yt91VarM50626j.m94607a();
                break;
            case 5:
                this.f240134b = st91Var;
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-settings-item-offlineplayback";
                yt91VarM50626j2.f276052f = "1.0.0";
                yt91VarM50626j2.f276053g = "20.0.5";
                this.f240135c = yt91VarM50626j2.m94607a();
                break;
            case 6:
                this.f240134b = st91Var;
                zt91 zt91Var3 = zt91.f286105i;
                yt91 yt91VarM50626j3 = ihf1.m50626j();
                yt91VarM50626j3.f276054h = "music";
                yt91VarM50626j3.f276047a = "mobile-settings-item-removedownloads";
                yt91VarM50626j3.f276052f = "1.0.0";
                yt91VarM50626j3.f276053g = "20.0.5";
                this.f240135c = yt91VarM50626j3.m94607a();
                break;
            case 7:
                this.f240134b = st91Var;
                zt91 zt91Var4 = zt91.f286105i;
                yt91 yt91VarM50626j4 = ihf1.m50626j();
                yt91VarM50626j4.f276054h = "music";
                yt91VarM50626j4.f276047a = "mobile-settings-shuffle";
                yt91VarM50626j4.f276052f = "0.1.0";
                yt91VarM50626j4.f276053g = "20.0.5";
                this.f240135c = yt91VarM50626j4.m94607a();
                break;
            case 8:
                this.f240134b = st91Var;
                zt91 zt91Var5 = zt91.f286105i;
                yt91 yt91VarM50626j5 = ihf1.m50626j();
                yt91VarM50626j5.f276054h = "music";
                yt91VarM50626j5.f276047a = "mobile-share-sheet-on-platform-section";
                yt91VarM50626j5.f276052f = "2.0.1";
                yt91VarM50626j5.f276053g = "20.0.5";
                this.f240135c = yt91VarM50626j5.m94607a();
                break;
            case 9:
                this.f240134b = st91Var;
                zt91 zt91Var6 = zt91.f286105i;
                yt91 yt91VarM50626j6 = ihf1.m50626j();
                yt91VarM50626j6.f276054h = "music";
                yt91VarM50626j6.f276047a = "mobile-share-sheet-tool-chapter-selector";
                yt91VarM50626j6.f276052f = "4.0.1";
                yt91VarM50626j6.f276053g = "20.0.5";
                this.f240135c = yt91VarM50626j6.m94607a();
                break;
            case 10:
                this.f240134b = st91Var;
                zt91 zt91Var7 = zt91.f286105i;
                yt91 yt91VarM50626j7 = ihf1.m50626j();
                yt91VarM50626j7.f276054h = "music";
                yt91VarM50626j7.f276047a = "mobile-share-sheet-tool-collaborators-toggle";
                yt91VarM50626j7.f276052f = "3.0.1";
                yt91VarM50626j7.f276053g = "20.0.5";
                this.f240135c = yt91VarM50626j7.m94607a();
                break;
            case 11:
                this.f240134b = st91Var;
                zt91 zt91Var8 = zt91.f286105i;
                yt91 yt91VarM50626j8 = ihf1.m50626j();
                yt91VarM50626j8.f276054h = "music";
                yt91VarM50626j8.f276047a = "mobile-share-sheet-tool-media-trimmer";
                yt91VarM50626j8.f276052f = "3.0.1";
                yt91VarM50626j8.f276053g = "20.0.5";
                this.f240135c = yt91VarM50626j8.m94607a();
                break;
            case 12:
                this.f240134b = st91Var;
                zt91 zt91Var9 = zt91.f286105i;
                yt91 yt91VarM50626j9 = ihf1.m50626j();
                yt91VarM50626j9.f276054h = "music";
                yt91VarM50626j9.f276047a = "mobile-share-sheet-tool-swatch";
                yt91VarM50626j9.f276052f = "4.0.1";
                yt91VarM50626j9.f276053g = "20.0.5";
                this.f240135c = yt91VarM50626j9.m94607a();
                break;
            case 13:
            case 14:
            case 16:
            default:
                this.f240134b = st91Var;
                zt91 zt91Var10 = zt91.f286105i;
                yt91 yt91VarM50626j10 = ihf1.m50626j();
                yt91VarM50626j10.f276054h = "music";
                yt91VarM50626j10.f276047a = "mobile-settings-element-standard-footnote";
                yt91VarM50626j10.f276052f = "2.0.0";
                yt91VarM50626j10.f276053g = "20.0.5";
                yt91VarM50626j10.f276048b = "privacy_settings_web";
                this.f240135c = yt91VarM50626j10.m94607a();
                break;
            case 15:
                this.f240134b = st91Var;
                zt91 zt91Var11 = zt91.f286105i;
                yt91 yt91VarM50626j11 = ihf1.m50626j();
                yt91VarM50626j11.f276054h = "music";
                yt91VarM50626j11.f276047a = "mobile-sponsoredplaylist-npb-attachment";
                yt91VarM50626j11.f276052f = "0.1.0";
                yt91VarM50626j11.f276053g = "20.0.5";
                this.f240135c = yt91VarM50626j11.m94607a();
                break;
            case 17:
                this.f240134b = st91Var;
                zt91 zt91Var12 = zt91.f286105i;
                yt91 yt91VarM50626j12 = ihf1.m50626j();
                yt91VarM50626j12.f276054h = "music";
                yt91VarM50626j12.f276047a = "mobile-wrapped-your-top-songs";
                yt91VarM50626j12.f276052f = "1.0.0";
                yt91VarM50626j12.f276053g = "20.0.5";
                this.f240135c = yt91VarM50626j12.m94607a();
                break;
            case 18:
                this.f240134b = st91Var;
                zt91 zt91Var13 = zt91.f286105i;
                yt91 yt91VarM50626j13 = ihf1.m50626j();
                yt91VarM50626j13.f276054h = "music";
                yt91VarM50626j13.f276047a = "mobile-xr-glasses-touch-controls";
                yt91VarM50626j13.f276052f = "2.1.0";
                yt91VarM50626j13.f276053g = "20.0.5";
                this.f240135c = yt91VarM50626j13.m94607a();
                break;
            case 19:
                this.f240134b = st91Var;
                zt91 zt91Var14 = zt91.f286105i;
                yt91 yt91VarM50626j14 = ihf1.m50626j();
                yt91VarM50626j14.f276054h = "music";
                yt91VarM50626j14.f276047a = "mobile-your-library-confirmation-dialog";
                yt91VarM50626j14.f276052f = "0.1.0";
                yt91VarM50626j14.f276053g = "20.0.5";
                this.f240135c = yt91VarM50626j14.m94607a();
                break;
            case 20:
                this.f240134b = st91Var;
                zt91 zt91Var15 = zt91.f286105i;
                yt91 yt91VarM50626j15 = ihf1.m50626j();
                yt91VarM50626j15.f276054h = "music";
                yt91VarM50626j15.f276047a = "mobile-your-library-import-match-results";
                yt91VarM50626j15.f276052f = "1.1.0";
                yt91VarM50626j15.f276053g = "20.0.5";
                this.f240135c = yt91VarM50626j15.m94607a();
                break;
            case 21:
                this.f240134b = st91Var;
                zt91 zt91Var16 = zt91.f286105i;
                yt91 yt91VarM50626j16 = ihf1.m50626j();
                yt91VarM50626j16.f276054h = "music";
                yt91VarM50626j16.f276047a = "mobile-your-library-messaging-hide-your-library-item-message";
                yt91VarM50626j16.f276052f = "0.1.0";
                yt91VarM50626j16.f276053g = "20.0.5";
                this.f240135c = yt91VarM50626j16.m94607a();
                break;
            case 22:
                this.f240134b = st91Var;
                zt91 zt91Var17 = zt91.f286105i;
                yt91 yt91VarM50626j17 = ihf1.m50626j();
                yt91VarM50626j17.f276054h = "music";
                yt91VarM50626j17.f276047a = "mobile-your-listening-sharing";
                yt91VarM50626j17.f276052f = "3.0.0";
                yt91VarM50626j17.f276053g = "20.0.5";
                this.f240135c = yt91VarM50626j17.m94607a();
                break;
            case 23:
                this.f240134b = st91Var;
                zt91 zt91Var18 = zt91.f286105i;
                yt91 yt91VarM50626j18 = ihf1.m50626j();
                yt91VarM50626j18.f276054h = "music";
                yt91VarM50626j18.f276047a = "mobile-your-listening-stats-tiles";
                yt91VarM50626j18.f276052f = "2.0.1";
                yt91VarM50626j18.f276053g = "20.0.5";
                this.f240135c = yt91VarM50626j18.m94607a();
                break;
        }
    }

    public vch0(int i) {
        this.f240133a = i;
        switch (i) {
            case 24:
                this.f240134b = st91.f213865b;
                zt91 zt91Var = zt91.f286105i;
                yt91 yt91VarM50626j = ihf1.m50626j();
                yt91VarM50626j.f276054h = "music";
                yt91VarM50626j.f276047a = "tap-spoton-entrypoints-android";
                yt91VarM50626j.f276052f = "2.0.0";
                yt91VarM50626j.f276053g = "20.0.5";
                this.f240135c = yt91VarM50626j.m94607a();
                break;
            default:
                this.f240134b = st91.f213865b;
                zt91 zt91Var2 = zt91.f286105i;
                yt91 yt91VarM50626j2 = ihf1.m50626j();
                yt91VarM50626j2.f276054h = "music";
                yt91VarM50626j2.f276047a = "mobile-social-on-demand";
                yt91VarM50626j2.f276052f = "0.2.1";
                yt91VarM50626j2.f276053g = "20.0.5";
                this.f240135c = yt91VarM50626j2.m94607a();
                break;
        }
    }

    public vch0(String str, String str2, st91 st91Var) {
        this.f240133a = 16;
        this.f240134b = st91Var;
        zt91 zt91Var = zt91.f286105i;
        yt91 yt91VarM50626j = ihf1.m50626j();
        yt91VarM50626j.f276054h = "music";
        yt91VarM50626j.f276047a = "mobile-user-account-page";
        yt91VarM50626j.f276052f = "2.1.1";
        yt91VarM50626j.f276053g = "20.0.5";
        yt91VarM50626j.f276048b = str;
        yt91VarM50626j.f276050d = str2;
        this.f240135c = yt91VarM50626j.m94607a();
    }
}
