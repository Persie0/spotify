package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class tca {

    /* JADX INFO: renamed from: a */
    public final int f219048a;

    /* JADX INFO: renamed from: b */
    public final int f219049b;

    /* JADX INFO: renamed from: c */
    public final int f219050c;

    /* JADX INFO: renamed from: d */
    public final int f219051d;

    /* JADX INFO: renamed from: e */
    public final int f219052e;

    /* JADX INFO: renamed from: f */
    public final int f219053f;

    /* JADX INFO: renamed from: g */
    public final int f219054g;

    public tca(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f219048a = i;
        this.f219049b = i2;
        this.f219050c = i3;
        this.f219051d = i4;
        this.f219052e = i5;
        this.f219053f = i6;
        this.f219054g = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tca)) {
            return false;
        }
        tca tcaVar = (tca) obj;
        return this.f219048a == tcaVar.f219048a && this.f219049b == tcaVar.f219049b && this.f219050c == tcaVar.f219050c && this.f219051d == tcaVar.f219051d && this.f219052e == tcaVar.f219052e && this.f219053f == tcaVar.f219053f && this.f219054g == tcaVar.f219054g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f219054g) + mt60.m62800g(this.f219053f, mt60.m62800g(this.f219052e, mt60.m62800g(this.f219051d, mt60.m62800g(this.f219050c, mt60.m62800g(this.f219049b, Integer.hashCode(this.f219048a) * 31, 31), 31), 31), 31), 31);
    }
}
