package p204p;

import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class t201 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f216398a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ s301 f216399b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t201(s301 s301Var, int i) {
        super(0);
        this.f216398a = i;
        this.f216399b = s301Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        r301 r301Var;
        boolean z;
        switch (this.f216398a) {
            case 0:
                return Collections.singletonList(new lke(this.f216399b, 7));
            default:
                s301 s301Var = this.f216399b;
                synchronized (s301Var.f205150b) {
                    r301Var = s301Var.f205151c;
                }
                if (r301Var != null) {
                    s301 s301Var2 = this.f216399b;
                    synchronized (s301Var2.f205150b) {
                        z = r301Var.f195400c;
                    }
                    if (z) {
                        s301Var2.m77113a(r301Var, null, "Session UI host remains contaminated");
                    } else {
                        try {
                            u301 u301VarM85389b = r301Var.f195399b.m85389b();
                            if (!u301VarM85389b.equals(wjr0.f252021X)) {
                                if (!(u301VarM85389b instanceof t301)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                s301Var2.m77113a(r301Var, null, ((t301) u301VarM85389b).f216685a);
                            }
                        } catch (Exception e) {
                            s301Var2.m77113a(r301Var, e, "Session UI teardown failed");
                        }
                    }
                }
                return w2a1.f247311a;
        }
    }
}
