package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rd61 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f198050a;

    public /* synthetic */ rd61(int i) {
        this.f198050a = i;
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f198050a) {
            case 0:
                return (td61) ((sd61) obj2).f207902a.f191969g.getValue();
            case 1:
                return Integer.valueOf(((h6d0) obj).mo39622u(((Integer) obj2).intValue()));
            case 2:
                return Integer.valueOf(((h6d0) obj).mo39623w(((Integer) obj2).intValue()));
            case 3:
                return Integer.valueOf(((h6d0) obj).mo39621l(((Integer) obj2).intValue()));
            case 4:
                return Integer.valueOf(((h6d0) obj).mo39620d(((Integer) obj2).intValue()));
            case 5:
                c871 c871Var = (c871) obj2;
                return h6f.m46715L(Float.valueOf(c871Var.f35131a.m84031v()), Boolean.valueOf(((vvl0) c871Var.f35136f.getValue()) == vvl0.f245248a));
            case 6:
                huk hukVar = (huk) obj2;
                if (!(hukVar instanceof pg71)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? hukVar : Integer.valueOf(iIntValue + 1);
            case 7:
                pg71 pg71Var = (pg71) obj;
                huk hukVar2 = (huk) obj2;
                if (pg71Var != null) {
                    return pg71Var;
                }
                if (hukVar2 instanceof pg71) {
                    return (pg71) hukVar2;
                }
                return null;
            case 8:
                xg71 xg71Var = (xg71) obj;
                huk hukVar3 = (huk) obj2;
                if (hukVar3 instanceof pg71) {
                    pg71 pg71Var2 = (pg71) hukVar3;
                    Object objMo69866G = pg71Var2.mo69866G(xg71Var.f261235a);
                    Object[] objArr = xg71Var.f261236b;
                    int i = xg71Var.f261238d;
                    objArr[i] = objMo69866G;
                    pg71[] pg71VarArr = xg71Var.f261237c;
                    xg71Var.f261238d = i + 1;
                    pg71VarArr[i] = pg71Var2;
                }
                return xg71Var;
            default:
                c581 c581Var = (c581) obj2;
                return h6f.m46715L(Float.valueOf(c581Var.f34105a), Float.valueOf(c581Var.f34107c.m84031v()), Float.valueOf(c581Var.f34106b.m84031v()));
        }
    }
}
