package p204p;

import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public final class ir0 {

    /* JADX INFO: renamed from: a */
    public final Date f104874a;

    /* JADX INFO: renamed from: b */
    public final boolean f104875b;

    /* JADX INFO: renamed from: c */
    public final Date f104876c;

    public ir0(Date date, boolean z, Date date2) {
        this.f104874a = date;
        this.f104875b = z;
        this.f104876c = date2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m51419a() {
        return this.f104875b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir0)) {
            return false;
        }
        ir0 ir0Var = (ir0) obj;
        return wj50.m88271j(this.f104874a, ir0Var.f104874a) && this.f104875b == ir0Var.f104875b && wj50.m88271j(this.f104876c, ir0Var.f104876c);
    }

    public final int hashCode() {
        return this.f104876c.hashCode() + s571.m77245d(this.f104874a.hashCode() * 31, 31, this.f104875b);
    }
}
