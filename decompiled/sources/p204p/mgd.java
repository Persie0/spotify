package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class mgd {

    /* JADX INFO: renamed from: a */
    public final int f143437a;

    /* JADX INFO: renamed from: b */
    public final List f143438b;

    /* JADX INFO: renamed from: c */
    public final boolean f143439c;

    public mgd(int i, List list, boolean z) {
        this.f143437a = i;
        this.f143438b = list;
        this.f143439c = z;
    }

    /* JADX INFO: renamed from: a */
    public static mgd m61703a(mgd mgdVar, int i, ArrayList arrayList, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            i = mgdVar.f143437a;
        }
        List list = arrayList;
        if ((i2 & 2) != 0) {
            list = mgdVar.f143438b;
        }
        if ((i2 & 4) != 0) {
            z = mgdVar.f143439c;
        }
        mgdVar.getClass();
        return new mgd(i, list, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgd)) {
            return false;
        }
        mgd mgdVar = (mgd) obj;
        return this.f143437a == mgdVar.f143437a && wj50.m88271j(this.f143438b, mgdVar.f143438b) && this.f143439c == mgdVar.f143439c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f143439c) + s571.m77244c(edb.m38547C(this.f143437a) * 31, 31, this.f143438b);
    }

    public /* synthetic */ mgd(ArrayList arrayList, int i, int i2) {
        this(i, (i2 & 2) != 0 ? lau.f131415a : arrayList, false);
    }
}
