package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class g4p extends mb61 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f76451a = 1;

    /* JADX INFO: renamed from: b */
    public int f76452b;

    /* JADX INFO: renamed from: c */
    public String f76453c;

    /* JADX INFO: renamed from: d */
    public Object f76454d;

    /* JADX INFO: renamed from: e */
    public Object f76455e;

    /* JADX INFO: renamed from: f */
    public Object f76456f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f76457g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f76458h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4p(k4p k4pVar, boc bocVar, fbk fbkVar) {
        super(1, fbkVar);
        this.f76457g = k4pVar;
        this.f76458h = bocVar;
    }

    @Override // p204p.ly8
    public final fbk create(fbk fbkVar) {
        switch (this.f76451a) {
            case 0:
                return new g4p((k4p) this.f76457g, (boc) this.f76458h, fbkVar);
            default:
                return new g4p((c3e1) this.f76454d, (z3l0) this.f76455e, this.f76453c, (n95) this.f76456f, (djs0) this.f76457g, (rwt0) this.f76458h, fbkVar);
        }
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        fbk fbkVar = (fbk) obj;
        switch (this.f76451a) {
            case 0:
                break;
        }
        return ((g4p) create(fbkVar)).invokeSuspend(w2a1.f247311a);
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        pzs0 pzs0Var;
        oqc oqcVar;
        pgo pgoVar;
        String str;
        switch (this.f76451a) {
            case 0:
                int i = this.f76452b;
                yuk yukVar = yuk.f276404a;
                if (i != 0) {
                    if (i == 1) {
                        String str2 = this.f76453c;
                        pzs0Var = (pzs0) this.f76456f;
                        pgo pgoVar2 = (pgo) this.f76455e;
                        oqc oqcVar2 = (oqc) this.f76454d;
                        bga.m29073P(obj);
                        str = str2;
                        oqcVar = oqcVar2;
                        pgoVar = pgoVar2;
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bga.m29073P(obj);
                    }
                    return w2a1.f247311a;
                }
                bga.m29073P(obj);
                k4p k4pVar = (k4p) this.f76457g;
                oqc oqcVar3 = k4pVar.f119284g;
                pgo pgoVar3 = k4pVar.f119281d;
                pzs0 pzs0Var2 = k4pVar.f119285h;
                String str3 = k4pVar.f119282e;
                String str4 = ((boc) this.f76458h).f29065a;
                this.f76454d = oqcVar3;
                this.f76455e = pgoVar3;
                this.f76456f = pzs0Var2;
                this.f76453c = str3;
                this.f76452b = 1;
                obj = k4p.m55404b(k4pVar, str4, this);
                if (obj == yukVar) {
                    return yukVar;
                }
                pzs0Var = pzs0Var2;
                oqcVar = oqcVar3;
                pgoVar = pgoVar3;
                str = str3;
                this.f76454d = null;
                this.f76455e = null;
                this.f76456f = null;
                this.f76453c = null;
                this.f76452b = 2;
                if (oqcVar.m67629f(pgoVar, pzs0Var, str, (List) obj, this) == yukVar) {
                    return yukVar;
                }
                return w2a1.f247311a;
            default:
                int i2 = this.f76452b;
                if (i2 == 0) {
                    bga.m29073P(obj);
                    String str5 = ((c3e1) this.f76454d).f33664a;
                    z3l0 z3l0Var = (z3l0) this.f76455e;
                    p0m p0mVar = new p0m(str5, z3l0Var.f278978a, z3l0Var.f278979b);
                    String str6 = this.f76453c;
                    wj50.m88279p(str6);
                    n95 n95Var = (n95) this.f76456f;
                    djs0 djs0Var = (djs0) this.f76457g;
                    rwt0 rwt0Var = (rwt0) this.f76458h;
                    this.f76452b = 1;
                    Object objM28395a = b7s.m28395a(p0mVar, str6, n95Var, djs0Var, rwt0Var, this);
                    yuk yukVar2 = yuk.f276404a;
                    if (objM28395a == yukVar2) {
                        return yukVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bga.m29073P(obj);
                }
                return w2a1.f247311a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4p(c3e1 c3e1Var, z3l0 z3l0Var, String str, n95 n95Var, djs0 djs0Var, rwt0 rwt0Var, fbk fbkVar) {
        super(1, fbkVar);
        this.f76454d = c3e1Var;
        this.f76455e = z3l0Var;
        this.f76453c = str;
        this.f76456f = n95Var;
        this.f76457g = djs0Var;
        this.f76458h = rwt0Var;
    }
}
