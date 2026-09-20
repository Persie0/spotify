package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a050 implements yz40 {

    /* JADX INFO: renamed from: a */
    public final zz40 f10995a;

    public a050(zz40 zz40Var) {
        this.f10995a = zz40Var;
    }

    @Override // p204p.yz40
    /* JADX INFO: renamed from: a */
    public final String mo24321a(String str) {
        ArrayList arrayList = new ArrayList();
        String strM95788j = zag1.m95788j(str, "utm_campaign");
        if (strM95788j.length() > 0) {
            arrayList.add("utm_campaign=".concat(strM95788j));
        }
        String strM95788j2 = zag1.m95788j(str, "utm_medium");
        if (strM95788j2.length() > 0) {
            arrayList.add("utm_medium=".concat(strM95788j2));
        }
        String strM95788j3 = zag1.m95788j(str, "utm_source");
        if (strM95788j3.length() > 0) {
            arrayList.add("utm_source=".concat(strM95788j3));
        }
        return g6f.m43753y0(arrayList, "&", null, null, null, 62);
    }

    @Override // p204p.yz40
    /* JADX INFO: renamed from: b */
    public final boolean mo24322b(String str) {
        if (this.f10995a.mo24322b(str)) {
            return false;
        }
        return wl51.m88496t0(str, "utm_campaign", false) || wl51.m88496t0(str, "utm_medium", false) || wl51.m88496t0(str, "utm_source", false);
    }
}
