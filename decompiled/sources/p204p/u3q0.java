package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class u3q0 extends c4q0 {

    /* JADX INFO: renamed from: a */
    public final String f226420a;

    /* JADX INFO: renamed from: b */
    public final boolean f226421b;

    /* JADX INFO: renamed from: c */
    public final boolean f226422c;

    public u3q0(String str, boolean z, boolean z2) {
        this.f226420a = str;
        this.f226421b = z;
        this.f226422c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3q0)) {
            return false;
        }
        u3q0 u3q0Var = (u3q0) obj;
        return wj50.m88271j(this.f226420a, u3q0Var.f226420a) && this.f226421b == u3q0Var.f226421b && this.f226422c == u3q0Var.f226422c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f226422c) + s571.m77245d(this.f226420a.hashCode() * 31, 31, this.f226421b);
    }
}
