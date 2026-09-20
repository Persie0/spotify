package p204p;

/* JADX INFO: loaded from: classes.dex */
public interface ezx0 extends AutoCloseable {
    /* JADX INFO: renamed from: A */
    void mo24840A();

    /* JADX INFO: renamed from: E1 */
    boolean mo24841E1();

    /* JADX INFO: renamed from: R */
    void mo24842R(int i, String str);

    /* JADX INFO: renamed from: Y */
    void mo24843Y(double d);

    byte[] getBlob(int i);

    default boolean getBoolean() {
        return getLong(0) != 0;
    }

    int getColumnCount();

    String getColumnName(int i);

    double getDouble(int i);

    long getLong(int i);

    /* JADX INFO: renamed from: h1 */
    String mo24844h1(int i);

    boolean isNull(int i);

    /* JADX INFO: renamed from: q */
    void mo24845q(byte[] bArr, int i);

    void reset();

    /* JADX INFO: renamed from: u */
    void mo24846u(int i, long j);

    /* JADX INFO: renamed from: v */
    void mo24847v(int i);
}
