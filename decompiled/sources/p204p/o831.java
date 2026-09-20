package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class o831 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f162697a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ q831 f162698b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cwf f162699c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o831(q831 q831Var, cwf cwfVar, int i) {
        super(1);
        this.f162697a = i;
        this.f162698b = q831Var;
        this.f162699c = cwfVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f162697a) {
            case 0:
                return q831.m72296a(this.f162698b, this.f162699c, ((Number) obj).intValue());
            default:
                return q831.m72296a(this.f162698b, this.f162699c, ((Number) obj).intValue());
        }
    }
}
