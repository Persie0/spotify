package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class mxt extends mb61 implements th00 {

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ kqi0 f148171X;

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ kqi0 f148172Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ kqi0 f148173Z;

    /* JADX INFO: renamed from: a */
    public int f148174a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fmu0 f148175b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ slv0 f148176c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ sqi0 f148177d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ slv0 f148178e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f148179f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ gh00 f148180g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ slv0 f148181h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ kqi0 f148182i;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ kqi0 f148183t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mxt(fmu0 fmu0Var, slv0 slv0Var, sqi0 sqi0Var, slv0 slv0Var2, String str, gh00 gh00Var, slv0 slv0Var3, kqi0 kqi0Var, kqi0 kqi0Var2, kqi0 kqi0Var3, kqi0 kqi0Var4, kqi0 kqi0Var5, fbk fbkVar) {
        super(2, fbkVar);
        this.f148175b = fmu0Var;
        this.f148176c = slv0Var;
        this.f148177d = sqi0Var;
        this.f148178e = slv0Var2;
        this.f148179f = str;
        this.f148180g = gh00Var;
        this.f148181h = slv0Var3;
        this.f148182i = kqi0Var;
        this.f148183t = kqi0Var2;
        this.f148171X = kqi0Var3;
        this.f148172Y = kqi0Var4;
        this.f148173Z = kqi0Var5;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        return new mxt(this.f148175b, this.f148176c, this.f148177d, this.f148178e, this.f148179f, this.f148180g, this.f148181h, this.f148182i, this.f148183t, this.f148171X, this.f148172Y, this.f148173Z, fbkVar);
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        return ((mxt) create((xuk) obj, (fbk) obj2)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        int i = this.f148174a;
        if (i == 0) {
            bga.m29073P(obj);
            lxt lxtVar = new lxt(this.f148176c, this.f148177d, this.f148178e, this.f148179f, this.f148180g, this.f148181h, this.f148182i, this.f148183t, this.f148171X, this.f148172Y, this.f148173Z, null);
            this.f148174a = 1;
            Object objMo26212b = this.f148175b.mo26212b(lxtVar, this);
            yuk yukVar = yuk.f276404a;
            if (objMo26212b == yukVar) {
                return yukVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        return w2a1.f247311a;
    }
}
