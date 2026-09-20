package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class wv11 {

    /* JADX INFO: renamed from: a */
    public final Set f255314a;

    /* JADX INFO: renamed from: b */
    public final uv11 f255315b;

    /* JADX INFO: renamed from: c */
    public final boolean f255316c;

    public /* synthetic */ wv11(Set set) {
        this(set, uv11.f234311a, true);
    }

    /* JADX INFO: renamed from: a */
    public final uv11 m89072a() {
        return this.f255315b;
    }

    /* JADX INFO: renamed from: b */
    public final Set m89073b() {
        return this.f255314a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m89074c() {
        return this.f255316c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv11)) {
            return false;
        }
        wv11 wv11Var = (wv11) obj;
        return wj50.m88271j(this.f255314a, wv11Var.f255314a) && this.f255315b == wv11Var.f255315b && this.f255316c == wv11Var.f255316c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f255316c) + ((this.f255315b.hashCode() + (this.f255314a.hashCode() * 31)) * 31);
    }

    public wv11(Set set, uv11 uv11Var, boolean z) {
        this.f255314a = set;
        this.f255315b = uv11Var;
        this.f255316c = z;
    }
}
