package p204p;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class vua extends ava {

    /* JADX INFO: renamed from: e */
    public final int f244900e;

    /* JADX INFO: renamed from: f */
    public final int f244901f;

    public vua(byte[] bArr, int i, int i2) {
        super(bArr);
        ava.m27229b(i, i + i2, bArr.length);
        this.f244900e = i;
        this.f244901f = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // p204p.ava
    /* JADX INFO: renamed from: a */
    public final byte mo27231a(int i) {
        int i2 = this.f244901f;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.f20133b[this.f244900e + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(s571.m77246e(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(s571.m77247f(i, "Index > length: ", i2, ", "));
    }

    @Override // p204p.ava
    /* JADX INFO: renamed from: e */
    public final int mo27232e() {
        return this.f244900e;
    }

    @Override // p204p.ava
    /* JADX INFO: renamed from: f */
    public final byte mo27233f(int i) {
        return this.f20133b[this.f244900e + i];
    }

    @Override // p204p.ava
    public final int size() {
        return this.f244901f;
    }

    public Object writeReplace() {
        byte[] bArr;
        int i = this.f244901f;
        if (i == 0) {
            bArr = ce50.f37011b;
        } else {
            byte[] bArr2 = new byte[i];
            System.arraycopy(this.f20133b, this.f244900e, bArr2, 0, i);
            bArr = bArr2;
        }
        return new ava(bArr);
    }
}
