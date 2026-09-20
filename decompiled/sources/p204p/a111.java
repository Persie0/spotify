package p204p;

import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class a111 implements dut {

    /* JADX INFO: renamed from: X */
    public final cph f11232X;

    /* JADX INFO: renamed from: a */
    public final k4k0 f11233a;

    /* JADX INFO: renamed from: b */
    public final j2r f11234b;

    /* JADX INFO: renamed from: c */
    public final eeh0 f11235c;

    /* JADX INFO: renamed from: d */
    public final kv91 f11236d;

    /* JADX INFO: renamed from: e */
    public final j2r f11237e;

    /* JADX INFO: renamed from: f */
    public final y0i0 f11238f;

    /* JADX INFO: renamed from: g */
    public final m011 f11239g;

    /* JADX INFO: renamed from: h */
    public final b411 f11240h;

    /* JADX INFO: renamed from: i */
    public final wxh0 f11241i;

    /* JADX INFO: renamed from: t */
    public final i5x f11242t;

    public a111(k4k0 k4k0Var, j2r j2rVar, eeh0 eeh0Var, kv91 kv91Var, j2r j2rVar2, y0i0 y0i0Var, m011 m011Var, luk lukVar, b411 b411Var) {
        this.f11233a = k4k0Var;
        this.f11234b = j2rVar;
        this.f11235c = eeh0Var;
        this.f11236d = kv91Var;
        this.f11237e = j2rVar2;
        this.f11238f = y0i0Var;
        this.f11239g = m011Var;
        this.f11240h = b411Var;
        y011 y011Var = y011.f267858b;
        fyf fyfVar = new fyf(new z701(this, 2), true, -888917666);
        jtp jtpVar = new jtp();
        jtpVar.m54301a(y011.f267860c, z801.f280322Z);
        this.f11241i = new wxh0(jtpVar, y011Var, lukVar, fyfVar);
        this.f11242t = mhf1.m61771p(this).m94133b(new z011(this, 0), new z011(this, 1));
        fyf fyfVar2 = new fyf(new puz0(this, 14), true, 1105964613);
        wpi0 wpi0Var = xwt.f266743a;
        this.f11232X = new cph(fyfVar2, 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r25v1, types: [java.lang.Throwable] */
    /* JADX INFO: renamed from: e */
    public static final void m24407e(a111 a111Var, x011 x011Var, gh00 gh00Var, xq00 xq00Var, int i) {
        boolean z;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(1524173594);
        int i2 = (i & 6) == 0 ? (xq00Var.m91766g(x011Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91766g(a111Var) ? 256 : 128;
        }
        boolean z2 = false;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z3 = x011Var instanceof v011;
            cxh0 cxh0Var = cxh0.f43038a;
            w2a1 w2a1Var = w2a1.f247311a;
            vb9 vb9Var = null;
            ?? r15 = 0;
            ?? r16 = 0;
            if (z3) {
                xq00Var.m91771i0(261457501);
                boolean z4 = ((i2 & 896) == 256) | ((i2 & ContentType.LONG_FORM_ON_DEMAND) == 32);
                Object objM91750T = xq00Var.m91750T();
                if (z4 || objM91750T == ia7Var) {
                    objM91750T = new vx01(a111Var, gh00Var, r15 == true ? 1 : 0, 1);
                    xq00Var.m91793t0(objM91750T);
                }
                hz40.m49237i(w2a1Var, (th00) objM91750T, xq00Var);
                v011 v011Var = (v011) x011Var;
                Object obj = v011Var.f235876b;
                boolean zM91766g = xq00Var.m91766g(obj);
                Object objM91750T2 = xq00Var.m91750T();
                if (zM91766g || objM91750T2 == ia7Var) {
                    xq00Var.m91793t0(obj);
                } else {
                    obj = objM91750T2;
                }
                List list = (List) obj;
                if (list.isEmpty()) {
                    xq00Var.m91771i0(262077129);
                    ulg1.m83373g(new gkj0(k0e1.m54977L(R.string.share_sheet_no_off_platform_destinations_title, xq00Var), k0e1.m54977L(R.string.share_sheet_no_off_platform_destinations_subtitle, xq00Var), (fkj0) (r16 == true ? 1 : 0), 12), mi21.m61822f(1.0f, cxh0Var), xq00Var, 48);
                    xq00Var.m91788r(false);
                    z = false;
                } else {
                    xq00Var.m91771i0(262517236);
                    xq00Var.m91771i0(147017892);
                    ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                    int i3 = 0;
                    for (Object obj2 : list) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            ?? r25 = vb9Var;
                            h6f.m46722S();
                            throw r25;
                        }
                        vb9 vb9Var2 = vb9Var;
                        o011 o011Var = new o011(v011Var.f235878d, v011Var.f235879e, v011Var.f235880f, v011Var.f235881g, v011Var.f235875a.m82262g(), (gq01) obj2, i3, v011Var.f235882h);
                        Object objM91750T3 = xq00Var.m91750T();
                        if (objM91750T3 == ia7Var) {
                            objM91750T3 = (dut) new wjk0(a111Var.f11233a, 24).invoke();
                            xq00Var.m91793t0(objM91750T3);
                        }
                        arrayList.add(new s630(o011Var, (dut) objM91750T3));
                        i3 = i4;
                        vb9Var = vb9Var2;
                        z2 = false;
                    }
                    xq00Var.m91788r(z2);
                    AbstractC2524w8 abstractC2524w8M67546C = opo.m67546C(arrayList);
                    fxh0 fxh0VarM39673I = epv0.m39673I("share.sheet.share.destination_list", mi21.m61842z(mi21.m61822f(1.0f, cxh0Var), vb9Var, 3));
                    Object objM91750T4 = xq00Var.m91750T();
                    if (objM91750T4 == ia7Var) {
                        objM91750T4 = z801.f280320Y;
                        xq00Var.m91793t0(objM91750T4);
                    }
                    hra.m48356b(abstractC2524w8M67546C, fxh0VarM39673I, (th00) objM91750T4, xq00Var, 432, 0);
                    z = false;
                    xq00Var.m91788r(false);
                }
                xq00Var.m91788r(z);
            } else if (x011Var instanceof w011) {
                xq00Var.m91771i0(147042232);
                ufc1.m82964b(null, xq00Var, 0);
                xq00Var.m91788r(false);
            } else {
                if (!(x011Var instanceof u011)) {
                    throw lq51.m59703i(146980499, xq00Var, false);
                }
                xq00Var.m91771i0(263402844);
                int i5 = i2 & ContentType.LONG_FORM_ON_DEMAND;
                boolean z5 = i5 == 32;
                Object objM91750T5 = xq00Var.m91750T();
                if (z5 || objM91750T5 == ia7Var) {
                    objM91750T5 = new ri0(gh00Var, null, 14);
                    xq00Var.m91793t0(objM91750T5);
                }
                hz40.m49237i(w2a1Var, (th00) objM91750T5, xq00Var);
                fxh0 fxh0VarM61822f = mi21.m61822f(1.0f, cxh0Var);
                boolean z6 = i5 == 32;
                Object objM91750T6 = xq00Var.m91750T();
                if (z6 || objM91750T6 == ia7Var) {
                    objM91750T6 = new os01(7, gh00Var);
                    xq00Var.m91793t0(objM91750T6);
                }
                ppg1.m70559c(6, (eh00) objM91750T6, xq00Var, fxh0VarM61822f);
                xq00Var.m91788r(false);
            }
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ylw0(a111Var, x011Var, gh00Var, i, 19);
        }
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f11242t;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f11232X;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f11241i;
    }
}
