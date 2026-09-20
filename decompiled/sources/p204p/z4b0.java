package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class z4b0 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f279190a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f279191b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ykn f279192c;

    public /* synthetic */ z4b0(niz nizVar, ykn yknVar, int i) {
        this.f279190a = i;
        this.f279191b = nizVar;
        this.f279192c = yknVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0089  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        y4b0 y4b0Var;
        c5b0 c5b0Var;
        switch (this.f279190a) {
            case 0:
                if (fbkVar instanceof y4b0) {
                    y4b0Var = (y4b0) fbkVar;
                    int i = y4b0Var.f269114b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        y4b0Var.f269114b = i - Integer.MIN_VALUE;
                    } else {
                        y4b0Var = new y4b0(this, fbkVar);
                    }
                } else {
                    y4b0Var = new y4b0(this, fbkVar);
                }
                Object obj2 = y4b0Var.f269113a;
                int i2 = y4b0Var.f269114b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    pqm0 pqm0Var = (pqm0) obj;
                    List list = (List) pqm0Var.f180350a;
                    pqm0 pqm0Var2 = new pqm0(ykn.m93995k(this.f279192c, list), (pe01) pqm0Var.f180351b);
                    y4b0Var.f269114b = 1;
                    Object objEmit = this.f279191b.emit(pqm0Var2, y4b0Var);
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
            default:
                if (fbkVar instanceof c5b0) {
                    c5b0Var = (c5b0) fbkVar;
                    int i3 = c5b0Var.f34132b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        c5b0Var.f34132b = i3 - Integer.MIN_VALUE;
                    } else {
                        c5b0Var = new c5b0(this, fbkVar);
                    }
                } else {
                    c5b0Var = new c5b0(this, fbkVar);
                }
                Object obj3 = c5b0Var.f34131a;
                int i4 = c5b0Var.f34132b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    pqm0 pqm0Var3 = (pqm0) obj;
                    List list2 = (List) pqm0Var3.f180350a;
                    pe01 pe01Var = (pe01) pqm0Var3.f180351b;
                    api apiVarM93995k = ykn.m93995k(this.f279192c, list2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : list2) {
                        if (((api) obj4) != apiVarM93995k) {
                            arrayList.add(obj4);
                        }
                    }
                    pqm0 pqm0Var4 = new pqm0(arrayList, pe01Var);
                    c5b0Var.f34132b = 1;
                    Object objEmit2 = this.f279191b.emit(pqm0Var4, c5b0Var);
                    yuk yukVar2 = yuk.f276404a;
                    if (objEmit2 == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj3);
                }
                return w2a1.f247311a;
        }
    }
}
