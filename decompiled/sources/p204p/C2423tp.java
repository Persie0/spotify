package p204p;

import java.util.List;

/* JADX INFO: renamed from: p.tp */
/* JADX INFO: loaded from: classes18.dex */
public final class C2423tp implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f222372a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f222373b;

    public /* synthetic */ C2423tp(Object obj, int i) {
        this.f222372a = i;
        this.f222373b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        C2384sp c2384sp;
        switch (this.f222372a) {
            case 0:
                if (fbkVar instanceof C2384sp) {
                    c2384sp = (C2384sp) fbkVar;
                    int i = c2384sp.f212702b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c2384sp.f212702b = i - Integer.MIN_VALUE;
                    } else {
                        c2384sp = new C2384sp(this, fbkVar);
                    }
                } else {
                    c2384sp = new C2384sp(this, fbkVar);
                }
                Object obj2 = c2384sp.f212701a;
                yuk yukVar = yuk.f276404a;
                int i2 = c2384sp.f212702b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    niz nizVar = (niz) this.f222373b;
                    Object obj3 = ((bo40) obj).f29009b;
                    c2384sp.f212702b = 1;
                    if (nizVar.emit(obj3, c2384sp) == yukVar) {
                        return yukVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            default:
                ((C2585xr) this.f222373b).f265175l = Boolean.valueOf(!((List) obj).isEmpty());
                Boolean bool = ((C2585xr) this.f222373b).f265175l;
                return w2a1.f247311a;
        }
    }
}
