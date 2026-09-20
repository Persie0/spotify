package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class f101 implements d101 {

    /* JADX INFO: renamed from: f */
    public static final double f64756f = Math.random();

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f64757g = 0;

    /* JADX INFO: renamed from: a */
    public final faz f64758a;

    /* JADX INFO: renamed from: b */
    public final vaz f64759b;

    /* JADX INFO: renamed from: c */
    public final l401 f64760c;

    /* JADX INFO: renamed from: d */
    public final b5p f64761d;

    /* JADX INFO: renamed from: e */
    public final juk f64762e;

    public f101(faz fazVar, vaz vazVar, l401 l401Var, b5p b5pVar, juk jukVar) {
        this.f64758a = fazVar;
        this.f64759b = vazVar;
        this.f64760c = l401Var;
        this.f64761d = b5pVar;
        this.f64762e = jukVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m40515a(f101 f101Var, ibk ibkVar) {
        e101 e101Var;
        boolean zBooleanValue;
        if (ibkVar instanceof e101) {
            e101Var = (e101) ibkVar;
            int i = e101Var.f55081d;
            if ((i & Integer.MIN_VALUE) != 0) {
                e101Var.f55081d = i - Integer.MIN_VALUE;
            } else {
                e101Var = new e101(f101Var, ibkVar);
            }
        } else {
            e101Var = new e101(f101Var, ibkVar);
        }
        Object obj = e101Var.f55079b;
        int i2 = e101Var.f55081d;
        if (i2 == 0) {
            bga.m29073P(obj);
            l401 l401Var = f101Var.f64760c;
            e101Var.f55078a = f101Var;
            e101Var.f55081d = 1;
            Object objM58034b = l401Var.m58034b(e101Var);
            yuk yukVar = yuk.f276404a;
            if (objM58034b == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f101Var = e101Var.f55078a;
            bga.m29073P(obj);
        }
        l401 l401Var2 = f101Var.f64760c;
        Boolean boolM95405u = l401Var2.f129469a.m95405u();
        if (boolM95405u != null) {
            zBooleanValue = boolM95405u.booleanValue();
        } else {
            Boolean boolM75416a = l401Var2.f129470b.m75416a();
            zBooleanValue = boolM75416a != null ? boolM75416a.booleanValue() : true;
        }
        if (zBooleanValue) {
            return f64756f <= f101Var.f64760c.m58033a() ? qyg1.m74178H(true) : qyg1.m74178H(false);
        }
        return qyg1.m74178H(false);
    }
}
