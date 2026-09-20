package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class fis extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69958a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qoc1 f69959b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gis f69960c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ sag0 f69961d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fis(qoc1 qoc1Var, gis gisVar, sag0 sag0Var, int i) {
        super(0);
        this.f69958a = i;
        this.f69959b = qoc1Var;
        this.f69960c = gisVar;
        this.f69961d = sag0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f69958a) {
            case 0:
                sag0 sag0Var = this.f69961d;
                gis gisVar = this.f69960c;
                return this.f69959b.m73390a(gisVar, new eis(sag0Var, gisVar, 0));
            default:
                sag0 sag0Var2 = this.f69961d;
                gis gisVar2 = this.f69960c;
                return this.f69959b.m73390a(gisVar2, new eis(sag0Var2, gisVar2, 1));
        }
    }
}
