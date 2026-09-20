package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class ifl0 extends mfl0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f101780a;

    /* JADX INFO: renamed from: b */
    public final String f101781b;

    public ifl0(ArrayList arrayList, String str) {
        this.f101780a = arrayList;
        this.f101781b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifl0)) {
            return false;
        }
        ifl0 ifl0Var = (ifl0) obj;
        return this.f101780a.equals(ifl0Var.f101780a) && wj50.m88271j(this.f101781b, ifl0Var.f101781b);
    }

    public final int hashCode() {
        return this.f101781b.hashCode() + (this.f101780a.hashCode() * 31);
    }
}
