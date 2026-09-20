package p204p;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class wmz extends hq20 {

    /* JADX INFO: renamed from: A0 */
    public int f253011A0;

    /* JADX INFO: renamed from: B0 */
    public int f253012B0;

    /* JADX INFO: renamed from: C0 */
    public int f253013C0;

    /* JADX INFO: renamed from: D0 */
    public int f253014D0;

    /* JADX INFO: renamed from: E0 */
    public int f253015E0;

    /* JADX INFO: renamed from: F0 */
    public int f253016F0;

    /* JADX INFO: renamed from: G0 */
    public int f253017G0;

    /* JADX INFO: renamed from: H0 */
    public int f253018H0;

    /* JADX INFO: renamed from: I0 */
    public float f253019I0;

    /* JADX INFO: renamed from: J0 */
    public float f253020J0;

    /* JADX INFO: renamed from: K0 */
    public float f253021K0;

    /* JADX INFO: renamed from: L0 */
    public float f253022L0;

    /* JADX INFO: renamed from: n0 */
    public giz f253023n0;

    /* JADX INFO: renamed from: o0 */
    public HashMap f253024o0;

    /* JADX INFO: renamed from: p0 */
    public HashMap f253025p0;

    /* JADX INFO: renamed from: q0 */
    public HashMap f253026q0;

    /* JADX INFO: renamed from: r0 */
    public int f253027r0;

    /* JADX INFO: renamed from: s0 */
    public int f253028s0;

    /* JADX INFO: renamed from: t0 */
    public int f253029t0;

    /* JADX INFO: renamed from: u0 */
    public int f253030u0;

    /* JADX INFO: renamed from: v0 */
    public int f253031v0;

    /* JADX INFO: renamed from: w0 */
    public int f253032w0;

    /* JADX INFO: renamed from: x0 */
    public int f253033x0;

    /* JADX INFO: renamed from: y0 */
    public int f253034y0;

    /* JADX INFO: renamed from: z0 */
    public int f253035z0;

    public wmz(xu41 xu41Var, int i) {
        super(xu41Var, i);
        this.f253027r0 = 0;
        this.f253028s0 = -1;
        this.f253029t0 = -1;
        this.f253030u0 = -1;
        this.f253031v0 = -1;
        this.f253032w0 = -1;
        this.f253033x0 = -1;
        this.f253034y0 = 2;
        this.f253035z0 = 2;
        this.f253011A0 = 0;
        this.f253012B0 = 0;
        this.f253013C0 = 0;
        this.f253014D0 = 0;
        this.f253015E0 = 0;
        this.f253016F0 = 0;
        this.f253017G0 = -1;
        this.f253018H0 = 0;
        this.f253019I0 = 0.5f;
        this.f253020J0 = 0.5f;
        this.f253021K0 = 0.5f;
        this.f253022L0 = 0.5f;
        if (i == 8) {
            this.f253018H0 = 1;
        }
    }

    @Override // p204p.hq20
    /* JADX INFO: renamed from: a0 */
    public final jq20 mo43252a0() {
        if (this.f253023n0 == null) {
            this.f253023n0 = new giz();
        }
        return this.f253023n0;
    }

    @Override // p204p.hq20, p204p.v6j, p204p.ulv0, p204p.e6y
    public final void apply() {
        mo43252a0();
        mo61241a(this.f253023n0);
        giz gizVar = this.f253023n0;
        gizVar.f80294Z0 = this.f253018H0;
        gizVar.f80292X0 = this.f253027r0;
        int i = this.f253017G0;
        if (i != -1) {
            gizVar.f80293Y0 = i;
        }
        int i2 = this.f253013C0;
        if (i2 != 0) {
            gizVar.f243659A0 = i2;
        }
        int i3 = this.f253015E0;
        if (i3 != 0) {
            gizVar.f243666w0 = i3;
        }
        int i4 = this.f253014D0;
        if (i4 != 0) {
            gizVar.f243660B0 = i4;
        }
        int i5 = this.f253016F0;
        if (i5 != 0) {
            gizVar.f243667x0 = i5;
        }
        int i6 = this.f253012B0;
        if (i6 != 0) {
            gizVar.f80288T0 = i6;
        }
        int i7 = this.f253011A0;
        if (i7 != 0) {
            gizVar.f80289U0 = i7;
        }
        float f = this.f237890h;
        if (f != 0.5f) {
            gizVar.f80282N0 = f;
        }
        float f2 = this.f253021K0;
        if (f2 != 0.5f) {
            gizVar.f80284P0 = f2;
        }
        float f3 = this.f253022L0;
        if (f3 != 0.5f) {
            gizVar.f80286R0 = f3;
        }
        float f4 = this.f237892i;
        if (f4 != 0.5f) {
            gizVar.f80283O0 = f4;
        }
        float f5 = this.f253019I0;
        if (f5 != 0.5f) {
            gizVar.f80285Q0 = f5;
        }
        float f6 = this.f253020J0;
        if (f6 != 0.5f) {
            gizVar.f80287S0 = f6;
        }
        int i8 = this.f253035z0;
        if (i8 != 2) {
            gizVar.f80290V0 = i8;
        }
        int i9 = this.f253034y0;
        if (i9 != 2) {
            gizVar.f80291W0 = i9;
        }
        int i10 = this.f253028s0;
        if (i10 != -1) {
            gizVar.f80277I0 = i10;
        }
        int i11 = this.f253029t0;
        if (i11 != -1) {
            gizVar.f80279K0 = i11;
        }
        int i12 = this.f253030u0;
        if (i12 != -1) {
            gizVar.f80281M0 = i12;
        }
        int i13 = this.f253031v0;
        if (i13 != -1) {
            gizVar.f80276H0 = i13;
        }
        int i14 = this.f253032w0;
        if (i14 != -1) {
            gizVar.f80278J0 = i14;
        }
        int i15 = this.f253033x0;
        if (i15 != -1) {
            gizVar.f80280L0 = i15;
        }
        m48197Z();
    }
}
