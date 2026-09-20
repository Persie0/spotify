package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class x2e1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f257456a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t2e1 f257457b;

    /* JADX INFO: renamed from: c */
    public int f257458c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2e1(t2e1 t2e1Var, fbk fbkVar) {
        super(fbkVar);
        this.f257457b = t2e1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f257456a = obj;
        this.f257458c |= Integer.MIN_VALUE;
        return this.f257457b.m79906b(null, this);
    }
}
