package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class i9i0 {

    /* JADX INFO: renamed from: a */
    public final String f100016a;

    /* JADX INFO: renamed from: b */
    public final int f100017b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f100018c;

    /* JADX INFO: renamed from: d */
    public final String f100019d;

    /* JADX INFO: renamed from: e */
    public final String f100020e;

    /* JADX INFO: renamed from: f */
    public final String f100021f;

    /* JADX INFO: renamed from: g */
    public final String f100022g;

    /* JADX INFO: renamed from: h */
    public final String f100023h;

    public i9i0(int i, String str, String str2, String str3, String str4, String str5, String str6, ArrayList arrayList) {
        this.f100016a = str;
        this.f100017b = i;
        this.f100018c = arrayList;
        this.f100019d = str2;
        this.f100020e = str3;
        this.f100021f = str4;
        this.f100022g = str5;
        this.f100023h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9i0)) {
            return false;
        }
        i9i0 i9i0Var = (i9i0) obj;
        return this.f100016a.equals(i9i0Var.f100016a) && this.f100017b == i9i0Var.f100017b && this.f100018c.equals(i9i0Var.f100018c) && this.f100019d.equals(i9i0Var.f100019d) && this.f100020e.equals(i9i0Var.f100020e) && this.f100021f.equals(i9i0Var.f100021f) && this.f100022g.equals(i9i0Var.f100022g) && this.f100023h.equals(i9i0Var.f100023h);
    }

    public final int hashCode() {
        return s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(s571.m77243b(lq51.m59700f(this.f100018c, mt60.m62800g(this.f100017b, this.f100016a.hashCode() * 31, 31), 31), 31, this.f100019d), 31, this.f100020e), 31, this.f100021f), 31, this.f100022g), 31, this.f100023h);
    }
}
