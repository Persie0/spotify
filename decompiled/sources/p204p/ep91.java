package p204p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ep91 {

    /* JADX INFO: renamed from: d */
    public static final ThreadLocal f61589d = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public final int f61590a;

    /* JADX INFO: renamed from: b */
    public final x4b f61591b;

    /* JADX INFO: renamed from: c */
    public volatile int f61592c = 0;

    public ep91(x4b x4bVar, int i) {
        this.f61591b = x4bVar;
        this.f61590a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m39639a(int i) {
        k7f0 k7f0VarM39641c = m39641c();
        int iM83534a = k7f0VarM39641c.m83534a(16);
        if (iM83534a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = k7f0VarM39641c.f232071b;
        int i2 = iM83534a + k7f0VarM39641c.f232070a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    /* JADX INFO: renamed from: b */
    public final short m39640b() {
        k7f0 k7f0VarM39641c = m39641c();
        int iM83534a = k7f0VarM39641c.m83534a(10);
        if (iM83534a != 0) {
            return k7f0VarM39641c.f232071b.getShort(iM83534a + k7f0VarM39641c.f232070a);
        }
        return (short) 0;
    }

    /* JADX INFO: renamed from: c */
    public final k7f0 m39641c() {
        ThreadLocal threadLocal = f61589d;
        k7f0 k7f0Var = (k7f0) threadLocal.get();
        if (k7f0Var == null) {
            k7f0Var = new k7f0();
            threadLocal.set(k7f0Var);
        }
        m7f0 m7f0Var = (m7f0) this.f61591b.f258037b;
        int iM83534a = m7f0Var.m83534a(6);
        if (iM83534a != 0) {
            int i = iM83534a + m7f0Var.f232070a;
            int i2 = (this.f61590a * 4) + m7f0Var.f232071b.getInt(i) + i + 4;
            int i3 = m7f0Var.f232071b.getInt(i2) + i2;
            ByteBuffer byteBuffer = m7f0Var.f232071b;
            k7f0Var.f232071b = byteBuffer;
            if (byteBuffer != null) {
                k7f0Var.f232070a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                k7f0Var.f232072c = i4;
                k7f0Var.f232073d = k7f0Var.f232071b.getShort(i4);
                return k7f0Var;
            }
            k7f0Var.f232070a = 0;
            k7f0Var.f232072c = 0;
            k7f0Var.f232073d = 0;
        }
        return k7f0Var;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        k7f0 k7f0VarM39641c = m39641c();
        int iM83534a = k7f0VarM39641c.m83534a(4);
        sb.append(Integer.toHexString(iM83534a != 0 ? k7f0VarM39641c.f232071b.getInt(iM83534a + k7f0VarM39641c.f232070a) : 0));
        sb.append(", codepoints:");
        k7f0 k7f0VarM39641c2 = m39641c();
        int iM83534a2 = k7f0VarM39641c2.m83534a(16);
        if (iM83534a2 != 0) {
            int i2 = iM83534a2 + k7f0VarM39641c2.f232070a;
            i = k7f0VarM39641c2.f232071b.getInt(k7f0VarM39641c2.f232071b.getInt(i2) + i2);
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(Integer.toHexString(m39639a(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
