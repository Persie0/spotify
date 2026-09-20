package p204p;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class jz10 extends vpc1 {

    /* JADX INFO: renamed from: H0 */
    public w7j f117539H0;

    /* JADX INFO: renamed from: I0 */
    public v7j[] f117540I0;

    /* JADX INFO: renamed from: J0 */
    public int f117541J0;

    /* JADX INFO: renamed from: K0 */
    public int f117542K0;

    /* JADX INFO: renamed from: L0 */
    public int f117543L0;

    /* JADX INFO: renamed from: M0 */
    public int f117544M0;

    /* JADX INFO: renamed from: N0 */
    public float f117545N0;

    /* JADX INFO: renamed from: O0 */
    public float f117546O0;

    /* JADX INFO: renamed from: P0 */
    public String f117547P0;

    /* JADX INFO: renamed from: Q0 */
    public String f117548Q0;

    /* JADX INFO: renamed from: R0 */
    public String f117549R0;

    /* JADX INFO: renamed from: S0 */
    public String f117550S0;

    /* JADX INFO: renamed from: T0 */
    public int f117551T0;

    /* JADX INFO: renamed from: U0 */
    public int f117552U0;

    /* JADX INFO: renamed from: V0 */
    public boolean[][] f117553V0;

    /* JADX INFO: renamed from: W0 */
    public HashSet f117554W0;

    /* JADX INFO: renamed from: X0 */
    public int[][] f117555X0;

    /* JADX INFO: renamed from: b0 */
    public static void m54825b0(v7j v7jVar) {
        v7jVar.f238253n0[1] = -1.0f;
        v7jVar.f238210K.m31576j();
        v7jVar.f238212M.m31576j();
        v7jVar.f238213N.m31576j();
    }

    /* JADX INFO: renamed from: j0 */
    public static int[][] m54826j0(String str) {
        try {
            String[] strArrSplit = str.split(",");
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, strArrSplit.length, 3);
            for (int i = 0; i < strArrSplit.length; i++) {
                String[] strArrSplit2 = strArrSplit[i].trim().split(":");
                String[] strArrSplit3 = strArrSplit2[1].split("x");
                iArr[i][0] = Integer.parseInt(strArrSplit2[0]);
                iArr[i][1] = Integer.parseInt(strArrSplit3[0]);
                iArr[i][2] = Integer.parseInt(strArrSplit3[1]);
            }
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static float[] m54827k0(int i, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] strArrSplit = str.split(",");
        if (strArrSplit.length != i) {
            return null;
        }
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = Float.parseFloat(strArrSplit[i2].trim());
        }
        return fArr;
    }

    @Override // p204p.vpc1
    /* JADX INFO: renamed from: Z */
    public final void mo35147Z(int i, int i2, int i3, int i4) {
        int i5;
        int[][] iArrM54826j0;
        int[][] iArrM54826j1;
        this.f117539H0 = (w7j) this.f238221V;
        int i6 = this.f117541J0;
        if (i6 >= 1 && (i5 = this.f117543L0) >= 1) {
            this.f117552U0 = 0;
            int iMax = Math.max(i6, i5);
            v7j[] v7jVarArr = this.f117540I0;
            u7j u7jVar = u7j.f227712c;
            if (v7jVarArr == null) {
                this.f117540I0 = new v7j[iMax];
                int i7 = 0;
                while (true) {
                    v7j[] v7jVarArr2 = this.f117540I0;
                    if (i7 >= v7jVarArr2.length) {
                        break;
                    }
                    v7j v7jVar = new v7j();
                    u7j[] u7jVarArr = v7jVar.f238220U;
                    u7jVarArr[0] = u7jVar;
                    u7jVarArr[1] = u7jVar;
                    v7jVar.f238246k = String.valueOf(v7jVar.hashCode());
                    v7jVarArr2[i7] = v7jVar;
                    i7++;
                }
            } else if (iMax != v7jVarArr.length) {
                v7j[] v7jVarArr3 = new v7j[iMax];
                for (int i8 = 0; i8 < iMax; i8++) {
                    v7j[] v7jVarArr4 = this.f117540I0;
                    if (i8 < v7jVarArr4.length) {
                        v7jVarArr3[i8] = v7jVarArr4[i8];
                    } else {
                        v7j v7jVar2 = new v7j();
                        u7j[] u7jVarArr2 = v7jVar2.f238220U;
                        u7jVarArr2[0] = u7jVar;
                        u7jVarArr2[1] = u7jVar;
                        v7jVar2.f238246k = String.valueOf(v7jVar2.hashCode());
                        v7jVarArr3[i8] = v7jVar2;
                    }
                }
                while (true) {
                    v7j[] v7jVarArr5 = this.f117540I0;
                    if (iMax >= v7jVarArr5.length) {
                        break;
                    }
                    this.f117539H0.m87396d0(v7jVarArr5[iMax]);
                    iMax++;
                }
                this.f117540I0 = v7jVarArr3;
            }
            String str = this.f117550S0;
            if (str != null && !str.trim().isEmpty() && (iArrM54826j1 = m54826j0(this.f117550S0)) != null) {
                m54831f0(iArrM54826j1);
            }
            String str2 = this.f117549R0;
            if (str2 != null && !str2.trim().isEmpty() && (iArrM54826j0 = m54826j0(this.f117549R0)) != null) {
                m54832g0(iArrM54826j0);
            }
        }
        w7j w7jVar = this.f117539H0;
        v7j[] v7jVarArr6 = this.f117540I0;
        w7jVar.getClass();
        for (v7j v7jVar3 : v7jVarArr6) {
            w7jVar.m87390W(v7jVar3);
        }
    }

    @Override // p204p.v7j
    /* JADX INFO: renamed from: c */
    public final void mo35148c(kl80 kl80Var, boolean z) {
        int i;
        int i2;
        super.mo35148c(kl80Var, z);
        int iMax = Math.max(this.f117541J0, this.f117543L0);
        v7j v7jVar = this.f117540I0[0];
        float[] fArrM54827k0 = m54827k0(this.f117541J0, this.f117547P0);
        int i3 = this.f117541J0;
        c6j c6jVar = this.f238212M;
        c6j c6jVar2 = this.f238210K;
        if (i3 == 1) {
            m54825b0(v7jVar);
            v7jVar.f238210K.m31567a(c6jVar2, 0);
            v7jVar.f238212M.m31567a(c6jVar, 0);
        } else {
            int i4 = 0;
            while (true) {
                i = this.f117541J0;
                if (i4 >= i) {
                    break;
                }
                v7j v7jVar2 = this.f117540I0[i4];
                m54825b0(v7jVar2);
                c6j c6jVar3 = v7jVar2.f238212M;
                c6j c6jVar4 = v7jVar2.f238210K;
                if (fArrM54827k0 != null) {
                    v7jVar2.f238253n0[1] = fArrM54827k0[i4];
                }
                if (i4 > 0) {
                    c6jVar4.m31567a(this.f117540I0[i4 - 1].f238212M, 0);
                } else {
                    c6jVar4.m31567a(c6jVar2, 0);
                }
                if (i4 < this.f117541J0 - 1) {
                    c6jVar3.m31567a(this.f117540I0[i4 + 1].f238210K, 0);
                } else {
                    c6jVar3.m31567a(c6jVar, 0);
                }
                if (i4 > 0) {
                    c6jVar4.f34552g = (int) this.f117546O0;
                }
                i4++;
            }
            while (i < iMax) {
                v7j v7jVar3 = this.f117540I0[i];
                m54825b0(v7jVar3);
                v7jVar3.f238210K.m31567a(c6jVar2, 0);
                v7jVar3.f238212M.m31567a(c6jVar, 0);
                i++;
            }
        }
        int iMax2 = Math.max(this.f117541J0, this.f117543L0);
        v7j v7jVar4 = this.f117540I0[0];
        float[] fArrM54827k1 = m54827k0(this.f117543L0, this.f117548Q0);
        int i5 = this.f117543L0;
        c6j c6jVar5 = this.f238211L;
        c6j c6jVar6 = this.f238209J;
        if (i5 == 1) {
            float[] fArr = v7jVar4.f238253n0;
            c6j c6jVar7 = v7jVar4.f238211L;
            c6j c6jVar8 = v7jVar4.f238209J;
            fArr[0] = -1.0f;
            c6jVar8.m31576j();
            c6jVar7.m31576j();
            c6jVar8.m31567a(c6jVar6, 0);
            c6jVar7.m31567a(c6jVar5, 0);
        } else {
            int i6 = 0;
            while (true) {
                i2 = this.f117543L0;
                if (i6 >= i2) {
                    break;
                }
                v7j v7jVar5 = this.f117540I0[i6];
                float[] fArr2 = v7jVar5.f238253n0;
                c6j c6jVar9 = v7jVar5.f238211L;
                c6j c6jVar10 = v7jVar5.f238209J;
                fArr2[0] = -1.0f;
                c6jVar10.m31576j();
                c6jVar9.m31576j();
                if (fArrM54827k1 != null) {
                    v7jVar5.f238253n0[0] = fArrM54827k1[i6];
                }
                if (i6 > 0) {
                    c6jVar10.m31567a(this.f117540I0[i6 - 1].f238211L, 0);
                } else {
                    c6jVar10.m31567a(c6jVar6, 0);
                }
                if (i6 < this.f117543L0 - 1) {
                    c6jVar9.m31567a(this.f117540I0[i6 + 1].f238209J, 0);
                } else {
                    c6jVar9.m31567a(c6jVar5, 0);
                }
                if (i6 > 0) {
                    c6jVar10.f34552g = (int) this.f117545N0;
                }
                i6++;
            }
            while (i2 < iMax2) {
                v7j v7jVar6 = this.f117540I0[i2];
                float[] fArr3 = v7jVar6.f238253n0;
                c6j c6jVar11 = v7jVar6.f238211L;
                c6j c6jVar12 = v7jVar6.f238209J;
                fArr3[0] = -1.0f;
                c6jVar12.m31576j();
                c6jVar11.m31576j();
                c6jVar12.m31567a(c6jVar6, 0);
                c6jVar11.m31567a(c6jVar5, 0);
                i2++;
            }
        }
        for (int i7 = 0; i7 < this.f114775v0; i7++) {
            if (!this.f117554W0.contains(this.f114774u0[i7].f238246k)) {
                boolean z2 = false;
                int i8 = 0;
                while (!z2) {
                    i8 = this.f117552U0;
                    if (i8 >= this.f117541J0 * this.f117543L0) {
                        i8 = -1;
                        break;
                    }
                    int iM54830e0 = m54830e0(i8);
                    int iM54829d0 = m54829d0(this.f117552U0);
                    boolean[] zArr = this.f117553V0[iM54830e0];
                    if (zArr[iM54829d0]) {
                        zArr[iM54829d0] = false;
                        z2 = true;
                    }
                    this.f117552U0++;
                }
                int iM54830e1 = m54830e0(i8);
                int iM54829d1 = m54829d0(i8);
                if (i8 == -1) {
                    return;
                } else {
                    m54828c0(iM54830e1, iM54829d1, 1, 1, this.f114774u0[i7]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m54828c0(int i, int i2, int i3, int i4, v7j v7jVar) {
        v7jVar.f238209J.m31567a(this.f117540I0[i2].f238209J, 0);
        v7jVar.f238210K.m31567a(this.f117540I0[i].f238210K, 0);
        v7jVar.f238211L.m31567a(this.f117540I0[(i2 + i4) - 1].f238211L, 0);
        v7jVar.f238212M.m31567a(this.f117540I0[(i + i3) - 1].f238212M, 0);
    }

    /* JADX INFO: renamed from: d0 */
    public final int m54829d0(int i) {
        return this.f117551T0 == 1 ? i / this.f117541J0 : i % this.f117543L0;
    }

    /* JADX INFO: renamed from: e0 */
    public final int m54830e0(int i) {
        return this.f117551T0 == 1 ? i % this.f117541J0 : i / this.f117543L0;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m54831f0(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!m54834i0(m54830e0(iArr2[0]), m54829d0(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m54832g0(int[][] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int iM54830e0 = m54830e0(iArr[i][0]);
            int iM54829d0 = m54829d0(iArr[i][0]);
            int[] iArr2 = iArr[i];
            if (!m54834i0(iM54830e0, iM54829d0, iArr2[1], iArr2[2])) {
                break;
            }
            v7j v7jVar = this.f114774u0[i];
            int[] iArr3 = iArr[i];
            m54828c0(iM54830e0, iM54829d0, iArr3[1], iArr3[2], v7jVar);
            this.f117554W0.add(this.f114774u0[i].f238246k);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m54833h0() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.f117541J0, this.f117543L0);
        this.f117553V0 = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i = this.f114775v0;
        if (i > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i, 4);
            this.f117555X0 = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m54834i0(int i, int i2, int i3, int i4) {
        for (int i5 = i; i5 < i + i3; i5++) {
            for (int i6 = i2; i6 < i2 + i4; i6++) {
                boolean[][] zArr = this.f117553V0;
                if (i5 < zArr.length && i6 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i5];
                    if (zArr2[i6]) {
                        zArr2[i6] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m54835l0() {
        int i;
        int i2 = this.f117542K0;
        if (i2 != 0 && (i = this.f117544M0) != 0) {
            this.f117541J0 = i2;
            this.f117543L0 = i;
            return;
        }
        int i3 = this.f117544M0;
        if (i3 > 0) {
            this.f117543L0 = i3;
            this.f117541J0 = ((this.f114775v0 + i3) - 1) / i3;
        } else if (i2 > 0) {
            this.f117541J0 = i2;
            this.f117543L0 = ((this.f114775v0 + i2) - 1) / i2;
        } else {
            int iSqrt = (int) (Math.sqrt(this.f114775v0) + 1.5d);
            this.f117541J0 = iSqrt;
            this.f117543L0 = ((this.f114775v0 + iSqrt) - 1) / iSqrt;
        }
    }
}
