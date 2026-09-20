package p204p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes4.dex */
public final class lt5 implements w1k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f136700a;

    /* JADX INFO: renamed from: b */
    public final Object f136701b;

    public /* synthetic */ lt5(Object obj, int i) {
        this.f136700a = i;
        this.f136701b = obj;
    }

    @Override // p204p.w1k
    /* JADX INFO: renamed from: a */
    public final Object mo32553a(m6k m6kVar, j6a j6aVar) {
        switch (this.f136700a) {
            case 0:
                return m59870b((nt5) m6kVar, j6aVar);
            case 1:
                lo7 lo7Var = (lo7) m6kVar;
                so7 so7Var = (so7) this.f136701b;
                so7Var.getClass();
                return kk40.m56684z(new qo7(lo7Var.f135322d, so7Var, lo7Var.f135319a, lo7Var.f135320b, null), j6aVar);
            case 2:
                return m59871c((eq80) m6kVar, j6aVar);
            default:
                exe1 exe1Var = (exe1) m6kVar;
                return ((a5j0) this.f136701b).m24802a(exe1Var.f63752a, exe1Var.f63753b, j6aVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m59870b(nt5 nt5Var, ibk ibkVar) {
        kt5 kt5Var;
        if (ibkVar instanceof kt5) {
            kt5Var = (kt5) ibkVar;
            int i = kt5Var.f126140c;
            if ((i & Integer.MIN_VALUE) != 0) {
                kt5Var.f126140c = i - Integer.MIN_VALUE;
            } else {
                kt5Var = new kt5(this, ibkVar);
            }
        } else {
            kt5Var = new kt5(this, ibkVar);
        }
        Object obj = kt5Var.f126138a;
        int i2 = kt5Var.f126140c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        Observable observableM60410a = ((m06) this.f136701b).m60410a(nt5Var);
        kt5Var.f126140c = 1;
        Object objM96571q = zn91.m96571q(observableM60410a, 1, null, kt5Var);
        yuk yukVar = yuk.f276404a;
        return objM96571q == yukVar ? yukVar : objM96571q;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public Object m59871c(eq80 eq80Var, ibk ibkVar) {
        dq80 dq80Var;
        if (ibkVar instanceof dq80) {
            dq80Var = (dq80) ibkVar;
            int i = dq80Var.f51895c;
            if ((i & Integer.MIN_VALUE) != 0) {
                dq80Var.f51895c = i - Integer.MIN_VALUE;
            } else {
                dq80Var = new dq80(this, ibkVar);
            }
        } else {
            dq80Var = new dq80(this, ibkVar);
        }
        Object obj = dq80Var.f51893a;
        int i2 = dq80Var.f51895c;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
            return obj;
        }
        bga.m29073P(obj);
        Observable observableM68415b = ((oy80) this.f136701b).m68415b(eq80Var);
        dq80Var.f51895c = 1;
        Object objM96571q = zn91.m96571q(observableM68415b, 1, null, dq80Var);
        yuk yukVar = yuk.f276404a;
        return objM96571q == yukVar ? yukVar : objM96571q;
    }
}
