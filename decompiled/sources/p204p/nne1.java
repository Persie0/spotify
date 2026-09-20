package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class nne1 {

    /* JADX INFO: renamed from: a */
    public final cme1 f156408a;

    /* JADX INFO: renamed from: b */
    public final cme1 f156409b;

    /* JADX INFO: renamed from: c */
    public final cme1 f156410c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f156411d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f156412e;

    public nne1(cme1 cme1Var, cme1 cme1Var2, cme1 cme1Var3, ArrayList arrayList, ArrayList arrayList2) {
        this.f156408a = cme1Var;
        this.f156409b = cme1Var2;
        this.f156410c = cme1Var3;
        this.f156411d = arrayList;
        this.f156412e = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nne1)) {
            return false;
        }
        nne1 nne1Var = (nne1) obj;
        return this.f156408a.equals(nne1Var.f156408a) && this.f156409b.equals(nne1Var.f156409b) && this.f156410c.equals(nne1Var.f156410c) && this.f156411d.equals(nne1Var.f156411d) && this.f156412e.equals(nne1Var.f156412e);
    }

    public final int hashCode() {
        return this.f156412e.hashCode() + lq51.m59700f(this.f156411d, (this.f156410c.hashCode() + ((this.f156409b.hashCode() + (this.f156408a.hashCode() * 31)) * 31)) * 31, 31);
    }
}
