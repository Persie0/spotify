package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class xf1 {

    /* JADX INFO: renamed from: a */
    public final String f260804a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f260805b;

    /* JADX INFO: renamed from: c */
    public final w00 f260806c;

    public xf1(String str, ArrayList arrayList, w00 w00Var) {
        this.f260804a = str;
        this.f260805b = arrayList;
        this.f260806c = w00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf1)) {
            return false;
        }
        xf1 xf1Var = (xf1) obj;
        return this.f260804a.equals(xf1Var.f260804a) && this.f260805b.equals(xf1Var.f260805b) && this.f260806c.equals(xf1Var.f260806c);
    }

    public final int hashCode() {
        return this.f260806c.hashCode() + lq51.m59700f(this.f260805b, this.f260804a.hashCode() * 31, 31);
    }
}
