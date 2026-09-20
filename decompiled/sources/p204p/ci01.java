package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class ci01 implements pmj {

    /* JADX INFO: renamed from: a */
    public final int f38172a;

    /* JADX INFO: renamed from: b */
    public final iw4 f38173b;

    /* JADX INFO: renamed from: c */
    public final iw4 f38174c;

    /* JADX INFO: renamed from: d */
    public final iw4 f38175d;

    /* JADX INFO: renamed from: e */
    public final boolean f38176e;

    public ci01(String str, int i, iw4 iw4Var, iw4 iw4Var2, iw4 iw4Var3, boolean z) {
        this.f38172a = i;
        this.f38173b = iw4Var;
        this.f38174c = iw4Var2;
        this.f38175d = iw4Var3;
        this.f38176e = z;
    }

    @Override // p204p.pmj
    /* JADX INFO: renamed from: a */
    public final hej mo26175a(r9b0 r9b0Var, u8b0 u8b0Var, oz8 oz8Var) {
        return new vk91(oz8Var, this);
    }

    /* JADX INFO: renamed from: b */
    public final iw4 m32825b() {
        return this.f38174c;
    }

    /* JADX INFO: renamed from: c */
    public final iw4 m32826c() {
        return this.f38175d;
    }

    /* JADX INFO: renamed from: d */
    public final iw4 m32827d() {
        return this.f38173b;
    }

    /* JADX INFO: renamed from: e */
    public final int m32828e() {
        return this.f38172a;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m32829f() {
        return this.f38176e;
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f38173b + ", end: " + this.f38174c + ", offset: " + this.f38175d + "}";
    }
}
