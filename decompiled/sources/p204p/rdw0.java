package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes10.dex */
public final class rdw0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f198218a;

    /* JADX INFO: renamed from: b */
    public final int f198219b;

    public rdw0(int i, ArrayList arrayList) {
        this.f198218a = arrayList;
        this.f198219b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdw0)) {
            return false;
        }
        rdw0 rdw0Var = (rdw0) obj;
        return this.f198218a.equals(rdw0Var.f198218a) && this.f198219b == rdw0Var.f198219b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f198219b) + (this.f198218a.hashCode() * 31);
    }
}
