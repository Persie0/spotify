package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class w0n0 implements x0n0 {

    /* JADX INFO: renamed from: a */
    public final String f246777a;

    /* JADX INFO: renamed from: b */
    public final ss8 f246778b;

    /* JADX INFO: renamed from: c */
    public final boolean f246779c;

    /* JADX INFO: renamed from: d */
    public final boolean f246780d;

    /* JADX INFO: renamed from: e */
    public final String f246781e;

    public w0n0(String str, String str2, ss8 ss8Var, boolean z, boolean z2) {
        this.f246777a = str;
        this.f246778b = ss8Var;
        this.f246779c = z;
        this.f246780d = z2;
        this.f246781e = str2;
    }

    @Override // p204p.x0n0
    /* JADX INFO: renamed from: a */
    public final boolean mo84393a() {
        return this.f246780d;
    }

    @Override // p204p.x0n0
    /* JADX INFO: renamed from: b */
    public final boolean mo84394b() {
        return this.f246779c;
    }

    @Override // p204p.x0n0
    /* JADX INFO: renamed from: c */
    public final ss8 mo84395c() {
        return this.f246778b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0n0)) {
            return false;
        }
        w0n0 w0n0Var = (w0n0) obj;
        return wj50.m88271j(this.f246777a, w0n0Var.f246777a) && this.f246778b == w0n0Var.f246778b && this.f246779c == w0n0Var.f246779c && this.f246780d == w0n0Var.f246780d && wj50.m88271j(this.f246781e, w0n0Var.f246781e);
    }

    @Override // p204p.x0n0
    public final String getUri() {
        return this.f246777a;
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(s571.m77245d((this.f246778b.hashCode() + (this.f246777a.hashCode() * 31)) * 31, 31, this.f246779c), 31, this.f246780d);
        String str = this.f246781e;
        return iM77245d + (str == null ? 0 : str.hashCode());
    }
}
