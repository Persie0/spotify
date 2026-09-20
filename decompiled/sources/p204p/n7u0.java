package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n7u0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f151219a;

    /* JADX INFO: renamed from: b */
    public int f151220b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f151221c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7u0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f151221c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f151219a = obj;
        this.f151220b |= Integer.MIN_VALUE;
        return this.f151221c.emit(null, this);
    }
}
