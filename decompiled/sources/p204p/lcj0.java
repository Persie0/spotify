package p204p;

import android.app.Activity;
import android.content.Intent;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class lcj0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f131944a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Activity f131945b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lcj0(int i, Activity activity) {
        super(0);
        this.f131944a = i;
        this.f131945b = activity;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f131944a;
        Activity activity = this.f131945b;
        switch (i) {
            case 0:
                return Boolean.valueOf(ze0.m95955u0(activity, "android.permission.BLUETOOTH_CONNECT"));
            case 1:
                String string = activity.getString(R.string.your_library_offboard_new_episodes_hint_label);
                String string2 = activity.getString(R.string.your_library_offboard_new_episodes_to_follow_feed_hint_title);
                String string3 = activity.getString(R.string.your_library_offboard_new_episodes_to_follow_feed_hint_body);
                String string4 = activity.getString(R.string.your_library_offboard_new_episodes_to_follow_feed_hint_button);
                String string5 = activity.getString(R.string.f6036x21666e9a);
                String string6 = activity.getString(R.string.f6035x40bbe19);
                fx20[] fx20VarArr = fx20.f74227b;
                return new ehv("offboard_new_episodes", "spotify:home?facet=podcasts-following-chip", string, string2, string3, string4, string5, string6, 0);
            case 2:
                activity.startActivity(new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY"));
                return w2a1.f247311a;
            case 3:
                return new ehv("create_playlist", xoc1.f263848B1.f243453a, activity.getString(R.string.your_library_create_playlist_hint_label), activity.getString(R.string.your_library_create_playlist_hint_title), activity.getString(R.string.your_library_create_playlist_hint_body), activity.getString(R.string.your_library_create_playlist_hint_button), activity.getString(R.string.your_library_create_playlist_hint_button_content_description), activity.getString(R.string.your_library_create_playlist_hint_dismiss_content_description), null);
            default:
                return new ehv("follow_podcast", xoc1.f263935M0.f243453a, activity.getString(R.string.your_library_follow_podcast_hint_label), activity.getString(R.string.your_library_follow_podcast_hint_title), activity.getString(R.string.your_library_follow_podcast_hint_body), activity.getString(R.string.your_library_follow_podcast_hint_button), null, activity.getString(R.string.f6033xe9726871), null);
        }
    }
}
