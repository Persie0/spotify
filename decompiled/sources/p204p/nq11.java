package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class nq11 extends lg01 {

    /* JADX INFO: renamed from: a */
    public final gq11 f157104a;

    /* JADX INFO: renamed from: b */
    public final hs01 f157105b;

    public nq11(gq11 gq11Var) {
        this.f157104a = gq11Var;
        this.f157105b = new hs01(((jq11) gq11Var).f114768d, this, 8);
    }

    /* JADX INFO: renamed from: a */
    public static fd01 m65376a(a7x0 a7x0Var) {
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
        return this.f157105b;
    }

    @Override // p204p.lg01
    public final /* bridge */ /* synthetic */ Object setValue(Object obj, Object obj2, d850 d850Var, fbk fbkVar) {
        return setValue((Boolean) obj, ((Boolean) obj2).booleanValue(), d850Var, fbkVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object setValue(Boolean bool, boolean z, d850 d850Var, fbk fbkVar) {
        lq11 lq11Var;
        nq11 nq11Var;
        if (fbkVar instanceof lq11) {
            lq11Var = (lq11) fbkVar;
            int i = lq11Var.f135932d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lq11Var.f135932d = i - Integer.MIN_VALUE;
            } else {
                lq11Var = new lq11(this, (ibk) fbkVar);
            }
        } else {
            lq11Var = new lq11(this, (ibk) fbkVar);
        }
        Object objM74344f = lq11Var.f135930b;
        int i2 = lq11Var.f135932d;
        if (i2 == 0) {
            bga.m29073P(objM74344f);
            lq11Var.f135929a = this;
            lq11Var.f135932d = 1;
            objM74344f = ((jq11) this.f157104a).f114767c.m74344f(z, lq11Var);
            yuk yukVar = yuk.f276404a;
            if (objM74344f == yukVar) {
                return yukVar;
            }
            nq11Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nq11Var = lq11Var.f135929a;
            bga.m29073P(objM74344f);
        }
        nq11Var.getClass();
        return m65376a((a7x0) objM74344f);
    }
}
