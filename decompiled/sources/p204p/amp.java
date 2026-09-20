package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class amp {

    /* JADX INFO: renamed from: a */
    public dkv0 f17170a;

    /* JADX INFO: renamed from: b */
    public dkv0 f17171b;

    /* JADX INFO: renamed from: c */
    public final int f17172c;

    /* JADX INFO: renamed from: d */
    public final int f17173d;

    /* JADX INFO: renamed from: e */
    public final int f17174e;

    /* JADX INFO: renamed from: f */
    public final int f17175f;

    public amp(dkv0 dkv0Var, dkv0 dkv0Var2, int i, int i2, int i3, int i4) {
        this.f17170a = dkv0Var;
        this.f17171b = dkv0Var2;
        this.f17172c = i;
        this.f17173d = i2;
        this.f17174e = i3;
        this.f17175f = i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
        sb.append(this.f17170a);
        sb.append(", newHolder=");
        sb.append(this.f17171b);
        sb.append(", fromX=");
        sb.append(this.f17172c);
        sb.append(", fromY=");
        sb.append(this.f17173d);
        sb.append(", toX=");
        sb.append(this.f17174e);
        sb.append(", toY=");
        return edb.m38567p(sb, this.f17175f, '}');
    }
}
