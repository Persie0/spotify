package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class xkz0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f262969a;

    /* JADX INFO: renamed from: b */
    public final boolean f262970b;

    public xkz0(ArrayList arrayList, boolean z) {
        this.f262969a = arrayList;
        this.f262970b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xkz0)) {
            return false;
        }
        xkz0 xkz0Var = (xkz0) obj;
        return this.f262969a.equals(xkz0Var.f262969a) && this.f262970b == xkz0Var.f262970b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f262970b) + (this.f262969a.hashCode() * 31);
    }
}
