package p204p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class nj2 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f154421a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ck2 f154422b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nj2(ck2 ck2Var, int i) {
        super(1);
        this.f154421a = i;
        this.f154422b = ck2Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        Object value;
        vk40 uk40Var;
        switch (this.f154421a) {
            case 0:
                String str = (String) obj;
                zv41 zv41Var = this.f154422b.f38787z;
                do {
                    value = zv41Var.getValue();
                    uk40Var = (vk40) value;
                    uk40 uk40Var2 = uk40Var instanceof uk40 ? (uk40) uk40Var : null;
                    if (uk40Var2 != null) {
                        uk40Var = new uk40(uk40Var2.f231216a, uk40Var2.f231217b, str);
                    }
                } while (!zv41Var.m97089k(value, uk40Var));
                break;
            default:
                this.f154422b.f38748E = null;
                if (((Throwable) obj) instanceof CancellationException) {
                    this.f154422b.f38787z.m97090l(null);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
