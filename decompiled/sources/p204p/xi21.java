package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: classes9.dex */
public final class xi21 implements iji {

    /* JADX INFO: renamed from: a */
    public static final PlayOrigin f261753a;

    static {
        PlayOrigin.Builder builder = PlayOrigin.builder("media-session");
        th50 th50Var = uh50.f230369a;
        f261753a = builder.referrerIdentifier("app_integration").build();
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: b */
    public final boolean mo28037b(String str) {
        return "com.skmusic".equals(str);
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: c */
    public final PlayOrigin mo28038c(String str) {
        return f261753a;
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: f */
    public final ExternalAccessoryDescription mo28041f(String str, String str2, yjx0 yjx0Var) {
        return new ExternalAccessoryDescription("", null, null, "app_to_app", null, "app", "skmusic", "cactus jack", str2, "media_session", str, 22, null);
    }
}
