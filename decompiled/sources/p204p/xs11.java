package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class xs11 extends ys11 {

    /* JADX INFO: renamed from: a */
    public final String f265454a;

    /* JADX INFO: renamed from: b */
    public final String f265455b;

    /* JADX INFO: renamed from: c */
    public final String f265456c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f265457d;

    /* JADX INFO: renamed from: e */
    public final js11 f265458e;

    public xs11(String str, String str2, String str3, ArrayList arrayList, js11 js11Var) {
        this.f265454a = str;
        this.f265455b = str2;
        this.f265456c = str3;
        this.f265457d = arrayList;
        this.f265458e = js11Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs11)) {
            return false;
        }
        xs11 xs11Var = (xs11) obj;
        return this.f265454a.equals(xs11Var.f265454a) && wj50.m88271j(this.f265455b, xs11Var.f265455b) && wj50.m88271j(this.f265456c, xs11Var.f265456c) && this.f265457d.equals(xs11Var.f265457d) && wj50.m88271j(this.f265458e, xs11Var.f265458e);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f265454a.hashCode() * 31, 31, this.f265455b);
        String str = this.f265456c;
        int iM59700f = lq51.m59700f(this.f265457d, (iM77243b + (str == null ? 0 : str.hashCode())) * 31, 31);
        js11 js11Var = this.f265458e;
        return iM59700f + (js11Var != null ? js11Var.hashCode() : 0);
    }
}
