package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class eu21 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f62859a;

    /* JADX INFO: renamed from: b */
    public final i3a0 f62860b;

    public eu21(ArrayList arrayList, i3a0 i3a0Var) {
        this.f62859a = arrayList;
        this.f62860b = i3a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu21)) {
            return false;
        }
        eu21 eu21Var = (eu21) obj;
        return this.f62859a.equals(eu21Var.f62859a) && this.f62860b == eu21Var.f62860b;
    }

    public final int hashCode() {
        return this.f62860b.hashCode() + (this.f62859a.hashCode() * 31);
    }
}
