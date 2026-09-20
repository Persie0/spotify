package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class eh71 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f59513a;

    /* JADX INFO: renamed from: b */
    public final int f59514b;

    public eh71(int i, ArrayList arrayList) {
        this.f59513a = arrayList;
        this.f59514b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh71)) {
            return false;
        }
        eh71 eh71Var = (eh71) obj;
        return this.f59513a.equals(eh71Var.f59513a) && this.f59514b == eh71Var.f59514b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59514b) + (this.f59513a.hashCode() * 31);
    }
}
