package p204p;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public final class pir0 implements kqi0, xuk {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kqi0 f178006a;

    /* JADX INFO: renamed from: b */
    public final juk f178007b;

    public pir0(kqi0 kqi0Var, juk jukVar) {
        this.f178006a = kqi0Var;
        this.f178007b = jukVar;
    }

    @Override // p204p.xuk
    /* JADX INFO: renamed from: M */
    public final juk mo31960M() {
        return this.f178007b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m70116a(eh00 eh00Var, ibk ibkVar) {
        oir0 oir0Var;
        if (ibkVar instanceof oir0) {
            oir0Var = (oir0) ibkVar;
            int i = oir0Var.f165878d;
            if ((i & Integer.MIN_VALUE) != 0) {
                oir0Var.f165878d = i - Integer.MIN_VALUE;
            } else {
                oir0Var = new oir0(this, ibkVar);
            }
        } else {
            oir0Var = new oir0(this, ibkVar);
        }
        Object obj = oir0Var.f165876b;
        int i2 = oir0Var.f165878d;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                oir0Var.f165875a = (qe70) eh00Var;
                oir0Var.f165878d = 1;
                hqb hqbVar = new hqb(1, seg1.m77914f(oir0Var));
                hqbVar.m48222q();
                eh00Var = eh00Var;
                if (hqbVar.m48221p() == yuk.f276404a) {
                    return;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eh00 eh00Var2 = (eh00) oir0Var.f165875a;
                bga.m29073P(obj);
                eh00Var = eh00Var2;
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            eh00Var.invoke();
            throw th;
        }
    }

    @Override // p204p.rv41
    public final Object getValue() {
        return this.f178006a.getValue();
    }

    @Override // p204p.kqi0
    /* JADX INFO: renamed from: h */
    public final gh00 mo57113h() {
        return this.f178006a.mo57113h();
    }

    @Override // p204p.kqi0
    /* JADX INFO: renamed from: l */
    public final Object mo57114l() {
        return this.f178006a.mo57114l();
    }

    @Override // p204p.kqi0
    public final void setValue(Object obj) {
        this.f178006a.setValue(obj);
    }
}
