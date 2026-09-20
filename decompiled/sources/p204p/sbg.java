package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes10.dex */
public final class sbg extends qe70 implements xh00 {

    /* JADX INFO: renamed from: L0 */
    public static final sbg f207472L0;

    /* JADX INFO: renamed from: M0 */
    public static final sbg f207473M0;

    /* JADX INFO: renamed from: N0 */
    public static final sbg f207474N0;

    /* JADX INFO: renamed from: O0 */
    public static final sbg f207475O0;

    /* JADX INFO: renamed from: P0 */
    public static final sbg f207476P0;

    /* JADX INFO: renamed from: Q0 */
    public static final sbg f207477Q0;

    /* JADX INFO: renamed from: R0 */
    public static final sbg f207478R0;

    /* JADX INFO: renamed from: S0 */
    public static final sbg f207479S0;

    /* JADX INFO: renamed from: T0 */
    public static final sbg f207480T0;

    /* JADX INFO: renamed from: U0 */
    public static final sbg f207481U0;

    /* JADX INFO: renamed from: V0 */
    public static final sbg f207482V0;

    /* JADX INFO: renamed from: W0 */
    public static final sbg f207483W0;

    /* JADX INFO: renamed from: X */
    public static final sbg f207484X;

    /* JADX INFO: renamed from: X0 */
    public static final sbg f207485X0;

    /* JADX INFO: renamed from: Y */
    public static final sbg f207486Y;

    /* JADX INFO: renamed from: Y0 */
    public static final sbg f207487Y0;

    /* JADX INFO: renamed from: Z */
    public static final sbg f207488Z;

    /* JADX INFO: renamed from: Z0 */
    public static final sbg f207489Z0;

    /* JADX INFO: renamed from: a1 */
    public static final sbg f207490a1;

    /* JADX INFO: renamed from: b */
    public static final sbg f207491b;

    /* JADX INFO: renamed from: b1 */
    public static final sbg f207492b1;

    /* JADX INFO: renamed from: c */
    public static final sbg f207493c;

    /* JADX INFO: renamed from: c1 */
    public static final sbg f207494c1;

    /* JADX INFO: renamed from: d */
    public static final sbg f207495d;

    /* JADX INFO: renamed from: e */
    public static final sbg f207496e;

    /* JADX INFO: renamed from: f */
    public static final sbg f207497f;

    /* JADX INFO: renamed from: g */
    public static final sbg f207498g;

    /* JADX INFO: renamed from: h */
    public static final sbg f207499h;

    /* JADX INFO: renamed from: i */
    public static final sbg f207500i;

    /* JADX INFO: renamed from: t */
    public static final sbg f207501t;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f207502a;

    static {
        int i = 4;
        f207491b = new sbg(i, 0);
        f207493c = new sbg(i, 1);
        f207495d = new sbg(i, 2);
        f207496e = new sbg(i, 3);
        f207497f = new sbg(i, 4);
        f207498g = new sbg(i, 5);
        f207499h = new sbg(i, 6);
        f207500i = new sbg(i, 7);
        f207501t = new sbg(i, 8);
        f207484X = new sbg(i, 9);
        f207486Y = new sbg(i, 10);
        f207488Z = new sbg(i, 11);
        f207472L0 = new sbg(i, 12);
        f207473M0 = new sbg(i, 13);
        f207474N0 = new sbg(i, 14);
        f207475O0 = new sbg(i, 15);
        f207476P0 = new sbg(i, 16);
        f207477Q0 = new sbg(i, 17);
        f207478R0 = new sbg(i, 18);
        f207479S0 = new sbg(i, 19);
        f207480T0 = new sbg(i, 20);
        f207481U0 = new sbg(i, 21);
        f207482V0 = new sbg(i, 22);
        f207483W0 = new sbg(i, 23);
        f207485X0 = new sbg(i, 24);
        f207487Y0 = new sbg(i, 25);
        f207489Z0 = new sbg(i, 26);
        f207490a1 = new sbg(i, 27);
        f207492b1 = new sbg(i, 28);
        f207494c1 = new sbg(i, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sbg(int i, int i2) {
        super(i);
        this.f207502a = i2;
    }

    /* JADX INFO: renamed from: a */
    private final Object m77732a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        uve0 uve0Var = (uve0) obj;
        gh00 gh00Var = (gh00) obj2;
        xq00 xq00Var = (xq00) obj3;
        int iIntValue = ((Number) obj4).intValue();
        if ((iIntValue & 6) == 0) {
            i = (xq00Var.m91766g(uve0Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i & 1, (i & 147) != 146)) {
            boolean z = (i & ContentType.LONG_FORM_ON_DEMAND) == 32;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new ppg(22, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            ahg1.m25961d(uve0Var, (eh00) objM91750T, null, xq00Var, i & 14);
        } else {
            xq00Var.m91757b0();
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: e */
    private final Object m77733e(Object obj, Object obj2, Object obj3, Object obj4) {
        xq00 xq00Var = (xq00) obj3;
        ((Number) obj4).intValue();
        int iOrdinal = ((yvf0) obj2).ordinal();
        cxh0 cxh0Var = cxh0.f43038a;
        if (iOrdinal == 0) {
            xq00Var.m91771i0(-1012380885);
            y85.m93057b(qvu.f193101c, new rgj(k0e1.m54977L(R.string.mixing_edit_page_play_button_stop_content_description, xq00Var)), epv0.m39673I("stop_icon", cxh0Var), 0L, 0L, false, xq00Var, qvu.f193102d | 384, 56);
            xq00Var.m91788r(false);
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw lq51.m59703i(-1141038452, xq00Var, false);
            }
            xq00Var.m91771i0(-1012380885);
            y85.m93057b(qvu.f193101c, new rgj(k0e1.m54977L(R.string.mixing_edit_page_play_button_stop_content_description, xq00Var)), epv0.m39673I("stop_icon", cxh0Var), 0L, 0L, false, xq00Var, qvu.f193102d | 384, 56);
            xq00Var.m91788r(false);
        } else {
            xq00Var.m91771i0(-1011984085);
            y85.m93057b(psu.f180961c, new rgj(k0e1.m54977L(R.string.mixing_edit_page_play_button_play_content_description, xq00Var)), epv0.m39673I("play_icon", cxh0Var), 0L, 0L, false, xq00Var, psu.f180962d | 384, 56);
            xq00Var.m91788r(false);
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: f */
    private final Object m77734f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        usi0 usi0Var = (usi0) obj;
        gh00 gh00Var = (gh00) obj2;
        xq00 xq00Var = (xq00) obj3;
        int iIntValue = ((Number) obj4).intValue();
        if ((iIntValue & 6) == 0) {
            i = (xq00Var.m91766g(usi0Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i & 1, (i & 147) != 146)) {
            vig1.m85649d(null, null, null, null, rkk.m75772x(1125961210, new eib(19, (Object) usi0Var, gh00Var), xq00Var), xq00Var, 24576, 15);
        } else {
            xq00Var.m91757b0();
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: g */
    private final Object m77735g(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        xq00 xq00Var = (xq00) obj3;
        ((Number) obj4).intValue();
        cxh0 cxh0Var = cxh0.f43038a;
        if (zBooleanValue) {
            xq00Var.m91771i0(1856169101);
            y85.m93057b(lsu.f136611c, new rgj(k0e1.m54978M(R.string.play_button_default_pause_content_description, new Object[]{""}, xq00Var)), epv0.m39673I("pause_icon", cxh0Var), 0L, 0L, false, xq00Var, lsu.f136612d, 56);
            xq00Var.m91788r(false);
        } else {
            xq00Var.m91771i0(1856180290);
            y85.m93057b(psu.f180961c, new rgj(k0e1.m54978M(R.string.play_button_default_play_content_description, new Object[]{""}, xq00Var)), epv0.m39673I("play_icon", cxh0Var), 0L, 0L, false, xq00Var, psu.f180962d, 56);
            xq00Var.m91788r(false);
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: i */
    private final Object m77736i(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        xq00 xq00Var = (xq00) obj3;
        ((Number) obj4).intValue();
        cxh0 cxh0Var = cxh0.f43038a;
        qgj qgjVar = qgj.f188480a;
        if (zBooleanValue) {
            xq00Var.m91771i0(378357947);
            y85.m93057b(lsu.f136611c, qgjVar, mi21.m61834r(leu.m58816b(xq00Var).f117235g.f159605c, cxh0Var), ((diu) iiu.f102631a.f258037b).f49476a, 0L, false, xq00Var, lsu.f136612d | 48, 48);
            xq00Var.m91788r(false);
        } else {
            xq00Var.m91771i0(378638652);
            y85.m93057b(psu.f180961c, qgjVar, mi21.m61834r(leu.m58816b(xq00Var).f117235g.f159605c, cxh0Var), ((diu) iiu.f102631a.f258037b).f49476a, 0L, false, xq00Var, psu.f180962d | 48, 48);
            xq00Var.m91788r(false);
        }
        return w2a1.f247311a;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        switch (this.f207502a) {
            case 0:
                ((Number) obj2).intValue();
                xq00 xq00Var = (xq00) obj3;
                int iIntValue = ((Number) obj4).intValue();
                if (!xq00Var.m91752Y(iIntValue & 1, (iIntValue & 129) != 128)) {
                    xq00Var.m91757b0();
                }
                return w2a1.f247311a;
            case 1:
                C2592xx c2592xx = (C2592xx) obj;
                gh00 gh00Var = (gh00) obj2;
                xq00 xq00Var2 = (xq00) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = (xq00Var2.m91766g(c2592xx) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= xq00Var2.m91770i(gh00Var) ? 32 : 16;
                }
                if (xq00Var2.m91752Y(i & 1, (i & 147) != 146)) {
                    boolean z = (i & ContentType.LONG_FORM_ON_DEMAND) == 32;
                    Object objM91750T = xq00Var2.m91750T();
                    if (z || objM91750T == t6x0.f217647t) {
                        objM91750T = new j7g(27, gh00Var);
                        xq00Var2.m91793t0(objM91750T);
                    }
                    AbstractC1831ey.m40273a(c2592xx, (eh00) objM91750T, null, null, xq00Var2, i & 14);
                } else {
                    xq00Var2.m91757b0();
                }
                return w2a1.f247311a;
            case 2:
                n43 n43Var = (n43) obj;
                gh00 gh00Var2 = (gh00) obj2;
                xq00 xq00Var3 = (xq00) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                if ((iIntValue3 & 6) == 0) {
                    i2 = (xq00Var3.m91766g(n43Var) ? 4 : 2) | iIntValue3;
                } else {
                    i2 = iIntValue3;
                }
                if ((iIntValue3 & 48) == 0) {
                    i2 |= xq00Var3.m91770i(gh00Var2) ? 32 : 16;
                }
                if (xq00Var3.m91752Y(i2 & 1, (i2 & 147) != 146)) {
                    e72.m37993a(n43Var, gh00Var2, null, null, null, xq00Var3, i2 & 126);
                } else {
                    xq00Var3.m91757b0();
                }
                return w2a1.f247311a;
            case 3:
                zw5 zw5Var = (zw5) obj;
                gh00 gh00Var3 = (gh00) obj2;
                xq00 xq00Var4 = (xq00) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                ia7 ia7Var = t6x0.f217647t;
                if ((iIntValue4 & 6) == 0) {
                    i3 = (xq00Var4.m91766g(zw5Var) ? 4 : 2) | iIntValue4;
                } else {
                    i3 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i3 |= xq00Var4.m91770i(gh00Var3) ? 32 : 16;
                }
                if (xq00Var4.m91752Y(i3 & 1, (i3 & 147) != 146)) {
                    int i16 = i3 & ContentType.LONG_FORM_ON_DEMAND;
                    boolean z2 = i16 == 32;
                    Object objM91750T2 = xq00Var4.m91750T();
                    if (z2 || objM91750T2 == ia7Var) {
                        objM91750T2 = new j7g(28, gh00Var3);
                        xq00Var4.m91793t0(objM91750T2);
                    }
                    eh00 eh00Var = (eh00) objM91750T2;
                    boolean z3 = i16 == 32;
                    Object objM91750T3 = xq00Var4.m91750T();
                    if (z3 || objM91750T3 == ia7Var) {
                        objM91750T3 = new j7g(29, gh00Var3);
                        xq00Var4.m91793t0(objM91750T3);
                    }
                    cx5.m34213a(zw5Var, eh00Var, (eh00) objM91750T3, null, null, xq00Var4, i3 & 14);
                } else {
                    xq00Var4.m91757b0();
                }
                return w2a1.f247311a;
            case 4:
                x79 x79Var = (x79) obj;
                gh00 gh00Var4 = (gh00) obj2;
                xq00 xq00Var5 = (xq00) obj3;
                int iIntValue5 = ((Number) obj4).intValue();
                ia7 ia7Var2 = t6x0.f217647t;
                if ((iIntValue5 & 6) == 0) {
                    i4 = (xq00Var5.m91766g(x79Var) ? 4 : 2) | iIntValue5;
                } else {
                    i4 = iIntValue5;
                }
                if ((iIntValue5 & 48) == 0) {
                    i4 |= xq00Var5.m91770i(gh00Var4) ? 32 : 16;
                }
                if (xq00Var5.m91752Y(i4 & 1, (i4 & 147) != 146)) {
                    int i17 = i4 & ContentType.LONG_FORM_ON_DEMAND;
                    boolean z4 = i17 == 32;
                    Object objM91750T4 = xq00Var5.m91750T();
                    if (z4 || objM91750T4 == ia7Var2) {
                        objM91750T4 = new zbg(0, gh00Var4);
                        xq00Var5.m91793t0(objM91750T4);
                    }
                    eh00 eh00Var2 = (eh00) objM91750T4;
                    boolean z5 = i17 == 32;
                    Object objM91750T5 = xq00Var5.m91750T();
                    if (z5 || objM91750T5 == ia7Var2) {
                        objM91750T5 = new zbg(1, gh00Var4);
                        xq00Var5.m91793t0(objM91750T5);
                    }
                    nqg1.m65427a(x79Var, eh00Var2, (eh00) objM91750T5, null, xq00Var5, i4 & 14);
                } else {
                    xq00Var5.m91757b0();
                }
                return w2a1.f247311a;
            case 5:
                ccy ccyVar = (ccy) obj;
                gh00 gh00Var5 = (gh00) obj2;
                xq00 xq00Var6 = (xq00) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                ia7 ia7Var3 = t6x0.f217647t;
                if ((iIntValue6 & 6) == 0) {
                    i5 = (xq00Var6.m91766g(ccyVar) ? 4 : 2) | iIntValue6;
                } else {
                    i5 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i5 |= xq00Var6.m91770i(gh00Var5) ? 32 : 16;
                }
                if (xq00Var6.m91752Y(i5 & 1, (i5 & 147) != 146)) {
                    int i18 = i5 & ContentType.LONG_FORM_ON_DEMAND;
                    boolean z6 = i18 == 32;
                    Object objM91750T6 = xq00Var6.m91750T();
                    if (z6 || objM91750T6 == ia7Var3) {
                        objM91750T6 = new zbg(3, gh00Var5);
                        xq00Var6.m91793t0(objM91750T6);
                    }
                    eh00 eh00Var3 = (eh00) objM91750T6;
                    boolean z7 = i18 == 32;
                    Object objM91750T7 = xq00Var6.m91750T();
                    if (z7 || objM91750T7 == ia7Var3) {
                        objM91750T7 = new zbg(4, gh00Var5);
                        xq00Var6.m91793t0(objM91750T7);
                    }
                    eh00 eh00Var4 = (eh00) objM91750T7;
                    boolean z8 = i18 == 32;
                    Object objM91750T8 = xq00Var6.m91750T();
                    if (z8 || objM91750T8 == ia7Var3) {
                        objM91750T8 = new zbg(5, gh00Var5);
                        xq00Var6.m91793t0(objM91750T8);
                    }
                    k3u0.m55302f(ccyVar, eh00Var3, eh00Var4, (eh00) objM91750T8, null, xq00Var6, i5 & 14);
                } else {
                    xq00Var6.m91757b0();
                }
                return w2a1.f247311a;
            case 6:
                pd10 pd10Var = (pd10) obj;
                gh00 gh00Var6 = (gh00) obj2;
                xq00 xq00Var7 = (xq00) obj3;
                int iIntValue7 = ((Number) obj4).intValue();
                ia7 ia7Var4 = t6x0.f217647t;
                if ((iIntValue7 & 6) == 0) {
                    i6 = (xq00Var7.m91766g(pd10Var) ? 4 : 2) | iIntValue7;
                } else {
                    i6 = iIntValue7;
                }
                if ((iIntValue7 & 48) == 0) {
                    i6 |= xq00Var7.m91770i(gh00Var6) ? 32 : 16;
                }
                if (xq00Var7.m91752Y(i6 & 1, (i6 & 147) != 146)) {
                    int i19 = i6 & ContentType.LONG_FORM_ON_DEMAND;
                    boolean z9 = i19 == 32;
                    Object objM91750T9 = xq00Var7.m91750T();
                    if (z9 || objM91750T9 == ia7Var4) {
                        objM91750T9 = new zbg(6, gh00Var6);
                        xq00Var7.m91793t0(objM91750T9);
                    }
                    eh00 eh00Var5 = (eh00) objM91750T9;
                    boolean z10 = i19 == 32;
                    Object objM91750T10 = xq00Var7.m91750T();
                    if (z10 || objM91750T10 == ia7Var4) {
                        objM91750T10 = new zbg(7, gh00Var6);
                        xq00Var7.m91793t0(objM91750T10);
                    }
                    rqg1.m76231b(pd10Var, eh00Var5, (eh00) objM91750T10, null, null, xq00Var7, i6 & 14);
                } else {
                    xq00Var7.m91757b0();
                }
                return w2a1.f247311a;
            case 7:
                yh90 yh90Var = (yh90) obj;
                gh00 gh00Var7 = (gh00) obj2;
                xq00 xq00Var8 = (xq00) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                ia7 ia7Var5 = t6x0.f217647t;
                if ((iIntValue8 & 6) == 0) {
                    i7 = (xq00Var8.m91766g(yh90Var) ? 4 : 2) | iIntValue8;
                } else {
                    i7 = iIntValue8;
                }
                if ((iIntValue8 & 48) == 0) {
                    i7 |= xq00Var8.m91770i(gh00Var7) ? 32 : 16;
                }
                if (xq00Var8.m91752Y(i7 & 1, (i7 & 147) != 146)) {
                    int i20 = i7 & ContentType.LONG_FORM_ON_DEMAND;
                    boolean z11 = i20 == 32;
                    Object objM91750T11 = xq00Var8.m91750T();
                    if (z11 || objM91750T11 == ia7Var5) {
                        objM91750T11 = new zbg(8, gh00Var7);
                        xq00Var8.m91793t0(objM91750T11);
                    }
                    eh00 eh00Var6 = (eh00) objM91750T11;
                    boolean z12 = i20 == 32;
                    Object objM91750T12 = xq00Var8.m91750T();
                    if (z12 || objM91750T12 == ia7Var5) {
                        objM91750T12 = new zbg(9, gh00Var7);
                        xq00Var8.m91793t0(objM91750T12);
                    }
                    eh00 eh00Var7 = (eh00) objM91750T12;
                    boolean z13 = i20 == 32;
                    Object objM91750T13 = xq00Var8.m91750T();
                    if (z13 || objM91750T13 == ia7Var5) {
                        objM91750T13 = new zbg(10, gh00Var7);
                        xq00Var8.m91793t0(objM91750T13);
                    }
                    gv90.m45864g(yh90Var, eh00Var6, eh00Var7, (eh00) objM91750T13, null, xq00Var8, i7 & 14);
                } else {
                    xq00Var8.m91757b0();
                }
                return w2a1.f247311a;
            case 8:
                fj90 fj90Var = (fj90) obj;
                gh00 gh00Var8 = (gh00) obj2;
                xq00 xq00Var9 = (xq00) obj3;
                int iIntValue9 = ((Number) obj4).intValue();
                if ((iIntValue9 & 6) == 0) {
                    i8 = (xq00Var9.m91766g(fj90Var) ? 4 : 2) | iIntValue9;
                } else {
                    i8 = iIntValue9;
                }
                if ((iIntValue9 & 48) == 0) {
                    i8 |= xq00Var9.m91770i(gh00Var8) ? 32 : 16;
                }
                if (xq00Var9.m91752Y(i8 & 1, (i8 & 147) != 146)) {
                    boolean z14 = (i8 & ContentType.LONG_FORM_ON_DEMAND) == 32;
                    Object objM91750T14 = xq00Var9.m91750T();
                    if (z14 || objM91750T14 == t6x0.f217647t) {
                        objM91750T14 = new zbg(11, gh00Var8);
                        xq00Var9.m91793t0(objM91750T14);
                    }
                    qzb0.m74303c(fj90Var, (eh00) objM91750T14, null, xq00Var9, i8 & 14);
                } else {
                    xq00Var9.m91757b0();
                }
                return w2a1.f247311a;
            case 9:
                kky0 kky0Var = (kky0) obj;
                gh00 gh00Var9 = (gh00) obj2;
                xq00 xq00Var10 = (xq00) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                if ((iIntValue10 & 6) == 0) {
                    i9 = (xq00Var10.m91766g(kky0Var) ? 4 : 2) | iIntValue10;
                } else {
                    i9 = iIntValue10;
                }
                if ((iIntValue10 & 48) == 0) {
                    i9 |= xq00Var10.m91770i(gh00Var9) ? 32 : 16;
                }
                if (xq00Var10.m91752Y(i9 & 1, (i9 & 147) != 146)) {
                    boolean z15 = (i9 & ContentType.LONG_FORM_ON_DEMAND) == 32;
                    Object objM91750T15 = xq00Var10.m91750T();
                    if (z15 || objM91750T15 == t6x0.f217647t) {
                        objM91750T15 = new zbg(15, gh00Var9);
                        xq00Var10.m91793t0(objM91750T15);
                    }
                    lhg1.m58977d(kky0Var, (eh00) objM91750T15, null, xq00Var10, i9 & 14);
                } else {
                    xq00Var10.m91757b0();
                }
                return w2a1.f247311a;
            case 10:
                we91 we91Var = (we91) obj;
                gh00 gh00Var10 = (gh00) obj2;
                xq00 xq00Var11 = (xq00) obj3;
                int iIntValue11 = ((Number) obj4).intValue();
                ia7 ia7Var6 = t6x0.f217647t;
                if ((iIntValue11 & 6) == 0) {
                    i10 = (xq00Var11.m91766g(we91Var) ? 4 : 2) | iIntValue11;
                } else {
                    i10 = iIntValue11;
                }
                if ((iIntValue11 & 48) == 0) {
                    i10 |= xq00Var11.m91770i(gh00Var10) ? 32 : 16;
                }
                if (xq00Var11.m91752Y(i10 & 1, (i10 & 147) != 146)) {
                    int i21 = i10 & ContentType.LONG_FORM_ON_DEMAND;
                    boolean z16 = i21 == 32;
                    Object objM91750T16 = xq00Var11.m91750T();
                    if (z16 || objM91750T16 == ia7Var6) {
                        objM91750T16 = new zbg(16, gh00Var10);
                        xq00Var11.m91793t0(objM91750T16);
                    }
                    eh00 eh00Var8 = (eh00) objM91750T16;
                    boolean z17 = i21 == 32;
                    Object objM91750T17 = xq00Var11.m91750T();
                    if (z17 || objM91750T17 == ia7Var6) {
                        objM91750T17 = new zbg(17, gh00Var10);
                        xq00Var11.m91793t0(objM91750T17);
                    }
                    eh00 eh00Var9 = (eh00) objM91750T17;
                    boolean z18 = i21 == 32;
                    Object objM91750T18 = xq00Var11.m91750T();
                    if (z18 || objM91750T18 == ia7Var6) {
                        objM91750T18 = new zbg(18, gh00Var10);
                        xq00Var11.m91793t0(objM91750T18);
                    }
                    eh00 eh00Var10 = (eh00) objM91750T18;
                    boolean z19 = i21 == 32;
                    Object objM91750T19 = xq00Var11.m91750T();
                    if (z19 || objM91750T19 == ia7Var6) {
                        objM91750T19 = new zbg(19, gh00Var10);
                        xq00Var11.m91793t0(objM91750T19);
                    }
                    eh00 eh00Var11 = (eh00) objM91750T19;
                    boolean z20 = i21 == 32;
                    Object objM91750T20 = xq00Var11.m91750T();
                    if (z20 || objM91750T20 == ia7Var6) {
                        objM91750T20 = new zbg(20, gh00Var10);
                        xq00Var11.m91793t0(objM91750T20);
                    }
                    pzb0.m71708f(we91Var, eh00Var8, eh00Var9, eh00Var10, eh00Var11, (eh00) objM91750T20, null, null, xq00Var11, i10 & 14);
                } else {
                    xq00Var11.m91757b0();
                }
                return w2a1.f247311a;
            case 11:
                nob1 nob1Var = (nob1) obj;
                gh00 gh00Var11 = (gh00) obj2;
                xq00 xq00Var12 = (xq00) obj3;
                int iIntValue12 = ((Number) obj4).intValue();
                ia7 ia7Var7 = t6x0.f217647t;
                if ((iIntValue12 & 6) == 0) {
                    i11 = (xq00Var12.m91766g(nob1Var) ? 4 : 2) | iIntValue12;
                } else {
                    i11 = iIntValue12;
                }
                if ((iIntValue12 & 48) == 0) {
                    i11 |= xq00Var12.m91770i(gh00Var11) ? 32 : 16;
                }
                if (xq00Var12.m91752Y(i11 & 1, (i11 & 147) != 146)) {
                    int i22 = i11 & ContentType.LONG_FORM_ON_DEMAND;
                    boolean z21 = i22 == 32;
                    Object objM91750T21 = xq00Var12.m91750T();
                    if (z21 || objM91750T21 == ia7Var7) {
                        objM91750T21 = new zbg(21, gh00Var11);
                        xq00Var12.m91793t0(objM91750T21);
                    }
                    eh00 eh00Var12 = (eh00) objM91750T21;
                    boolean z22 = i22 == 32;
                    Object objM91750T22 = xq00Var12.m91750T();
                    if (z22 || objM91750T22 == ia7Var7) {
                        objM91750T22 = new zbg(22, gh00Var11);
                        xq00Var12.m91793t0(objM91750T22);
                    }
                    eh00 eh00Var13 = (eh00) objM91750T22;
                    boolean z23 = i22 == 32;
                    Object objM91750T23 = xq00Var12.m91750T();
                    if (z23 || objM91750T23 == ia7Var7) {
                        objM91750T23 = new zbg(23, gh00Var11);
                        xq00Var12.m91793t0(objM91750T23);
                    }
                    eh00 eh00Var14 = (eh00) objM91750T23;
                    boolean z24 = i22 == 32;
                    Object objM91750T24 = xq00Var12.m91750T();
                    if (z24 || objM91750T24 == ia7Var7) {
                        objM91750T24 = new zbg(24, gh00Var11);
                        xq00Var12.m91793t0(objM91750T24);
                    }
                    qkg1.m73112i(nob1Var, eh00Var12, eh00Var13, eh00Var14, (eh00) objM91750T24, null, xq00Var12, i11 & 14);
                } else {
                    xq00Var12.m91757b0();
                }
                return w2a1.f247311a;
            case 12:
                ((Number) obj4).intValue();
                return w2a1.f247311a;
            case 13:
                xq00 xq00Var13 = (xq00) obj3;
                ahf1.m25932d((String) obj2, null, leu.m58818d(xq00Var13).f64977m, leu.m58815a(xq00Var13).f112824b.f138758b, null, null, 2, false, new ol80(1), 0, null, xq00Var13, ((((Number) obj4).intValue() >> 3) & 14) | 1572864, 0, 1714);
                return w2a1.f247311a;
            case 14:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                xq00 xq00Var14 = (xq00) obj3;
                ((Number) obj4).intValue();
                y85.m93057b(zBooleanValue ? qvu.f193101c : psu.f180961c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var14).f117235g.f159606d, cxh0.f43038a), 0L, 0L, false, xq00Var14, 56, 56);
                return w2a1.f247311a;
            case 15:
                p4z p4zVar = (p4z) obj;
                gh00 gh00Var12 = (gh00) obj2;
                xq00 xq00Var15 = (xq00) obj3;
                int iIntValue13 = ((Number) obj4).intValue();
                if ((iIntValue13 & 6) == 0) {
                    i12 = (xq00Var15.m91766g(p4zVar) ? 4 : 2) | iIntValue13;
                } else {
                    i12 = iIntValue13;
                }
                if ((iIntValue13 & 48) == 0) {
                    i12 |= xq00Var15.m91770i(gh00Var12) ? 32 : 16;
                }
                if (xq00Var15.m91752Y(i12 & 1, (i12 & 147) != 146)) {
                    m5z.m60896a(p4zVar, gh00Var12, null, null, false, xq00Var15, i12 & 126);
                } else {
                    xq00Var15.m91757b0();
                }
                return w2a1.f247311a;
            case 16:
                pu00 pu00Var = (pu00) obj;
                gh00 gh00Var13 = (gh00) obj2;
                xq00 xq00Var16 = (xq00) obj3;
                int iIntValue14 = ((Number) obj4).intValue();
                if ((iIntValue14 & 6) == 0) {
                    i13 = (xq00Var16.m91766g(pu00Var) ? 4 : 2) | iIntValue14;
                } else {
                    i13 = iIntValue14;
                }
                if ((iIntValue14 & 48) == 0) {
                    i13 |= xq00Var16.m91770i(gh00Var13) ? 32 : 16;
                }
                if (xq00Var16.m91752Y(i13 & 1, (i13 & 147) != 146)) {
                    float f = 16;
                    qlg1.m73200e(pu00Var, zsf1.m96832C(cxh0.f43038a, f, 0.0f, f, 0.0f, 10), gh00Var13, xq00Var16, ((i13 << 3) & 896) | (i13 & 14));
                } else {
                    xq00Var16.m91757b0();
                }
                return w2a1.f247311a;
            case 17:
                pu00 pu00Var2 = (pu00) obj;
                gh00 gh00Var14 = (gh00) obj2;
                xq00 xq00Var17 = (xq00) obj3;
                int iIntValue15 = ((Number) obj4).intValue();
                if ((iIntValue15 & 6) == 0) {
                    i14 = (xq00Var17.m91766g(pu00Var2) ? 4 : 2) | iIntValue15;
                } else {
                    i14 = iIntValue15;
                }
                if ((iIntValue15 & 48) == 0) {
                    i14 |= xq00Var17.m91770i(gh00Var14) ? 32 : 16;
                }
                if (xq00Var17.m91752Y(i14 & 1, (i14 & 147) != 146)) {
                    float f2 = 16;
                    qlg1.m73200e(pu00Var2, zsf1.m96832C(cxh0.f43038a, 0.0f, f2, 0.0f, f2, 5), gh00Var14, xq00Var17, ((i14 << 3) & 896) | (i14 & 14));
                } else {
                    xq00Var17.m91757b0();
                }
                return w2a1.f247311a;
            case 18:
                pu00 pu00Var3 = (pu00) obj;
                gh00 gh00Var15 = (gh00) obj2;
                xq00 xq00Var18 = (xq00) obj3;
                int iIntValue16 = ((Number) obj4).intValue();
                if ((iIntValue16 & 6) == 0) {
                    i15 = (xq00Var18.m91766g(pu00Var3) ? 4 : 2) | iIntValue16;
                } else {
                    i15 = iIntValue16;
                }
                if ((iIntValue16 & 48) == 0) {
                    i15 |= xq00Var18.m91770i(gh00Var15) ? 32 : 16;
                }
                if (xq00Var18.m91752Y(i15 & 1, (i15 & 147) != 146)) {
                    float f3 = 16;
                    qlg1.m73200e(pu00Var3, zsf1.m96831B(cxh0.f43038a, f3, f3, f3, f3), gh00Var15, xq00Var18, ((i15 << 3) & 896) | (i15 & 14));
                } else {
                    xq00Var18.m91757b0();
                }
                return w2a1.f247311a;
            case 19:
                j580 j580Var = (j580) obj;
                int iIntValue17 = ((Number) obj4).intValue();
                wj50.m88279p(j580Var);
                psg1.m70838d(j580Var, (gh00) obj2, (xq00) obj3, iIntValue17 & ContentType.LONG_FORM_ON_DEMAND);
                return w2a1.f247311a;
            case 20:
                j580 j580Var2 = (j580) obj;
                int iIntValue18 = ((Number) obj4).intValue();
                wj50.m88279p(j580Var2);
                x2h1.m89748j(j580Var2, (gh00) obj2, (xq00) obj3, iIntValue18 & ContentType.LONG_FORM_ON_DEMAND);
                return w2a1.f247311a;
            case 21:
                ((Number) obj2).intValue();
                ((Number) obj4).intValue();
                cjf1.m32966g(0, 1, (xq00) obj3, null);
                return w2a1.f247311a;
            case 22:
                ((Number) obj2).intValue();
                xq00 xq00Var19 = (xq00) obj3;
                int iIntValue19 = ((Number) obj4).intValue();
                if (xq00Var19.m91752Y(iIntValue19 & 1, (iIntValue19 & 129) != 128)) {
                    fpg1.m42347c(null, xq00Var19, 0);
                } else {
                    xq00Var19.m91757b0();
                }
                return w2a1.f247311a;
            case 23:
                int iIntValue20 = ((Number) obj2).intValue();
                xq00 xq00Var20 = (xq00) obj3;
                int iIntValue21 = ((Number) obj4).intValue();
                if ((iIntValue21 & 48) == 0) {
                    iIntValue21 |= xq00Var20.m91762e(iIntValue20) ? 32 : 16;
                }
                if (xq00Var20.m91752Y(iIntValue21 & 1, (iIntValue21 & 145) != 144)) {
                    svg1.m79480p(0, xq00Var20, null, iIntValue20 >= 3);
                } else {
                    xq00Var20.m91757b0();
                }
                return w2a1.f247311a;
            case 24:
                return m77732a(obj, obj2, obj3, obj4);
            case 25:
                return m77733e(obj, obj2, obj3, obj4);
            case 26:
                return m77734f(obj, obj2, obj3, obj4);
            case 27:
                return m77735g(obj, obj2, obj3, obj4);
            case 28:
                return m77736i(obj, obj2, obj3, obj4);
            default:
                gh00 gh00Var16 = (gh00) obj2;
                xq00 xq00Var21 = (xq00) obj3;
                int iIntValue22 = ((Number) obj4).intValue();
                if ((iIntValue22 & 48) == 0) {
                    iIntValue22 |= xq00Var21.m91770i(gh00Var16) ? 32 : 16;
                }
                if (xq00Var21.m91752Y(iIntValue22 & 1, (iIntValue22 & 145) != 144)) {
                    boolean z25 = (iIntValue22 & ContentType.LONG_FORM_ON_DEMAND) == 32;
                    Object objM91750T25 = xq00Var21.m91750T();
                    if (z25 || objM91750T25 == t6x0.f217647t) {
                        objM91750T25 = new cxg(25, gh00Var16);
                        xq00Var21.m91793t0(objM91750T25);
                    }
                    ehf1.m38942h(0, (eh00) objM91750T25, xq00Var21, null);
                } else {
                    xq00Var21.m91757b0();
                }
                return w2a1.f247311a;
        }
    }
}
