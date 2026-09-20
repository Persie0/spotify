package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class ruk0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f202870a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ z43 f202871b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ruk0(z43 z43Var, int i) {
        super(1);
        this.f202870a = i;
        this.f202871b = z43Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f202870a) {
            case 0:
                z43 z43Var = this.f202871b;
                return new guk0(((vml) z43Var.f279104c).f242868a, (String) z43Var.f279105d);
            default:
                return Collections.singleton(((vml) this.f202871b.f279104c).f242868a);
        }
    }
}
