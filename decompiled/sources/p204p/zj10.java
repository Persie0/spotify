package p204p;

import android.net.Uri;
import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.voiceassistants.playermodels.PlayIntent;

/* JADX INFO: loaded from: classes11.dex */
public final class zj10 implements esc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f283328a;

    @Override // p204p.esc1
    /* JADX INFO: renamed from: a */
    public final ExternalAccessoryDescription mo34985a() {
        switch (this.f283328a) {
            case 0:
                return new ExternalAccessoryDescription("voice_assistant", null, null, "app_to_app", null, "app", "google", "google_assistant", null, "media_session", "com.google.android.googlequicksearchbox", 278, null);
            case 1:
                return new ExternalAccessoryDescription("voice_assistant", null, null, "app_to_app", null, "app", "google", "google_assistant", "driving_mode", "media_session", "com.google.android.googlequicksearchbox", 22, null);
            default:
                return new ExternalAccessoryDescription("voice_assistant", null, null, "app_to_app", null, "app", "google", "google_assistant", "smart_space", "media_session", "com.google.android.googlequicksearchbox", 22, null);
        }
    }

    @Override // p204p.esc1
    /* JADX INFO: renamed from: b */
    public final String mo34986b(PlayIntent playIntent) {
        switch (this.f283328a) {
            case 0:
                Uri uri = playIntent.getUri();
                return (wj50.m88271j(uri.getQueryParameter("utm_source"), "google") && wj50.m88271j(uri.getQueryParameter("utm_medium"), "gemini")) ? "GEMINI" : "ANDROID_GOOGLE_ASSISTANT";
            case 1:
                return "ANDROID_GOOGLE_ASSISTANT";
            default:
                return "ANDROID_GOOGLE_ASSISTANT";
        }
    }
}
