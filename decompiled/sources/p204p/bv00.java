package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class bv00 implements j0w0 {

    /* JADX INFO: renamed from: a */
    public final String f31245a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f31246b;

    public bv00(String str, ArrayList arrayList) {
        this.f31245a = str;
        this.f31246b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv00)) {
            return false;
        }
        bv00 bv00Var = (bv00) obj;
        return wj50.m88271j(this.f31245a, bv00Var.f31245a) && this.f31246b.equals(bv00Var.f31246b);
    }

    public final int hashCode() {
        return this.f31246b.hashCode() + (this.f31245a.hashCode() * 31);
    }
}
