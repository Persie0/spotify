package p204p;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class q0t0 extends u110 {

    /* JADX INFO: renamed from: W0 */
    public static final q0t0 f184074W0;

    /* JADX INFO: renamed from: X0 */
    public static final uo60 f184075X0 = new uo60(15);

    /* JADX INFO: renamed from: L0 */
    public int f184076L0;

    /* JADX INFO: renamed from: M0 */
    public List f184077M0;

    /* JADX INFO: renamed from: N0 */
    public List f184078N0;

    /* JADX INFO: renamed from: O0 */
    public p1t0 f184079O0;

    /* JADX INFO: renamed from: P0 */
    public List f184080P0;

    /* JADX INFO: renamed from: Q0 */
    public e0t0 f184081Q0;

    /* JADX INFO: renamed from: R0 */
    public List f184082R0;

    /* JADX INFO: renamed from: S0 */
    public List f184083S0;

    /* JADX INFO: renamed from: T0 */
    public List f184084T0;

    /* JADX INFO: renamed from: U0 */
    public byte f184085U0;

    /* JADX INFO: renamed from: V0 */
    public int f184086V0;

    /* JADX INFO: renamed from: X */
    public int f184087X;

    /* JADX INFO: renamed from: Y */
    public List f184088Y;

    /* JADX INFO: renamed from: Z */
    public List f184089Z;

    /* JADX INFO: renamed from: b */
    public final hva f184090b;

    /* JADX INFO: renamed from: c */
    public int f184091c;

    /* JADX INFO: renamed from: d */
    public int f184092d;

    /* JADX INFO: renamed from: e */
    public int f184093e;

    /* JADX INFO: renamed from: f */
    public int f184094f;

    /* JADX INFO: renamed from: g */
    public j1t0 f184095g;

    /* JADX INFO: renamed from: h */
    public int f184096h;

    /* JADX INFO: renamed from: i */
    public List f184097i;

    /* JADX INFO: renamed from: t */
    public j1t0 f184098t;

    static {
        q0t0 q0t0Var = new q0t0();
        f184074W0 = q0t0Var;
        q0t0Var.m71865o();
    }

    public q0t0(p0t0 p0t0Var) {
        super(p0t0Var);
        this.f184076L0 = -1;
        this.f184085U0 = (byte) -1;
        this.f184086V0 = -1;
        this.f184090b = p0t0Var.f149263a;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        int i = this.f184086V0;
        if (i != -1) {
            return i;
        }
        int iM87319g = (this.f184091c & 2) == 2 ? w780.m87319g(1, this.f184093e) : 0;
        if ((this.f184091c & 4) == 4) {
            iM87319g += w780.m87319g(2, this.f184094f);
        }
        if ((this.f184091c & 8) == 8) {
            iM87319g += w780.m87321i(3, this.f184095g);
        }
        for (int i2 = 0; i2 < this.f184097i.size(); i2++) {
            iM87319g += w780.m87321i(4, (AbstractC2155n8) this.f184097i.get(i2));
        }
        if ((this.f184091c & 32) == 32) {
            iM87319g += w780.m87321i(5, this.f184098t);
        }
        for (int i3 = 0; i3 < this.f184078N0.size(); i3++) {
            iM87319g += w780.m87321i(6, (AbstractC2155n8) this.f184078N0.get(i3));
        }
        if ((this.f184091c & 16) == 16) {
            iM87319g += w780.m87319g(7, this.f184096h);
        }
        if ((this.f184091c & 64) == 64) {
            iM87319g += w780.m87319g(8, this.f184087X);
        }
        if ((this.f184091c & 1) == 1) {
            iM87319g += w780.m87319g(9, this.f184092d);
        }
        for (int i4 = 0; i4 < this.f184088Y.size(); i4++) {
            iM87319g += w780.m87321i(10, (AbstractC2155n8) this.f184088Y.get(i4));
        }
        int iM87320h = 0;
        for (int i5 = 0; i5 < this.f184089Z.size(); i5++) {
            iM87320h += w780.m87320h(((Integer) this.f184089Z.get(i5)).intValue());
        }
        int iM87321i = iM87319g + iM87320h;
        if (!this.f184089Z.isEmpty()) {
            iM87321i = iM87321i + 1 + w780.m87320h(iM87320h);
        }
        this.f184076L0 = iM87320h;
        for (int i6 = 0; i6 < this.f184083S0.size(); i6++) {
            iM87321i += w780.m87321i(12, (AbstractC2155n8) this.f184083S0.get(i6));
        }
        for (int i7 = 0; i7 < this.f184077M0.size(); i7++) {
            iM87321i += w780.m87321i(13, (AbstractC2155n8) this.f184077M0.get(i7));
        }
        if ((this.f184091c & 128) == 128) {
            iM87321i += w780.m87321i(30, this.f184079O0);
        }
        int iM87320h2 = 0;
        for (int i8 = 0; i8 < this.f184080P0.size(); i8++) {
            iM87320h2 += w780.m87320h(((Integer) this.f184080P0.get(i8)).intValue());
        }
        int size = (this.f184080P0.size() * 2) + iM87321i + iM87320h2;
        if ((this.f184091c & 256) == 256) {
            size += w780.m87321i(32, this.f184081Q0);
        }
        for (int i9 = 0; i9 < this.f184082R0.size(); i9++) {
            size += w780.m87321i(33, (AbstractC2155n8) this.f184082R0.get(i9));
        }
        for (int i10 = 0; i10 < this.f184084T0.size(); i10++) {
            size += w780.m87321i(34, (AbstractC2155n8) this.f184084T0.get(i10));
        }
        int size2 = this.f184090b.size() + m82139h() + size;
        this.f184086V0 = size2;
        return size2;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        return p0t0.m68729h();
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: c */
    public final n110 mo24392c() {
        p0t0 p0t0VarM68729h = p0t0.m68729h();
        p0t0VarM68729h.m68731i(this);
        return p0t0VarM68729h;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        mo24390a();
        tey teyVar = new tey(this);
        if ((this.f184091c & 2) == 2) {
            w780Var.m87344P(1, this.f184093e);
        }
        if ((this.f184091c & 4) == 4) {
            w780Var.m87344P(2, this.f184094f);
        }
        if ((this.f184091c & 8) == 8) {
            w780Var.m87346R(3, this.f184095g);
        }
        for (int i = 0; i < this.f184097i.size(); i++) {
            w780Var.m87346R(4, (AbstractC2155n8) this.f184097i.get(i));
        }
        if ((this.f184091c & 32) == 32) {
            w780Var.m87346R(5, this.f184098t);
        }
        for (int i2 = 0; i2 < this.f184078N0.size(); i2++) {
            w780Var.m87346R(6, (AbstractC2155n8) this.f184078N0.get(i2));
        }
        if ((this.f184091c & 16) == 16) {
            w780Var.m87344P(7, this.f184096h);
        }
        if ((this.f184091c & 64) == 64) {
            w780Var.m87344P(8, this.f184087X);
        }
        if ((this.f184091c & 1) == 1) {
            w780Var.m87344P(9, this.f184092d);
        }
        for (int i3 = 0; i3 < this.f184088Y.size(); i3++) {
            w780Var.m87346R(10, (AbstractC2155n8) this.f184088Y.get(i3));
        }
        if (this.f184089Z.size() > 0) {
            w780Var.m87353Y(90);
            w780Var.m87353Y(this.f184076L0);
        }
        for (int i4 = 0; i4 < this.f184089Z.size(); i4++) {
            w780Var.m87345Q(((Integer) this.f184089Z.get(i4)).intValue());
        }
        for (int i5 = 0; i5 < this.f184083S0.size(); i5++) {
            w780Var.m87346R(12, (AbstractC2155n8) this.f184083S0.get(i5));
        }
        for (int i6 = 0; i6 < this.f184077M0.size(); i6++) {
            w780Var.m87346R(13, (AbstractC2155n8) this.f184077M0.get(i6));
        }
        if ((this.f184091c & 128) == 128) {
            w780Var.m87346R(30, this.f184079O0);
        }
        for (int i7 = 0; i7 < this.f184080P0.size(); i7++) {
            w780Var.m87344P(31, ((Integer) this.f184080P0.get(i7)).intValue());
        }
        if ((this.f184091c & 256) == 256) {
            w780Var.m87346R(32, this.f184081Q0);
        }
        for (int i8 = 0; i8 < this.f184082R0.size(); i8++) {
            w780Var.m87346R(33, (AbstractC2155n8) this.f184082R0.get(i8));
        }
        for (int i9 = 0; i9 < this.f184084T0.size(); i9++) {
            w780Var.m87346R(34, (AbstractC2155n8) this.f184084T0.get(i9));
        }
        teyVar.m80597y(19000, w780Var);
        w780Var.m87349U(this.f184090b);
    }

    @Override // p204p.rre0
    public final AbstractC2155n8 getDefaultInstanceForType() {
        return f184074W0;
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        byte b = this.f184085U0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f184091c;
        if ((i & 4) != 4) {
            this.f184085U0 = (byte) 0;
            return false;
        }
        if ((i & 8) == 8 && !this.f184095g.isInitialized()) {
            this.f184085U0 = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f184097i.size(); i2++) {
            if (!((o1t0) this.f184097i.get(i2)).isInitialized()) {
                this.f184085U0 = (byte) 0;
                return false;
            }
        }
        if ((this.f184091c & 32) == 32 && !this.f184098t.isInitialized()) {
            this.f184085U0 = (byte) 0;
            return false;
        }
        for (int i3 = 0; i3 < this.f184088Y.size(); i3++) {
            if (!((j1t0) this.f184088Y.get(i3)).isInitialized()) {
                this.f184085U0 = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.f184077M0.size(); i4++) {
            if (!((r1t0) this.f184077M0.get(i4)).isInitialized()) {
                this.f184085U0 = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.f184078N0.size(); i5++) {
            if (!((r1t0) this.f184078N0.get(i5)).isInitialized()) {
                this.f184085U0 = (byte) 0;
                return false;
            }
        }
        if ((this.f184091c & 128) == 128 && !this.f184079O0.isInitialized()) {
            this.f184085U0 = (byte) 0;
            return false;
        }
        if ((this.f184091c & 256) == 256 && !this.f184081Q0.isInitialized()) {
            this.f184085U0 = (byte) 0;
            return false;
        }
        for (int i6 = 0; i6 < this.f184082R0.size(); i6++) {
            if (!((a0t0) this.f184082R0.get(i6)).isInitialized()) {
                this.f184085U0 = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.f184083S0.size(); i7++) {
            if (!((wzs0) this.f184083S0.get(i7)).isInitialized()) {
                this.f184085U0 = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.f184084T0.size(); i8++) {
            if (!((wzs0) this.f184084T0.get(i8)).isInitialized()) {
                this.f184085U0 = (byte) 0;
                return false;
            }
        }
        if (m82138g()) {
            this.f184085U0 = (byte) 1;
            return true;
        }
        this.f184085U0 = (byte) 0;
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final List m71864n() {
        return this.f184077M0;
    }

    /* JADX INFO: renamed from: o */
    public final void m71865o() {
        this.f184092d = 6;
        this.f184093e = 6;
        this.f184094f = 0;
        j1t0 j1t0Var = j1t0.f107844S0;
        this.f184095g = j1t0Var;
        this.f184096h = 0;
        List list = Collections.EMPTY_LIST;
        this.f184097i = list;
        this.f184098t = j1t0Var;
        this.f184087X = 0;
        this.f184088Y = list;
        this.f184089Z = list;
        this.f184077M0 = list;
        this.f184078N0 = list;
        this.f184079O0 = p1t0.f173161g;
        this.f184080P0 = list;
        this.f184081Q0 = e0t0.f55031e;
        this.f184082R0 = list;
        this.f184083S0 = list;
        this.f184084T0 = list;
    }

    public q0t0() {
        this.f184076L0 = -1;
        this.f184085U0 = (byte) -1;
        this.f184086V0 = -1;
        this.f184090b = hva.f95637a;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v0 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public q0t0(p204p.pwe r22, p204p.bux r23) {
        /*
            Method dump skipped, instruction units count: 1190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.q0t0.<init>(p.pwe, p.bux):void");
    }
}
