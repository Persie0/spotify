package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;

/* JADX INFO: loaded from: classes9.dex */
public final class j3y0 implements iji {

    /* JADX INFO: renamed from: a */
    public static final hg40 f108526a = hg40.m47408t("com.samsung.android.app.galaxyfinder", "com.sec.android.app.launcher");

    @Override // p204p.iji
    /* JADX INFO: renamed from: b */
    public final boolean mo28037b(String str) {
        return f108526a.contains(str);
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: e */
    public final String mo28040e() {
        return "spotify_media_browser_root_samsung";
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: f */
    public final ExternalAccessoryDescription mo28041f(String str, String str2, yjx0 yjx0Var) {
        ExternalAccessoryDescription externalAccessoryDescriptionMo28041f = super.mo28041f(str, str2, yjx0Var);
        return externalAccessoryDescriptionMo28041f.copy(externalAccessoryDescriptionMo28041f.integrationType, externalAccessoryDescriptionMo28041f.p.kyx.b java.lang.String, externalAccessoryDescriptionMo28041f.name, externalAccessoryDescriptionMo28041f.p.kyx.d java.lang.String, externalAccessoryDescriptionMo28041f.connectionLabel, externalAccessoryDescriptionMo28041f.p.kyx.c java.lang.String, d6n0.f45731d, "samsung finder", externalAccessoryDescriptionMo28041f.version, externalAccessoryDescriptionMo28041f.p.kyx.e java.lang.String, externalAccessoryDescriptionMo28041f.senderId);
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: i */
    public final c101 mo28042i() {
        return c101.f32936i;
    }
}
