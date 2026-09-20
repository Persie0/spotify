package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;

/* JADX INFO: loaded from: classes8.dex */
public final class w9x0 implements fod0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f249283c;

    /* JADX INFO: renamed from: d */
    public final ynd0 f249284d;

    public /* synthetic */ w9x0(ynd0 ynd0Var, int i) {
        this.f249283c = i;
        this.f249284d = ynd0Var;
    }

    @Override // p204p.fod0
    /* JADX INFO: renamed from: a */
    public final ExternalAccessoryDescription mo42270a(String str) {
        switch (this.f249283c) {
            case 0:
                return new ExternalAccessoryDescription("", "", "", "app_to_app", "", "app", "", "", "", "media_session", str);
            default:
                return new ExternalAccessoryDescription("Rockscout", null, null, null, null, "car", "mirrorlink", "rockscout", null, "media_session", str, 286, null);
        }
    }

    @Override // p204p.fod0
    /* JADX INFO: renamed from: b */
    public final boolean mo42271b(String str) {
        switch (this.f249283c) {
            case 0:
                return "com.android.systemui".equals(str);
            default:
                return "com.carconnectivity.mlmediaplayer".equals(str);
        }
    }

    @Override // p204p.fod0
    /* JADX INFO: renamed from: c */
    public final xnd0 mo42272c(uzx uzxVar, int i) {
        switch (this.f249283c) {
            case 0:
                return ((oon) this.f249284d).m67509b(uzxVar, fod0.f71515a, i);
            default:
                return ((non) this.f249284d).m65249b(uzxVar, fod0.f71515a, i);
        }
    }
}
