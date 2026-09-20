package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class bhf1 extends nhf1 {

    /* JADX INFO: renamed from: d */
    public final int f27176d;

    public bhf1(byte[] bArr, int i) {
        super(bArr);
        zhf1.m96128f(0, i, bArr.length);
        this.f27176d = i;
    }

    @Override // p204p.nhf1, p204p.zhf1
    /* JADX INFO: renamed from: a */
    public final byte mo29246a(int i) {
        int i2 = this.f27176d;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f154001c[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(s571.m77246e(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(s571.m77247f(i, "Index > length: ", i2, ", "));
    }

    @Override // p204p.nhf1, p204p.zhf1
    /* JADX INFO: renamed from: b */
    public final byte mo29247b(int i) {
        return this.f154001c[i];
    }

    @Override // p204p.nhf1, p204p.zhf1
    /* JADX INFO: renamed from: d */
    public final int mo29248d() {
        return this.f27176d;
    }

    @Override // p204p.nhf1, p204p.zhf1
    /* JADX INFO: renamed from: e */
    public final void mo29249e(byte[] bArr, int i) {
        System.arraycopy(this.f154001c, 0, bArr, 0, i);
    }
}
