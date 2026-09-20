package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bm31 implements dut {

    /* JADX INFO: renamed from: g */
    public static final Object f28363g = kkc0.m56695h0(new pqm0(zl31.f283899a, bk5.m29624m1(new fww0[]{new fww0(v140.class), new fww0(erc1.class), new fww0(jl31.class)})), new pqm0(zl31.f283900b, bk5.m29624m1(new eww0[]{new eww0(erc1.class), new eww0(v140.class)})), new pqm0(zl31.f283901c, bk5.m29624m1(new fww0[]{new fww0(v140.class), new fww0(erc1.class)})));

    /* JADX INFO: renamed from: a */
    public final e940 f28364a;

    /* JADX INFO: renamed from: b */
    public final l7k f28365b;

    /* JADX INFO: renamed from: c */
    public final cw41 f28366c;

    /* JADX INFO: renamed from: d */
    public final m7t0 f28367d;

    /* JADX INFO: renamed from: e */
    public final i5x f28368e = mhf1.m61771p(this).m94133b(q131.f184201i, q131.f184202t);

    /* JADX INFO: renamed from: f */
    public final cph f28369f;

    public bm31(e940 e940Var, l7k l7kVar, cw41 cw41Var) {
        this.f28364a = e940Var;
        this.f28365b = l7kVar;
        this.f28366c = cw41Var;
        int i = 0;
        int i2 = 0;
        this.f28367d = ysj0.m94495j(new am31(this, 0), new ptw0(1, this, bm31.class, "defaultState", "defaultState(Lcom/spotify/songdna/elements/songdnaentrypointelement/SongDNAEntrypoint$Props;)Lcom/spotify/songdna/elements/songdnaentrypointelement/impl/SongDNAEntrypointState;", i2, i, 20), new sq11(2, this, bm31.class, "stateMapper", "stateMapper(Lcom/spotify/songdna/elements/songdnaentrypointelement/SongDNAEntrypoint$Props;Lcom/spotify/listcontentruntime/metadataapi/MetadataValues;)Lcom/spotify/songdna/elements/songdnaentrypointelement/impl/SongDNAEntrypointState;", i2, i, 3), new am31(this, 1), 8);
        fyf fyfVar = new fyf(new lx11(this, 14), true, 416060938);
        wpi0 wpi0Var = xwt.f266743a;
        this.f28369f = new cph(fyfVar, 3);
    }

    /* JADX INFO: renamed from: e */
    public static ktx m29792e(dbf0 dbf0Var) {
        cbf0 cbf0VarM35556a;
        if (dbf0Var == null || (cbf0VarM35556a = dbf0Var.m35556a()) == null) {
            return null;
        }
        return (ktx) cbf0VarM35556a.f36107a;
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f28368e;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f28369f;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f28367d;
    }
}
