package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class cad1 {

    /* JADX INFO: renamed from: a */
    public final String f35806a;

    /* JADX INFO: renamed from: b */
    public final rzd1 f35807b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f35808c;

    public cad1(String str, ArrayList arrayList, rzd1 rzd1Var) {
        this.f35806a = str;
        this.f35807b = rzd1Var;
        this.f35808c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cad1)) {
            return false;
        }
        cad1 cad1Var = (cad1) obj;
        return wj50.m88271j(this.f35806a, cad1Var.f35806a) && this.f35807b.equals(cad1Var.f35807b) && this.f35808c.equals(cad1Var.f35808c);
    }

    public final int hashCode() {
        return this.f35808c.hashCode() + ((this.f35807b.hashCode() + (this.f35806a.hashCode() * 31)) * 31);
    }
}
