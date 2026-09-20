package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class v0n0 implements x0n0 {

    /* JADX INFO: renamed from: a */
    public final String f236089a;

    /* JADX INFO: renamed from: b */
    public final ss8 f236090b;

    /* JADX INFO: renamed from: c */
    public final boolean f236091c;

    public v0n0(String str, ss8 ss8Var, boolean z) {
        this.f236089a = str;
        this.f236090b = ss8Var;
        this.f236091c = z;
    }

    @Override // p204p.x0n0
    /* JADX INFO: renamed from: a */
    public final boolean mo84393a() {
        return false;
    }

    @Override // p204p.x0n0
    /* JADX INFO: renamed from: b */
    public final boolean mo84394b() {
        return this.f236091c;
    }

    @Override // p204p.x0n0
    /* JADX INFO: renamed from: c */
    public final ss8 mo84395c() {
        return this.f236090b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0n0)) {
            return false;
        }
        v0n0 v0n0Var = (v0n0) obj;
        return wj50.m88271j(this.f236089a, v0n0Var.f236089a) && this.f236090b == v0n0Var.f236090b && this.f236091c == v0n0Var.f236091c;
    }

    @Override // p204p.x0n0
    public final String getUri() {
        return this.f236089a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + s571.m77245d((this.f236090b.hashCode() + (this.f236089a.hashCode() * 31)) * 31, 31, this.f236091c);
    }
}
