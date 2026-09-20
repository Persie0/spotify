package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class pb9 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f175739a;

    /* JADX INFO: renamed from: b */
    public final List f175740b;

    /* JADX INFO: renamed from: c */
    public final List f175741c;

    public pb9(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f175739a = arrayList;
        this.f175740b = arrayList2;
        this.f175741c = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb9)) {
            return false;
        }
        pb9 pb9Var = (pb9) obj;
        return this.f175739a.equals(pb9Var.f175739a) && wj50.m88271j(this.f175740b, pb9Var.f175740b) && wj50.m88271j(this.f175741c, pb9Var.f175741c);
    }

    public final int hashCode() {
        int iHashCode = this.f175739a.hashCode() * 31;
        List list = this.f175740b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f175741c;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }
}
