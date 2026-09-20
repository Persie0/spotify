package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class j0r0 {

    /* JADX INFO: renamed from: a */
    public final String f107541a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f107542b;

    public j0r0(String str, ArrayList arrayList) {
        this.f107541a = str;
        this.f107542b = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final String m52106a() {
        return this.f107541a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0r0)) {
            return false;
        }
        j0r0 j0r0Var = (j0r0) obj;
        return wj50.m88271j(this.f107541a, j0r0Var.f107541a) && this.f107542b.equals(j0r0Var.f107542b);
    }

    public final int hashCode() {
        return this.f107542b.hashCode() + (this.f107541a.hashCode() * 31);
    }
}
