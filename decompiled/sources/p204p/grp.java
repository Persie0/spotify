package p204p;

import android.content.Context;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes8.dex */
public final class grp implements dut {

    /* JADX INFO: renamed from: L0 */
    public final Object f83802L0;

    /* JADX INFO: renamed from: X */
    public final Object f83803X;

    /* JADX INFO: renamed from: Y */
    public final Object f83804Y;

    /* JADX INFO: renamed from: Z */
    public final Object f83805Z;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f83806a;

    /* JADX INFO: renamed from: b */
    public final cph f83807b;

    /* JADX INFO: renamed from: c */
    public final Object f83808c;

    /* JADX INFO: renamed from: d */
    public final Object f83809d;

    /* JADX INFO: renamed from: e */
    public final Object f83810e;

    /* JADX INFO: renamed from: f */
    public final Object f83811f;

    /* JADX INFO: renamed from: g */
    public final Object f83812g;

    /* JADX INFO: renamed from: h */
    public final Object f83813h;

    /* JADX INFO: renamed from: i */
    public final Object f83814i;

    /* JADX INFO: renamed from: t */
    public final Object f83815t;

    public grp(Context context, v0y v0yVar, h2n h2nVar, n6q n6qVar, cr9 cr9Var, xwz xwzVar, z9j0 z9j0Var, cgm cgmVar, etg0 etg0Var) {
        this.f83806a = 2;
        this.f83808c = context;
        this.f83809d = v0yVar;
        this.f83810e = h2nVar;
        this.f83811f = n6qVar;
        this.f83812g = cr9Var;
        this.f83813h = xwzVar;
        this.f83814i = z9j0Var;
        this.f83815t = etg0Var;
        this.f83803X = jag1.m52819d(Boolean.FALSE);
        this.f83804Y = mvl0.m62953p(k0e1.m54985d(cgmVar.m32730a(true)));
        int i = 0;
        this.f83805Z = axf1.m27398m(new g3n0(this, i), new g3n0(this, 1), new k1l0(this, 11), null, new g3n0(this, 2), 8);
        this.f83802L0 = mhf1.m61771p(this).m94133b(new h3n0(this, i), xll0.f263179Y0);
        fyf fyfVar = new fyf(new zwk0(this, 20), true, 1537262113);
        wpi0 wpi0Var = xwt.f266743a;
        this.f83807b = new cph(fyfVar, 3);
    }

    /* JADX INFO: renamed from: e */
    public static final f3n0 m45572e(grp grpVar, e3n0 e3n0Var) {
        String str = e3n0Var.f55829a;
        String str2 = e3n0Var.f55830b;
        boolean z = e3n0Var.f55831c;
        Context context = (Context) grpVar.f83808c;
        return new f3n0(str, str2, z, context.getString(R.string.jam_participant_learn_more_body, str2), e3n0Var.f55831c ? new sm50(h6f.m46715L(context.getString(R.string.jam_participant_learn_more_condition_bluetooth), context.getString(R.string.jam_participant_learn_more_condition_interaction))) : new sm50(h6f.m46715L(context.getString(R.string.jam_participant_learn_more_condition_wifi), context.getString(R.string.jam_participant_learn_more_condition_bluetooth))), "https://support.spotify.com/us/article/jam/", e3n0Var.f55832d, false, false);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        switch (this.f83806a) {
            case 0:
                return (j2a1) this.f83802L0;
            case 1:
                return (i5x) this.f83805Z;
            default:
                return (i5x) this.f83802L0;
        }
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        switch (this.f83806a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.f83807b;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        switch (this.f83806a) {
            case 0:
                return (mmh0) this.f83805Z;
            case 1:
                return (kzs0) this.f83802L0;
            default:
                return (xiz) this.f83805Z;
        }
    }

    public grp(voc1 voc1Var, ck90 ck90Var, pgo pgoVar, t5p t5pVar, uo20 uo20Var, wvm wvmVar, i82 i82Var, kon konVar, q7s0 q7s0Var, y43 y43Var) {
        this.f83806a = 1;
        this.f83808c = voc1Var;
        this.f83809d = ck90Var;
        this.f83810e = pgoVar;
        this.f83811f = t5pVar;
        this.f83812g = uo20Var;
        this.f83813h = wvmVar;
        this.f83814i = i82Var;
        this.f83815t = konVar;
        this.f83803X = q7s0Var;
        this.f83804Y = y43Var;
        this.f83805Z = mhf1.m61771p(this).m94133b(ccu.f36634a1, ccu.f36636b1);
        this.f83802L0 = new kzs0(acu.f14449Y);
        fyf fyfVar = new fyf(new fgv(this, 7), true, -1665547269);
        wpi0 wpi0Var = xwt.f266743a;
        this.f83807b = new cph(fyfVar, 3);
    }

    public grp(e940 e940Var, luk lukVar, hze0 hze0Var, gut gutVar, gut gutVar2, gut gutVar3, String str, String str2, String str3, String str4) {
        this.f83806a = 0;
        this.f83808c = e940Var;
        this.f83809d = lukVar;
        this.f83810e = hze0Var;
        this.f83811f = gutVar;
        this.f83812g = gutVar2;
        this.f83813h = gutVar3;
        this.f83814i = str;
        this.f83815t = str2;
        this.f83803X = str3;
        this.f83804Y = str4;
        this.f83805Z = alf1.m26337t(new m2f0(null, false, true, gbu.f78413a), brp.f30130b, new o72(this, 8), q6p.f185898i, new jhp(this, 10));
        this.f83802L0 = new j2a1();
        fyf fyfVar = new fyf(new jql(this, 21), true, -1690950406);
        wpi0 wpi0Var = xwt.f266743a;
        this.f83807b = new cph(fyfVar, 3);
    }
}
