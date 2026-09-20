package p204p;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class q190 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ niz f184269a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f184270b;

    public q190(niz nizVar, boolean z) {
        this.f184269a = nizVar;
        this.f184270b = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        p190 p190Var;
        if (fbkVar instanceof p190) {
            p190Var = (p190) fbkVar;
            int i = p190Var.f173008b;
            if ((i & Integer.MIN_VALUE) != 0) {
                p190Var.f173008b = i - Integer.MIN_VALUE;
            } else {
                p190Var = new p190(this, fbkVar);
            }
        } else {
            p190Var = new p190(this, fbkVar);
        }
        Object obj2 = p190Var.f173007a;
        int i2 = p190Var.f173008b;
        if (i2 == 0) {
            bga.m29073P(obj2);
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : (Set) obj) {
                nt80 nt80Var = (nt80) obj3;
                if (!(nt80Var instanceof kt80) || this.f184270b) {
                    if (!(nt80Var instanceof ys80)) {
                        arrayList.add(obj3);
                    }
                }
            }
            Set setM43736n1 = g6f.m43736n1(arrayList);
            p190Var.f173008b = 1;
            Object objEmit = this.f184269a.emit(setM43736n1, p190Var);
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
