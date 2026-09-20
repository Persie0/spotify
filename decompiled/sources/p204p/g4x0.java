package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class g4x0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f76546a;

    /* JADX INFO: renamed from: b */
    public final int f76547b;

    public g4x0(int i, ArrayList arrayList) {
        this.f76546a = arrayList;
        this.f76547b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4x0)) {
            return false;
        }
        g4x0 g4x0Var = (g4x0) obj;
        return this.f76546a.equals(g4x0Var.f76546a) && this.f76547b == g4x0Var.f76547b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f76547b) + (this.f76546a.hashCode() * 31);
    }
}
