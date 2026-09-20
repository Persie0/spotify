package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class z8f0 {

    /* JADX INFO: renamed from: a */
    public final String f280464a;

    /* JADX INFO: renamed from: b */
    public final cvr f280465b;

    /* JADX INFO: renamed from: c */
    public final String f280466c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f280467d;

    public z8f0(String str, cvr cvrVar, String str2, ArrayList arrayList) {
        this.f280464a = str;
        this.f280465b = cvrVar;
        this.f280466c = str2;
        this.f280467d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z8f0)) {
            return false;
        }
        z8f0 z8f0Var = (z8f0) obj;
        return wj50.m88271j(this.f280464a, z8f0Var.f280464a) && this.f280465b.equals(z8f0Var.f280465b) && wj50.m88271j(this.f280466c, z8f0Var.f280466c) && this.f280467d.equals(z8f0Var.f280467d);
    }

    public final int hashCode() {
        int iHashCode = (this.f280465b.hashCode() + (this.f280464a.hashCode() * 31)) * 31;
        String str = this.f280466c;
        return this.f280467d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
