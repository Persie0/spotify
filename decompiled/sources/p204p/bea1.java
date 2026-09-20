package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class bea1 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f26313a;

    /* JADX INFO: renamed from: b */
    public final int f26314b;

    public bea1(int i, ArrayList arrayList) {
        this.f26313a = arrayList;
        this.f26314b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bea1)) {
            return false;
        }
        bea1 bea1Var = (bea1) obj;
        return this.f26313a.equals(bea1Var.f26313a) && this.f26314b == bea1Var.f26314b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f26314b) + (this.f26313a.hashCode() * 31);
    }
}
