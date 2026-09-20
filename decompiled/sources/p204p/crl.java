package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class crl implements erl {

    /* JADX INFO: renamed from: a */
    public final int f41319a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f41320b;

    /* JADX INFO: renamed from: c */
    public final int f41321c;

    public crl(ArrayList arrayList, int i, int i2) {
        this.f41319a = i;
        this.f41320b = arrayList;
        this.f41321c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crl)) {
            return false;
        }
        crl crlVar = (crl) obj;
        return this.f41319a == crlVar.f41319a && this.f41320b.equals(crlVar.f41320b) && this.f41321c == crlVar.f41321c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f41321c) + lq51.m59700f(this.f41320b, edb.m38547C(this.f41319a) * 31, 31);
    }
}
