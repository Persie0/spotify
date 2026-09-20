package p204p;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: p.z5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2638z5 extends c95 {

    /* JADX INFO: renamed from: e */
    public final ByteBuffer f279420e = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);

    @Override // p204p.c95
    /* JADX INFO: renamed from: R */
    public final c95 mo31863R(byte[] bArr) {
        bArr.getClass();
        mo40584e0(bArr, bArr.length);
        return this;
    }

    @Override // p204p.c95
    /* JADX INFO: renamed from: S */
    public final c95 mo25556S(byte[] bArr, int i) {
        c95.m31852r(0, i, bArr.length);
        mo40584e0(bArr, i);
        return this;
    }

    @Override // p204p.c95
    /* JADX INFO: renamed from: T */
    public final c95 mo25557T(char c) {
        ByteBuffer byteBuffer = this.f279420e;
        byteBuffer.putChar(c);
        try {
            mo40584e0(byteBuffer.array(), 2);
            return this;
        } finally {
            mkg1.m62155q(byteBuffer);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public abstract void mo40584e0(byte[] bArr, int i);
}
