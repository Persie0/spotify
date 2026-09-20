package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class uu40 implements vu40 {

    /* JADX INFO: renamed from: a */
    public final String f234102a;

    /* JADX INFO: renamed from: b */
    public final String f234103b;

    /* JADX INFO: renamed from: c */
    public final String f234104c;

    /* JADX INFO: renamed from: d */
    public final boolean f234105d;

    public uu40(int i, String str, String str2, boolean z, String str3) {
        z = (i & 128) != 0 ? false : z;
        this.f234102a = str;
        this.f234103b = str2;
        this.f234104c = str3;
        this.f234105d = z;
    }

    @Override // p204p.vu40
    /* JADX INFO: renamed from: a */
    public final boolean mo81548a() {
        return true;
    }

    @Override // p204p.vu40
    /* JADX INFO: renamed from: c */
    public final String mo81549c() {
        return null;
    }

    @Override // p204p.vu40
    /* JADX INFO: renamed from: d */
    public final boolean mo81550d() {
        return false;
    }

    @Override // p204p.vu40
    /* JADX INFO: renamed from: e */
    public final boolean mo81551e() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu40)) {
            return false;
        }
        uu40 uu40Var = (uu40) obj;
        return this.f234102a.equals(uu40Var.f234102a) && this.f234103b.equals(uu40Var.f234103b) && this.f234104c.equals(uu40Var.f234104c) && this.f234105d == uu40Var.f234105d;
    }

    @Override // p204p.vu40
    /* JADX INFO: renamed from: f */
    public final boolean mo81552f() {
        return this.f234105d;
    }

    @Override // p204p.vu40
    /* JADX INFO: renamed from: g */
    public final boolean mo81553g() {
        return false;
    }

    @Override // p204p.vu40
    public final String getContextUri() {
        return this.f234104c;
    }

    @Override // p204p.vu40
    public final String getUid() {
        return this.f234103b;
    }

    @Override // p204p.vu40
    public final String getUri() {
        return this.f234102a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + s571.m77245d(s571.m77245d(s571.m77245d(s571.m77243b(s571.m77245d(s571.m77243b(this.f234102a.hashCode() * 31, 31, this.f234103b), 31, true), 31, this.f234104c), 31, false), 961, false), 31, this.f234105d);
    }
}
