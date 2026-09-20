package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class j23 {

    /* JADX INFO: renamed from: a */
    public final String f107912a;

    /* JADX INFO: renamed from: b */
    public final Object f107913b;

    public j23(String str, List list) {
        this.f107912a = str;
        this.f107913b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j23)) {
            return false;
        }
        j23 j23Var = (j23) obj;
        return wj50.m88271j(this.f107912a, j23Var.f107912a) && this.f107913b.equals(j23Var.f107913b);
    }

    public final int hashCode() {
        return this.f107913b.hashCode() + (this.f107912a.hashCode() * 31);
    }
}
