package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class vzf1 extends rzf1 {

    /* JADX INFO: renamed from: c */
    public final byte[] f246461c;

    public vzf1(byte[] bArr) {
        bArr.getClass();
        this.f246461c = bArr;
    }

    @Override // p204p.rzf1
    /* JADX INFO: renamed from: a */
    public final byte mo40350a(int i) {
        return this.f246461c[i];
    }

    @Override // p204p.rzf1
    /* JADX INFO: renamed from: b */
    public final byte mo40351b(int i) {
        return this.f246461c[i];
    }

    @Override // p204p.rzf1
    /* JADX INFO: renamed from: d */
    public final int mo40352d(int i, int i2) {
        return a5g1.m24800a(i, this.f246461c, 0, i2);
    }

    @Override // p204p.rzf1
    /* JADX INFO: renamed from: e */
    public final int mo40353e() {
        return this.f246461c.length;
    }

    @Override // p204p.rzf1
    /* JADX INFO: renamed from: f */
    public final rzf1 mo40354f(int i, int i2) {
        byte[] bArr = this.f246461c;
        int iM76783l = rzf1.m76783l(0, i2, bArr.length);
        return iM76783l == 0 ? rzf1.f204149b : new ezf1(bArr, 0, iM76783l);
    }

    @Override // p204p.rzf1
    /* JADX INFO: renamed from: i */
    public final void mo40355i(v0g1 v0g1Var) {
        byte[] bArr = this.f246461c;
        v0g1Var.m84380D(bArr, 0, bArr.length);
    }

    @Override // p204p.rzf1
    /* JADX INFO: renamed from: j */
    public final boolean mo40356j(rzf1 rzf1Var) {
        boolean z = rzf1Var instanceof vzf1;
        byte[] bArr = this.f246461c;
        if (z) {
            return Arrays.equals(bArr, ((vzf1) rzf1Var).f246461c);
        }
        boolean z2 = rzf1Var instanceof ezf1;
        if (!z2) {
            return rzf1Var.mo40356j(this);
        }
        ezf1 ezf1Var = (ezf1) rzf1Var;
        int i = ezf1Var.f64373e;
        int length = bArr.length;
        if (length > i) {
            throw new IllegalArgumentException("Length too large: " + length + length);
        }
        if (length > i) {
            throw new IllegalArgumentException(s571.m77247f(length, "Ran off end of other: 0, ", i, ", "));
        }
        if (z) {
            return rzf1.m76785n(0, 0, length, bArr, ((vzf1) rzf1Var).f246461c);
        }
        if (!z2) {
            return rzf1Var.mo40354f(0, length).equals(mo40354f(0, length));
        }
        return rzf1.m76785n(0, ezf1Var.f64372d, length, bArr, ezf1Var.f64371c);
    }
}
