package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rpi {

    /* JADX INFO: renamed from: a */
    public final List f201591a;

    /* JADX INFO: renamed from: b */
    public final boolean f201592b;

    /* JADX INFO: renamed from: c */
    public final List f201593c;

    /* JADX INFO: renamed from: d */
    public final List f201594d;

    public rpi(List list, boolean z, List list2, List list3) {
        this.f201591a = list;
        this.f201592b = z;
        this.f201593c = list2;
        this.f201594d = list3;
    }

    /* JADX INFO: renamed from: a */
    public static rpi m76188a(rpi rpiVar, ArrayList arrayList, boolean z, ArrayList arrayList2, List list, int i) {
        List list2 = arrayList;
        if ((i & 1) != 0) {
            list2 = rpiVar.f201591a;
        }
        if ((i & 2) != 0) {
            z = rpiVar.f201592b;
        }
        List list3 = arrayList2;
        if ((i & 4) != 0) {
            list3 = rpiVar.f201593c;
        }
        if ((i & 8) != 0) {
            list = rpiVar.f201594d;
        }
        rpiVar.getClass();
        return new rpi(list2, z, list3, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rpi)) {
            return false;
        }
        rpi rpiVar = (rpi) obj;
        return wj50.m88271j(this.f201591a, rpiVar.f201591a) && this.f201592b == rpiVar.f201592b && wj50.m88271j(this.f201593c, rpiVar.f201593c) && wj50.m88271j(this.f201594d, rpiVar.f201594d);
    }

    public final int hashCode() {
        return this.f201594d.hashCode() + s571.m77244c(s571.m77245d(this.f201591a.hashCode() * 31, 31, this.f201592b), 31, this.f201593c);
    }
}
