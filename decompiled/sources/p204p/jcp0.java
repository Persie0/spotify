package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class jcp0 {

    /* JADX INFO: renamed from: a */
    public final String f111164a;

    /* JADX INFO: renamed from: b */
    public final boolean f111165b;

    /* JADX INFO: renamed from: c */
    public final boolean f111166c;

    /* JADX INFO: renamed from: d */
    public final boolean f111167d;

    /* JADX INFO: renamed from: e */
    public final boolean f111168e;

    /* JADX INFO: renamed from: f */
    public final boolean f111169f;

    /* JADX INFO: renamed from: g */
    public final boolean f111170g;

    /* JADX INFO: renamed from: h */
    public final t5m f111171h;

    public jcp0(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, t5m t5mVar) {
        this.f111164a = str;
        this.f111165b = z;
        this.f111166c = z2;
        this.f111167d = z3;
        this.f111168e = z4;
        this.f111169f = z5;
        this.f111170g = z6;
        this.f111171h = t5mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcp0)) {
            return false;
        }
        jcp0 jcp0Var = (jcp0) obj;
        return wj50.m88271j(this.f111164a, jcp0Var.f111164a) && this.f111165b == jcp0Var.f111165b && this.f111166c == jcp0Var.f111166c && this.f111167d == jcp0Var.f111167d && this.f111168e == jcp0Var.f111168e && this.f111169f == jcp0Var.f111169f && this.f111170g == jcp0Var.f111170g && this.f111171h == jcp0Var.f111171h;
    }

    public final int hashCode() {
        return this.f111171h.hashCode() + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(this.f111164a.hashCode() * 31, 31, this.f111165b), 31, this.f111166c), 31, this.f111167d), 31, this.f111168e), 31, this.f111169f), 31, this.f111170g);
    }
}
