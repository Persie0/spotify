package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class q4v implements t4v {

    /* JADX INFO: renamed from: a */
    public final boolean f185351a;

    /* JADX INFO: renamed from: b */
    public final boolean f185352b;

    public q4v(boolean z, boolean z2) {
        this.f185351a = z;
        this.f185352b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4v)) {
            return false;
        }
        q4v q4vVar = (q4v) obj;
        return this.f185351a == q4vVar.f185351a && this.f185352b == q4vVar.f185352b;
    }

    @Override // p204p.t4v
    /* JADX INFO: renamed from: f */
    public final boolean mo63686f() {
        return this.f185351a;
    }

    @Override // p204p.t4v
    /* JADX INFO: renamed from: g */
    public final int mo63687g() {
        return 0;
    }

    @Override // p204p.t4v
    public final boolean getEnabled() {
        return this.f185352b;
    }

    @Override // p204p.t4v
    /* JADX INFO: renamed from: h */
    public final int mo63688h() {
        return 1;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f185352b) + (Boolean.hashCode(this.f185351a) * 31);
    }
}
