package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class wxu extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gh00 f256104a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f256105b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxu(int i, gh00 gh00Var) {
        super(1);
        this.f256104a = gh00Var;
        this.f256105b = i;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        this.f256104a.invoke(new byr(this.f256105b, (uw70) obj));
        return w2a1.f247311a;
    }
}
