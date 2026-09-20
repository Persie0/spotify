package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class rbu0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f197657a;

    /* JADX INFO: renamed from: b */
    public final boolean f197658b;

    public rbu0(ArrayList arrayList, boolean z) {
        this.f197657a = arrayList;
        this.f197658b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbu0)) {
            return false;
        }
        rbu0 rbu0Var = (rbu0) obj;
        return this.f197657a.equals(rbu0Var.f197657a) && this.f197658b == rbu0Var.f197658b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f197658b) + (this.f197657a.hashCode() * 31);
    }
}
