package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class bs20 {

    /* JADX INFO: renamed from: a */
    public final float f30216a;

    /* JADX INFO: renamed from: b */
    public final float f30217b;

    /* JADX INFO: renamed from: c */
    public final float f30218c;

    /* JADX INFO: renamed from: d */
    public final float f30219d;

    /* JADX INFO: renamed from: e */
    public final int f30220e;

    /* JADX INFO: renamed from: f */
    public final int f30221f;

    public bs20(float f, float f2, float f3, float f4, int i, int i2) {
        this.f30216a = f;
        this.f30217b = f2;
        this.f30218c = f3;
        this.f30219d = f4;
        this.f30220e = i;
        this.f30221f = i2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m30344a(bs20 bs20Var) {
        return bs20Var != null && this.f30220e == bs20Var.f30220e && this.f30216a == bs20Var.f30216a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Highlight, x: ");
        sb.append(this.f30216a);
        sb.append(", y: ");
        sb.append(this.f30217b);
        sb.append(", dataSetIndex: ");
        return klh.m56832d(this.f30220e, ", stackIndex (only stacked barentry): -1", sb);
    }
}
