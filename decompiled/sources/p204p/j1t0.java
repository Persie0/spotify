package p204p;

import com.comscore.streaming.ContentDeliveryAdvertisementCapability;
import com.comscore.streaming.ContentType;
import com.spotify.metadata.classic.proto.Metadata$Episode;
import com.spotify.signup.signup.p150v2.proto.Error;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class j1t0 extends u110 {

    /* JADX INFO: renamed from: S0 */
    public static final j1t0 f107844S0;

    /* JADX INFO: renamed from: T0 */
    public static final uo60 f107845T0 = new uo60(22);

    /* JADX INFO: renamed from: L0 */
    public int f107846L0;

    /* JADX INFO: renamed from: M0 */
    public j1t0 f107847M0;

    /* JADX INFO: renamed from: N0 */
    public int f107848N0;

    /* JADX INFO: renamed from: O0 */
    public int f107849O0;

    /* JADX INFO: renamed from: P0 */
    public List f107850P0;

    /* JADX INFO: renamed from: Q0 */
    public byte f107851Q0;

    /* JADX INFO: renamed from: R0 */
    public int f107852R0;

    /* JADX INFO: renamed from: X */
    public int f107853X;

    /* JADX INFO: renamed from: Y */
    public int f107854Y;

    /* JADX INFO: renamed from: Z */
    public j1t0 f107855Z;

    /* JADX INFO: renamed from: b */
    public final hva f107856b;

    /* JADX INFO: renamed from: c */
    public int f107857c;

    /* JADX INFO: renamed from: d */
    public List f107858d;

    /* JADX INFO: renamed from: e */
    public boolean f107859e;

    /* JADX INFO: renamed from: f */
    public int f107860f;

    /* JADX INFO: renamed from: g */
    public j1t0 f107861g;

    /* JADX INFO: renamed from: h */
    public int f107862h;

    /* JADX INFO: renamed from: i */
    public int f107863i;

    /* JADX INFO: renamed from: t */
    public int f107864t;

    static {
        j1t0 j1t0Var = new j1t0();
        f107844S0 = j1t0Var;
        j1t0Var.m52185o();
    }

    public j1t0(i1t0 i1t0Var) {
        super(i1t0Var);
        this.f107851Q0 = (byte) -1;
        this.f107852R0 = -1;
        this.f107856b = i1t0Var.f149263a;
    }

    /* JADX INFO: renamed from: p */
    public static i1t0 m52183p(j1t0 j1t0Var) {
        i1t0 i1t0VarM49423h = i1t0.m49423h();
        i1t0VarM49423h.m49425i(j1t0Var);
        return i1t0VarM49423h;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        int i = this.f107852R0;
        if (i != -1) {
            return i;
        }
        int iM87319g = (this.f107857c & 4096) == 4096 ? w780.m87319g(1, this.f107849O0) : 0;
        for (int i2 = 0; i2 < this.f107858d.size(); i2++) {
            iM87319g += w780.m87321i(2, (AbstractC2155n8) this.f107858d.get(i2));
        }
        if ((this.f107857c & 1) == 1) {
            iM87319g += w780.m87325m(3) + 1;
        }
        if ((this.f107857c & 2) == 2) {
            iM87319g += w780.m87319g(4, this.f107860f);
        }
        if ((this.f107857c & 4) == 4) {
            iM87319g += w780.m87321i(5, this.f107861g);
        }
        if ((this.f107857c & 16) == 16) {
            iM87319g += w780.m87319g(6, this.f107863i);
        }
        if ((this.f107857c & 32) == 32) {
            iM87319g += w780.m87319g(7, this.f107864t);
        }
        if ((this.f107857c & 8) == 8) {
            iM87319g += w780.m87319g(8, this.f107862h);
        }
        if ((this.f107857c & 64) == 64) {
            iM87319g += w780.m87319g(9, this.f107853X);
        }
        if ((this.f107857c & 256) == 256) {
            iM87319g += w780.m87321i(10, this.f107855Z);
        }
        if ((this.f107857c & 512) == 512) {
            iM87319g += w780.m87319g(11, this.f107846L0);
        }
        if ((this.f107857c & 128) == 128) {
            iM87319g += w780.m87319g(12, this.f107854Y);
        }
        if ((this.f107857c & 1024) == 1024) {
            iM87319g += w780.m87321i(13, this.f107847M0);
        }
        if ((this.f107857c & 2048) == 2048) {
            iM87319g += w780.m87319g(14, this.f107848N0);
        }
        for (int i3 = 0; i3 < this.f107850P0.size(); i3++) {
            iM87319g += w780.m87321i(100, (AbstractC2155n8) this.f107850P0.get(i3));
        }
        int size = this.f107856b.size() + m82139h() + iM87319g;
        this.f107852R0 = size;
        return size;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        return i1t0.m49423h();
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        mo24390a();
        tey teyVar = new tey(this);
        if ((this.f107857c & 4096) == 4096) {
            w780Var.m87344P(1, this.f107849O0);
        }
        for (int i = 0; i < this.f107858d.size(); i++) {
            w780Var.m87346R(2, (AbstractC2155n8) this.f107858d.get(i));
        }
        if ((this.f107857c & 1) == 1) {
            boolean z = this.f107859e;
            w780Var.m87356a0(3, 0);
            w780Var.m87348T(z ? 1 : 0);
        }
        if ((this.f107857c & 2) == 2) {
            w780Var.m87344P(4, this.f107860f);
        }
        if ((this.f107857c & 4) == 4) {
            w780Var.m87346R(5, this.f107861g);
        }
        if ((this.f107857c & 16) == 16) {
            w780Var.m87344P(6, this.f107863i);
        }
        if ((this.f107857c & 32) == 32) {
            w780Var.m87344P(7, this.f107864t);
        }
        if ((this.f107857c & 8) == 8) {
            w780Var.m87344P(8, this.f107862h);
        }
        if ((this.f107857c & 64) == 64) {
            w780Var.m87344P(9, this.f107853X);
        }
        if ((this.f107857c & 256) == 256) {
            w780Var.m87346R(10, this.f107855Z);
        }
        if ((this.f107857c & 512) == 512) {
            w780Var.m87344P(11, this.f107846L0);
        }
        if ((this.f107857c & 128) == 128) {
            w780Var.m87344P(12, this.f107854Y);
        }
        if ((this.f107857c & 1024) == 1024) {
            w780Var.m87346R(13, this.f107847M0);
        }
        if ((this.f107857c & 2048) == 2048) {
            w780Var.m87344P(14, this.f107848N0);
        }
        for (int i2 = 0; i2 < this.f107850P0.size(); i2++) {
            w780Var.m87346R(100, (AbstractC2155n8) this.f107850P0.get(i2));
        }
        teyVar.m80597y(200, w780Var);
        w780Var.m87349U(this.f107856b);
    }

    @Override // p204p.rre0
    public final AbstractC2155n8 getDefaultInstanceForType() {
        return f107844S0;
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        byte b = this.f107851Q0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f107858d.size(); i++) {
            if (!((h1t0) this.f107858d.get(i)).isInitialized()) {
                this.f107851Q0 = (byte) 0;
                return false;
            }
        }
        if ((this.f107857c & 4) == 4 && !this.f107861g.isInitialized()) {
            this.f107851Q0 = (byte) 0;
            return false;
        }
        if ((this.f107857c & 256) == 256 && !this.f107855Z.isInitialized()) {
            this.f107851Q0 = (byte) 0;
            return false;
        }
        if ((this.f107857c & 1024) == 1024 && !this.f107847M0.isInitialized()) {
            this.f107851Q0 = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f107850P0.size(); i2++) {
            if (!((wzs0) this.f107850P0.get(i2)).isInitialized()) {
                this.f107851Q0 = (byte) 0;
                return false;
            }
        }
        if (m82138g()) {
            this.f107851Q0 = (byte) 1;
            return true;
        }
        this.f107851Q0 = (byte) 0;
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m52184n() {
        return (this.f107857c & 16) == 16;
    }

    /* JADX INFO: renamed from: o */
    public final void m52185o() {
        List list = Collections.EMPTY_LIST;
        this.f107858d = list;
        this.f107859e = false;
        this.f107860f = 0;
        j1t0 j1t0Var = f107844S0;
        this.f107861g = j1t0Var;
        this.f107862h = 0;
        this.f107863i = 0;
        this.f107864t = 0;
        this.f107853X = 0;
        this.f107854Y = 0;
        this.f107855Z = j1t0Var;
        this.f107846L0 = 0;
        this.f107847M0 = j1t0Var;
        this.f107848N0 = 0;
        this.f107849O0 = 0;
        this.f107850P0 = list;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final i1t0 mo24392c() {
        return m52183p(this);
    }

    public j1t0() {
        this.f107851Q0 = (byte) -1;
        this.f107852R0 = -1;
        this.f107856b = hva.f95637a;
    }

    public j1t0(pwe pweVar, bux buxVar) {
        this.f107851Q0 = (byte) -1;
        this.f107852R0 = -1;
        m52185o();
        eva evaVar = new eva(0);
        w780 w780VarM87328y = w780.m87328y(evaVar, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iM71249o = pweVar.m71249o();
                    uo60 uo60Var = f107845T0;
                    i1t0 i1t0VarM52183p = null;
                    switch (iM71249o) {
                        case 0:
                            break;
                        case 8:
                            this.f107857c |= 4096;
                            this.f107849O0 = pweVar.m71246l();
                            continue;
                        case 18:
                            if ((i & 1) != 1) {
                                this.f107858d = new ArrayList();
                                i |= 1;
                            }
                            this.f107858d.add(pweVar.m71242h(h1t0.f86700i, buxVar));
                            continue;
                        case 24:
                            this.f107857c |= 1;
                            this.f107859e = pweVar.m71247m() != 0;
                            continue;
                        case 32:
                            this.f107857c |= 2;
                            this.f107860f = pweVar.m71246l();
                            continue;
                        case 42:
                            if ((this.f107857c & 4) == 4) {
                                j1t0 j1t0Var = this.f107861g;
                                j1t0Var.getClass();
                                i1t0VarM52183p = m52183p(j1t0Var);
                            }
                            j1t0 j1t0Var2 = (j1t0) pweVar.m71242h(uo60Var, buxVar);
                            this.f107861g = j1t0Var2;
                            if (i1t0VarM52183p != null) {
                                i1t0VarM52183p.m49425i(j1t0Var2);
                                this.f107861g = i1t0VarM52183p.m49424g();
                            }
                            this.f107857c |= 4;
                            continue;
                        case 48:
                            this.f107857c |= 16;
                            this.f107863i = pweVar.m71246l();
                            continue;
                        case 56:
                            this.f107857c |= 32;
                            this.f107864t = pweVar.m71246l();
                            continue;
                        case 64:
                            this.f107857c |= 8;
                            this.f107862h = pweVar.m71246l();
                            continue;
                        case 72:
                            this.f107857c |= 64;
                            this.f107853X = pweVar.m71246l();
                            continue;
                        case 82:
                            if ((this.f107857c & 256) == 256) {
                                j1t0 j1t0Var3 = this.f107855Z;
                                j1t0Var3.getClass();
                                i1t0VarM52183p = m52183p(j1t0Var3);
                            }
                            j1t0 j1t0Var4 = (j1t0) pweVar.m71242h(uo60Var, buxVar);
                            this.f107855Z = j1t0Var4;
                            if (i1t0VarM52183p != null) {
                                i1t0VarM52183p.m49425i(j1t0Var4);
                                this.f107855Z = i1t0VarM52183p.m49424g();
                            }
                            this.f107857c |= 256;
                            continue;
                        case Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
                            this.f107857c |= 512;
                            this.f107846L0 = pweVar.m71246l();
                            continue;
                        case 96:
                            this.f107857c |= 128;
                            this.f107854Y = pweVar.m71246l();
                            continue;
                        case Error.INVALID_COUNTRY_FIELD_NUMBER /* 106 */:
                            if ((this.f107857c & 1024) == 1024) {
                                j1t0 j1t0Var5 = this.f107847M0;
                                j1t0Var5.getClass();
                                i1t0VarM52183p = m52183p(j1t0Var5);
                            }
                            j1t0 j1t0Var6 = (j1t0) pweVar.m71242h(uo60Var, buxVar);
                            this.f107847M0 = j1t0Var6;
                            if (i1t0VarM52183p != null) {
                                i1t0VarM52183p.m49425i(j1t0Var6);
                                this.f107847M0 = i1t0VarM52183p.m49424g();
                            }
                            this.f107857c |= 1024;
                            continue;
                        case ContentType.LONG_FORM_ON_DEMAND /* 112 */:
                            this.f107857c |= 2048;
                            this.f107848N0 = pweVar.m71246l();
                            continue;
                        case ContentDeliveryAdvertisementCapability.DYNAMIC_LOAD /* 802 */:
                            if ((i & 16384) != 16384) {
                                this.f107850P0 = new ArrayList();
                                i |= 16384;
                            }
                            this.f107850P0.add(pweVar.m71242h(wzs0.f256674h, buxVar));
                            continue;
                        default:
                            if (!m82143l(pweVar, w780VarM87328y, buxVar, iM71249o)) {
                                break;
                            }
                            break;
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    e.f10912a = this;
                    throw e;
                } catch (IOException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                    invalidProtocolBufferException.f10912a = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                if ((i & 1) == 1) {
                    this.f107858d = Collections.unmodifiableList(this.f107858d);
                }
                if ((i & 16384) == 16384) {
                    this.f107850P0 = Collections.unmodifiableList(this.f107850P0);
                }
                try {
                    w780VarM87328y.m87375o();
                } catch (IOException unused) {
                } finally {
                    this.f107856b = evaVar.m40103e();
                }
                m82142k();
                throw th;
            }
        }
        if ((i & 1) == 1) {
            this.f107858d = Collections.unmodifiableList(this.f107858d);
        }
        if ((i & 16384) == 16384) {
            this.f107850P0 = Collections.unmodifiableList(this.f107850P0);
        }
        try {
            w780VarM87328y.m87375o();
        } catch (IOException unused2) {
        } finally {
            this.f107856b = evaVar.m40103e();
        }
        m82142k();
    }
}
