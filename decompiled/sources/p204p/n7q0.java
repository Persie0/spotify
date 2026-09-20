package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class n7q0 {

    /* JADX INFO: renamed from: a */
    public final int f151201a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f151202b;

    public n7q0(int i, ArrayList arrayList) {
        this.f151201a = i;
        this.f151202b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7q0)) {
            return false;
        }
        n7q0 n7q0Var = (n7q0) obj;
        return this.f151201a == n7q0Var.f151201a && this.f151202b.equals(n7q0Var.f151202b);
    }

    public final int hashCode() {
        return this.f151202b.hashCode() + (Integer.hashCode(this.f151201a) * 31);
    }
}
