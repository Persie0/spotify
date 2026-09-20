package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class jst implements vic1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f115551a;

    /* JADX INFO: renamed from: b */
    public final Object f115552b;

    public /* synthetic */ jst(Object obj, int i) {
        this.f115551a = i;
        this.f115552b = obj;
    }

    @Override // p204p.vic1
    /* JADX INFO: renamed from: b */
    public final mic1 mo24736b(Class cls) {
        switch (this.f115551a) {
            case 0:
                if (cls.equals(ist.class)) {
                    return (mic1) ((wfn) this.f115552b).get();
                }
                throw new IllegalArgumentException(dq60.m36610j(cls, "unsupported view model class: "));
            case 1:
                return new z8x0((t7j) this.f115552b);
            case 2:
                Object obj = ((i4t0) this.f115552b).get();
                mic1 mic1Var = obj instanceof mic1 ? (mic1) obj : null;
                if (mic1Var != null) {
                    return mic1Var;
                }
                ytg1.m94635z();
                throw null;
            default:
                return (mic1) ((zic1) this.f115552b).f283130a.invoke();
        }
    }
}
