package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cj51 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f38511a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dj51 f38512b;

    /* JADX INFO: renamed from: c */
    public int f38513c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cj51(dj51 dj51Var, fbk fbkVar) {
        super(fbkVar);
        this.f38512b = dj51Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f38511a = obj;
        this.f38513c |= Integer.MIN_VALUE;
        return this.f38512b.m36170Y(null, this);
    }
}
