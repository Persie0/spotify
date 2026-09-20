package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class zzr implements a0s {

    /* JADX INFO: renamed from: a */
    public final boolean f288062a;

    /* JADX INFO: renamed from: b */
    public final boolean f288063b;

    /* JADX INFO: renamed from: c */
    public final boolean f288064c;

    /* JADX INFO: renamed from: d */
    public final boolean f288065d;

    /* JADX INFO: renamed from: e */
    public final boolean f288066e;

    /* JADX INFO: renamed from: f */
    public final boolean f288067f;

    /* JADX INFO: renamed from: g */
    public final boolean f288068g;

    public zzr(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f288062a = z;
        this.f288063b = z2;
        this.f288064c = z3;
        this.f288065d = z4;
        this.f288066e = z5;
        this.f288067f = z6;
        this.f288068g = z7;
    }

    @Override // p204p.a0s
    /* JADX INFO: renamed from: a */
    public final boolean mo24385a() {
        return this.f288064c;
    }

    @Override // p204p.a0s
    /* JADX INFO: renamed from: b */
    public final boolean mo24386b() {
        return this.f288063b;
    }

    @Override // p204p.a0s
    /* JADX INFO: renamed from: c */
    public final boolean mo24387c() {
        return this.f288067f;
    }

    @Override // p204p.a0s
    /* JADX INFO: renamed from: d */
    public final boolean mo24388d() {
        return this.f288066e;
    }

    @Override // p204p.a0s
    /* JADX INFO: renamed from: e */
    public final boolean mo24389e() {
        return this.f288068g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzr)) {
            return false;
        }
        zzr zzrVar = (zzr) obj;
        return this.f288062a == zzrVar.f288062a && this.f288063b == zzrVar.f288063b && this.f288064c == zzrVar.f288064c && this.f288065d == zzrVar.f288065d && this.f288066e == zzrVar.f288066e && this.f288067f == zzrVar.f288067f && this.f288068g == zzrVar.f288068g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f288068g) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(s571.m77245d(Boolean.hashCode(this.f288062a) * 31, 31, this.f288063b), 31, this.f288064c), 31, this.f288065d), 31, this.f288066e), 31, this.f288067f);
    }
}
