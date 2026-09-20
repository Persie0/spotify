package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.voiceassistants.playermodels.PlayIntent;

/* JADX INFO: loaded from: classes11.dex */
public final class d5f0 implements esc1 {

    /* JADX INFO: renamed from: b */
    public static final Object f45425b = kkc0.m56695h0(new pqm0(new st60("com.facebook.stella"), new d5f0("com.facebook.stella")), new pqm0(new st60("com.facebook.stella_debug"), new d5f0("com.facebook.stella_debug")));

    /* JADX INFO: renamed from: a */
    public final String f45426a;

    public d5f0(String str) {
        this.f45426a = str;
    }

    @Override // p204p.esc1
    /* JADX INFO: renamed from: a */
    public final ExternalAccessoryDescription mo34985a() {
        return new ExternalAccessoryDescription("voice_assistant", null, null, "app_to_app", null, "app", "Meta", "stella", null, "media_session", this.f45426a, 278, null);
    }

    @Override // p204p.esc1
    /* JADX INFO: renamed from: b */
    public final String mo34986b(PlayIntent playIntent) {
        return "META_RB";
    }
}
