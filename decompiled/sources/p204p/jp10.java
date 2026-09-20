package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: classes3.dex */
public final class jp10 implements iji {

    /* JADX INFO: renamed from: a */
    public static final PlayOrigin f114545a;

    static {
        PlayOrigin.Builder builder = PlayOrigin.builder("google-clock");
        th50 th50Var = uh50.f230369a;
        f114545a = builder.referrerIdentifier("google-clock").build();
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: b */
    public final boolean mo28037b(String str) {
        return "com.google.android.deskclock".equals(str);
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: c */
    public final PlayOrigin mo28038c(String str) {
        return f114545a;
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: d */
    public final zab mo28039d() {
        return zab.f281022g;
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: e */
    public final String mo28040e() {
        return "spotify_media_browser_root_wakeup";
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: f */
    public final ExternalAccessoryDescription mo28041f(String str, String str2, yjx0 yjx0Var) {
        return new ExternalAccessoryDescription("Clock", null, null, "app_to_app", null, "app", "google", "google clock", str2, "media_session", str, 22, null);
    }
}
