package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class maj0 implements uaj0 {

    /* JADX INFO: renamed from: a */
    public final int f141601a;

    /* JADX INFO: renamed from: b */
    public final String f141602b;

    /* JADX INFO: renamed from: c */
    public final List f141603c;

    /* JADX INFO: renamed from: d */
    public final boolean f141604d;

    /* JADX INFO: renamed from: e */
    public final taj0 f141605e;

    /* JADX INFO: renamed from: f */
    public final boolean f141606f;

    /* JADX INFO: renamed from: g */
    public final gh00 f141607g;

    public maj0(int i, String str, List list, boolean z, taj0 taj0Var, boolean z2, gh00 gh00Var) {
        this.f141601a = i;
        this.f141602b = str;
        this.f141603c = list;
        this.f141604d = z;
        this.f141605e = taj0Var;
        this.f141606f = z2;
        this.f141607g = gh00Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m61311a() {
        return this.f141604d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!maj0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        maj0 maj0Var = (maj0) obj;
        return this.f141601a == maj0Var.f141601a && wj50.m88271j(this.f141602b, maj0Var.f141602b) && this.f141603c.equals(maj0Var.f141603c) && this.f141604d == maj0Var.f141604d && this.f141605e.equals(maj0Var.f141605e) && this.f141606f == maj0Var.f141606f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f141606f) + ((this.f141605e.hashCode() + s571.m77245d(s571.m77244c(s571.m77243b(Integer.hashCode(this.f141601a) * 31, 31, this.f141602b), 31, this.f141603c), 31, this.f141604d)) * 31);
    }
}
