package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class xme1 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f263350a;

    /* JADX INFO: renamed from: b */
    public final up60 f263351b;

    /* JADX INFO: renamed from: c */
    public final wwf f263352c;

    /* JADX INFO: renamed from: d */
    public final v47 f263353d;

    /* JADX INFO: renamed from: e */
    public final ene1 f263354e;

    public xme1(ArrayList arrayList, up60 up60Var, wwf wwfVar, v47 v47Var, ene1 ene1Var) {
        this.f263350a = arrayList;
        this.f263351b = up60Var;
        this.f263352c = wwfVar;
        this.f263353d = v47Var;
        this.f263354e = ene1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xme1)) {
            return false;
        }
        xme1 xme1Var = (xme1) obj;
        return this.f263350a.equals(xme1Var.f263350a) && wj50.m88271j(this.f263351b, xme1Var.f263351b) && wj50.m88271j(this.f263352c, xme1Var.f263352c) && this.f263353d.equals(xme1Var.f263353d) && this.f263354e.equals(xme1Var.f263354e);
    }

    public final int hashCode() {
        return this.f263354e.hashCode() + ((this.f263353d.hashCode() + ((this.f263352c.hashCode() + ((this.f263351b.hashCode() + (this.f263350a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
