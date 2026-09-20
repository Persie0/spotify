package p204p;

import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class g020 extends hq20 {

    /* JADX INFO: renamed from: n0 */
    public jz10 f75241n0;

    /* JADX INFO: renamed from: o0 */
    public int f75242o0;

    /* JADX INFO: renamed from: p0 */
    public int f75243p0;

    /* JADX INFO: renamed from: q0 */
    public int f75244q0;

    /* JADX INFO: renamed from: r0 */
    public float f75245r0;

    /* JADX INFO: renamed from: s0 */
    public float f75246s0;

    /* JADX INFO: renamed from: t0 */
    public String f75247t0;

    /* JADX INFO: renamed from: u0 */
    public String f75248u0;

    /* JADX INFO: renamed from: v0 */
    public String f75249v0;

    /* JADX INFO: renamed from: w0 */
    public String f75250w0;

    public g020(xu41 xu41Var, int i) {
        super(xu41Var, i);
        if (i == 10) {
            this.f75243p0 = 1;
        } else if (i == 11) {
            this.f75244q0 = 1;
        }
    }

    @Override // p204p.hq20
    /* JADX INFO: renamed from: a0 */
    public final jq20 mo43252a0() {
        int[][] iArrM54826j0;
        int[][] iArrM54826j1;
        boolean[][] zArr;
        if (this.f75241n0 == null) {
            jz10 jz10Var = new jz10();
            jz10Var.f117552U0 = 0;
            jz10Var.f117554W0 = new HashSet();
            jz10Var.m54835l0();
            int[][] iArr = jz10Var.f117555X0;
            boolean z = iArr != null && iArr.length == jz10Var.f114775v0 && (zArr = jz10Var.f117553V0) != null && zArr.length == jz10Var.f117541J0 && zArr[0].length == jz10Var.f117543L0;
            if (!z) {
                jz10Var.m54833h0();
            }
            if (z) {
                for (int i = 0; i < jz10Var.f117553V0.length; i++) {
                    int i2 = 0;
                    while (true) {
                        boolean[][] zArr2 = jz10Var.f117553V0;
                        if (i2 < zArr2[0].length) {
                            zArr2[i][i2] = true;
                            i2++;
                        }
                    }
                }
                for (int i3 = 0; i3 < jz10Var.f117555X0.length; i3++) {
                    int i4 = 0;
                    while (true) {
                        int[][] iArr2 = jz10Var.f117555X0;
                        if (i4 < iArr2[0].length) {
                            iArr2[i3][i4] = -1;
                            i4++;
                        }
                    }
                }
            }
            jz10Var.f117552U0 = 0;
            String str = jz10Var.f117550S0;
            if (str != null && !str.trim().isEmpty() && (iArrM54826j1 = jz10.m54826j0(jz10Var.f117550S0)) != null) {
                jz10Var.m54831f0(iArrM54826j1);
            }
            String str2 = jz10Var.f117549R0;
            if (str2 != null && !str2.trim().isEmpty() && (iArrM54826j0 = jz10.m54826j0(jz10Var.f117549R0)) != null) {
                jz10Var.m54832g0(iArrM54826j0);
            }
            this.f75241n0 = jz10Var;
        }
        return this.f75241n0;
    }

    @Override // p204p.hq20, p204p.v6j, p204p.ulv0, p204p.e6y
    public final void apply() {
        mo43252a0();
        jz10 jz10Var = this.f75241n0;
        int i = this.f75242o0;
        jz10Var.getClass();
        if ((i == 0 || i == 1) && jz10Var.f117551T0 != i) {
            jz10Var.f117551T0 = i;
        }
        int i2 = this.f75243p0;
        if (i2 != 0) {
            jz10 jz10Var2 = this.f75241n0;
            if (i2 > 50) {
                jz10Var2.getClass();
            } else if (jz10Var2.f117542K0 != i2) {
                jz10Var2.f117542K0 = i2;
                jz10Var2.m54835l0();
                jz10Var2.m54833h0();
            }
        }
        int i3 = this.f75244q0;
        if (i3 != 0) {
            jz10 jz10Var3 = this.f75241n0;
            if (i3 > 50) {
                jz10Var3.getClass();
            } else if (jz10Var3.f117544M0 != i3) {
                jz10Var3.f117544M0 = i3;
                jz10Var3.m54835l0();
                jz10Var3.m54833h0();
            }
        }
        float f = this.f75245r0;
        if (f != 0.0f) {
            jz10 jz10Var4 = this.f75241n0;
            if (f < 0.0f) {
                jz10Var4.getClass();
            } else if (jz10Var4.f117545N0 != f) {
                jz10Var4.f117545N0 = f;
            }
        }
        float f2 = this.f75246s0;
        if (f2 != 0.0f) {
            jz10 jz10Var5 = this.f75241n0;
            if (f2 < 0.0f) {
                jz10Var5.getClass();
            } else if (jz10Var5.f117546O0 != f2) {
                jz10Var5.f117546O0 = f2;
            }
        }
        String str = this.f75247t0;
        if (str != null && !str.equals("")) {
            jz10 jz10Var6 = this.f75241n0;
            String str2 = this.f75247t0;
            String str3 = jz10Var6.f117547P0;
            if (str3 == null || !str3.equals(str2)) {
                jz10Var6.f117547P0 = str2;
            }
        }
        String str4 = this.f75248u0;
        if (str4 != null && !str4.equals("")) {
            jz10 jz10Var7 = this.f75241n0;
            String str5 = this.f75248u0;
            String str6 = jz10Var7.f117548Q0;
            if (str6 == null || !str6.equals(str5)) {
                jz10Var7.f117548Q0 = str5;
            }
        }
        String str7 = this.f75249v0;
        if (str7 != null && !str7.equals("")) {
            jz10 jz10Var8 = this.f75241n0;
            String str8 = this.f75249v0;
            String str9 = jz10Var8.f117549R0;
            if (str9 == null || !str9.equals(str8.toString())) {
                jz10Var8.f117549R0 = str8.toString();
            }
        }
        String str10 = this.f75250w0;
        if (str10 != null && !str10.equals("")) {
            jz10 jz10Var9 = this.f75241n0;
            String str11 = this.f75250w0;
            String str12 = jz10Var9.f117550S0;
            if (str12 == null || !str12.equals(str11)) {
                jz10Var9.f117550S0 = str11;
            }
        }
        m48197Z();
    }
}
