package p204p;

import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class t1t {

    /* JADX INFO: renamed from: a */
    public final boolean f216350a;

    /* JADX INFO: renamed from: b */
    public final Set f216351b;

    /* JADX INFO: renamed from: c */
    public final boolean f216352c;

    public t1t(boolean z, Set set, boolean z2) {
        this.f216350a = z;
        this.f216351b = set;
        this.f216352c = z2;
    }

    /* JADX INFO: renamed from: a */
    public static t1t m79883a(t1t t1tVar, boolean z, Set set, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = t1tVar.f216350a;
        }
        if ((i & 2) != 0) {
            set = t1tVar.f216351b;
        }
        if ((i & 4) != 0) {
            z2 = t1tVar.f216352c;
        }
        t1tVar.getClass();
        return new t1t(z, set, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1t)) {
            return false;
        }
        t1t t1tVar = (t1t) obj;
        return this.f216350a == t1tVar.f216350a && wj50.m88271j(this.f216351b, t1tVar.f216351b) && this.f216352c == t1tVar.f216352c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f216352c) + klh.m56830b(Boolean.hashCode(this.f216350a) * 31, 31, this.f216351b);
    }
}
