package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l6t extends vys0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f130474h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l6t(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.f130474h = i2;
    }

    @Override // p204p.lr60
    public final Object get() {
        switch (this.f130474h) {
            case 0:
                return ((c7t) this.f78014b).f34995N0;
            case 1:
                return ((c7t) this.f78014b).f34996O0;
            case 2:
                return ((c7t) this.f78014b).f34997P0;
            case 3:
                return ((c7t) this.f78014b).f34998Q0;
            case 4:
                return ((c7t) this.f78014b).f34999R0;
            case 5:
                return ((c7t) this.f78014b).f35000S0;
            case 6:
                return ((rv41) this.f78014b).getValue();
            case 7:
                return ((rv41) this.f78014b).getValue();
            case 8:
                return ((rv41) this.f78014b).getValue();
            case 9:
                return ((rv41) this.f78014b).getValue();
            case 10:
                return opo.m67555e(this.f78014b);
            case 11:
                return ((rv41) this.f78014b).getValue();
            case 12:
                return ((se41) this.f78014b).m77883a();
            case 13:
                return Boolean.valueOf(((lc01) this.f78014b).isEnabled());
            case 14:
                ((he01) this.f78014b).getClass();
                return Boolean.TRUE;
            case 15:
                return ((rv41) this.f78014b).getValue();
            default:
                return ((rv41) this.f78014b).getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6t(c7t c7tVar, int i) {
        super(c7tVar, c7t.class, "nameComponent", "getNameComponent()Lcom/spotify/encoreconsumermobile/component/Component;", 0);
        this.f130474h = i;
        switch (i) {
            case 1:
                super(c7tVar, c7t.class, "socialHandleComponent", "getSocialHandleComponent()Lcom/spotify/encoreconsumermobile/component/Component;", 0);
                break;
            case 2:
                super(c7tVar, c7t.class, "bioComponent", "getBioComponent()Lcom/spotify/encoreconsumermobile/component/Component;", 0);
                break;
            case 3:
                super(c7tVar, c7t.class, "kidNameComponent", "getKidNameComponent()Lcom/spotify/encoreconsumermobile/component/Component;", 0);
                break;
            case 4:
                super(c7tVar, c7t.class, "pronounsComponent", "getPronounsComponent()Lcom/spotify/encoreconsumermobile/component/Component;", 0);
                break;
            case 5:
                super(c7tVar, c7t.class, "locationComponent", "getLocationComponent()Lcom/spotify/encoreconsumermobile/component/Component;", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6t(ena0 ena0Var) {
        super(ena0Var, opo.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        this.f130474h = 10;
    }
}
