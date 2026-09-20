package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class qh81 extends uh81 {

    /* JADX INFO: renamed from: a */
    public final String f188682a;

    /* JADX INFO: renamed from: b */
    public final String f188683b;

    /* JADX INFO: renamed from: c */
    public final boolean f188684c;

    /* JADX INFO: renamed from: d */
    public final List f188685d;

    /* JADX INFO: renamed from: e */
    public final String f188686e;

    /* JADX INFO: renamed from: f */
    public final oh81 f188687f;

    /* JADX INFO: renamed from: g */
    public final String f188688g;

    /* JADX INFO: renamed from: h */
    public final boolean f188689h;

    public qh81(String str, String str2, boolean z, List list, String str3, oh81 oh81Var, String str4, boolean z2) {
        this.f188682a = str;
        this.f188683b = str2;
        this.f188684c = z;
        this.f188685d = list;
        this.f188686e = str3;
        this.f188687f = oh81Var;
        this.f188688g = str4;
        this.f188689h = z2;
    }

    /* JADX INFO: renamed from: b */
    public static qh81 m72791b(qh81 qh81Var, boolean z, oh81 oh81Var, int i) {
        String str = qh81Var.f188682a;
        String str2 = qh81Var.f188683b;
        if ((i & 4) != 0) {
            z = qh81Var.f188684c;
        }
        boolean z2 = z;
        List list = qh81Var.f188685d;
        String str3 = qh81Var.f188686e;
        if ((i & 32) != 0) {
            oh81Var = qh81Var.f188687f;
        }
        return new qh81(str, str2, z2, list, str3, oh81Var, qh81Var.f188688g, qh81Var.f188689h);
    }

    @Override // p204p.uh81
    /* JADX INFO: renamed from: a */
    public final String mo72792a() {
        return this.f188682a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh81)) {
            return false;
        }
        qh81 qh81Var = (qh81) obj;
        return wj50.m88271j(this.f188682a, qh81Var.f188682a) && wj50.m88271j(this.f188683b, qh81Var.f188683b) && this.f188684c == qh81Var.f188684c && wj50.m88271j(this.f188685d, qh81Var.f188685d) && wj50.m88271j(this.f188686e, qh81Var.f188686e) && wj50.m88271j(this.f188687f, qh81Var.f188687f) && wj50.m88271j(this.f188688g, qh81Var.f188688g) && this.f188689h == qh81Var.f188689h;
    }

    public final int hashCode() {
        int iHashCode = (this.f188687f.hashCode() + s571.m77243b(s571.m77244c(s571.m77245d(s571.m77243b(this.f188682a.hashCode() * 31, 31, this.f188683b), 31, this.f188684c), 31, this.f188685d), 31, this.f188686e)) * 31;
        String str = this.f188688g;
        return Boolean.hashCode(this.f188689h) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
