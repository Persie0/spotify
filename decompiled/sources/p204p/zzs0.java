package p204p;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class zzs0 extends u110 {

    /* JADX INFO: renamed from: e1 */
    public static final zzs0 f288070e1;

    /* JADX INFO: renamed from: f1 */
    public static final uo60 f288071f1 = new uo60(8);

    /* JADX INFO: renamed from: L0 */
    public List f288072L0;

    /* JADX INFO: renamed from: M0 */
    public int f288073M0;

    /* JADX INFO: renamed from: N0 */
    public List f288074N0;

    /* JADX INFO: renamed from: O0 */
    public List f288075O0;

    /* JADX INFO: renamed from: P0 */
    public List f288076P0;

    /* JADX INFO: renamed from: Q0 */
    public List f288077Q0;

    /* JADX INFO: renamed from: R0 */
    public List f288078R0;

    /* JADX INFO: renamed from: S0 */
    public List f288079S0;

    /* JADX INFO: renamed from: T0 */
    public int f288080T0;

    /* JADX INFO: renamed from: U0 */
    public int f288081U0;

    /* JADX INFO: renamed from: V0 */
    public j1t0 f288082V0;

    /* JADX INFO: renamed from: W0 */
    public int f288083W0;

    /* JADX INFO: renamed from: X */
    public List f288084X;

    /* JADX INFO: renamed from: X0 */
    public List f288085X0;

    /* JADX INFO: renamed from: Y */
    public int f288086Y;

    /* JADX INFO: renamed from: Y0 */
    public p1t0 f288087Y0;

    /* JADX INFO: renamed from: Z */
    public List f288088Z;

    /* JADX INFO: renamed from: Z0 */
    public List f288089Z0;

    /* JADX INFO: renamed from: a1 */
    public w1t0 f288090a1;

    /* JADX INFO: renamed from: b */
    public final hva f288091b;

    /* JADX INFO: renamed from: b1 */
    public List f288092b1;

    /* JADX INFO: renamed from: c */
    public int f288093c;

    /* JADX INFO: renamed from: c1 */
    public byte f288094c1;

    /* JADX INFO: renamed from: d */
    public int f288095d;

    /* JADX INFO: renamed from: d1 */
    public int f288096d1;

    /* JADX INFO: renamed from: e */
    public int f288097e;

    /* JADX INFO: renamed from: f */
    public int f288098f;

    /* JADX INFO: renamed from: g */
    public List f288099g;

    /* JADX INFO: renamed from: h */
    public List f288100h;

    /* JADX INFO: renamed from: i */
    public List f288101i;

    /* JADX INFO: renamed from: t */
    public int f288102t;

    static {
        zzs0 zzs0Var = new zzs0();
        f288070e1 = zzs0Var;
        zzs0Var.m97338n();
    }

    public zzs0(xzs0 xzs0Var) {
        super(xzs0Var);
        this.f288102t = -1;
        this.f288086Y = -1;
        this.f288073M0 = -1;
        this.f288080T0 = -1;
        this.f288094c1 = (byte) -1;
        this.f288096d1 = -1;
        this.f288091b = xzs0Var.f149263a;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        int i = this.f288096d1;
        if (i != -1) {
            return i;
        }
        int iM87319g = (this.f288093c & 1) == 1 ? w780.m87319g(1, this.f288095d) : 0;
        int iM87320h = 0;
        for (int i2 = 0; i2 < this.f288101i.size(); i2++) {
            iM87320h += w780.m87320h(((Integer) this.f288101i.get(i2)).intValue());
        }
        int iM87321i = iM87319g + iM87320h;
        if (!this.f288101i.isEmpty()) {
            iM87321i = iM87321i + 1 + w780.m87320h(iM87320h);
        }
        this.f288102t = iM87320h;
        if ((this.f288093c & 2) == 2) {
            iM87321i += w780.m87319g(3, this.f288097e);
        }
        if ((this.f288093c & 4) == 4) {
            iM87321i += w780.m87319g(4, this.f288098f);
        }
        for (int i3 = 0; i3 < this.f288099g.size(); i3++) {
            iM87321i += w780.m87321i(5, (AbstractC2155n8) this.f288099g.get(i3));
        }
        for (int i4 = 0; i4 < this.f288100h.size(); i4++) {
            iM87321i += w780.m87321i(6, (AbstractC2155n8) this.f288100h.get(i4));
        }
        int iM87320h2 = 0;
        for (int i5 = 0; i5 < this.f288084X.size(); i5++) {
            iM87320h2 += w780.m87320h(((Integer) this.f288084X.get(i5)).intValue());
        }
        int iM87321i2 = iM87321i + iM87320h2;
        if (!this.f288084X.isEmpty()) {
            iM87321i2 = iM87321i2 + 1 + w780.m87320h(iM87320h2);
        }
        this.f288086Y = iM87320h2;
        for (int i6 = 0; i6 < this.f288074N0.size(); i6++) {
            iM87321i2 += w780.m87321i(8, (AbstractC2155n8) this.f288074N0.get(i6));
        }
        for (int i7 = 0; i7 < this.f288075O0.size(); i7++) {
            iM87321i2 += w780.m87321i(9, (AbstractC2155n8) this.f288075O0.get(i7));
        }
        for (int i8 = 0; i8 < this.f288076P0.size(); i8++) {
            iM87321i2 += w780.m87321i(10, (AbstractC2155n8) this.f288076P0.get(i8));
        }
        for (int i9 = 0; i9 < this.f288077Q0.size(); i9++) {
            iM87321i2 += w780.m87321i(11, (AbstractC2155n8) this.f288077Q0.get(i9));
        }
        for (int i10 = 0; i10 < this.f288078R0.size(); i10++) {
            iM87321i2 += w780.m87321i(13, (AbstractC2155n8) this.f288078R0.get(i10));
        }
        int iM87320h3 = 0;
        for (int i11 = 0; i11 < this.f288079S0.size(); i11++) {
            iM87320h3 += w780.m87320h(((Integer) this.f288079S0.get(i11)).intValue());
        }
        int iM87321i3 = iM87321i2 + iM87320h3;
        if (!this.f288079S0.isEmpty()) {
            iM87321i3 = iM87321i3 + 2 + w780.m87320h(iM87320h3);
        }
        this.f288080T0 = iM87320h3;
        if ((this.f288093c & 8) == 8) {
            iM87321i3 += w780.m87319g(17, this.f288081U0);
        }
        if ((this.f288093c & 16) == 16) {
            iM87321i3 += w780.m87321i(18, this.f288082V0);
        }
        if ((this.f288093c & 32) == 32) {
            iM87321i3 += w780.m87319g(19, this.f288083W0);
        }
        for (int i12 = 0; i12 < this.f288088Z.size(); i12++) {
            iM87321i3 += w780.m87321i(20, (AbstractC2155n8) this.f288088Z.get(i12));
        }
        int iM87320h4 = 0;
        for (int i13 = 0; i13 < this.f288072L0.size(); i13++) {
            iM87320h4 += w780.m87320h(((Integer) this.f288072L0.get(i13)).intValue());
        }
        int iM87321i4 = iM87321i3 + iM87320h4;
        if (!this.f288072L0.isEmpty()) {
            iM87321i4 = iM87321i4 + 2 + w780.m87320h(iM87320h4);
        }
        this.f288073M0 = iM87320h4;
        for (int i14 = 0; i14 < this.f288085X0.size(); i14++) {
            iM87321i4 += w780.m87321i(25, (AbstractC2155n8) this.f288085X0.get(i14));
        }
        if ((this.f288093c & 64) == 64) {
            iM87321i4 += w780.m87321i(30, this.f288087Y0);
        }
        int iM87320h5 = 0;
        for (int i15 = 0; i15 < this.f288089Z0.size(); i15++) {
            iM87320h5 += w780.m87320h(((Integer) this.f288089Z0.get(i15)).intValue());
        }
        int size = (this.f288089Z0.size() * 2) + iM87321i4 + iM87320h5;
        if ((this.f288093c & 128) == 128) {
            size += w780.m87321i(32, this.f288090a1);
        }
        for (int i16 = 0; i16 < this.f288092b1.size(); i16++) {
            size += w780.m87321i(33, (AbstractC2155n8) this.f288092b1.get(i16));
        }
        int size2 = this.f288091b.size() + m82139h() + size;
        this.f288096d1 = size2;
        return size2;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        return xzs0.m92487h();
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: c */
    public final n110 mo24392c() {
        xzs0 xzs0VarM92487h = xzs0.m92487h();
        xzs0VarM92487h.m92489i(this);
        return xzs0VarM92487h;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        mo24390a();
        tey teyVar = new tey(this);
        if ((this.f288093c & 1) == 1) {
            w780Var.m87344P(1, this.f288095d);
        }
        if (this.f288101i.size() > 0) {
            w780Var.m87353Y(18);
            w780Var.m87353Y(this.f288102t);
        }
        for (int i = 0; i < this.f288101i.size(); i++) {
            w780Var.m87345Q(((Integer) this.f288101i.get(i)).intValue());
        }
        if ((this.f288093c & 2) == 2) {
            w780Var.m87344P(3, this.f288097e);
        }
        if ((this.f288093c & 4) == 4) {
            w780Var.m87344P(4, this.f288098f);
        }
        for (int i2 = 0; i2 < this.f288099g.size(); i2++) {
            w780Var.m87346R(5, (AbstractC2155n8) this.f288099g.get(i2));
        }
        for (int i3 = 0; i3 < this.f288100h.size(); i3++) {
            w780Var.m87346R(6, (AbstractC2155n8) this.f288100h.get(i3));
        }
        if (this.f288084X.size() > 0) {
            w780Var.m87353Y(58);
            w780Var.m87353Y(this.f288086Y);
        }
        for (int i4 = 0; i4 < this.f288084X.size(); i4++) {
            w780Var.m87345Q(((Integer) this.f288084X.get(i4)).intValue());
        }
        for (int i5 = 0; i5 < this.f288074N0.size(); i5++) {
            w780Var.m87346R(8, (AbstractC2155n8) this.f288074N0.get(i5));
        }
        for (int i6 = 0; i6 < this.f288075O0.size(); i6++) {
            w780Var.m87346R(9, (AbstractC2155n8) this.f288075O0.get(i6));
        }
        for (int i7 = 0; i7 < this.f288076P0.size(); i7++) {
            w780Var.m87346R(10, (AbstractC2155n8) this.f288076P0.get(i7));
        }
        for (int i8 = 0; i8 < this.f288077Q0.size(); i8++) {
            w780Var.m87346R(11, (AbstractC2155n8) this.f288077Q0.get(i8));
        }
        for (int i9 = 0; i9 < this.f288078R0.size(); i9++) {
            w780Var.m87346R(13, (AbstractC2155n8) this.f288078R0.get(i9));
        }
        if (this.f288079S0.size() > 0) {
            w780Var.m87353Y(130);
            w780Var.m87353Y(this.f288080T0);
        }
        for (int i10 = 0; i10 < this.f288079S0.size(); i10++) {
            w780Var.m87345Q(((Integer) this.f288079S0.get(i10)).intValue());
        }
        if ((this.f288093c & 8) == 8) {
            w780Var.m87344P(17, this.f288081U0);
        }
        if ((this.f288093c & 16) == 16) {
            w780Var.m87346R(18, this.f288082V0);
        }
        if ((this.f288093c & 32) == 32) {
            w780Var.m87344P(19, this.f288083W0);
        }
        for (int i11 = 0; i11 < this.f288088Z.size(); i11++) {
            w780Var.m87346R(20, (AbstractC2155n8) this.f288088Z.get(i11));
        }
        if (this.f288072L0.size() > 0) {
            w780Var.m87353Y(170);
            w780Var.m87353Y(this.f288073M0);
        }
        for (int i12 = 0; i12 < this.f288072L0.size(); i12++) {
            w780Var.m87345Q(((Integer) this.f288072L0.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.f288085X0.size(); i13++) {
            w780Var.m87346R(25, (AbstractC2155n8) this.f288085X0.get(i13));
        }
        if ((this.f288093c & 64) == 64) {
            w780Var.m87346R(30, this.f288087Y0);
        }
        for (int i14 = 0; i14 < this.f288089Z0.size(); i14++) {
            w780Var.m87344P(31, ((Integer) this.f288089Z0.get(i14)).intValue());
        }
        if ((this.f288093c & 128) == 128) {
            w780Var.m87346R(32, this.f288090a1);
        }
        for (int i15 = 0; i15 < this.f288092b1.size(); i15++) {
            w780Var.m87346R(33, (AbstractC2155n8) this.f288092b1.get(i15));
        }
        teyVar.m80597y(19000, w780Var);
        w780Var.m87349U(this.f288091b);
    }

    @Override // p204p.rre0
    public final AbstractC2155n8 getDefaultInstanceForType() {
        return f288070e1;
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        byte b = this.f288094c1;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f288093c & 2) != 2) {
            this.f288094c1 = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f288099g.size(); i++) {
            if (!((o1t0) this.f288099g.get(i)).isInitialized()) {
                this.f288094c1 = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.f288100h.size(); i2++) {
            if (!((j1t0) this.f288100h.get(i2)).isInitialized()) {
                this.f288094c1 = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f288088Z.size(); i3++) {
            if (!((j1t0) this.f288088Z.get(i3)).isInitialized()) {
                this.f288094c1 = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.f288074N0.size(); i4++) {
            if (!((c0t0) this.f288074N0.get(i4)).isInitialized()) {
                this.f288094c1 = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.f288075O0.size(); i5++) {
            if (!((q0t0) this.f288075O0.get(i5)).isInitialized()) {
                this.f288094c1 = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.f288076P0.size(); i6++) {
            if (!((y0t0) this.f288076P0.get(i6)).isInitialized()) {
                this.f288094c1 = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.f288077Q0.size(); i7++) {
            if (!((l1t0) this.f288077Q0.get(i7)).isInitialized()) {
                this.f288094c1 = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.f288078R0.size(); i8++) {
            if (!((l0t0) this.f288078R0.get(i8)).isInitialized()) {
                this.f288094c1 = (byte) 0;
                return false;
            }
        }
        if ((this.f288093c & 16) == 16 && !this.f288082V0.isInitialized()) {
            this.f288094c1 = (byte) 0;
            return false;
        }
        for (int i9 = 0; i9 < this.f288085X0.size(); i9++) {
            if (!((wzs0) this.f288085X0.get(i9)).isInitialized()) {
                this.f288094c1 = (byte) 0;
                return false;
            }
        }
        if ((this.f288093c & 64) == 64 && !this.f288087Y0.isInitialized()) {
            this.f288094c1 = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.f288092b1.size(); i10++) {
            if (!((a0t0) this.f288092b1.get(i10)).isInitialized()) {
                this.f288094c1 = (byte) 0;
                return false;
            }
        }
        if (m82138g()) {
            this.f288094c1 = (byte) 1;
            return true;
        }
        this.f288094c1 = (byte) 0;
        return false;
    }

    /* JADX INFO: renamed from: n */
    public final void m97338n() {
        this.f288095d = 6;
        this.f288097e = 0;
        this.f288098f = 0;
        List list = Collections.EMPTY_LIST;
        this.f288099g = list;
        this.f288100h = list;
        this.f288101i = list;
        this.f288084X = list;
        this.f288088Z = list;
        this.f288072L0 = list;
        this.f288074N0 = list;
        this.f288075O0 = list;
        this.f288076P0 = list;
        this.f288077Q0 = list;
        this.f288078R0 = list;
        this.f288079S0 = list;
        this.f288081U0 = 0;
        this.f288082V0 = j1t0.f107844S0;
        this.f288083W0 = 0;
        this.f288085X0 = list;
        this.f288087Y0 = p1t0.f173161g;
        this.f288089Z0 = list;
        this.f288090a1 = w1t0.f247176e;
        this.f288092b1 = list;
    }

    public zzs0() {
        this.f288102t = -1;
        this.f288086Y = -1;
        this.f288073M0 = -1;
        this.f288080T0 = -1;
        this.f288094c1 = (byte) -1;
        this.f288096d1 = -1;
        this.f288091b = hva.f95637a;
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
    public zzs0(p204p.pwe r22, p204p.bux r23) {
        /*
            Method dump skipped, instruction units count: 1604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.zzs0.<init>(p.pwe, p.bux):void");
    }
}
