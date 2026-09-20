package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes11.dex */
public final class rzs0 extends n110 implements rre0 {

    /* JADX INFO: renamed from: X */
    public List f204211X;

    /* JADX INFO: renamed from: Y */
    public int f204212Y;

    /* JADX INFO: renamed from: Z */
    public int f204213Z;

    /* JADX INFO: renamed from: b */
    public int f204214b;

    /* JADX INFO: renamed from: c */
    public szs0 f204215c;

    /* JADX INFO: renamed from: d */
    public long f204216d;

    /* JADX INFO: renamed from: e */
    public float f204217e;

    /* JADX INFO: renamed from: f */
    public double f204218f;

    /* JADX INFO: renamed from: g */
    public int f204219g;

    /* JADX INFO: renamed from: h */
    public int f204220h;

    /* JADX INFO: renamed from: i */
    public int f204221i;

    /* JADX INFO: renamed from: t */
    public wzs0 f204222t;

    /* JADX INFO: renamed from: g */
    public static rzs0 m76831g() {
        rzs0 rzs0Var = new rzs0();
        rzs0Var.f204215c = szs0.BYTE;
        rzs0Var.f204222t = wzs0.f256673g;
        rzs0Var.f204211X = Collections.EMPTY_LIST;
        return rzs0Var;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: b */
    public final AbstractC2155n8 mo26645b() {
        tzs0 tzs0VarM76832e = m76832e();
        if (tzs0VarM76832e.isInitialized()) {
            return tzs0VarM76832e;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p204p.n110
    /* JADX INFO: renamed from: c */
    public final n110 mo26646c(pwe pweVar, bux buxVar) throws Throwable {
        tzs0 tzs0Var = null;
        try {
            try {
                tzs0.f225294O0.getClass();
                m76833h(new tzs0(pweVar, buxVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                tzs0 tzs0Var2 = (tzs0) e.f10912a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    tzs0Var = tzs0Var2;
                    if (tzs0Var != null) {
                        m76833h(tzs0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (tzs0Var != null) {
                m76833h(tzs0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        rzs0 rzs0VarM76831g = m76831g();
        rzs0VarM76831g.m76833h(m76832e());
        return rzs0VarM76831g;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ n110 mo26647d(a210 a210Var) {
        m76833h((tzs0) a210Var);
        return this;
    }

    /* JADX INFO: renamed from: e */
    public final tzs0 m76832e() {
        tzs0 tzs0Var = new tzs0(this);
        int i = this.f204214b;
        int i2 = (i & 1) != 1 ? 0 : 1;
        tzs0Var.f225302c = this.f204215c;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        tzs0Var.f225303d = this.f204216d;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        tzs0Var.f225304e = this.f204217e;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        tzs0Var.f225305f = this.f204218f;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        tzs0Var.f225306g = this.f204219g;
        if ((i & 32) == 32) {
            i2 |= 32;
        }
        tzs0Var.f225307h = this.f204220h;
        if ((i & 64) == 64) {
            i2 |= 64;
        }
        tzs0Var.f225308i = this.f204221i;
        if ((i & 128) == 128) {
            i2 |= 128;
        }
        tzs0Var.f225309t = this.f204222t;
        if ((i & 256) == 256) {
            this.f204211X = Collections.unmodifiableList(this.f204211X);
            this.f204214b &= -257;
        }
        tzs0Var.f225297X = this.f204211X;
        if ((i & 512) == 512) {
            i2 |= 256;
        }
        tzs0Var.f225298Y = this.f204212Y;
        if ((i & 1024) == 1024) {
            i2 |= 512;
        }
        tzs0Var.f225299Z = this.f204213Z;
        tzs0Var.f225301b = i2;
        return tzs0Var;
    }

    /* JADX INFO: renamed from: h */
    public final void m76833h(tzs0 tzs0Var) {
        wzs0 wzs0Var;
        if (tzs0Var == tzs0.f225293N0) {
            return;
        }
        if ((tzs0Var.f225301b & 1) == 1) {
            szs0 szs0Var = tzs0Var.f225302c;
            szs0Var.getClass();
            this.f204214b = 1 | this.f204214b;
            this.f204215c = szs0Var;
        }
        int i = tzs0Var.f225301b;
        if ((i & 2) == 2) {
            long j = tzs0Var.f225303d;
            this.f204214b |= 2;
            this.f204216d = j;
        }
        if ((i & 4) == 4) {
            float f = tzs0Var.f225304e;
            this.f204214b = 4 | this.f204214b;
            this.f204217e = f;
        }
        if ((i & 8) == 8) {
            double d = tzs0Var.f225305f;
            this.f204214b |= 8;
            this.f204218f = d;
        }
        if ((i & 16) == 16) {
            int i2 = tzs0Var.f225306g;
            this.f204214b = 16 | this.f204214b;
            this.f204219g = i2;
        }
        if ((i & 32) == 32) {
            int i3 = tzs0Var.f225307h;
            this.f204214b = 32 | this.f204214b;
            this.f204220h = i3;
        }
        if ((i & 64) == 64) {
            int i4 = tzs0Var.f225308i;
            this.f204214b = 64 | this.f204214b;
            this.f204221i = i4;
        }
        if ((i & 128) == 128) {
            wzs0 wzs0Var2 = tzs0Var.f225309t;
            if ((this.f204214b & 128) != 128 || (wzs0Var = this.f204222t) == wzs0.f256673g) {
                this.f204222t = wzs0Var2;
            } else {
                vzs0 vzs0Var = new vzs0(0);
                vzs0Var.f246536d = Collections.EMPTY_LIST;
                vzs0Var.m86912i(wzs0Var);
                vzs0Var.m86912i(wzs0Var2);
                this.f204222t = vzs0Var.m86910e();
            }
            this.f204214b |= 128;
        }
        if (!tzs0Var.f225297X.isEmpty()) {
            if (this.f204211X.isEmpty()) {
                this.f204211X = tzs0Var.f225297X;
                this.f204214b &= -257;
            } else {
                if ((this.f204214b & 256) != 256) {
                    this.f204211X = new ArrayList(this.f204211X);
                    this.f204214b |= 256;
                }
                this.f204211X.addAll(tzs0Var.f225297X);
            }
        }
        int i5 = tzs0Var.f225301b;
        if ((i5 & 256) == 256) {
            int i6 = tzs0Var.f225298Y;
            this.f204214b |= 512;
            this.f204212Y = i6;
        }
        if ((i5 & 512) == 512) {
            int i7 = tzs0Var.f225299Z;
            this.f204214b |= 1024;
            this.f204213Z = i7;
        }
        this.f149263a = this.f149263a.m48763b(tzs0Var.f225300a);
    }
}
