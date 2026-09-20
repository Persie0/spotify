package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class puz implements dut {

    /* JADX INFO: renamed from: a */
    public final h0p f181549a;

    /* JADX INFO: renamed from: b */
    public final z5f f181550b;

    /* JADX INFO: renamed from: c */
    public final v5m f181551c;

    /* JADX INFO: renamed from: d */
    public final i5x f181552d = mhf1.m61771p(this).m94133b(hzy.f97034P0, hzy.f97036R0);

    /* JADX INFO: renamed from: e */
    public final xiz f181553e;

    /* JADX INFO: renamed from: f */
    public final cph f181554f;

    public puz(h0p h0pVar, z5f z5fVar, v5m v5mVar) {
        this.f181549a = h0pVar;
        this.f181550b = z5fVar;
        this.f181551c = v5mVar;
        int i = 3;
        this.f181553e = axf1.m27398m(new a8x(1, this, puz.class, "getState", "getState(Lcom/spotify/curation/followbutton/FollowButtonElement$Props;)Lkotlinx/coroutines/flow/Flow;", 0, 0, 16), ttz.f223727g, xyy.f267452Y, null, new wpz(this, i), 8);
        fyf fyfVar = rig.f199538a;
        wpi0 wpi0Var = xwt.f266743a;
        this.f181554f = new cph(fyfVar, i);
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f181552d;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f181554f;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f181553e;
    }
}
