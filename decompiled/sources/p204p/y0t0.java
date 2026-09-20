package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.metadata.classic.proto.Metadata$Episode;
import com.spotify.signup.signup.p150v2.proto.Error;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class y0t0 extends u110 {

    /* JADX INFO: renamed from: c1 */
    public static final y0t0 f268056c1;

    /* JADX INFO: renamed from: d1 */
    public static final uo60 f268057d1 = new uo60(18);

    /* JADX INFO: renamed from: L0 */
    public int f268058L0;

    /* JADX INFO: renamed from: M0 */
    public List f268059M0;

    /* JADX INFO: renamed from: N0 */
    public r1t0 f268060N0;

    /* JADX INFO: renamed from: O0 */
    public int f268061O0;

    /* JADX INFO: renamed from: P0 */
    public int f268062P0;

    /* JADX INFO: renamed from: Q0 */
    public List f268063Q0;

    /* JADX INFO: renamed from: R0 */
    public List f268064R0;

    /* JADX INFO: renamed from: S0 */
    public List f268065S0;

    /* JADX INFO: renamed from: T0 */
    public List f268066T0;

    /* JADX INFO: renamed from: U0 */
    public List f268067U0;

    /* JADX INFO: renamed from: V0 */
    public List f268068V0;

    /* JADX INFO: renamed from: W0 */
    public List f268069W0;

    /* JADX INFO: renamed from: X */
    public int f268070X;

    /* JADX INFO: renamed from: X0 */
    public List f268071X0;

    /* JADX INFO: renamed from: Y */
    public List f268072Y;

    /* JADX INFO: renamed from: Y0 */
    public e0t0 f268073Y0;

    /* JADX INFO: renamed from: Z */
    public List f268074Z;

    /* JADX INFO: renamed from: Z0 */
    public e0t0 f268075Z0;

    /* JADX INFO: renamed from: a1 */
    public byte f268076a1;

    /* JADX INFO: renamed from: b */
    public final hva f268077b;

    /* JADX INFO: renamed from: b1 */
    public int f268078b1;

    /* JADX INFO: renamed from: c */
    public int f268079c;

    /* JADX INFO: renamed from: d */
    public int f268080d;

    /* JADX INFO: renamed from: e */
    public int f268081e;

    /* JADX INFO: renamed from: f */
    public int f268082f;

    /* JADX INFO: renamed from: g */
    public j1t0 f268083g;

    /* JADX INFO: renamed from: h */
    public int f268084h;

    /* JADX INFO: renamed from: i */
    public List f268085i;

    /* JADX INFO: renamed from: t */
    public j1t0 f268086t;

    static {
        y0t0 y0t0Var = new y0t0();
        f268056c1 = y0t0Var;
        y0t0Var.m92602o();
    }

    public y0t0(x0t0 x0t0Var) {
        super(x0t0Var);
        this.f268058L0 = -1;
        this.f268076a1 = (byte) -1;
        this.f268078b1 = -1;
        this.f268077b = x0t0Var.f149263a;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        int i = this.f268078b1;
        if (i != -1) {
            return i;
        }
        int iM87319g = (this.f268079c & 2) == 2 ? w780.m87319g(1, this.f268081e) : 0;
        if ((this.f268079c & 4) == 4) {
            iM87319g += w780.m87319g(2, this.f268082f);
        }
        if ((this.f268079c & 8) == 8) {
            iM87319g += w780.m87321i(3, this.f268083g);
        }
        for (int i2 = 0; i2 < this.f268085i.size(); i2++) {
            iM87319g += w780.m87321i(4, (AbstractC2155n8) this.f268085i.get(i2));
        }
        if ((this.f268079c & 32) == 32) {
            iM87319g += w780.m87321i(5, this.f268086t);
        }
        if ((this.f268079c & 128) == 128) {
            iM87319g += w780.m87321i(6, this.f268060N0);
        }
        if ((this.f268079c & 256) == 256) {
            iM87319g += w780.m87319g(7, this.f268061O0);
        }
        if ((this.f268079c & 512) == 512) {
            iM87319g += w780.m87319g(8, this.f268062P0);
        }
        if ((this.f268079c & 16) == 16) {
            iM87319g += w780.m87319g(9, this.f268084h);
        }
        if ((this.f268079c & 64) == 64) {
            iM87319g += w780.m87319g(10, this.f268070X);
        }
        if ((this.f268079c & 1) == 1) {
            iM87319g += w780.m87319g(11, this.f268080d);
        }
        for (int i3 = 0; i3 < this.f268072Y.size(); i3++) {
            iM87319g += w780.m87321i(12, (AbstractC2155n8) this.f268072Y.get(i3));
        }
        int iM87320h = 0;
        for (int i4 = 0; i4 < this.f268074Z.size(); i4++) {
            iM87320h += w780.m87320h(((Integer) this.f268074Z.get(i4)).intValue());
        }
        int iM87321i = iM87319g + iM87320h;
        if (!this.f268074Z.isEmpty()) {
            iM87321i = iM87321i + 1 + w780.m87320h(iM87320h);
        }
        this.f268058L0 = iM87320h;
        for (int i5 = 0; i5 < this.f268065S0.size(); i5++) {
            iM87321i += w780.m87321i(14, (AbstractC2155n8) this.f268065S0.get(i5));
        }
        for (int i6 = 0; i6 < this.f268066T0.size(); i6++) {
            iM87321i += w780.m87321i(15, (AbstractC2155n8) this.f268066T0.get(i6));
        }
        for (int i7 = 0; i7 < this.f268067U0.size(); i7++) {
            iM87321i += w780.m87321i(16, (AbstractC2155n8) this.f268067U0.get(i7));
        }
        for (int i8 = 0; i8 < this.f268059M0.size(); i8++) {
            iM87321i += w780.m87321i(17, (AbstractC2155n8) this.f268059M0.get(i8));
        }
        int iM87320h2 = 0;
        for (int i9 = 0; i9 < this.f268063Q0.size(); i9++) {
            iM87320h2 += w780.m87320h(((Integer) this.f268063Q0.get(i9)).intValue());
        }
        int size = (this.f268063Q0.size() * 2) + iM87321i + iM87320h2;
        for (int i10 = 0; i10 < this.f268064R0.size(); i10++) {
            size += w780.m87321i(32, (AbstractC2155n8) this.f268064R0.get(i10));
        }
        for (int i11 = 0; i11 < this.f268068V0.size(); i11++) {
            size += w780.m87321i(33, (AbstractC2155n8) this.f268068V0.get(i11));
        }
        for (int i12 = 0; i12 < this.f268069W0.size(); i12++) {
            size += w780.m87321i(34, (AbstractC2155n8) this.f268069W0.get(i12));
        }
        for (int i13 = 0; i13 < this.f268071X0.size(); i13++) {
            size += w780.m87321i(35, (AbstractC2155n8) this.f268071X0.get(i13));
        }
        if ((this.f268079c & 1024) == 1024) {
            size += w780.m87321i(40, this.f268073Y0);
        }
        if ((this.f268079c & 2048) == 2048) {
            size += w780.m87321i(41, this.f268075Z0);
        }
        int size2 = this.f268077b.size() + m82139h() + size;
        this.f268078b1 = size2;
        return size2;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        return x0t0.m89609h();
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: c */
    public final n110 mo24392c() {
        x0t0 x0t0VarM89609h = x0t0.m89609h();
        x0t0VarM89609h.m89611i(this);
        return x0t0VarM89609h;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        mo24390a();
        tey teyVar = new tey(this);
        if ((this.f268079c & 2) == 2) {
            w780Var.m87344P(1, this.f268081e);
        }
        if ((this.f268079c & 4) == 4) {
            w780Var.m87344P(2, this.f268082f);
        }
        if ((this.f268079c & 8) == 8) {
            w780Var.m87346R(3, this.f268083g);
        }
        for (int i = 0; i < this.f268085i.size(); i++) {
            w780Var.m87346R(4, (AbstractC2155n8) this.f268085i.get(i));
        }
        if ((this.f268079c & 32) == 32) {
            w780Var.m87346R(5, this.f268086t);
        }
        if ((this.f268079c & 128) == 128) {
            w780Var.m87346R(6, this.f268060N0);
        }
        if ((this.f268079c & 256) == 256) {
            w780Var.m87344P(7, this.f268061O0);
        }
        if ((this.f268079c & 512) == 512) {
            w780Var.m87344P(8, this.f268062P0);
        }
        if ((this.f268079c & 16) == 16) {
            w780Var.m87344P(9, this.f268084h);
        }
        if ((this.f268079c & 64) == 64) {
            w780Var.m87344P(10, this.f268070X);
        }
        if ((this.f268079c & 1) == 1) {
            w780Var.m87344P(11, this.f268080d);
        }
        for (int i2 = 0; i2 < this.f268072Y.size(); i2++) {
            w780Var.m87346R(12, (AbstractC2155n8) this.f268072Y.get(i2));
        }
        if (this.f268074Z.size() > 0) {
            w780Var.m87353Y(Error.INVALID_COUNTRY_FIELD_NUMBER);
            w780Var.m87353Y(this.f268058L0);
        }
        for (int i3 = 0; i3 < this.f268074Z.size(); i3++) {
            w780Var.m87345Q(((Integer) this.f268074Z.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.f268065S0.size(); i4++) {
            w780Var.m87346R(14, (AbstractC2155n8) this.f268065S0.get(i4));
        }
        for (int i5 = 0; i5 < this.f268066T0.size(); i5++) {
            w780Var.m87346R(15, (AbstractC2155n8) this.f268066T0.get(i5));
        }
        for (int i6 = 0; i6 < this.f268067U0.size(); i6++) {
            w780Var.m87346R(16, (AbstractC2155n8) this.f268067U0.get(i6));
        }
        for (int i7 = 0; i7 < this.f268059M0.size(); i7++) {
            w780Var.m87346R(17, (AbstractC2155n8) this.f268059M0.get(i7));
        }
        for (int i8 = 0; i8 < this.f268063Q0.size(); i8++) {
            w780Var.m87344P(31, ((Integer) this.f268063Q0.get(i8)).intValue());
        }
        for (int i9 = 0; i9 < this.f268064R0.size(); i9++) {
            w780Var.m87346R(32, (AbstractC2155n8) this.f268064R0.get(i9));
        }
        for (int i10 = 0; i10 < this.f268068V0.size(); i10++) {
            w780Var.m87346R(33, (AbstractC2155n8) this.f268068V0.get(i10));
        }
        for (int i11 = 0; i11 < this.f268069W0.size(); i11++) {
            w780Var.m87346R(34, (AbstractC2155n8) this.f268069W0.get(i11));
        }
        for (int i12 = 0; i12 < this.f268071X0.size(); i12++) {
            w780Var.m87346R(35, (AbstractC2155n8) this.f268071X0.get(i12));
        }
        if ((this.f268079c & 1024) == 1024) {
            w780Var.m87346R(40, this.f268073Y0);
        }
        if ((this.f268079c & 2048) == 2048) {
            w780Var.m87346R(41, this.f268075Z0);
        }
        teyVar.m80597y(19000, w780Var);
        w780Var.m87349U(this.f268077b);
    }

    @Override // p204p.rre0
    public final AbstractC2155n8 getDefaultInstanceForType() {
        return f268056c1;
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        byte b = this.f268076a1;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f268079c;
        if ((i & 4) != 4) {
            this.f268076a1 = (byte) 0;
            return false;
        }
        if ((i & 8) == 8 && !this.f268083g.isInitialized()) {
            this.f268076a1 = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f268085i.size(); i2++) {
            if (!((o1t0) this.f268085i.get(i2)).isInitialized()) {
                this.f268076a1 = (byte) 0;
                return false;
            }
        }
        if ((this.f268079c & 32) == 32 && !this.f268086t.isInitialized()) {
            this.f268076a1 = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.f268072Y.size(); i3++) {
            if (!((j1t0) this.f268072Y.get(i3)).isInitialized()) {
                this.f268076a1 = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.f268059M0.size(); i4++) {
            if (!((r1t0) this.f268059M0.get(i4)).isInitialized()) {
                this.f268076a1 = (byte) 0;
                return false;
            }
        }
        if ((this.f268079c & 128) == 128 && !this.f268060N0.isInitialized()) {
            this.f268076a1 = (byte) 0;
            return false;
        }
        for (int i5 = 0; i5 < this.f268064R0.size(); i5++) {
            if (!((a0t0) this.f268064R0.get(i5)).isInitialized()) {
                this.f268076a1 = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.f268065S0.size(); i6++) {
            if (!((wzs0) this.f268065S0.get(i6)).isInitialized()) {
                this.f268076a1 = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.f268066T0.size(); i7++) {
            if (!((wzs0) this.f268066T0.get(i7)).isInitialized()) {
                this.f268076a1 = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.f268067U0.size(); i8++) {
            if (!((wzs0) this.f268067U0.get(i8)).isInitialized()) {
                this.f268076a1 = (byte) 0;
                return false;
            }
        }
        for (int i9 = 0; i9 < this.f268068V0.size(); i9++) {
            if (!((wzs0) this.f268068V0.get(i9)).isInitialized()) {
                this.f268076a1 = (byte) 0;
                return false;
            }
        }
        for (int i10 = 0; i10 < this.f268069W0.size(); i10++) {
            if (!((wzs0) this.f268069W0.get(i10)).isInitialized()) {
                this.f268076a1 = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f268071X0.size(); i11++) {
            if (!((wzs0) this.f268071X0.get(i11)).isInitialized()) {
                this.f268076a1 = (byte) 0;
                return false;
            }
        }
        if ((this.f268079c & 1024) == 1024 && !this.f268073Y0.isInitialized()) {
            this.f268076a1 = (byte) 0;
            return false;
        }
        if ((this.f268079c & 2048) == 2048 && !this.f268075Z0.isInitialized()) {
            this.f268076a1 = (byte) 0;
            return false;
        }
        if (m82138g()) {
            this.f268076a1 = (byte) 1;
            return true;
        }
        this.f268076a1 = (byte) 0;
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final List m92601n() {
        return this.f268059M0;
    }

    /* JADX INFO: renamed from: o */
    public final void m92602o() {
        this.f268080d = 518;
        this.f268081e = 2054;
        this.f268082f = 0;
        j1t0 j1t0Var = j1t0.f107844S0;
        this.f268083g = j1t0Var;
        this.f268084h = 0;
        List list = Collections.EMPTY_LIST;
        this.f268085i = list;
        this.f268086t = j1t0Var;
        this.f268070X = 0;
        this.f268072Y = list;
        this.f268074Z = list;
        this.f268059M0 = list;
        this.f268060N0 = r1t0.f194907L0;
        this.f268061O0 = 0;
        this.f268062P0 = 0;
        this.f268063Q0 = list;
        this.f268064R0 = list;
        this.f268065S0 = list;
        this.f268066T0 = list;
        this.f268067U0 = list;
        this.f268068V0 = list;
        this.f268069W0 = list;
        this.f268071X0 = list;
        e0t0 e0t0Var = e0t0.f55031e;
        this.f268073Y0 = e0t0Var;
        this.f268075Z0 = e0t0Var;
    }

    public y0t0() {
        this.f268058L0 = -1;
        this.f268076a1 = (byte) -1;
        this.f268078b1 = -1;
        this.f268077b = hva.f95637a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x0040  */
    /* JADX WARN: Multi-variable type inference failed */
    public y0t0(pwe pweVar, bux buxVar) throws Throwable {
        d0t0 d0t0Var;
        d0t0 d0t0Var2;
        this.f268058L0 = -1;
        this.f268076a1 = (byte) -1;
        this.f268078b1 = -1;
        m92602o();
        eva evaVarM48762l = hva.m48762l();
        boolean z = true;
        w780 w780VarM87328y = w780.m87328y(evaVarM48762l, 1);
        boolean z2 = false;
        int i = 0;
        while (true) {
            boolean z3 = z;
            if (!z2) {
                try {
                    try {
                        int iM71249o = pweVar.m71249o();
                        switch (iM71249o) {
                            case 0:
                                z2 = z3;
                                z = z3;
                                break;
                            case 8:
                                this.f268079c |= 2;
                                this.f268081e = pweVar.m71241g();
                                z = z3;
                                break;
                            case 16:
                                this.f268079c |= 4;
                                this.f268082f = pweVar.m71241g();
                                z = z3;
                                break;
                            case 26:
                                i1t0 i1t0VarMo24392c = (this.f268079c & 8) == 8 ? this.f268083g.mo24392c() : null;
                                j1t0 j1t0Var = (j1t0) pweVar.m71242h(j1t0.f107845T0, buxVar);
                                this.f268083g = j1t0Var;
                                if (i1t0VarMo24392c != 0) {
                                    i1t0VarMo24392c.m49425i(j1t0Var);
                                    this.f268083g = i1t0VarMo24392c.m49424g();
                                }
                                this.f268079c |= 8;
                                z = z3;
                                break;
                            case 34:
                                if ((i & 32) != 32) {
                                    this.f268085i = new ArrayList();
                                    i |= 32;
                                }
                                this.f268085i.add(pweVar.m71242h(o1t0.f160848M0, buxVar));
                                z = z3;
                                break;
                            case 42:
                                i1t0 i1t0VarMo24392c2 = (this.f268079c & 32) == 32 ? this.f268086t.mo24392c() : null;
                                j1t0 j1t0Var2 = (j1t0) pweVar.m71242h(j1t0.f107845T0, buxVar);
                                this.f268086t = j1t0Var2;
                                if (i1t0VarMo24392c2 != 0) {
                                    i1t0VarMo24392c2.m49425i(j1t0Var2);
                                    this.f268086t = i1t0VarMo24392c2.m49424g();
                                }
                                this.f268079c |= 32;
                                z = z3;
                                break;
                            case 50:
                                q1t0 q1t0VarM74491o = (this.f268079c & 128) == 128 ? this.f268060N0.m74491o() : null;
                                r1t0 r1t0Var = (r1t0) pweVar.m71242h(r1t0.f194908M0, buxVar);
                                this.f268060N0 = r1t0Var;
                                if (q1t0VarM74491o != 0) {
                                    q1t0VarM74491o.m71957i(r1t0Var);
                                    this.f268060N0 = q1t0VarM74491o.m71956g();
                                }
                                this.f268079c |= 128;
                                z = z3;
                                break;
                            case 56:
                                this.f268079c |= 256;
                                this.f268061O0 = pweVar.m71241g();
                                z = z3;
                                break;
                            case 64:
                                this.f268079c |= 512;
                                this.f268062P0 = pweVar.m71241g();
                                z = z3;
                                break;
                            case 72:
                                this.f268079c |= 16;
                                this.f268084h = pweVar.m71241g();
                                z = z3;
                                break;
                            case 80:
                                this.f268079c |= 64;
                                this.f268070X = pweVar.m71241g();
                                z = z3;
                                break;
                            case Metadata$Episode.SEASON_NUMBER_FIELD_NUMBER /* 88 */:
                                this.f268079c |= 1;
                                this.f268080d = pweVar.m71241g();
                                z = z3;
                                break;
                            case 98:
                                if ((i & 256) != 256) {
                                    this.f268072Y = new ArrayList();
                                    i |= 256;
                                }
                                this.f268072Y.add(pweVar.m71242h(j1t0.f107845T0, buxVar));
                                z = z3;
                                break;
                            case 104:
                                if ((i & 512) != 512) {
                                    this.f268074Z = new ArrayList();
                                    i |= 512;
                                }
                                this.f268074Z.add(Integer.valueOf(pweVar.m71241g()));
                                z = z3;
                                break;
                            case Error.INVALID_COUNTRY_FIELD_NUMBER /* 106 */:
                                int iM71239e = pweVar.m71239e(pweVar.m71246l());
                                if ((i & 512) != 512 && pweVar.m71237c() > 0) {
                                    this.f268074Z = new ArrayList();
                                    i |= 512;
                                }
                                while (pweVar.m71237c() > 0) {
                                    this.f268074Z.add(Integer.valueOf(pweVar.m71241g()));
                                }
                                pweVar.m71238d(iM71239e);
                                z = z3;
                                break;
                            case 114:
                                if ((i & 65536) != 65536) {
                                    this.f268065S0 = new ArrayList();
                                    i |= 65536;
                                }
                                this.f268065S0.add(pweVar.m71242h(wzs0.f256674h, buxVar));
                                z = z3;
                                break;
                            case ContentType.USER_GENERATED_LONG_FORM_ON_DEMAND /* 122 */:
                                if ((i & 131072) != 131072) {
                                    this.f268066T0 = new ArrayList();
                                    i |= 131072;
                                }
                                this.f268066T0.add(pweVar.m71242h(wzs0.f256674h, buxVar));
                                z = z3;
                                break;
                            case 130:
                                if ((i & 262144) != 262144) {
                                    this.f268067U0 = new ArrayList();
                                    i |= 262144;
                                }
                                this.f268067U0.add(pweVar.m71242h(wzs0.f256674h, buxVar));
                                z = z3;
                                break;
                            case 138:
                                if ((i & 1024) != 1024) {
                                    this.f268059M0 = new ArrayList();
                                    i |= 1024;
                                }
                                this.f268059M0.add(pweVar.m71242h(r1t0.f194908M0, buxVar));
                                z = z3;
                                break;
                            case 248:
                                if ((i & 16384) != 16384) {
                                    this.f268063Q0 = new ArrayList();
                                    i |= 16384;
                                }
                                this.f268063Q0.add(Integer.valueOf(pweVar.m71241g()));
                                z = z3;
                                break;
                            case 250:
                                int iM71239e2 = pweVar.m71239e(pweVar.m71246l());
                                if ((i & 16384) != 16384 && pweVar.m71237c() > 0) {
                                    this.f268063Q0 = new ArrayList();
                                    i |= 16384;
                                }
                                while (pweVar.m71237c() > 0) {
                                    this.f268063Q0.add(Integer.valueOf(pweVar.m71241g()));
                                }
                                pweVar.m71238d(iM71239e2);
                                z = z3;
                                break;
                            case 258:
                                if ((i & 32768) != 32768) {
                                    this.f268064R0 = new ArrayList();
                                    i |= 32768;
                                }
                                this.f268064R0.add(pweVar.m71242h(a0t0.f11162h, buxVar));
                                z = z3;
                                break;
                            case 266:
                                if ((i & 524288) != 524288) {
                                    this.f268068V0 = new ArrayList();
                                    i |= 524288;
                                }
                                this.f268068V0.add(pweVar.m71242h(wzs0.f256674h, buxVar));
                                z = z3;
                                break;
                            case 274:
                                if ((i & 1048576) != 1048576) {
                                    this.f268069W0 = new ArrayList();
                                    i |= 1048576;
                                }
                                this.f268069W0.add(pweVar.m71242h(wzs0.f256674h, buxVar));
                                z = z3;
                                break;
                            case 282:
                                if ((i & 2097152) != 2097152) {
                                    this.f268071X0 = new ArrayList();
                                    i |= 2097152;
                                }
                                this.f268071X0.add(pweVar.m71242h(wzs0.f256674h, buxVar));
                                z = z3;
                                break;
                            case 322:
                                if ((this.f268079c & 1024) == 1024) {
                                    e0t0 e0t0Var = this.f268073Y0;
                                    e0t0Var.getClass();
                                    d0t0Var2 = new d0t0(0);
                                    d0t0Var2.f44052d = Collections.EMPTY_LIST;
                                    d0t0Var2.m34558j(e0t0Var);
                                } else {
                                    d0t0Var2 = null;
                                }
                                e0t0 e0t0Var2 = (e0t0) pweVar.m71242h(e0t0.f55032f, buxVar);
                                this.f268073Y0 = e0t0Var2;
                                if (d0t0Var2 != null) {
                                    d0t0Var2.m34558j(e0t0Var2);
                                    this.f268073Y0 = d0t0Var2.m34554e();
                                }
                                this.f268079c |= 1024;
                                z = z3;
                                break;
                            case 330:
                                try {
                                    if ((this.f268079c & 2048) == 2048) {
                                        try {
                                            e0t0 e0t0Var3 = this.f268075Z0;
                                            e0t0Var3.getClass();
                                            d0t0Var = new d0t0(0);
                                            d0t0Var.f44052d = Collections.EMPTY_LIST;
                                            d0t0Var.m34558j(e0t0Var3);
                                        } catch (InvalidProtocolBufferException e) {
                                            e = e;
                                            e.m24219a(this);
                                            throw e;
                                        } catch (IOException e2) {
                                            e = e2;
                                            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e.getMessage());
                                            invalidProtocolBufferException.m24219a(this);
                                            throw invalidProtocolBufferException;
                                        } catch (Throwable th) {
                                            th = th;
                                            if ((i & 32) == 32) {
                                                this.f268085i = Collections.unmodifiableList(this.f268085i);
                                            }
                                            if ((i & 256) == 256) {
                                                this.f268072Y = Collections.unmodifiableList(this.f268072Y);
                                            }
                                            if ((i & 512) == 512) {
                                                this.f268074Z = Collections.unmodifiableList(this.f268074Z);
                                            }
                                            if ((i & 65536) == 65536) {
                                                this.f268065S0 = Collections.unmodifiableList(this.f268065S0);
                                            }
                                            if ((i & 131072) == 131072) {
                                                this.f268066T0 = Collections.unmodifiableList(this.f268066T0);
                                            }
                                            if ((i & 262144) == 262144) {
                                                this.f268067U0 = Collections.unmodifiableList(this.f268067U0);
                                            }
                                            if ((i & 1024) == 1024) {
                                                this.f268059M0 = Collections.unmodifiableList(this.f268059M0);
                                            }
                                            if ((i & 16384) == 16384) {
                                                this.f268063Q0 = Collections.unmodifiableList(this.f268063Q0);
                                            }
                                            if ((i & 32768) == 32768) {
                                                this.f268064R0 = Collections.unmodifiableList(this.f268064R0);
                                            }
                                            if ((i & 524288) == 524288) {
                                                this.f268068V0 = Collections.unmodifiableList(this.f268068V0);
                                            }
                                            if ((i & 1048576) == 1048576) {
                                                this.f268069W0 = Collections.unmodifiableList(this.f268069W0);
                                            }
                                            if ((i & 2097152) == 2097152) {
                                                this.f268071X0 = Collections.unmodifiableList(this.f268071X0);
                                            }
                                            try {
                                                w780VarM87328y.m87375o();
                                                break;
                                            } catch (IOException unused) {
                                            } finally {
                                                this.f268077b = evaVarM48762l.m40103e();
                                            }
                                            m82142k();
                                            throw th;
                                        }
                                    } else {
                                        d0t0Var = null;
                                    }
                                    e0t0 e0t0Var4 = (e0t0) pweVar.m71242h(e0t0.f55032f, buxVar);
                                    this.f268075Z0 = e0t0Var4;
                                    if (d0t0Var != null) {
                                        d0t0Var.m34558j(e0t0Var4);
                                        this.f268075Z0 = d0t0Var.m34554e();
                                    }
                                    this.f268079c |= 2048;
                                    z = z3;
                                } catch (InvalidProtocolBufferException e3) {
                                    e = e3;
                                } catch (IOException e4) {
                                    e = e4;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                break;
                            default:
                                if (!m82143l(pweVar, w780VarM87328y, buxVar, iM71249o)) {
                                    z2 = z3;
                                }
                                z = z3;
                                break;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (InvalidProtocolBufferException e5) {
                    e = e5;
                } catch (IOException e6) {
                    e = e6;
                }
            } else {
                if ((i & 32) == 32) {
                    this.f268085i = Collections.unmodifiableList(this.f268085i);
                }
                if ((i & 256) == 256) {
                    this.f268072Y = Collections.unmodifiableList(this.f268072Y);
                }
                if ((i & 512) == 512) {
                    this.f268074Z = Collections.unmodifiableList(this.f268074Z);
                }
                if ((i & 65536) == 65536) {
                    this.f268065S0 = Collections.unmodifiableList(this.f268065S0);
                }
                if ((i & 131072) == 131072) {
                    this.f268066T0 = Collections.unmodifiableList(this.f268066T0);
                }
                if ((i & 262144) == 262144) {
                    this.f268067U0 = Collections.unmodifiableList(this.f268067U0);
                }
                if ((i & 1024) == 1024) {
                    this.f268059M0 = Collections.unmodifiableList(this.f268059M0);
                }
                if ((i & 16384) == 16384) {
                    this.f268063Q0 = Collections.unmodifiableList(this.f268063Q0);
                }
                if ((i & 32768) == 32768) {
                    this.f268064R0 = Collections.unmodifiableList(this.f268064R0);
                }
                if ((i & 524288) == 524288) {
                    this.f268068V0 = Collections.unmodifiableList(this.f268068V0);
                }
                if ((i & 1048576) == 1048576) {
                    this.f268069W0 = Collections.unmodifiableList(this.f268069W0);
                }
                if ((i & 2097152) == 2097152) {
                    this.f268071X0 = Collections.unmodifiableList(this.f268071X0);
                }
                try {
                    w780VarM87328y.m87375o();
                } catch (IOException unused2) {
                } finally {
                    this.f268077b = evaVarM48762l.m40103e();
                }
                m82142k();
                return;
            }
        }
    }
}
