package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class c240 extends mb61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33288a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h240 f33289b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c240(h240 h240Var, fbk fbkVar, int i) {
        super(2, fbkVar);
        this.f33288a = i;
        this.f33289b = h240Var;
    }

    @Override // p204p.ly8
    public final fbk create(Object obj, fbk fbkVar) {
        switch (this.f33288a) {
            case 0:
                return new c240(this.f33289b, fbkVar, 0);
            case 1:
                return new c240(this.f33289b, fbkVar, 1);
            default:
                return new c240(this.f33289b, fbkVar, 2);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        xuk xukVar = (xuk) obj;
        fbk fbkVar = (fbk) obj2;
        switch (this.f33288a) {
            case 0:
                c240 c240Var = (c240) create(xukVar, fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                c240Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            case 1:
                c240 c240Var2 = (c240) create(xukVar, fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                c240Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
            default:
                c240 c240Var3 = (c240) create(xukVar, fbkVar);
                w2a1 w2a1Var3 = w2a1.f247311a;
                c240Var3.invokeSuspend(w2a1Var3);
                return w2a1Var3;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f33288a) {
            case 0:
                bga.m29073P(obj);
                Iterator it = this.f33289b.f86885b.iterator();
                while (it.hasNext()) {
                    ((a240) it.next()).mo24492c();
                }
                break;
            case 1:
                bga.m29073P(obj);
                Iterator it2 = this.f33289b.f86885b.iterator();
                while (it2.hasNext()) {
                    ((a240) it2.next()).mo24496g();
                }
                break;
            default:
                bga.m29073P(obj);
                Iterator it3 = this.f33289b.f86885b.iterator();
                while (it3.hasNext()) {
                    ((a240) it3.next()).mo24495f();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
