package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class r9z0 {

    /* JADX INFO: renamed from: a */
    public final Integer f197145a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f197146b;

    public r9z0(Integer num, ArrayList arrayList) {
        this.f197145a = num;
        this.f197146b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9z0)) {
            return false;
        }
        r9z0 r9z0Var = (r9z0) obj;
        return wj50.m88271j(this.f197145a, r9z0Var.f197145a) && this.f197146b.equals(r9z0Var.f197146b);
    }

    public final int hashCode() {
        Integer num = this.f197145a;
        return this.f197146b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }
}
