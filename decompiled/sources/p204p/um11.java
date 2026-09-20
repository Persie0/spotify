package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class um11 extends lg01 {

    /* JADX INFO: renamed from: a */
    public final om11 f231704a;

    /* JADX INFO: renamed from: b */
    public final hs01 f231705b;

    public um11(om11 om11Var) {
        this.f231704a = om11Var;
        this.f231705b = new hs01(((rm11) om11Var).f200414d, this, 7);
    }

    /* JADX INFO: renamed from: a */
    public static fd01 m83417a(a7x0 a7x0Var) {
        if (a7x0Var instanceof d6x0) {
            return new dd01(0, null);
        }
        if (a7x0Var instanceof m6x0) {
            return new ed01(Boolean.valueOf(((m6x0) a7x0Var).f140597a));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // p204p.lg01
    public final fiz getValue() {
        return this.f231705b;
    }

    @Override // p204p.lg01
    public final /* bridge */ /* synthetic */ Object setValue(Object obj, Object obj2, d850 d850Var, fbk fbkVar) {
        return setValue((Boolean) obj, ((Boolean) obj2).booleanValue(), d850Var, fbkVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object setValue(Boolean bool, boolean z, d850 d850Var, fbk fbkVar) {
        sm11 sm11Var;
        um11 um11Var;
        if (fbkVar instanceof sm11) {
            sm11Var = (sm11) fbkVar;
            int i = sm11Var.f210542d;
            if ((i & Integer.MIN_VALUE) != 0) {
                sm11Var.f210542d = i - Integer.MIN_VALUE;
            } else {
                sm11Var = new sm11(this, (ibk) fbkVar);
            }
        } else {
            sm11Var = new sm11(this, (ibk) fbkVar);
        }
        Object objM74344f = sm11Var.f210540b;
        int i2 = sm11Var.f210542d;
        if (i2 == 0) {
            bga.m29073P(objM74344f);
            sm11Var.f210539a = this;
            sm11Var.f210542d = 1;
            objM74344f = ((rm11) this.f231704a).f200413c.m74344f(z, sm11Var);
            yuk yukVar = yuk.f276404a;
            if (objM74344f == yukVar) {
                return yukVar;
            }
            um11Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            um11Var = sm11Var.f210539a;
            bga.m29073P(objM74344f);
        }
        um11Var.getClass();
        return m83417a((a7x0) objM74344f);
    }
}
