package p204p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableElementAtMaybe;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatMapCompletable;

/* JADX INFO: loaded from: classes7.dex */
public final class djb1 extends mb61 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49645a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hjb1 f49646b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ djb1(hjb1 hjb1Var, fbk fbkVar, int i) {
        super(1, fbkVar);
        this.f49645a = i;
        this.f49646b = hjb1Var;
    }

    @Override // p204p.ly8
    public final fbk create(fbk fbkVar) {
        switch (this.f49645a) {
            case 0:
                return new djb1(this.f49646b, fbkVar, 0);
            case 1:
                return new djb1(this.f49646b, fbkVar, 1);
            case 2:
                return new djb1(this.f49646b, fbkVar, 2);
            case 3:
                return new djb1(this.f49646b, fbkVar, 3);
            default:
                return new djb1(this.f49646b, fbkVar, 4);
        }
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        fbk fbkVar = (fbk) obj;
        switch (this.f49645a) {
            case 0:
                djb1 djb1Var = (djb1) create(fbkVar);
                w2a1 w2a1Var = w2a1.f247311a;
                djb1Var.invokeSuspend(w2a1Var);
                return w2a1Var;
            case 1:
                djb1 djb1Var2 = (djb1) create(fbkVar);
                w2a1 w2a1Var2 = w2a1.f247311a;
                djb1Var2.invokeSuspend(w2a1Var2);
                return w2a1Var2;
            case 2:
                djb1 djb1Var3 = (djb1) create(fbkVar);
                w2a1 w2a1Var3 = w2a1.f247311a;
                djb1Var3.invokeSuspend(w2a1Var3);
                return w2a1Var3;
            case 3:
                djb1 djb1Var4 = (djb1) create(fbkVar);
                w2a1 w2a1Var4 = w2a1.f247311a;
                djb1Var4.invokeSuspend(w2a1Var4);
                return w2a1Var4;
            default:
                djb1 djb1Var5 = (djb1) create(fbkVar);
                w2a1 w2a1Var5 = w2a1.f247311a;
                djb1Var5.invokeSuspend(w2a1Var5);
                return w2a1Var5;
        }
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        switch (this.f49645a) {
            case 0:
                bga.m29073P(obj);
                hjb1 hjb1Var = this.f49646b;
                pa9 pa9Var = (pa9) hjb1Var.f92022d.f257250e;
                if (pa9Var != null) {
                    pa9Var.m69449o(true);
                }
                hjb1Var.f92016X.m35154a(new pqm0("muted", Boolean.TRUE));
                break;
            case 1:
                bga.m29073P(obj);
                hjb1 hjb1Var2 = this.f49646b;
                pa9 pa9Var2 = (pa9) hjb1Var2.f92022d.f257250e;
                if (pa9Var2 != null) {
                    pa9Var2.m69449o(false);
                }
                hjb1Var2.f92016X.m35154a(new pqm0("muted", Boolean.FALSE));
                break;
            case 2:
                bga.m29073P(obj);
                pa9 pa9Var3 = (pa9) this.f49646b.f92022d.f257250e;
                if (pa9Var3 != null) {
                    pa9Var3.m69447l();
                }
                break;
            case 3:
                bga.m29073P(obj);
                pa9 pa9Var4 = (pa9) this.f49646b.f92022d.f257250e;
                if (pa9Var4 != null) {
                    pa9Var4.m69441f();
                }
                break;
            default:
                bga.m29073P(obj);
                d2j0 d2j0Var = this.f49646b.f92021c;
                new MaybeFlatMapCompletable(new FlowableElementAtMaybe(((Flowable) d2j0Var.f44572b).m23348j(d3v.f45011Y)), new m8p0(d2j0Var, 0)).m23296h(cz31.f43443T0).m23299p(Functions.f7232h).subscribe();
                break;
        }
        return w2a1.f247311a;
    }
}
