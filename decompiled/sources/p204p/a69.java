package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;

/* JADX INFO: loaded from: classes2.dex */
public final class a69 implements sje {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f12719a;

    @Override // p204p.sje
    /* JADX INFO: renamed from: a */
    public final String mo24852a(ExternalAccessoryDescription externalAccessoryDescription) {
        switch (this.f12719a) {
            case 0:
                if (wj50.m88271j(externalAccessoryDescription.senderId, "com.oplus.games")) {
                    return "CgdPbmVwbHVzEg1HYW1lIGxhdW5jaGVy";
                }
                return null;
            case 1:
                if (!wj50.m88271j(externalAccessoryDescription.integrationType, "partner_ui") || wj50.m88271j(externalAccessoryDescription.senderId, h3m0.f87264n.m49626a())) {
                    return null;
                }
                return "CgdTcG90aWZ5Eg1QYXJ0bmVyUGxheWVy";
            default:
                if (wj50.m88271j(externalAccessoryDescription.p.kyx.c java.lang.String, "widget")) {
                    return "CgdTcG90aWZ5Eg5BbmRyb2lkIHdpZGdldA%3D%3D";
                }
                return null;
        }
    }
}
