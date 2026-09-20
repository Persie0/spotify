package p204p;

import com.spotify.metadata.classic.proto.Metadata$Episode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class tzs0 extends a210 {

    /* JADX INFO: renamed from: N0 */
    public static final tzs0 f225293N0;

    /* JADX INFO: renamed from: O0 */
    public static final uo60 f225294O0 = new uo60(7);

    /* JADX INFO: renamed from: L0 */
    public byte f225295L0;

    /* JADX INFO: renamed from: M0 */
    public int f225296M0;

    /* JADX INFO: renamed from: X */
    public List f225297X;

    /* JADX INFO: renamed from: Y */
    public int f225298Y;

    /* JADX INFO: renamed from: Z */
    public int f225299Z;

    /* JADX INFO: renamed from: a */
    public final hva f225300a;

    /* JADX INFO: renamed from: b */
    public int f225301b;

    /* JADX INFO: renamed from: c */
    public szs0 f225302c;

    /* JADX INFO: renamed from: d */
    public long f225303d;

    /* JADX INFO: renamed from: e */
    public float f225304e;

    /* JADX INFO: renamed from: f */
    public double f225305f;

    /* JADX INFO: renamed from: g */
    public int f225306g;

    /* JADX INFO: renamed from: h */
    public int f225307h;

    /* JADX INFO: renamed from: i */
    public int f225308i;

    /* JADX INFO: renamed from: t */
    public wzs0 f225309t;

    static {
        tzs0 tzs0Var = new tzs0();
        f225293N0 = tzs0Var;
        tzs0Var.m82076g();
    }

    public tzs0() {
        this.f225295L0 = (byte) -1;
        this.f225296M0 = -1;
        this.f225300a = hva.f95637a;
    }

    /* JADX INFO: renamed from: h */
    public static rzs0 m82075h(tzs0 tzs0Var) {
        rzs0 rzs0VarM76831g = rzs0.m76831g();
        rzs0VarM76831g.m76833h(tzs0Var);
        return rzs0VarM76831g;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        int i = this.f225296M0;
        if (i != -1) {
            return i;
        }
        int iM87318f = (this.f225301b & 1) == 1 ? w780.m87318f(1, this.f225302c.f215657a) : 0;
        if ((this.f225301b & 2) == 2) {
            long j = this.f225303d;
            iM87318f += w780.m87324l((j >> 63) ^ (j << 1)) + w780.m87325m(2);
        }
        if ((this.f225301b & 4) == 4) {
            iM87318f += w780.m87325m(3) + 4;
        }
        if ((this.f225301b & 8) == 8) {
            iM87318f += w780.m87325m(4) + 8;
        }
        if ((this.f225301b & 16) == 16) {
            iM87318f += w780.m87319g(5, this.f225306g);
        }
        if ((this.f225301b & 32) == 32) {
            iM87318f += w780.m87319g(6, this.f225307h);
        }
        if ((this.f225301b & 64) == 64) {
            iM87318f += w780.m87319g(7, this.f225308i);
        }
        if ((this.f225301b & 128) == 128) {
            iM87318f += w780.m87321i(8, this.f225309t);
        }
        for (int i2 = 0; i2 < this.f225297X.size(); i2++) {
            iM87318f += w780.m87321i(9, (AbstractC2155n8) this.f225297X.get(i2));
        }
        if ((this.f225301b & 512) == 512) {
            iM87318f += w780.m87319g(10, this.f225299Z);
        }
        if ((this.f225301b & 256) == 256) {
            iM87318f += w780.m87319g(11, this.f225298Y);
        }
        int size = this.f225300a.size() + iM87318f;
        this.f225296M0 = size;
        return size;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        return rzs0.m76831g();
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: c */
    public final n110 mo24392c() {
        return m82075h(this);
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        mo24390a();
        if ((this.f225301b & 1) == 1) {
            w780Var.m87343O(1, this.f225302c.f215657a);
        }
        if ((this.f225301b & 2) == 2) {
            long j = this.f225303d;
            w780Var.m87356a0(2, 0);
            w780Var.m87354Z((j >> 63) ^ (j << 1));
        }
        if ((this.f225301b & 4) == 4) {
            float f = this.f225304e;
            w780Var.m87356a0(3, 5);
            w780Var.m87351W(Float.floatToRawIntBits(f));
        }
        if ((this.f225301b & 8) == 8) {
            double d = this.f225305f;
            w780Var.m87356a0(4, 1);
            w780Var.m87352X(Double.doubleToRawLongBits(d));
        }
        if ((this.f225301b & 16) == 16) {
            w780Var.m87344P(5, this.f225306g);
        }
        if ((this.f225301b & 32) == 32) {
            w780Var.m87344P(6, this.f225307h);
        }
        if ((this.f225301b & 64) == 64) {
            w780Var.m87344P(7, this.f225308i);
        }
        if ((this.f225301b & 128) == 128) {
            w780Var.m87346R(8, this.f225309t);
        }
        for (int i = 0; i < this.f225297X.size(); i++) {
            w780Var.m87346R(9, (AbstractC2155n8) this.f225297X.get(i));
        }
        if ((this.f225301b & 512) == 512) {
            w780Var.m87344P(10, this.f225299Z);
        }
        if ((this.f225301b & 256) == 256) {
            w780Var.m87344P(11, this.f225298Y);
        }
        w780Var.m87349U(this.f225300a);
    }

    /* JADX INFO: renamed from: g */
    public final void m82076g() {
        this.f225302c = szs0.BYTE;
        this.f225303d = 0L;
        this.f225304e = 0.0f;
        this.f225305f = 0.0d;
        this.f225306g = 0;
        this.f225307h = 0;
        this.f225308i = 0;
        this.f225309t = wzs0.f256673g;
        this.f225297X = Collections.EMPTY_LIST;
        this.f225298Y = 0;
        this.f225299Z = 0;
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        byte b = this.f225295L0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f225301b & 128) == 128 && !this.f225309t.isInitialized()) {
            this.f225295L0 = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f225297X.size(); i++) {
            if (!((tzs0) this.f225297X.get(i)).isInitialized()) {
                this.f225295L0 = (byte) 0;
                return false;
            }
        }
        this.f225295L0 = (byte) 1;
        return true;
    }

    public tzs0(pwe pweVar, bux buxVar) {
        vzs0 vzs0Var;
        this.f225295L0 = (byte) -1;
        this.f225296M0 = -1;
        m82076g();
        eva evaVar = new eva(0);
        w780 w780VarM87328y = w780.m87328y(evaVar, 1);
        boolean z = false;
        char c = 0;
        while (!z) {
            try {
                try {
                    int iM71249o = pweVar.m71249o();
                    switch (iM71249o) {
                        case 0:
                            break;
                        case 8:
                            int iM71246l = pweVar.m71246l();
                            szs0 szs0VarM79761a = szs0.m79761a(iM71246l);
                            if (szs0VarM79761a == null) {
                                w780VarM87328y.m87353Y(iM71249o);
                                w780VarM87328y.m87353Y(iM71246l);
                            } else {
                                this.f225301b |= 1;
                                this.f225302c = szs0VarM79761a;
                                continue;
                            }
                            break;
                        case 16:
                            this.f225301b |= 2;
                            long jM71247m = pweVar.m71247m();
                            this.f225303d = (-(jM71247m & 1)) ^ (jM71247m >>> 1);
                            continue;
                        case 29:
                            this.f225301b |= 4;
                            this.f225304e = Float.intBitsToFloat(pweVar.m71244j());
                            continue;
                        case 33:
                            this.f225301b |= 8;
                            this.f225305f = Double.longBitsToDouble(pweVar.m71245k());
                            continue;
                        case 40:
                            this.f225301b |= 16;
                            this.f225306g = pweVar.m71246l();
                            continue;
                        case 48:
                            this.f225301b |= 32;
                            this.f225307h = pweVar.m71246l();
                            continue;
                        case 56:
                            this.f225301b |= 64;
                            this.f225308i = pweVar.m71246l();
                            continue;
                        case 66:
                            if ((this.f225301b & 128) == 128) {
                                wzs0 wzs0Var = this.f225309t;
                                wzs0Var.getClass();
                                vzs0Var = new vzs0(0);
                                vzs0Var.f246536d = Collections.EMPTY_LIST;
                                vzs0Var.m86912i(wzs0Var);
                            } else {
                                vzs0Var = null;
                            }
                            wzs0 wzs0Var2 = (wzs0) pweVar.m71242h(wzs0.f256674h, buxVar);
                            this.f225309t = wzs0Var2;
                            if (vzs0Var != null) {
                                vzs0Var.m86912i(wzs0Var2);
                                this.f225309t = vzs0Var.m86910e();
                            }
                            this.f225301b |= 128;
                            continue;
                        case 74:
                            if ((c & 256) != 256) {
                                this.f225297X = new ArrayList();
                                c = 256;
                            }
                            this.f225297X.add(pweVar.m71242h(f225294O0, buxVar));
                            continue;
                        case 80:
                            this.f225301b |= 512;
                            this.f225299Z = pweVar.m71246l();
                            continue;
                        case Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
                            this.f225301b |= 256;
                            this.f225298Y = pweVar.m71246l();
                            continue;
                        default:
                            if (!pweVar.m71252r(iM71249o, w780VarM87328y)) {
                                break;
                            }
                            break;
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((c & 256) == 256) {
                        this.f225297X = Collections.unmodifiableList(this.f225297X);
                    }
                    try {
                        w780VarM87328y.m87375o();
                    } catch (IOException unused) {
                    } finally {
                        this.f225300a = evaVar.m40103e();
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                e.f10912a = this;
                throw e;
            } catch (IOException e2) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                invalidProtocolBufferException.f10912a = this;
                throw invalidProtocolBufferException;
            }
        }
        if ((c & 256) == 256) {
            this.f225297X = Collections.unmodifiableList(this.f225297X);
        }
        try {
            w780VarM87328y.m87375o();
        } catch (IOException unused2) {
        } finally {
            this.f225300a = evaVar.m40103e();
        }
    }

    public tzs0(rzs0 rzs0Var) {
        this.f225295L0 = (byte) -1;
        this.f225296M0 = -1;
        this.f225300a = rzs0Var.f149263a;
    }
}
