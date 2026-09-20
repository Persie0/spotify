package p204p;

import android.app.Activity;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes9.dex */
public final class v7q {

    /* JADX INFO: renamed from: a */
    public final Activity f238293a;

    /* JADX INFO: renamed from: b */
    public final dp21 f238294b;

    public v7q(Activity activity, dp21 dp21Var) {
        this.f238293a = activity;
        this.f238294b = dp21Var;
    }

    /* JADX INFO: renamed from: a */
    public final String m84894a(zo21 zo21Var) {
        String string;
        dp21 dp21Var = this.f238294b;
        boolean zM36563b = dp21Var.m36563b();
        ac20 ac20Var = dp21Var.f51158a;
        Activity activity = this.f238293a;
        if (!zM36563b) {
            String string2 = activity.getString(R.string.context_menu_sleep_timer);
            wj50.m88279p(string2);
            return string2;
        }
        if ((ac20Var.mo25416d() ? ac20Var.mo25418f() : -1L) < 0) {
            if (zo21Var == zo21.f284640b) {
                string = activity.getString(R.string.context_menu_sleep_timer_end_of_episode);
            } else if (zo21Var == zo21.f284641c) {
                string = activity.getString(R.string.context_menu_sleep_timer_end_of_chapter);
            } else if (zo21Var == zo21.f284642d) {
                string = activity.getString(R.string.context_menu_sleep_timer_end_of_podcast_chapter);
            } else {
                string = zo21Var == zo21.f284643e ? activity.getString(R.string.context_menu_sleep_timer_end_of_clip) : activity.getString(R.string.context_menu_sleep_timer_end_of_track);
            }
            wj50.m88279p(string);
        } else {
            int iCeil = (int) Math.ceil((ac20Var.mo25416d() ? ac20Var.mo25418f() : -1L) / ((double) 60000));
            if (iCeil < 60) {
                string = activity.getString(R.string.context_menu_sleep_timer_mins_left, Integer.valueOf(iCeil));
                wj50.m88279p(string);
            } else {
                string = activity.getString(R.string.context_menu_sleep_timer_hours_left, Integer.valueOf(iCeil / 60));
                wj50.m88279p(string);
            }
        }
        String string3 = activity.getString(R.string.context_menu_sleep_timer_active, string);
        wj50.m88279p(string3);
        return string3;
    }
}
