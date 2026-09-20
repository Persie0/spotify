package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class lxt extends mb61 implements th00 {

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ kqi0 f137869X;

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ kqi0 f137870Y;

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f137871a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ slv0 f137872b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sqi0 f137873c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ slv0 f137874d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f137875e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ gh00 f137876f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ slv0 f137877g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ kqi0 f137878h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ kqi0 f137879i;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ kqi0 f137880t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxt(slv0 slv0Var, sqi0 sqi0Var, slv0 slv0Var2, String str, gh00 gh00Var, slv0 slv0Var3, kqi0 kqi0Var, kqi0 kqi0Var2, kqi0 kqi0Var3, kqi0 kqi0Var4, kqi0 kqi0Var5, fbk fbkVar) {
        super(2, fbkVar);
        this.f137872b = slv0Var;
        this.f137873c = sqi0Var;
        this.f137874d = slv0Var2;
        this.f137875e = str;
        this.f137876f = gh00Var;
        this.f137877g = slv0Var3;
        this.f137878h = kqi0Var;
        this.f137879i = kqi0Var2;
        this.f137880t = kqi0Var3;
        this.f137869X = kqi0Var4;
        this.f137870Y = kqi0Var5;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        lxt lxtVar = new lxt(this.f137872b, this.f137873c, this.f137874d, this.f137875e, this.f137876f, this.f137877g, this.f137878h, this.f137879i, this.f137880t, this.f137869X, this.f137870Y, fbkVar);
        lxtVar.f137871a = obj;
        return lxtVar;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        lxt lxtVar = (lxt) create((b250) obj, (fbk) obj2);
        w2a1 w2a1Var = w2a1.f247311a;
        lxtVar.invokeSuspend(w2a1Var);
        return w2a1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        b250 b250Var = (b250) this.f137871a;
        bga.m29073P(obj);
        slv0 slv0Var = this.f137872b;
        b250 b250Var2 = (b250) slv0Var.f210497a;
        slv0Var.f210497a = b250Var;
        yxt yxtVarM57706k = kyf1.m57706k(b250Var);
        slv0 slv0Var2 = this.f137874d;
        if (yxtVarM57706k != null) {
            this.f137878h.setValue(yxtVarM57706k);
            slv0 slv0Var3 = this.f137877g;
            if (!wj50.m88271j(slv0Var3.f210497a, yxtVarM57706k)) {
                slv0Var3.f210497a = yxtVarM57706k;
                slv0Var2.f210497a = yxtVarM57706k.create();
            }
        }
        eh00 eh00VarM65830i = nxf1.m65830i(b250Var);
        if (eh00VarM65830i != null) {
            this.f137879i.setValue(eh00VarM65830i);
        }
        this.f137880t.setValue(pgg1.m69892o(b250Var));
        if (!wj50.m88271j(b250Var2, b250Var)) {
            kqi0 kqi0Var = this.f137869X;
            if (!((mjh) kqi0Var.getValue()).f144256b.f138796b) {
                Object value = this.f137870Y.getValue();
                mjh mjhVar = (mjh) kqi0Var.getValue();
                int i = this.f137873c.f213108a;
                Object obj2 = slv0Var2.f210497a;
                if (obj2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                mif1.m61872e(value, mjhVar, i, (xxt) obj2, b250Var, this.f137875e, this.f137876f);
            }
        }
        return w2a1.f247311a;
    }
}
