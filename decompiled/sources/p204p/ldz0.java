package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ldz0 {

    /* JADX INFO: renamed from: a */
    public final List f132379a;

    /* JADX INFO: renamed from: b */
    public final List f132380b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f132381c;

    public ldz0(List list, List list2, ArrayList arrayList) {
        this.f132379a = list;
        this.f132380b = list2;
        this.f132381c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldz0)) {
            return false;
        }
        ldz0 ldz0Var = (ldz0) obj;
        return wj50.m88271j(this.f132379a, ldz0Var.f132379a) && wj50.m88271j(this.f132380b, ldz0Var.f132380b) && this.f132381c.equals(ldz0Var.f132381c);
    }

    public final int hashCode() {
        return this.f132381c.hashCode() + s571.m77244c(this.f132379a.hashCode() * 31, 31, this.f132380b);
    }
}
