package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class pw00 implements niz, gi00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f181872a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ th00 f181873b;

    public /* synthetic */ pw00(int i, th00 th00Var) {
        this.f181872a = i;
        this.f181873b = th00Var;
    }

    @Override // p204p.niz
    public final /* synthetic */ Object emit(Object obj, fbk fbkVar) {
        switch (this.f181872a) {
            case 0:
                break;
        }
        return this.f181873b.invoke(obj, fbkVar);
    }

    public final boolean equals(Object obj) {
        switch (this.f181872a) {
            case 0:
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
        switch (this.f181872a) {
            case 0:
                break;
        }
        return this.f181873b;
    }

    public final int hashCode() {
        switch (this.f181872a) {
            case 0:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
