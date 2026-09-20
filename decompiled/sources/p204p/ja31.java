package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import com.spotify.player.model.PlayOrigin;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class ja31 implements iji {

    /* JADX INFO: renamed from: a */
    public static final Set f110315a = bk5.m29624m1(new String[]{"com.snap.specs.app.master", "com.snap.specs.app.alpha", "com.snap.specs.app.dev"});

    /* JADX INFO: renamed from: b */
    public static final PlayOrigin f110316b;

    static {
        PlayOrigin.Builder builder = PlayOrigin.builder("media-session");
        th50 th50Var = uh50.f230369a;
        f110316b = builder.referrerIdentifier("app_integration").build();
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: b */
    public final boolean mo28037b(String str) {
        return f110315a.contains(str);
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: c */
    public final PlayOrigin mo28038c(String str) {
        return f110316b;
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: d */
    public final zab mo28039d() {
        return zab.f281024i;
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: f */
    public final ExternalAccessoryDescription mo28041f(String str, String str2, yjx0 yjx0Var) {
        return new ExternalAccessoryDescription("", null, null, "app_to_app", null, "app", "snap", "Snap Specs", str2, "media_session", str, 22, null);
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: i */
    public final c101 mo28042i() {
        return c101.f32937t;
    }
}
