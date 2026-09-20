package p204p;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes2.dex */
public interface fqa extends ai21, WritableByteChannel {
    /* JADX INFO: renamed from: B0 */
    fqa mo42403B0(long j);

    /* JADX INFO: renamed from: H */
    long mo42404H(wt31 wt31Var);

    /* JADX INFO: renamed from: Z */
    fqa mo42405Z(vuu0 vuu0Var, long j);

    /* JADX INFO: renamed from: b0 */
    fqa mo42406b0(String str);

    @Override // p204p.ai21, java.io.Flushable
    void flush();

    /* JADX INFO: renamed from: j1 */
    fqa mo42407j1(int i, int i2, String str);

    /* JADX INFO: renamed from: l */
    npa mo42408l();

    /* JADX INFO: renamed from: q1 */
    fqa mo42409q1(iva ivaVar);

    /* JADX INFO: renamed from: v0 */
    fqa mo42410v0(int i, byte[] bArr, int i2);

    fqa write(byte[] bArr);

    fqa writeByte(int i);

    fqa writeInt(int i);

    fqa writeShort(int i);
}
