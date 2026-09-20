package p204p;

import com.google.protobuf.C0263b;
import com.google.protobuf.C0264c;
import com.google.protobuf.C0266e;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class owe {

    /* JADX INFO: renamed from: a */
    public int f170700a;

    /* JADX INFO: renamed from: b */
    public int f170701b;

    /* JADX INFO: renamed from: c */
    public C0266e f170702c;

    /* JADX INFO: renamed from: b */
    public static int m68164b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    /* JADX INFO: renamed from: c */
    public static long m68165c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    /* JADX INFO: renamed from: f */
    public static C0263b m68166f(byte[] bArr, int i, int i2, boolean z) {
        C0263b c0263b = new C0263b(bArr, i, i2, z);
        try {
            c0263b.mo2024i(i2);
            return c0263b;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: g */
    public static owe m68167g(InputStream inputStream) {
        if (inputStream != null) {
            return new C0264c(inputStream);
        }
        byte[] bArr = ee50.f58681b;
        return m68166f(bArr, 0, bArr.length, false);
    }

    /* JADX INFO: renamed from: s */
    public static int m68168s(InputStream inputStream, int i) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw InvalidProtocolBufferException.m1956h();
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw InvalidProtocolBufferException.m1956h();
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw InvalidProtocolBufferException.m1953e();
    }

    /* JADX INFO: renamed from: A */
    public abstract int mo2010A();

    /* JADX INFO: renamed from: B */
    public abstract long mo2011B();

    /* JADX INFO: renamed from: C */
    public abstract boolean mo2012C(int i);

    /* JADX INFO: renamed from: D */
    public final void m68169D() {
        boolean zMo2012C;
        do {
            int iMo2040z = mo2040z();
            if (iMo2040z == 0) {
                return;
            }
            int i = this.f170700a;
            int i2 = this.f170701b;
            if (i + i2 >= 100) {
                throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f170701b = i2 + 1;
            zMo2012C = mo2012C(iMo2040z);
            this.f170701b--;
        } while (zMo2012C);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo2020a(int i);

    /* JADX INFO: renamed from: d */
    public abstract int mo2021d();

    /* JADX INFO: renamed from: e */
    public abstract boolean mo2022e();

    /* JADX INFO: renamed from: h */
    public abstract void mo2023h(int i);

    /* JADX INFO: renamed from: i */
    public abstract int mo2024i(int i);

    /* JADX INFO: renamed from: j */
    public abstract boolean mo2025j();

    /* JADX INFO: renamed from: k */
    public abstract cva mo2026k();

    /* JADX INFO: renamed from: l */
    public abstract double mo2027l();

    /* JADX INFO: renamed from: m */
    public abstract int mo2028m();

    /* JADX INFO: renamed from: n */
    public abstract int mo2029n();

    /* JADX INFO: renamed from: o */
    public abstract long mo2030o();

    /* JADX INFO: renamed from: p */
    public abstract float mo2031p();

    /* JADX INFO: renamed from: q */
    public abstract int mo2032q();

    /* JADX INFO: renamed from: r */
    public abstract long mo2033r();

    /* JADX INFO: renamed from: t */
    public abstract int mo2034t();

    /* JADX INFO: renamed from: u */
    public abstract long mo2035u();

    /* JADX INFO: renamed from: v */
    public abstract int mo2036v();

    /* JADX INFO: renamed from: w */
    public abstract long mo2037w();

    /* JADX INFO: renamed from: x */
    public abstract String mo2038x();

    /* JADX INFO: renamed from: y */
    public abstract String mo2039y();

    /* JADX INFO: renamed from: z */
    public abstract int mo2040z();
}
