package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bit0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f27546a;

    /* JADX INFO: renamed from: b */
    public int f27547b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f27548c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bit0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f27548c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f27546a = obj;
        this.f27547b |= Integer.MIN_VALUE;
        return this.f27548c.emit(null, this);
    }
}
