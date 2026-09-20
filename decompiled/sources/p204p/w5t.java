package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class w5t extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f248194a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ p5t f248195b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w5t(p5t p5tVar, int i) {
        super(1);
        this.f248194a = i;
        this.f248195b = p5tVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f248194a) {
            case 0:
                this.f248195b.accept(new i5t((String) obj));
                return w2a1.f247311a;
            default:
                v670 v670Var = (v670) obj;
                boolean z = v670Var instanceof u670;
                p5t p5tVar = this.f248195b;
                if (z) {
                    p5tVar.accept(new f5t(((u670) v670Var).f227235a));
                } else {
                    if (!(v670Var instanceof t670)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    t670 t670Var = (t670) v670Var;
                    p5tVar.accept(new e5t(new aa8(t670Var.f217459a, t670Var.f217460b)));
                }
                return w2a1.f247311a;
        }
    }
}
