package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class at0 implements niz, gi00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f19538a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ niz f19539b;

    public /* synthetic */ at0(niz nizVar, int i) {
        this.f19538a = i;
        this.f19539b = nizVar;
    }

    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        switch (this.f19538a) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                Object objEmit = this.f19539b.emit(bool, fbkVar);
                return objEmit == yuk.f276404a ? objEmit : w2a1.f247311a;
            case 1:
                Object objEmit2 = this.f19539b.emit((w2a1) obj, fbkVar);
                return objEmit2 == yuk.f276404a ? objEmit2 : w2a1.f247311a;
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                Object objEmit3 = this.f19539b.emit(bool2, fbkVar);
                return objEmit3 == yuk.f276404a ? objEmit3 : w2a1.f247311a;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f19538a) {
            case 0:
                if ((obj instanceof niz) && (obj instanceof gi00)) {
                    return wj50.m88271j(getFunctionDelegate(), ((gi00) obj).getFunctionDelegate());
                }
                return false;
            case 1:
                if ((obj instanceof niz) && (obj instanceof gi00)) {
                    return wj50.m88271j(getFunctionDelegate(), ((gi00) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof niz) && (obj instanceof gi00)) {
                    return wj50.m88271j(getFunctionDelegate(), ((gi00) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    @Override // p204p.gi00
    public final ai00 getFunctionDelegate() {
        switch (this.f19538a) {
            case 0:
                break;
            case 1:
                break;
        }
        return new ri00(2, this.f19539b, niz.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0);
    }

    public final int hashCode() {
        switch (this.f19538a) {
            case 0:
                break;
            case 1:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
