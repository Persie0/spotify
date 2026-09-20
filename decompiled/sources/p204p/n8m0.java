package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n8m0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f151563a;

    /* JADX INFO: renamed from: b */
    public int f151564b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7m0 f151565c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8m0(i7m0 i7m0Var, fbk fbkVar) {
        super(fbkVar);
        this.f151565c = i7m0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f151563a = obj;
        this.f151564b |= Integer.MIN_VALUE;
        return this.f151565c.emit(null, this);
    }
}
