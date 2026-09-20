package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class it3 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f105409a;

    /* JADX INFO: renamed from: b */
    public final boolean f105410b;

    public it3(ArrayList arrayList, boolean z) {
        this.f105409a = arrayList;
        this.f105410b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it3)) {
            return false;
        }
        it3 it3Var = (it3) obj;
        return this.f105409a.equals(it3Var.f105409a) && this.f105410b == it3Var.f105410b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f105410b) + (this.f105409a.hashCode() * 31);
    }
}
