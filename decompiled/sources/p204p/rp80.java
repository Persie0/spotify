package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class rp80 {

    /* JADX INFO: renamed from: a */
    public final int f201460a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f201461b;

    public rp80(int i, ArrayList arrayList) {
        this.f201460a = i;
        this.f201461b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp80)) {
            return false;
        }
        rp80 rp80Var = (rp80) obj;
        return this.f201460a == rp80Var.f201460a && this.f201461b.equals(rp80Var.f201461b);
    }

    public final int hashCode() {
        return this.f201461b.hashCode() + (Integer.hashCode(this.f201460a) * 31);
    }
}
