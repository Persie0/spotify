package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class veq implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f240784a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f240785b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hfq f240786c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ rui f240787d;

    public /* synthetic */ veq(niz nizVar, hfq hfqVar, rui ruiVar, int i) {
        this.f240784a = i;
        this.f240785b = nizVar;
        this.f240786c = hfqVar;
        this.f240787d = ruiVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        ueq ueqVar;
        yeq yeqVar;
        switch (this.f240784a) {
            case 0:
                if (fbkVar instanceof ueq) {
                    ueqVar = (ueq) fbkVar;
                    int i = ueqVar.f229580b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ueqVar.f229580b = i - Integer.MIN_VALUE;
                    } else {
                        ueqVar = new ueq(this, fbkVar);
                    }
                } else {
                    ueqVar = new ueq(this, fbkVar);
                }
                Object obj2 = ueqVar.f229579a;
                int i2 = ueqVar.f229580b;
                if (i2 == 0) {
                    bga.m29073P(obj2);
                    List list = (List) obj;
                    hfq hfqVar = this.f240786c;
                    rui ruiVar = this.f240787d;
                    rmx0 rmx0VarM47362g = hfqVar.m47362g(ruiVar, list);
                    if (rmx0VarM47362g == null) {
                        rmx0VarM47362g = hfqVar.m47363h(ruiVar, list);
                    }
                    pqm0 pqm0Var = rmx0VarM47362g != null ? new pqm0(rmx0VarM47362g, list) : null;
                    if (pqm0Var != null) {
                        ueqVar.f229580b = 1;
                        Object objEmit = this.f240785b.emit(pqm0Var, ueqVar);
                        yuk yukVar = yuk.f276404a;
                        if (objEmit == yukVar) {
                            return yukVar;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj2);
                }
                return w2a1.f247311a;
            default:
                if (fbkVar instanceof yeq) {
                    yeqVar = (yeq) fbkVar;
                    int i3 = yeqVar.f272034b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        yeqVar.f272034b = i3 - Integer.MIN_VALUE;
                    } else {
                        yeqVar = new yeq(this, fbkVar);
                    }
                } else {
                    yeqVar = new yeq(this, fbkVar);
                }
                Object obj3 = yeqVar.f272033a;
                int i4 = yeqVar.f272034b;
                if (i4 == 0) {
                    bga.m29073P(obj3);
                    List list2 = (List) obj;
                    rmx0 rmx0VarM47362g2 = this.f240786c.m47362g(this.f240787d, list2);
                    pqm0 pqm0Var2 = rmx0VarM47362g2 != null ? new pqm0(rmx0VarM47362g2, list2) : null;
                    if (pqm0Var2 != null) {
                        yeqVar.f272034b = 1;
                        Object objEmit2 = this.f240785b.emit(pqm0Var2, yeqVar);
                        yuk yukVar2 = yuk.f276404a;
                        if (objEmit2 == yukVar2) {
                            return yukVar2;
                        }
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
