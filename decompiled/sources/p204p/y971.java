package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class y971 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ niz f270525a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f270526b;

    public y971(niz nizVar, long j) {
        this.f270525a = nizVar;
        this.f270526b = j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        x971 x971Var;
        if (fbkVar instanceof x971) {
            x971Var = (x971) fbkVar;
            int i = x971Var.f259292b;
            if ((i & Integer.MIN_VALUE) != 0) {
                x971Var.f259292b = i - Integer.MIN_VALUE;
            } else {
                x971Var = new x971(this, fbkVar);
            }
        } else {
            x971Var = new x971(this, fbkVar);
        }
        Object obj2 = x971Var.f259291a;
        int i2 = x971Var.f259292b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            ncd1 ncd1Var = (ncd1) obj;
            boolean z = ncd1Var instanceof lcd1;
            long jM75432b = this.f270526b;
            if (z) {
                Integer num = ((lcd1) ncd1Var).f131908a.f134516b;
                if (num != null) {
                    jM75432b = rfg1.m75432b(num.intValue());
                }
            } else if (!(ncd1Var instanceof mcd1)) {
                throw new NoWhenBranchMatchedException();
            }
            n6f n6fVar = new n6f(jM75432b);
            x971Var.f259292b = 1;
            Object objEmit = this.f270525a.emit(n6fVar, x971Var);
            yuk yukVar = yuk.f276404a;
            if (objEmit == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj2);
        }
        return w2a1.f247311a;
    }
}
