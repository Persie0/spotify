package p204p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class uua extends cva {

    /* JADX INFO: renamed from: e */
    public final int f234139e;

    /* JADX INFO: renamed from: f */
    public final int f234140f;

    public uua(byte[] bArr, int i, int i2) {
        super(bArr);
        gva.m45885b(i, i + i2, bArr.length);
        this.f234139e = i;
        this.f234140f = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // p204p.cva, p204p.gva
    /* JADX INFO: renamed from: a */
    public final byte mo34014a(int i) {
        int i2 = this.f234140f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f42342d[this.f234139e + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(s571.m77246e(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(s571.m77247f(i, "Index > length: ", i2, ", "));
    }

    @Override // p204p.cva, p204p.gva
    /* JADX INFO: renamed from: i */
    public final void mo34015i(byte[] bArr, int i) {
        System.arraycopy(this.f42342d, this.f234139e, bArr, 0, i);
    }

    @Override // p204p.cva, p204p.gva
    /* JADX INFO: renamed from: m */
    public final byte mo34016m(int i) {
        return this.f42342d[this.f234139e + i];
    }

    @Override // p204p.cva, p204p.gva
    public final int size() {
        return this.f234140f;
    }

    @Override // p204p.cva
    /* JADX INFO: renamed from: w */
    public final int mo34024w() {
        return this.f234139e;
    }

    public Object writeReplace() {
        return new cva(m45891s());
    }
}
