package p204p;

import java.util.Date;

/* JADX INFO: loaded from: classes5.dex */
public final class n881 {

    /* JADX INFO: renamed from: a */
    public final int f151393a;

    /* JADX INFO: renamed from: b */
    public final int f151394b;

    /* JADX INFO: renamed from: c */
    public final Date f151395c;

    /* JADX INFO: renamed from: d */
    public final Date f151396d;

    public n881(int i, int i2, Date date, Date date2) {
        this.f151393a = i;
        this.f151394b = i2;
        this.f151395c = date;
        this.f151396d = date2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n881)) {
            return false;
        }
        n881 n881Var = (n881) obj;
        return this.f151393a == n881Var.f151393a && this.f151394b == n881Var.f151394b && wj50.m88271j(this.f151395c, n881Var.f151395c) && wj50.m88271j(this.f151396d, n881Var.f151396d);
    }

    public final int hashCode() {
        return this.f151396d.hashCode() + ((this.f151395c.hashCode() + mt60.m62800g(this.f151394b, Integer.hashCode(this.f151393a) * 31, 31)) * 31);
    }
}
