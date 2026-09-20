package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class o981 implements moc1 {

    /* JADX INFO: renamed from: a */
    public final String f162964a;

    /* JADX INFO: renamed from: b */
    public final String f162965b;

    /* JADX INFO: renamed from: c */
    public final int f162966c;

    /* JADX INFO: renamed from: d */
    public final int f162967d;

    /* JADX INFO: renamed from: e */
    public final int f162968e;

    /* JADX INFO: renamed from: f */
    public final boolean f162969f;

    /* JADX INFO: renamed from: g */
    public final boolean f162970g;

    /* JADX INFO: renamed from: h */
    public final u881 f162971h;

    public o981(String str, String str2, int i, int i2, int i3, boolean z, boolean z2, u881 u881Var) {
        this.f162964a = str;
        this.f162965b = str2;
        this.f162966c = i;
        this.f162967d = i2;
        this.f162968e = i3;
        this.f162969f = z;
        this.f162970g = z2;
        this.f162971h = u881Var;
    }

    @Override // p204p.moc1
    /* JADX INFO: renamed from: a */
    public final int mo28648a() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o981)) {
            return false;
        }
        o981 o981Var = (o981) obj;
        return wj50.m88271j(this.f162964a, o981Var.f162964a) && wj50.m88271j(this.f162965b, o981Var.f162965b) && this.f162966c == o981Var.f162966c && this.f162967d == o981Var.f162967d && this.f162968e == o981Var.f162968e && this.f162969f == o981Var.f162969f && this.f162970g == o981Var.f162970g && wj50.m88271j(this.f162971h, o981Var.f162971h);
    }

    public final int hashCode() {
        return this.f162971h.hashCode() + s571.m77245d(s571.m77245d(mt60.m62800g(this.f162968e, mt60.m62800g(this.f162967d, mt60.m62800g(this.f162966c, s571.m77243b(this.f162964a.hashCode() * 31, 31, this.f162965b), 31), 31), 31), 31, this.f162969f), 31, this.f162970g);
    }
}
