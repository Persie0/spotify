package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class e6z0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f56780a;

    /* JADX INFO: renamed from: b */
    public final String f56781b;

    public e6z0(ArrayList arrayList, String str) {
        this.f56780a = arrayList;
        this.f56781b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6z0)) {
            return false;
        }
        e6z0 e6z0Var = (e6z0) obj;
        return this.f56780a.equals(e6z0Var.f56780a) && wj50.m88271j(this.f56781b, e6z0Var.f56781b);
    }

    public final int hashCode() {
        int iHashCode = this.f56780a.hashCode() * 31;
        String str = this.f56781b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
