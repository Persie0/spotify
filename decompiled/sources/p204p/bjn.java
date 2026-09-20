package p204p;

import io.reactivex.rxjava3.core.Flowable;

/* JADX INFO: loaded from: classes8.dex */
public final class bjn {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f27721a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h4t0 f27722b;

    public /* synthetic */ bjn(h4t0 h4t0Var, int i) {
        this.f27721a = i;
        this.f27722b = h4t0Var;
    }

    /* JADX INFO: renamed from: a */
    public final omb1 m29484a(lt0 lt0Var) {
        switch (this.f27721a) {
            case 0:
                son sonVar = ((phn) this.f27722b).f177688b;
                return new omb1((luk) sonVar.f211486K2.get(), lt0Var, (Flowable) sonVar.f211306D4.get());
            case 1:
                son sonVar2 = ((vfn) this.f27722b).f241004b;
                return new omb1((luk) sonVar2.f211486K2.get(), lt0Var, (Flowable) sonVar2.f211306D4.get());
            default:
                son sonVar3 = ((vfn) this.f27722b).f241004b;
                return new omb1((luk) sonVar3.f211486K2.get(), lt0Var, (Flowable) sonVar3.f211306D4.get());
        }
    }
}
