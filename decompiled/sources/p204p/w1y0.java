package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;

/* JADX INFO: loaded from: classes9.dex */
public final class w1y0 implements iji {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f247197a;

    @Override // p204p.iji
    /* JADX INFO: renamed from: b */
    public final boolean mo28037b(String str) {
        switch (this.f247197a) {
            case 0:
                return "com.samsung.android.smartsuggestions".equals(str);
            case 1:
                return "com.samsung.android.app.smartcapture".equals(str);
            case 2:
                return "com.samsung.android.app.moments".equals(str);
            default:
                return "com.samsung.android.app.routines".equals(str);
        }
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: e */
    public final String mo28040e() {
        switch (this.f247197a) {
        }
        return "spotify_media_browser_root_samsung";
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: f */
    public final ExternalAccessoryDescription mo28041f(String str, String str2, yjx0 yjx0Var) {
        switch (this.f247197a) {
            case 0:
                ExternalAccessoryDescription externalAccessoryDescriptionMo28041f = super.mo28041f(str, str2, yjx0Var);
                return externalAccessoryDescriptionMo28041f.copy(externalAccessoryDescriptionMo28041f.integrationType, externalAccessoryDescriptionMo28041f.p.kyx.b java.lang.String, externalAccessoryDescriptionMo28041f.name, externalAccessoryDescriptionMo28041f.p.kyx.d java.lang.String, externalAccessoryDescriptionMo28041f.connectionLabel, externalAccessoryDescriptionMo28041f.p.kyx.c java.lang.String, d6n0.f45731d, "samsung ai brief", externalAccessoryDescriptionMo28041f.version, externalAccessoryDescriptionMo28041f.p.kyx.e java.lang.String, externalAccessoryDescriptionMo28041f.senderId);
            case 1:
                ExternalAccessoryDescription externalAccessoryDescriptionMo28041f2 = super.mo28041f(str, str2, yjx0Var);
                return externalAccessoryDescriptionMo28041f2.copy(externalAccessoryDescriptionMo28041f2.integrationType, externalAccessoryDescriptionMo28041f2.p.kyx.b java.lang.String, externalAccessoryDescriptionMo28041f2.name, externalAccessoryDescriptionMo28041f2.p.kyx.d java.lang.String, externalAccessoryDescriptionMo28041f2.connectionLabel, externalAccessoryDescriptionMo28041f2.p.kyx.c java.lang.String, d6n0.f45731d, "samsung ai select", externalAccessoryDescriptionMo28041f2.version, externalAccessoryDescriptionMo28041f2.p.kyx.e java.lang.String, externalAccessoryDescriptionMo28041f2.senderId);
            case 2:
                ExternalAccessoryDescription externalAccessoryDescriptionMo28041f3 = super.mo28041f(str, str2, yjx0Var);
                return externalAccessoryDescriptionMo28041f3.copy(externalAccessoryDescriptionMo28041f3.integrationType, externalAccessoryDescriptionMo28041f3.p.kyx.b java.lang.String, externalAccessoryDescriptionMo28041f3.name, externalAccessoryDescriptionMo28041f3.p.kyx.d java.lang.String, externalAccessoryDescriptionMo28041f3.connectionLabel, externalAccessoryDescriptionMo28041f3.p.kyx.c java.lang.String, d6n0.f45731d, "samsung moments", externalAccessoryDescriptionMo28041f3.version, externalAccessoryDescriptionMo28041f3.p.kyx.e java.lang.String, externalAccessoryDescriptionMo28041f3.senderId);
            default:
                ExternalAccessoryDescription externalAccessoryDescriptionMo28041f4 = super.mo28041f(str, str2, yjx0Var);
                return externalAccessoryDescriptionMo28041f4.copy(externalAccessoryDescriptionMo28041f4.integrationType, externalAccessoryDescriptionMo28041f4.p.kyx.b java.lang.String, externalAccessoryDescriptionMo28041f4.name, externalAccessoryDescriptionMo28041f4.p.kyx.d java.lang.String, externalAccessoryDescriptionMo28041f4.connectionLabel, externalAccessoryDescriptionMo28041f4.p.kyx.c java.lang.String, d6n0.f45731d, "samsung routines", externalAccessoryDescriptionMo28041f4.version, externalAccessoryDescriptionMo28041f4.p.kyx.e java.lang.String, externalAccessoryDescriptionMo28041f4.senderId);
        }
    }

    @Override // p204p.iji
    /* JADX INFO: renamed from: i */
    public final c101 mo28042i() {
        switch (this.f247197a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return c101.f32936i;
    }
}
