package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class e7m0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f56959a;

    /* JADX INFO: renamed from: b */
    public final int f56960b;

    public e7m0(int i, ArrayList arrayList) {
        this.f56959a = arrayList;
        this.f56960b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e7m0)) {
            return false;
        }
        e7m0 e7m0Var = (e7m0) obj;
        return this.f56959a.equals(e7m0Var.f56959a) && this.f56960b == e7m0Var.f56960b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f56960b) + (this.f56959a.hashCode() * 31);
    }
}
