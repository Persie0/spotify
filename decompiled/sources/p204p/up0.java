package p204p;

import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public final class up0 {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f232546a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final c9k f232547b;

    public up0(luk lukVar) {
        this.f232547b = AbstractC0000a.m16o(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m83640a(hrw hrwVar, boolean z, ibk ibkVar) {
        tp0 tp0Var;
        if (ibkVar instanceof tp0) {
            tp0Var = (tp0) ibkVar;
            int i = tp0Var.f222376c;
            if ((i & Integer.MIN_VALUE) != 0) {
                tp0Var.f222376c = i - Integer.MIN_VALUE;
            } else {
                tp0Var = new tp0(this, ibkVar);
            }
        } else {
            tp0Var = new tp0(this, ibkVar);
        }
        Object objM96567o = tp0Var.f222374a;
        int i2 = tp0Var.f222376c;
        w2a1 w2a1Var = w2a1.f247311a;
        if (i2 == 0) {
            bga.m29073P(objM96567o);
            if (z) {
                Single singleMo48412a = hrwVar.mo48412a(new u7p0("ads-playercontroller", false));
                tp0Var.f222376c = 1;
                objM96567o = zn91.m96567o(singleMo48412a, tp0Var);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            }
            return w2a1Var;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bga.m29073P(objM96567o);
        if (((lcf) objM96567o) instanceof icf) {
            this.f232546a.set(true);
        }
        return w2a1Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m83641b(p8p0 p8p0Var) {
        if (this.f232546a.getAndSet(false)) {
            x0h1.m89578u(this.f232547b, null, 0, new C1819em(p8p0Var, null, 4), 3);
        }
    }
}
