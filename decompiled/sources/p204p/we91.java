package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes6.dex */
public final class we91 {

    /* JADX INFO: renamed from: a */
    public final boolean f250491a;

    /* JADX INFO: renamed from: b */
    public final String f250492b;

    /* JADX INFO: renamed from: c */
    public final String f250493c;

    /* JADX INFO: renamed from: d */
    public final String f250494d;

    /* JADX INFO: renamed from: e */
    public final boolean f250495e;

    /* JADX INFO: renamed from: f */
    public final String f250496f;

    /* JADX INFO: renamed from: g */
    public final boolean f250497g;

    /* JADX INFO: renamed from: h */
    public final int f250498h;

    public we91(int i, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.f250491a = z;
        this.f250492b = str;
        this.f250493c = str2;
        this.f250494d = str3;
        this.f250495e = z2;
        this.f250496f = str4;
        this.f250497g = z3;
        this.f250498h = i;
    }

    /* JADX INFO: renamed from: a */
    public static we91 m87873a(we91 we91Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = we91Var.f250491a;
        }
        boolean z3 = z;
        String str = we91Var.f250492b;
        we91Var.getClass();
        we91Var.getClass();
        we91Var.getClass();
        String str2 = we91Var.f250493c;
        String str3 = we91Var.f250494d;
        boolean z4 = we91Var.f250495e;
        String str4 = we91Var.f250496f;
        if ((i & 512) != 0) {
            z2 = we91Var.f250497g;
        }
        int i2 = we91Var.f250498h;
        we91Var.getClass();
        return new we91(i2, str, str2, str3, str4, z3, z4, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we91)) {
            return false;
        }
        we91 we91Var = (we91) obj;
        return this.f250491a == we91Var.f250491a && this.f250492b.equals(we91Var.f250492b) && Float.compare(0.0f, 0.0f) == 0 && this.f250493c.equals(we91Var.f250493c) && wj50.m88271j(this.f250494d, we91Var.f250494d) && this.f250495e == we91Var.f250495e && this.f250496f.equals(we91Var.f250496f) && this.f250497g == we91Var.f250497g && this.f250498h == we91Var.f250498h;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77243b(s571.m77245d(s571.m77243b(s571.m77243b(AbstractC0000a.m8g(s571.m77243b(Boolean.hashCode(this.f250491a) * 31, 31, this.f250492b), 29791, 0.0f), 31, this.f250493c), 31, this.f250494d), 31, this.f250495e), 31, this.f250496f), 31, this.f250497g);
        int i = this.f250498h;
        return iM77245d + (i == 0 ? 0 : edb.m38547C(i));
    }
}
