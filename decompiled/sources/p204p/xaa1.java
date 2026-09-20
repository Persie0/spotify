package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xaa1 implements niz {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f259637a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gh00 f259638b;

    public /* synthetic */ xaa1(int i, gh00 gh00Var) {
        this.f259637a = i;
        this.f259638b = gh00Var;
    }

    @Override // p204p.niz
    public final Object emit(Object obj, fbk fbkVar) {
        switch (this.f259637a) {
            case 0:
                this.f259638b.invoke(new jba1((String) obj));
                break;
            case 1:
                this.f259638b.invoke(new asa1((String) obj));
                break;
            case 2:
                this.f259638b.invoke((bib1) obj);
                break;
            case 3:
                this.f259638b.invoke((uvc1) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f259638b.invoke(bool);
                break;
        }
        return w2a1.f247311a;
    }
}
