package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class mpd implements dut {

    /* JADX INFO: renamed from: X */
    public final i5x f145975X;

    /* JADX INFO: renamed from: Y */
    public final cph f145976Y;

    /* JADX INFO: renamed from: a */
    public final c97 f145977a;

    /* JADX INFO: renamed from: b */
    public final cr9 f145978b;

    /* JADX INFO: renamed from: c */
    public final ynb f145979c;

    /* JADX INFO: renamed from: d */
    public final opd f145980d;

    /* JADX INFO: renamed from: e */
    public final int f145981e;

    /* JADX INFO: renamed from: f */
    public final pla1 f145982f;

    /* JADX INFO: renamed from: g */
    public final String f145983g;

    /* JADX INFO: renamed from: h */
    public final luk f145984h;

    /* JADX INFO: renamed from: i */
    public final luk f145985i;

    /* JADX INFO: renamed from: t */
    public final mmh0 f145986t;

    public mpd(c97 c97Var, cr9 cr9Var, ynb ynbVar, tvn tvnVar, opd opdVar, int i, pla1 pla1Var, String str, String str2, ag9 ag9Var, sn0 sn0Var, luk lukVar, luk lukVar2) {
        this.f145977a = c97Var;
        this.f145978b = cr9Var;
        this.f145979c = ynbVar;
        this.f145980d = opdVar;
        this.f145981e = i;
        this.f145982f = pla1Var;
        this.f145983g = str;
        this.f145984h = lukVar;
        this.f145985i = lukVar2;
        kpd kpdVar = new kpd(0, 0, false);
        int i2 = 2;
        lpc lpcVar = new lpc(this, i2);
        pwn pwnVar = tvnVar.f224200a;
        son sonVar = pwnVar.f182075b;
        xwz xwzVar = (xwz) sonVar.f212546x6.get();
        e3p e3pVar = (e3p) sonVar.f211768Ue.get();
        otn otnVar = pwnVar.f182076c;
        this.f145986t = alf1.m26339v(kpdVar, lpcVar, new wod(xwzVar, e3pVar, b2s.m27971a(otnVar.f169565X), ag9Var, (luk) sonVar.f212491v3.get(), otnVar.f169650c, (luk) sonVar.f211486K2.get(), sn0Var), f4c.f65734V0, new rqc(this, 4));
        this.f145975X = mhf1.m61771p(this).m94133b(new yt5(str2, i2), new sgd(this, i2));
        fyf fyfVar = new fyf(new bhd(this, i2), true, 922898231);
        wpi0 wpi0Var = xwt.f266743a;
        this.f145976Y = new cph(fyfVar, 3);
    }

    /* JADX INFO: renamed from: e */
    public static final int m62464e(mpd mpdVar) {
        int iM38547C = edb.m38547C(mpdVar.f145981e);
        if (iM38547C == 0) {
            return 3;
        }
        if (iM38547C == 1) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f145975X;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f145976Y;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f145986t;
    }
}
