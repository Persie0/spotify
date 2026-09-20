package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class vke0 {

    /* JADX INFO: renamed from: a */
    public final String f242212a;

    /* JADX INFO: renamed from: b */
    public final String f242213b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f242214c;

    public vke0(String str, String str2, ArrayList arrayList) {
        this.f242212a = str;
        this.f242213b = str2;
        this.f242214c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vke0)) {
            return false;
        }
        vke0 vke0Var = (vke0) obj;
        return wj50.m88271j(this.f242212a, vke0Var.f242212a) && wj50.m88271j(this.f242213b, vke0Var.f242213b) && this.f242214c.equals(vke0Var.f242214c);
    }

    public final int hashCode() {
        return this.f242214c.hashCode() + s571.m77243b(this.f242212a.hashCode() * 31, 31, this.f242213b);
    }
}
