package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class b3a0 extends c3a0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f22992a;

    /* JADX INFO: renamed from: b */
    public final int f22993b;

    public b3a0(int i, ArrayList arrayList) {
        this.f22992a = arrayList;
        this.f22993b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3a0)) {
            return false;
        }
        b3a0 b3a0Var = (b3a0) obj;
        return this.f22992a.equals(b3a0Var.f22992a) && this.f22993b == b3a0Var.f22993b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f22993b) + (this.f22992a.hashCode() * 31);
    }
}
