package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class fxx {

    /* JADX INFO: renamed from: a */
    public final List f74479a;

    /* JADX INFO: renamed from: b */
    public final lxx f74480b;

    /* JADX INFO: renamed from: c */
    public final pyx f74481c;

    /* JADX INFO: renamed from: d */
    public final String f74482d;

    public fxx(ArrayList arrayList, lxx lxxVar) {
        this(arrayList, lxxVar, null, null);
    }

    /* JADX INFO: renamed from: a */
    public static fxx m43028a(fxx fxxVar, List list, lxx lxxVar, int i) {
        if ((i & 1) != 0) {
            list = fxxVar.f74479a;
        }
        if ((i & 2) != 0) {
            lxxVar = fxxVar.f74480b;
        }
        pyx pyxVar = fxxVar.f74481c;
        String str = fxxVar.f74482d;
        fxxVar.getClass();
        return new fxx(list, lxxVar, pyxVar, str);
    }

    /* JADX INFO: renamed from: b */
    public final List m43029b() {
        return this.f74479a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxx)) {
            return false;
        }
        fxx fxxVar = (fxx) obj;
        return wj50.m88271j(this.f74479a, fxxVar.f74479a) && wj50.m88271j(this.f74480b, fxxVar.f74480b) && this.f74481c == fxxVar.f74481c && wj50.m88271j(this.f74482d, fxxVar.f74482d);
    }

    public final int hashCode() {
        int iHashCode = this.f74479a.hashCode() * 31;
        lxx lxxVar = this.f74480b;
        int iHashCode2 = (iHashCode + (lxxVar == null ? 0 : lxxVar.hashCode())) * 31;
        pyx pyxVar = this.f74481c;
        int iHashCode3 = (iHashCode2 + (pyxVar == null ? 0 : pyxVar.hashCode())) * 31;
        String str = this.f74482d;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public fxx(List list) {
        this(list, null, null, null);
    }

    public fxx(List list, lxx lxxVar, pyx pyxVar, String str) {
        this.f74479a = list;
        this.f74480b = lxxVar;
        this.f74481c = pyxVar;
        this.f74482d = str;
    }
}
