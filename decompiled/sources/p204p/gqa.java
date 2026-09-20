package p204p;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public interface gqa extends wt31, ReadableByteChannel {
    /* JADX INFO: renamed from: A0 */
    void mo45414A0(long j);

    /* JADX INFO: renamed from: H0 */
    int mo45415H0(hvl0 hvl0Var);

    /* JADX INFO: renamed from: H1 */
    InputStream mo45416H1();

    /* JADX INFO: renamed from: J0 */
    iva mo45417J0(long j);

    /* JADX INFO: renamed from: O0 */
    void mo45418O0(npa npaVar, long j);

    /* JADX INFO: renamed from: P0 */
    byte[] mo45419P0();

    /* JADX INFO: renamed from: R0 */
    boolean mo45420R0();

    /* JADX INFO: renamed from: S */
    String mo45421S(long j);

    /* JADX INFO: renamed from: b1 */
    String mo45422b1(Charset charset);

    /* JADX INFO: renamed from: d1 */
    int mo45423d1();

    /* JADX INFO: renamed from: l */
    npa mo42408l();

    /* JADX INFO: renamed from: o0 */
    long mo45424o0(iva ivaVar);

    /* JADX INFO: renamed from: o1 */
    long mo45425o1(iva ivaVar);

    /* JADX INFO: renamed from: p1 */
    int mo45426p1();

    vuu0 peek();

    int read(byte[] bArr);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j);

    /* JADX INFO: renamed from: s0 */
    short mo45427s0();

    /* JADX INFO: renamed from: s1 */
    String mo45428s1();

    void skip(long j);

    /* JADX INFO: renamed from: w1 */
    long mo45429w1(fqa fqaVar);

    /* JADX INFO: renamed from: x0 */
    boolean mo45430x0(long j, iva ivaVar);
}
