package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class s2e1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f204996a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t2e1 f204997b;

    /* JADX INFO: renamed from: c */
    public int f204998c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2e1(t2e1 t2e1Var, fbk fbkVar) {
        super(fbkVar);
        this.f204997b = t2e1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f204996a = obj;
        this.f204998c |= Integer.MIN_VALUE;
        return this.f204997b.m79906b(null, this);
    }
}
