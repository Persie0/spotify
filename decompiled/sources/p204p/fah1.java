package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class fah1 extends jah1 {

    /* JADX INFO: renamed from: d */
    public final int f67562d;

    public fah1(byte[] bArr) {
        super(bArr);
        jah1.m52841e(bArr.length);
        this.f67562d = 47;
    }

    @Override // p204p.jah1
    /* JADX INFO: renamed from: a */
    public final byte mo41178a(int i) {
        int i2 = this.f67562d;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f110471b[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(s571.m77248g(i, "Index < 0: ", new StringBuilder(String.valueOf(i).length() + 11)));
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i2).length());
        sb.append("Index > length: ");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    @Override // p204p.jah1
    /* JADX INFO: renamed from: b */
    public final byte mo41179b(int i) {
        return this.f110471b[i];
    }

    @Override // p204p.jah1
    /* JADX INFO: renamed from: d */
    public final int mo41180d() {
        return this.f67562d;
    }
}
