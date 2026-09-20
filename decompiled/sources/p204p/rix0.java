package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;

/* JADX INFO: loaded from: classes3.dex */
public final class rix0 implements iji {

    /* JADX INFO: renamed from: a */
    public final w9x0 f199648a;

    public rix0(w9x0 w9x0Var) {
        this.f199648a = w9x0Var;
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: b */
    public final boolean mo28037b(String str) {
        this.f199648a.getClass();
        return "com.carconnectivity.mlmediaplayer".equals(str);
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: d */
    public final zab mo28039d() {
        return zab.f281017b;
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: e */
    public final String mo28040e() {
        return "spotify_media_browser_root";
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: f */
    public final ExternalAccessoryDescription mo28041f(String str, String str2, yjx0 yjx0Var) {
        return this.f199648a.mo42270a(str);
    }
}
