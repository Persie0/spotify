package p204p;

import com.spotify.music.R;
import com.spotify.player.model.Context;
import com.spotify.player.model.ContextTrack;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class st30 {

    /* JADX INFO: renamed from: a */
    public static final urv0 f213768a = new urv0("^Using [\\w-]+:\\s*(.+?)\\.{0,3}$");

    /* JADX INFO: renamed from: b */
    public static final rt30 f213769b;

    /* JADX INFO: renamed from: c */
    public static final List f213770c;

    /* JADX INFO: renamed from: d */
    public static final Object f213771d;

    static {
        rt30 rt30Var = new rt30(R.string.campfire_agent_action_searching_active, R.string.campfire_agent_action_searching_past);
        rt30 rt30Var2 = new rt30(R.string.campfire_agent_action_browsing_library_active, R.string.campfire_agent_action_browsing_library_past);
        rt30 rt30Var3 = new rt30(R.string.campfire_agent_action_checking_library_active, R.string.campfire_agent_action_checking_library_past);
        rt30 rt30Var4 = new rt30(R.string.campfire_agent_action_saving_to_library_active, R.string.campfire_agent_action_saving_to_library_past);
        rt30 rt30Var5 = new rt30(R.string.campfire_agent_action_removing_from_library_active, R.string.campfire_agent_action_removing_from_library_past);
        rt30 rt30Var6 = new rt30(R.string.campfire_agent_action_checking_conversations_active, R.string.campfire_agent_action_checking_conversations_past);
        rt30 rt30Var7 = new rt30(R.string.campfire_agent_action_checking_whats_playing_active, R.string.campfire_agent_action_checking_whats_playing_past);
        rt30 rt30Var8 = new rt30(R.string.campfire_agent_action_checking_available_devices_active, R.string.campfire_agent_action_checking_available_devices_past);
        rt30 rt30Var9 = new rt30(R.string.campfire_agent_action_transferring_playback_active, R.string.campfire_agent_action_transferring_playback_past);
        f213769b = new rt30(R.string.campfire_agent_action_connecting_service_active, R.string.campfire_agent_action_connecting_service_past);
        f213770c = h6f.m46715L(new pqm0("search", rt30Var), new pqm0("library list", rt30Var2), new pqm0("library recent", rt30Var2), new pqm0("library contains", rt30Var3), new pqm0("library add", rt30Var4), new pqm0("library remove", rt30Var5), new pqm0("library", rt30Var3), new pqm0("chat list", rt30Var6), new pqm0("chat", rt30Var6), new pqm0(Context.Metadata.SHUFFLE_ALGORITHM_HISTORY, new rt30(R.string.campfire_agent_action_looking_at_recent_history_active, R.string.campfire_agent_action_looking_at_recent_history_past)), new pqm0("lookup", new rt30(R.string.campfire_agent_action_looking_up_track_details_active, R.string.campfire_agent_action_looking_up_track_details_past)), new pqm0("ask", new rt30(R.string.campfire_agent_action_thinking_about_question_active, R.string.campfire_agent_action_thinking_about_question_past)), new pqm0(ContextTrack.TrackAction.PAUSE, new rt30(R.string.campfire_agent_action_pausing_playback_active, R.string.campfire_agent_action_pausing_playback_past)), new pqm0(ContextTrack.TrackAction.RESUME, new rt30(R.string.campfire_agent_action_resuming_playback_active, R.string.campfire_agent_action_resuming_playback_past)), new pqm0("skip", new rt30(R.string.campfire_agent_action_skipping_track_active, R.string.campfire_agent_action_skipping_track_past)), new pqm0("next", new rt30(R.string.campfire_agent_action_skipping_track_active, R.string.campfire_agent_action_skipping_track_past)), new pqm0("previous", new rt30(R.string.campfire_agent_action_previous_track_active, R.string.campfire_agent_action_previous_track_past)), new pqm0("prev", new rt30(R.string.campfire_agent_action_previous_track_active, R.string.campfire_agent_action_previous_track_past)), new pqm0("play", new rt30(R.string.campfire_agent_action_playing_music_active, R.string.campfire_agent_action_playing_music_past)), new pqm0("seek", new rt30(R.string.campfire_agent_action_seeking_track_active, R.string.campfire_agent_action_seeking_track_past)), new pqm0("speed", new rt30(R.string.campfire_agent_action_adjusting_playback_speed_active, R.string.campfire_agent_action_adjusting_playback_speed_past)), new pqm0("volume", new rt30(R.string.campfire_agent_action_adjusting_volume_active, R.string.campfire_agent_action_adjusting_volume_past)), new pqm0("shuffle", new rt30(R.string.campfire_agent_action_toggling_shuffle_active, R.string.campfire_agent_action_toggling_shuffle_past)), new pqm0("repeat", new rt30(R.string.campfire_agent_action_changing_repeat_mode_active, R.string.campfire_agent_action_changing_repeat_mode_past)), new pqm0("playlist add", new rt30(R.string.campfire_agent_action_adding_to_playlist_active, R.string.campfire_agent_action_adding_to_playlist_past)), new pqm0("playlist create", new rt30(R.string.campfire_agent_action_creating_playlist_active, R.string.campfire_agent_action_creating_playlist_past)), new pqm0("playlist remove", new rt30(R.string.campfire_agent_action_removing_from_playlist_active, R.string.campfire_agent_action_removing_from_playlist_past)), new pqm0("playlist delete", new rt30(R.string.campfire_agent_action_removing_from_playlist_active, R.string.campfire_agent_action_removing_from_playlist_past)), new pqm0("playlist list", new rt30(R.string.campfire_agent_action_browsing_playlists_active, R.string.campfire_agent_action_browsing_playlists_past)), new pqm0("playlist get", new rt30(R.string.campfire_agent_action_loading_playlist_active, R.string.campfire_agent_action_loading_playlist_past)), new pqm0("playlist update", new rt30(R.string.campfire_agent_action_updating_playlist_active, R.string.campfire_agent_action_updating_playlist_past)), new pqm0("playlist", new rt30(R.string.campfire_agent_action_managing_playlist_active, R.string.campfire_agent_action_managing_playlist_past)), new pqm0("queue add", new rt30(R.string.campfire_agent_action_adding_to_queue_active, R.string.campfire_agent_action_adding_to_queue_past)), new pqm0("queue remove", new rt30(R.string.campfire_agent_action_removing_from_queue_active, R.string.campfire_agent_action_removing_from_queue_past)), new pqm0("queue move", new rt30(R.string.campfire_agent_action_reordering_queue_active, R.string.campfire_agent_action_reordering_queue_past)), new pqm0("queue", new rt30(R.string.campfire_agent_action_checking_queue_active, R.string.campfire_agent_action_checking_queue_past)), new pqm0("folder create", new rt30(R.string.campfire_agent_action_creating_folder_active, R.string.campfire_agent_action_creating_folder_past)), new pqm0("folder rename", new rt30(R.string.campfire_agent_action_renaming_folder_active, R.string.campfire_agent_action_renaming_folder_past)), new pqm0("folder move", new rt30(R.string.campfire_agent_action_moving_to_folder_active, R.string.campfire_agent_action_moving_to_folder_past)), new pqm0("folder remove", new rt30(R.string.campfire_agent_action_removing_folder_active, R.string.campfire_agent_action_removing_folder_past)), new pqm0("folder list", new rt30(R.string.campfire_agent_action_browsing_folders_active, R.string.campfire_agent_action_browsing_folders_past)), new pqm0("folder", new rt30(R.string.campfire_agent_action_managing_folders_active, R.string.campfire_agent_action_managing_folders_past)), new pqm0("unfollow", new rt30(R.string.campfire_agent_action_unfollowing_artist_active, R.string.campfire_agent_action_unfollowing_artist_past)), new pqm0("follow", new rt30(R.string.campfire_agent_action_following_artist_active, R.string.campfire_agent_action_following_artist_past)), new pqm0("unsave", rt30Var5), new pqm0("unlike", rt30Var5), new pqm0("save", rt30Var4), new pqm0("like", rt30Var4), new pqm0("now-playing", rt30Var7), new pqm0("now_playing", rt30Var7), new pqm0("status", rt30Var7), new pqm0("recommend", new rt30(R.string.campfire_agent_action_finding_recommendations_active, R.string.campfire_agent_action_finding_recommendations_past)), new pqm0("suggest", new rt30(R.string.campfire_agent_action_finding_recommendations_active, R.string.campfire_agent_action_finding_recommendations_past)), new pqm0("top", new rt30(R.string.campfire_agent_action_looking_at_top_tracks_active, R.string.campfire_agent_action_looking_at_top_tracks_past)), new pqm0("taste", new rt30(R.string.campfire_agent_action_analyzing_taste_profile_active, R.string.campfire_agent_action_analyzing_taste_profile_past)), new pqm0("album", new rt30(R.string.campfire_agent_action_looking_up_album_details_active, R.string.campfire_agent_action_looking_up_album_details_past)), new pqm0("artist", new rt30(R.string.campfire_agent_action_looking_up_artist_details_active, R.string.campfire_agent_action_looking_up_artist_details_past)), new pqm0("track", new rt30(R.string.campfire_agent_action_looking_up_track_info_active, R.string.campfire_agent_action_looking_up_track_info_past)), new pqm0("devices list", rt30Var8), new pqm0("devices transfer", rt30Var9), new pqm0("devices volume", new rt30(R.string.campfire_agent_action_adjusting_device_volume_active, R.string.campfire_agent_action_adjusting_device_volume_past)), new pqm0("devices info", new rt30(R.string.campfire_agent_action_checking_device_info_active, R.string.campfire_agent_action_checking_device_info_past)), new pqm0("devices", rt30Var8), new pqm0("device", rt30Var8), new pqm0("connect", rt30Var8), new pqm0("transfer", rt30Var9), new pqm0("jam create", new rt30(R.string.campfire_agent_action_starting_jam_active, R.string.campfire_agent_action_starting_jam_past)), new pqm0("jam leave", new rt30(R.string.campfire_agent_action_leaving_jam_active, R.string.campfire_agent_action_leaving_jam_past)), new pqm0("jam end", new rt30(R.string.campfire_agent_action_ending_jam_active, R.string.campfire_agent_action_ending_jam_past)), new pqm0("jam members", new rt30(R.string.campfire_agent_action_checking_jam_members_active, R.string.campfire_agent_action_checking_jam_members_past)), new pqm0("jam kick", new rt30(R.string.campfire_agent_action_removing_from_jam_active, R.string.campfire_agent_action_removing_from_jam_past)), new pqm0("jam permissions", new rt30(R.string.campfire_agent_action_checking_jam_permissions_active, R.string.campfire_agent_action_checking_jam_permissions_past)), new pqm0("jam status", new rt30(R.string.campfire_agent_action_checking_jam_status_active, R.string.campfire_agent_action_checking_jam_status_past)), new pqm0("jam", new rt30(R.string.campfire_agent_action_managing_jam_session_active, R.string.campfire_agent_action_managing_jam_session_past)), new pqm0("me", new rt30(R.string.campfire_agent_action_checking_profile_active, R.string.campfire_agent_action_checking_profile_past)));
        f213771d = kkc0.m56695h0(new pqm0("create_scheduled_routine", new rt30(R.string.campfire_agent_action_creating_routine_active, R.string.campfire_agent_action_creating_routine_past)), new pqm0("update_routine", new rt30(R.string.campfire_agent_action_updating_routine_active, R.string.campfire_agent_action_updating_routine_past)), new pqm0("delete_routine", new rt30(R.string.campfire_agent_action_deleting_routine_active, R.string.campfire_agent_action_deleting_routine_past)), new pqm0("list_routines", new rt30(R.string.campfire_agent_action_listing_routines_active, R.string.campfire_agent_action_listing_routines_past)), new pqm0("run_routine", new rt30(R.string.campfire_agent_action_running_routine_active, R.string.campfire_agent_action_running_routine_past)), new pqm0("memory_write", new rt30(R.string.campfire_agent_action_saving_to_memory_active, R.string.campfire_agent_action_saving_to_memory_past)), new pqm0("memory_read", new rt30(R.string.campfire_agent_action_searching_memory_active, R.string.campfire_agent_action_searching_memory_past)), new pqm0("list_models", new rt30(R.string.campfire_agent_action_checking_models_active, R.string.campfire_agent_action_checking_models_past)), new pqm0("find_and_install_skill", new rt30(R.string.campfire_agent_action_finding_skill_active, R.string.campfire_agent_action_finding_skill_past)), new pqm0("read_file", new rt30(R.string.campfire_agent_action_reading_file_active, R.string.campfire_agent_action_reading_file_past)), new pqm0("write_file", new rt30(R.string.campfire_agent_action_writing_file_active, R.string.campfire_agent_action_writing_file_past)), new pqm0("text_editor", new rt30(R.string.campfire_agent_action_editing_file_active, R.string.campfire_agent_action_editing_file_past)), new pqm0("str_replace_editor", new rt30(R.string.campfire_agent_action_editing_file_active, R.string.campfire_agent_action_editing_file_past)), new pqm0("list_directory", new rt30(R.string.campfire_agent_action_looking_at_files_active, R.string.campfire_agent_action_looking_at_files_past)), new pqm0("ls", new rt30(R.string.campfire_agent_action_looking_at_files_active, R.string.campfire_agent_action_looking_at_files_past)), new pqm0("web_search", new rt30(R.string.campfire_agent_action_searching_web_active, R.string.campfire_agent_action_searching_web_past)), new pqm0("search", new rt30(R.string.campfire_agent_action_searching_web_active, R.string.campfire_agent_action_searching_web_past)), new pqm0("web_fetch", new rt30(R.string.campfire_agent_action_fetching_page_active, R.string.campfire_agent_action_fetching_page_past)), new pqm0("fetch", new rt30(R.string.campfire_agent_action_fetching_page_active, R.string.campfire_agent_action_fetching_page_past)), new pqm0("computer", new rt30(R.string.campfire_agent_action_using_computer_active, R.string.campfire_agent_action_using_computer_past)));
    }

    /* JADX INFO: renamed from: a */
    public static String m79230a(String str) {
        r2d0 r2d0VarM83869a;
        String str2;
        if (str.length() == 0 || (r2d0VarM83869a = urv0.m83869a(f213768a, str)) == null || (str2 = (String) ((p2d0) r2d0VarM83869a.m74520a()).get(1)) == null) {
            return null;
        }
        return wl51.m88491o1(str2).toString();
    }

    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: b */
    public static qt30 m79231b(android.content.Context context, String str, mec0 mec0Var, String str2, String str3, String str4) {
        CharSequence charSequence;
        Object next;
        qt30 qt30VarM76363a;
        String str5;
        if (str.equals("bash") && str3 != null) {
            Iterator it = f213770c.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                str5 = (String) ((pqm0) next).f180350a;
                if (str3.equals(str5)) {
                    break;
                }
            } while (!bm51.m29803n0(str3, str5 + " ", false));
            pqm0 pqm0Var = (pqm0) next;
            if (pqm0Var == null) {
                qt30VarM76363a = null;
            } else {
                qt30VarM76363a = (!wj50.m88271j((String) pqm0Var.f180350a, "search") || str4 == null || str4.length() == 0) ? ((rt30) pqm0Var.f180351b).m76363a(context, str4) : new qt30(context.getString(R.string.campfire_agent_action_search_subject_active, str4), context.getString(R.string.campfire_agent_action_search_subject_past, str4));
            }
            if (qt30VarM76363a != null) {
                return qt30VarM76363a;
            }
        }
        if (str.equals("bash") || str.equals("sh")) {
            String strM79230a = (String) mec0Var.get("command");
            if (strM79230a == null && (strM79230a = m79230a(str2)) == null) {
                strM79230a = "";
            }
            String strM88489m1 = wl51.m88489m1(60, strM79230a);
            return strM88489m1.length() == 0 ? new qt30(context.getString(R.string.campfire_agent_action_running_shell_command_generic_active), context.getString(R.string.campfire_agent_action_running_shell_command_generic_past)) : new qt30(context.getString(R.string.campfire_agent_action_running_shell_command_preview_active, strM88489m1), context.getString(R.string.campfire_agent_action_running_shell_command_preview_past, strM88489m1));
        }
        if (str.equals("mcp") || bm51.m29803n0(str, "mcp_", false)) {
            return f213769b.m76363a(context, null);
        }
        if ((str.equals("web_search") || str.equals("search")) && (charSequence = (CharSequence) mec0Var.get("query")) != null && charSequence.length() != 0) {
            String str6 = (String) kkc0.m56692e0("query", mec0Var);
            return new qt30(context.getString(R.string.campfire_agent_action_search_query_active, str6), context.getString(R.string.campfire_agent_action_search_query_past, str6));
        }
        String strM79230a2 = m79230a(str2);
        rt30 rt30Var = (rt30) f213771d.get(str);
        if (rt30Var != null) {
            return rt30Var.m76363a(context, strM79230a2);
        }
        String strReplace = str.replace('_', ' ').replace('-', ' ');
        return new qt30(s571.m77250i(m79232c(context, context.getString(R.string.campfire_agent_action_running_unknown_active, strReplace), strM79230a2), "..."), m79232c(context, context.getString(R.string.campfire_agent_action_running_unknown_past, strReplace), strM79230a2));
    }

    /* JADX INFO: renamed from: c */
    public static String m79232c(android.content.Context context, String str, String str2) {
        return (str2 == null || str2.length() == 0) ? str : context.getString(R.string.campfire_agent_action_with_subject, str, str2);
    }
}
