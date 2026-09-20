package p204p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class tua extends bva {

    /* JADX INFO: renamed from: e */
    public final int f223801e;

    /* JADX INFO: renamed from: f */
    public final int f223802f;

    public tua(byte[] bArr, int i, int i2) {
        super(bArr);
        fva.m42775b(i, i + i2, bArr.length);
        this.f223801e = i;
        this.f223802f = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // p204p.bva, p204p.fva
    /* JADX INFO: renamed from: a */
    public final byte mo30594a(int i) {
        int i2 = this.f223802f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f31316d[this.f223801e + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(s571.m77246e(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(s571.m77247f(i, "Index > length: ", i2, ", "));
    }

    @Override // p204p.bva, p204p.fva
    /* JADX INFO: renamed from: e */
    public final void mo30595e(byte[] bArr, int i) {
        System.arraycopy(this.f31316d, this.f223801e, bArr, 0, i);
    }

    @Override // p204p.bva, p204p.fva
    /* JADX INFO: renamed from: f */
    public final byte mo30596f(int i) {
        return this.f31316d[this.f223801e + i];
    }

    @Override // p204p.bva
    /* JADX INFO: renamed from: j */
    public final int mo30597j() {
        return this.f223801e;
    }

    @Override // p204p.bva, p204p.fva
    public final int size() {
        return this.f223802f;
    }

    public Object writeReplace() {
        return new bva(m42777i());
    }
}
