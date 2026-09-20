package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class xh81 extends gif1 {

    /* JADX INFO: renamed from: c */
    public final String f261476c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f261477d;

    public xh81(String str, ArrayList arrayList) {
        this.f261476c = str;
        this.f261477d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh81)) {
            return false;
        }
        xh81 xh81Var = (xh81) obj;
        return wj50.m88271j(this.f261476c, xh81Var.f261476c) && this.f261477d.equals(xh81Var.f261477d);
    }

    public final int hashCode() {
        return this.f261477d.hashCode() + (this.f261476c.hashCode() * 31);
    }
}
