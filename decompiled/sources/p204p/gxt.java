package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class gxt extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f85329a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hxt f85330b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gxt(hxt hxtVar, int i) {
        super(1);
        this.f85329a = i;
        this.f85330b = hxtVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f85329a) {
            case 0:
                Throwable th = (Throwable) obj;
                hxt hxtVar = this.f85330b;
                Object obj2 = hxtVar.f96293f;
                u4l0 u4l0Var = hxtVar.f96308u;
                zuj0.m97047j(th, obj2, u4l0Var != null ? ((lvx0) ((m12) u4l0Var.f226773c).f138798d).getState() : null, hxtVar.f96288a.mo29380b());
                throw null;
            case 1:
                return this.f85330b.f96307t;
            case 2:
                return this.f85330b.f96307t;
            case 3:
                return this.f85330b.f96307t;
            default:
                return this.f85330b.f96307t;
        }
    }
}
