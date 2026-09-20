package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class n630 {

    /* JADX INFO: renamed from: a */
    public final String f150672a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f150673b;

    /* JADX INFO: renamed from: c */
    public final un20 f150674c;

    /* JADX INFO: renamed from: d */
    public final String f150675d;

    public n630(String str, String str2, ArrayList arrayList, un20 un20Var) {
        this.f150672a = str;
        this.f150673b = arrayList;
        this.f150674c = un20Var;
        this.f150675d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n630)) {
            return false;
        }
        n630 n630Var = (n630) obj;
        return this.f150672a.equals(n630Var.f150672a) && this.f150673b.equals(n630Var.f150673b) && wj50.m88271j(this.f150674c, n630Var.f150674c) && this.f150675d.equals(n630Var.f150675d);
    }

    public final int hashCode() {
        int iM59700f = lq51.m59700f(this.f150673b, this.f150672a.hashCode() * 31, 31);
        un20 un20Var = this.f150674c;
        return this.f150675d.hashCode() + ((iM59700f + (un20Var == null ? 0 : un20Var.hashCode())) * 31);
    }
}
