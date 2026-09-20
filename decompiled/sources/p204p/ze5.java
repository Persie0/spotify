package p204p;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes3.dex */
public final class ze5 implements huk {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f281881a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sir0 f281882b;

    public ze5(AtomicReference atomicReference, sir0 sir0Var) {
        this.f281881a = atomicReference;
        this.f281882b = sir0Var;
    }

    @Override // p204p.juk
    /* JADX INFO: renamed from: B */
    public final huk mo26595B(iuk iukVar) {
        return cct.m32323v(this, iukVar);
    }

    @Override // p204p.juk
    /* JADX INFO: renamed from: D */
    public final juk mo26596D(iuk iukVar) {
        return cct.m32326y(this, iukVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final void m95964b(th00 th00Var, ibk ibkVar) {
        ye5 ye5Var;
        if (ibkVar instanceof ye5) {
            ye5Var = (ye5) ibkVar;
            int i = ye5Var.f271922c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ye5Var.f271922c = i - Integer.MIN_VALUE;
            } else {
                ye5Var = new ye5(this, ibkVar);
            }
        } else {
            ye5Var = new ye5(this, ibkVar);
        }
        Object obj = ye5Var.f271920a;
        int i2 = ye5Var.f271922c;
        if (i2 == 0) {
            bga.m29073P(obj);
            ye5Var.f271922c = 1;
            hqb hqbVar = new hqb(1, seg1.m77914f(ye5Var));
            hqbVar.m48222q();
            sir0 sir0Var = this.f281882b;
            hqbVar.mo42415l(new xe5(sir0Var, 0));
            fqb fqbVar = (fqb) this.f281881a.getAndSet(hqbVar);
            if (fqbVar != null) {
                fqbVar.mo42416r(null);
            }
            sir0Var.mo30231j(th00Var);
            if (hqbVar.m48221p() == yuk.f276404a) {
                return;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // p204p.huk
    public iuk getKey() {
        return o5h1.f161978Q0;
    }

    @Override // p204p.juk
    /* JADX INFO: renamed from: o */
    public final Object mo26605o(Object obj, th00 th00Var) {
        return th00Var.invoke(obj, this);
    }

    @Override // p204p.juk
    /* JADX INFO: renamed from: y */
    public final juk mo26608y(juk jukVar) {
        return opo.m67570t(this, jukVar);
    }
}
