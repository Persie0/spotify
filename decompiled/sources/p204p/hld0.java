package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: classes8.dex */
public final class hld0 implements iji {

    /* JADX INFO: renamed from: a */
    public static final PlayOrigin f92674a;

    static {
        PlayOrigin.Builder builder = PlayOrigin.builder("media-resumption");
        th50 th50Var = uh50.f230369a;
        f92674a = builder.referrerIdentifier("media-resumption").build();
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: b */
    public final boolean mo28037b(String str) {
        return str.equals("com.android.systemui.recent");
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: c */
    public final PlayOrigin mo28038c(String str) {
        return f92674a;
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: e */
    public final String mo28040e() {
        return "spotify_root_media_resumption";
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: f */
    public final ExternalAccessoryDescription mo28041f(String str, String str2, yjx0 yjx0Var) {
        return new ExternalAccessoryDescription("media_resumption", null, null, "app_to_app", null, null, "google", null, null, "media_session", str, 438, null);
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: j */
    public final zvm0 mo47877j(String str, r46 r46Var) {
        return new zvm0("spotify_root_media_resumption");
    }
}
