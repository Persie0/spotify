package p204p;

import java.util.Date;

/* JADX INFO: loaded from: classes7.dex */
public final class e8c0 {

    /* JADX INFO: renamed from: a */
    public final boolean f57137a;

    /* JADX INFO: renamed from: b */
    public final boolean f57138b;

    /* JADX INFO: renamed from: c */
    public final Date f57139c;

    public e8c0(boolean z, boolean z2, Date date) {
        this.f57137a = z;
        this.f57138b = z2;
        this.f57139c = date;
    }

    /* JADX INFO: renamed from: a */
    public static e8c0 m38091a(e8c0 e8c0Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = e8c0Var.f57137a;
        }
        if ((i & 2) != 0) {
            z2 = e8c0Var.f57138b;
        }
        Date date = e8c0Var.f57139c;
        e8c0Var.getClass();
        return new e8c0(z, z2, date);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8c0)) {
            return false;
        }
        e8c0 e8c0Var = (e8c0) obj;
        return this.f57137a == e8c0Var.f57137a && this.f57138b == e8c0Var.f57138b && wj50.m88271j(this.f57139c, e8c0Var.f57139c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(Boolean.hashCode(this.f57137a) * 31, 31, this.f57138b);
        Date date = this.f57139c;
        return iM77245d + (date == null ? 0 : date.hashCode());
    }
}
