package p204p;

import androidx.car.app.model.Alert;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class qeq extends peq {

    /* JADX INFO: renamed from: L0 */
    public final int f187986L0;

    /* JADX INFO: renamed from: M0 */
    public final int f187987M0;

    /* JADX INFO: renamed from: N0 */
    public final int f187988N0;

    /* JADX INFO: renamed from: O0 */
    public final boolean f187989O0;

    /* JADX INFO: renamed from: P0 */
    public final int f187990P0;

    /* JADX INFO: renamed from: Q0 */
    public final boolean f187991Q0;

    /* JADX INFO: renamed from: R0 */
    public final int f187992R0;

    /* JADX INFO: renamed from: S0 */
    public final boolean f187993S0;

    /* JADX INFO: renamed from: T0 */
    public final boolean f187994T0;

    /* JADX INFO: renamed from: U0 */
    public final boolean f187995U0;

    /* JADX INFO: renamed from: V0 */
    public final int f187996V0;

    /* JADX INFO: renamed from: W0 */
    public final boolean f187997W0;

    /* JADX INFO: renamed from: X */
    public final int f187998X;

    /* JADX INFO: renamed from: X0 */
    public final String f187999X0;

    /* JADX INFO: renamed from: Y */
    public final int f188000Y;

    /* JADX INFO: renamed from: Z */
    public final int f188001Z;

    /* JADX INFO: renamed from: e */
    public final boolean f188002e;

    /* JADX INFO: renamed from: f */
    public final meq f188003f;

    /* JADX INFO: renamed from: g */
    public final boolean f188004g;

    /* JADX INFO: renamed from: h */
    public final boolean f188005h;

    /* JADX INFO: renamed from: i */
    public final boolean f188006i;

    /* JADX INFO: renamed from: t */
    public final int f188007t;

    /* JADX WARN: Code duplicated, block: B:130:0x018c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:45:0x0072  */
    public qeq(int i, kf81 kf81Var, int i2, meq meqVar, int i3, String str, int i4, boolean z) {
        boolean z2;
        boolean z3;
        int i5;
        int iM75410j;
        int i6;
        String strM95773c;
        r300 r300Var;
        int i7;
        int i8;
        int i9;
        r300 r300Var2;
        int i10;
        int i11;
        int i12;
        super(i, kf81Var, i2);
        this.f188003f = meqVar;
        boolean z4 = meqVar.f142823x0;
        pf40 pf40Var = meqVar.f52253m;
        pf40 pf40Var2 = meqVar.f52255o;
        int i13 = z4 ? 24 : 16;
        int i14 = 0;
        this.f187991Q0 = false;
        if (!z || (((i10 = (r300Var2 = this.f176833d).f195394w) != -1 && i10 > meqVar.f52241a) || ((i11 = r300Var2.f195395x) != -1 && i11 > meqVar.f52242b))) {
            z2 = false;
        } else {
            float f = r300Var2.f195352B;
            if ((f == -1.0f || f <= meqVar.f52243c) && ((i12 = r300Var2.f195382k) == -1 || i12 <= meqVar.f52244d)) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        this.f188002e = z2;
        if (!z || (((i7 = (r300Var = this.f176833d).f195394w) != -1 && i7 < meqVar.f52245e) || ((i8 = r300Var.f195395x) != -1 && i8 < meqVar.f52246f))) {
            z3 = false;
        } else {
            float f2 = r300Var.f195352B;
            if ((f2 == -1.0f || f2 >= meqVar.f52247g) && ((i9 = r300Var.f195382k) == -1 || i9 >= meqVar.f52248h)) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        this.f188004g = z3;
        this.f188005h = o09.m65985u(i3, false);
        r300 r300Var3 = this.f176833d;
        float f3 = r300Var3.f195352B;
        this.f188006i = f3 != -1.0f && f3 >= 10.0f;
        this.f188007t = r300Var3.f195382k;
        this.f187998X = r300Var3.m74566c();
        int i15 = 0;
        while (true) {
            int size = pf40Var2.size();
            i5 = Alert.DURATION_SHOW_INDEFINITELY;
            if (i15 >= size) {
                iM75410j = 0;
                i15 = Integer.MAX_VALUE;
                break;
            } else {
                iM75410j = req.m75410j(this.f176833d, (String) pf40Var2.get(i15), false);
                if (iM75410j > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.f188001Z = i15;
        this.f187986L0 = iM75410j;
        int i16 = this.f176833d.f195377f;
        int i17 = meqVar.f52256p;
        tvl0 tvl0Var = req.f198406l;
        this.f187987M0 = (i16 == 0 || i16 != i17) ? Integer.bitCount(i16 & i17) : Integer.MAX_VALUE;
        int i18 = this.f176833d.f195377f;
        this.f187989O0 = i18 == 0 || (i18 & 1) != 0;
        this.f187990P0 = req.m75410j(this.f176833d, str, req.m75411k(str) == null);
        r300 r300Var4 = this.f176833d;
        String str2 = r300Var4.f195387p;
        int i19 = i3 & 384;
        if (i19 == 256 && (strM95773c = zad0.m95773c(r300Var4)) != null) {
            str2 = strM95773c;
        }
        for (int i20 = 0; i20 < pf40Var.size(); i20++) {
            if (str2 != null && str2.equals(pf40Var.get(i20))) {
                i5 = i20;
                break;
            }
        }
        this.f188000Y = i5;
        this.f187988N0 = req.m75404d(this.f176833d, meqVar.f52254n);
        this.f187993S0 = i19 == 128 || i19 == 256;
        boolean z5 = i19 == 128;
        this.f187994T0 = z5;
        this.f187995U0 = (i3 & 64) == 64;
        this.f187999X0 = str2;
        if (str2 != null) {
            i6 = 4;
            switch (str2) {
                case "video/dolby-vision":
                    i6 = 5;
                    break;
                case "video/av01":
                    break;
                case "video/hevc":
                    i6 = 3;
                    break;
                case "video/avc":
                    i6 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i6 = 2;
                    break;
                default:
                    i6 = 0;
                    break;
            }
        } else {
            i6 = 0;
        }
        this.f187996V0 = i6;
        this.f187997W0 = z5 && p7f.m69260h(this.f176833d.f195358H);
        boolean z6 = this.f188002e;
        meq meqVar2 = this.f188003f;
        r300 r300Var5 = this.f176833d;
        if ((r300Var5.f195377f & 16384) == 0 && o09.m65985u(i3, meqVar2.f142818B0) && (z6 || meqVar2.f142822w0)) {
            i14 = (!o09.m65985u(i3, false) || !this.f188004g || !z6 || r300Var5.f195382k == -1 || meqVar2.f52238G || meqVar2.f52237F || (i13 & i3) == 0) ? 1 : 2;
        }
        this.f187992R0 = i14;
    }

    /* JADX INFO: renamed from: c */
    public static int m72666c(qeq qeqVar, qeq qeqVar2) {
        ytf ytfVarMo88921d = ytf.f276111a.mo88921d(qeqVar.f188005h, qeqVar2.f188005h);
        Integer numValueOf = Integer.valueOf(qeqVar.f188001Z);
        Integer numValueOf2 = Integer.valueOf(qeqVar2.f188001Z);
        hdx0 hdx0Var = hdx0.f90253a;
        return ytfVarMo88921d.mo88920c(numValueOf, numValueOf2, hdx0Var).mo88918a(qeqVar.f187986L0, qeqVar2.f187986L0).mo88918a(qeqVar.f187987M0, qeqVar2.f187987M0).mo88920c(Integer.valueOf(qeqVar.f187988N0), Integer.valueOf(qeqVar2.f187988N0), hdx0Var).mo88921d(qeqVar.f187989O0, qeqVar2.f187989O0).mo88918a(qeqVar.f187990P0, qeqVar2.f187990P0).mo88921d(qeqVar.f188006i, qeqVar2.f188006i).mo88921d(qeqVar.f188002e, qeqVar2.f188002e).mo88921d(qeqVar.f188004g, qeqVar2.f188004g).mo88920c(Integer.valueOf(qeqVar.f188000Y), Integer.valueOf(qeqVar2.f188000Y), hdx0Var).mo88921d(qeqVar.f187993S0, qeqVar2.f187993S0).mo88921d(qeqVar.f187995U0, qeqVar2.f187995U0).mo88923f();
    }

    @Override // p204p.peq
    /* JADX INFO: renamed from: a */
    public final int mo50397a() {
        return this.f187992R0;
    }

    @Override // p204p.peq
    /* JADX INFO: renamed from: b */
    public final boolean mo50398b(peq peqVar) {
        qeq qeqVar = (qeq) peqVar;
        if (!this.f187991Q0 && !Objects.equals(this.f187999X0, qeqVar.f187999X0)) {
            return false;
        }
        this.f188003f.getClass();
        return this.f187993S0 == qeqVar.f187993S0 && this.f187995U0 == qeqVar.f187995U0;
    }
}
