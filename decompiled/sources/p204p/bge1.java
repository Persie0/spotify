package p204p;

import java.io.InvalidObjectException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public final class bge1 extends w4u0 implements Serializable {

    /* JADX INFO: renamed from: c */
    public int f26925c;

    /* JADX INFO: renamed from: d */
    public int f26926d;

    /* JADX INFO: renamed from: e */
    public int f26927e;

    /* JADX INFO: renamed from: f */
    public int f26928f;

    /* JADX INFO: renamed from: g */
    public int f26929g;

    /* JADX INFO: renamed from: h */
    public int f26930h;

    public bge1(int i, int i2) {
        int i3 = ~i;
        int i4 = (i << 10) ^ (i2 >>> 4);
        this.f26925c = i;
        this.f26926d = i2;
        this.f26927e = 0;
        this.f26928f = 0;
        this.f26929g = i3;
        this.f26930h = i4;
        m29122l();
        for (int i5 = 0; i5 < 64; i5++) {
            mo29121f();
        }
    }

    private final Object readResolve() throws Throwable {
        try {
            m29122l();
            return this;
        } catch (Throwable th) {
            throw new InvalidObjectException(th.getMessage()).initCause(th);
        }
    }

    @Override // p204p.w4u0
    /* JADX INFO: renamed from: a */
    public final int mo29120a(int i) {
        return ((-i) >> 31) & (mo29121f() >>> (32 - i));
    }

    @Override // p204p.w4u0
    /* JADX INFO: renamed from: f */
    public final int mo29121f() {
        int i = this.f26925c;
        int i2 = i ^ (i >>> 2);
        this.f26925c = this.f26926d;
        this.f26926d = this.f26927e;
        this.f26927e = this.f26928f;
        int i3 = this.f26929g;
        this.f26928f = i3;
        int i4 = ((i2 ^ (i2 << 1)) ^ i3) ^ (i3 << 4);
        this.f26929g = i4;
        int i5 = this.f26930h + 362437;
        this.f26930h = i5;
        return i4 + i5;
    }

    /* JADX INFO: renamed from: l */
    public final void m29122l() {
        if ((this.f26925c | this.f26926d | this.f26927e | this.f26928f | this.f26929g) == 0) {
            throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
        }
    }
}
