package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ezf1 extends rzf1 {

    /* JADX INFO: renamed from: c */
    public final byte[] f64371c;

    /* JADX INFO: renamed from: d */
    public final int f64372d;

    /* JADX INFO: renamed from: e */
    public final int f64373e;

    public ezf1(byte[] bArr, int i, int i2) {
        rzf1.m76783l(i, i + i2, bArr.length);
        this.f64371c = bArr;
        this.f64372d = i;
        this.f64373e = i2;
    }

    @Override // p204p.rzf1
    /* JADX INFO: renamed from: a */
    public final byte mo40350a(int i) {
        int i2 = this.f64373e;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f64371c[this.f64372d + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(s571.m77246e(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(s571.m77247f(i, "Index > length: ", i2, ", "));
    }

    @Override // p204p.rzf1
    /* JADX INFO: renamed from: b */
    public final byte mo40351b(int i) {
        return this.f64371c[this.f64372d + i];
    }

    @Override // p204p.rzf1
    /* JADX INFO: renamed from: d */
    public final int mo40352d(int i, int i2) {
        return a5g1.m24800a(i, this.f64371c, this.f64372d, i2);
    }

    @Override // p204p.rzf1
    /* JADX INFO: renamed from: e */
    public final int mo40353e() {
        return this.f64373e;
    }

    @Override // p204p.rzf1
    /* JADX INFO: renamed from: f */
    public final rzf1 mo40354f(int i, int i2) {
        int iM76783l = rzf1.m76783l(i, i2, this.f64373e);
        if (iM76783l == 0) {
            return rzf1.f204149b;
        }
        return new ezf1(this.f64371c, this.f64372d + i, iM76783l);
    }

    @Override // p204p.rzf1
    /* JADX INFO: renamed from: i */
    public final void mo40355i(v0g1 v0g1Var) {
        v0g1Var.m84380D(this.f64371c, this.f64372d, this.f64373e);
    }

    @Override // p204p.rzf1
    /* JADX INFO: renamed from: j */
    public final boolean mo40356j(rzf1 rzf1Var) {
        boolean z = rzf1Var instanceof vzf1;
        if (!z && !(rzf1Var instanceof ezf1)) {
            return rzf1Var.mo40356j(this);
        }
        int iMo40353e = rzf1Var.mo40353e();
        int i = this.f64373e;
        if (i > iMo40353e) {
            throw new IllegalArgumentException("Length too large: " + i + i);
        }
        if (i > rzf1Var.mo40353e()) {
            throw new IllegalArgumentException(s571.m77247f(i, "Ran off end of other: 0, ", rzf1Var.mo40353e(), ", "));
        }
        byte[] bArr = this.f64371c;
        int i2 = this.f64372d;
        if (z) {
            return rzf1.m76785n(i2, 0, i, bArr, ((vzf1) rzf1Var).f246461c);
        }
        if (!(rzf1Var instanceof ezf1)) {
            return rzf1Var.mo40354f(0, i).equals(mo40354f(i2, i + i2));
        }
        ezf1 ezf1Var = (ezf1) rzf1Var;
        return rzf1.m76785n(i2, ezf1Var.f64372d, i, bArr, ezf1Var.f64371c);
    }
}
