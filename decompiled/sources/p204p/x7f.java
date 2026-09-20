package p204p;

import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class x7f implements sje {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f258887a;

    @Override // p204p.sje
    /* JADX INFO: renamed from: a */
    public final String mo24852a(ExternalAccessoryDescription externalAccessoryDescription) {
        switch (this.f258887a) {
            case 0:
                List list = y7f.f270044a;
                if (y7f.f270044a.contains(externalAccessoryDescription.senderId)) {
                    return "CgVPcGx1cxIJQXNzaXN0YW50";
                }
                return null;
            case 1:
                if (wj50.m88271j(externalAccessoryDescription.senderId, "com.motorola.partner.music")) {
                    return "CghNb3Rvcm9sYRIEUmF6cg%3D%3D";
                }
                return null;
            case 2:
                String str = externalAccessoryDescription.senderId;
                if (wj50.m88271j(str, "com.samsung.android.app.galaxyfinder") || wj50.m88271j(str, "com.sec.android.app.launcher")) {
                    return "CgdTYW1zdW5nEghTLUZpbmRlcg%3D%3D";
                }
                return null;
            case 3:
                if (wj50.m88271j(externalAccessoryDescription.senderId, "com.vivo.globalsearch")) {
                    return "CgRWaXZvEgxHbG9iYWxTZWFyY2g%3D";
                }
                return null;
            default:
                if (s5j.f205844a.contains(externalAccessoryDescription.senderId)) {
                    return "CgZYaWFvbWkSBkZpbmRlcg%3D%3D";
                }
                return null;
        }
    }
}
