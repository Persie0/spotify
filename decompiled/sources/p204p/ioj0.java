package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class ioj0 {

    /* JADX INFO: renamed from: a */
    public final nny0 f104233a;

    /* JADX INFO: renamed from: b */
    public final qx0 f104234b;

    /* JADX INFO: renamed from: c */
    public yqq f104235c;

    /* JADX INFO: renamed from: d */
    public boolean f104236d;

    /* JADX INFO: renamed from: e */
    public final t7q f104237e = new t7q(5);

    /* JADX WARN: Multi-variable type inference failed */
    public ioj0(nny0 nny0Var, th00 th00Var, yqq yqqVar) {
        this.f104233a = nny0Var;
        this.f104234b = (qx0) th00Var;
        this.f104235c = yqqVar;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: a */
    public static void m51206a(e6q0 e6q0Var) {
        ?? r3 = e6q0Var.f56704a;
        int size = r3.size();
        for (int i = 0; i < size; i++) {
            ((k6q0) r3.get(i)).m55602a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m51207b(th00 th00Var, ibk ibkVar) {
        hoj0 hoj0Var;
        if (ibkVar instanceof hoj0) {
            hoj0Var = (hoj0) ibkVar;
            int i = hoj0Var.f93553c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hoj0Var.f93553c = i - Integer.MIN_VALUE;
            } else {
                hoj0Var = new hoj0(this, ibkVar);
            }
        } else {
            hoj0Var = new hoj0(this, ibkVar);
        }
        Object obj = hoj0Var.f93551a;
        int i2 = hoj0Var.f93553c;
        if (i2 == 0) {
            bga.m29073P(obj);
            this.f104236d = true;
            rph0 rph0Var = new rph0(this, th00Var, null, 27);
            hoj0Var.f93553c = 1;
            Object objM64633z = njg1.m64633z(rph0Var, hoj0Var);
            yuk yukVar = yuk.f276404a;
            if (objM64633z == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        this.f104236d = false;
        return w2a1.f247311a;
    }
}
