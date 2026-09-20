package p204p;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class lv8 extends mb61 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f137258a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nv8 f137259b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lv8(nv8 nv8Var, fbk fbkVar, int i) {
        super(1, fbkVar);
        this.f137258a = i;
        this.f137259b = nv8Var;
    }

    @Override // p204p.ly8
    public final fbk create(fbk fbkVar) {
        switch (this.f137258a) {
            case 0:
                return new lv8(this.f137259b, fbkVar, 0);
            default:
                return new lv8(this.f137259b, fbkVar, 1);
        }
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        fbk fbkVar = (fbk) obj;
        switch (this.f137258a) {
            case 0:
                lv8 lv8Var = (lv8) create(fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                lv8Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            default:
                lv8 lv8Var2 = (lv8) create(fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                lv8Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f137258a) {
            case 0:
                bga.m29073P(obj);
                zv41 zv41Var = this.f137259b.f158837k;
                Boolean bool = Boolean.TRUE;
                zv41Var.getClass();
                zv41Var.m97091m(null, bool);
                break;
            default:
                bga.m29073P(obj);
                Iterator it = this.f137259b.f158836j.iterator();
                while (it.hasNext()) {
                    ((tf60) it.next()).mo26601e(null);
                }
                break;
        }
        return w2a1.f247311a;
    }
}
