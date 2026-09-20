package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class rb81 {

    /* JADX INFO: renamed from: a */
    public final int f197528a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f197529b;

    public rb81(int i, ArrayList arrayList) {
        this.f197528a = i;
        this.f197529b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb81)) {
            return false;
        }
        rb81 rb81Var = (rb81) obj;
        return this.f197528a == rb81Var.f197528a && this.f197529b.equals(rb81Var.f197529b);
    }

    public final int hashCode() {
        return this.f197529b.hashCode() + (edb.m38547C(this.f197528a) * 31);
    }
}
