package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bj51 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f27619a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dj51 f27620b;

    /* JADX INFO: renamed from: c */
    public int f27621c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj51(dj51 dj51Var, fbk fbkVar) {
        super(fbkVar);
        this.f27620b = dj51Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f27619a = obj;
        this.f27621c |= Integer.MIN_VALUE;
        return this.f27620b.m36169X(null, this);
    }
}
