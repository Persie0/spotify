package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class my9 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f148364a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ eh00 f148365b;

    public /* synthetic */ my9(int i, eh00 eh00Var) {
        this.f148364a = i;
        this.f148365b = eh00Var;
    }

    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        switch (this.f148364a) {
            case 0:
                if (((String) obj).length() > 0) {
                    this.f148365b.invoke();
                }
                break;
            case 1:
                ((Boolean) obj).booleanValue();
                this.f148365b.invoke();
                break;
            default:
                if (((b650) obj) instanceof wds) {
                    this.f148365b.invoke();
                }
                break;
        }
        return w2a1.f247311a;
    }
}
