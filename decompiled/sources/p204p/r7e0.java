package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class r7e0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f196504a;

    /* JADX INFO: renamed from: b */
    public int f196505b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqd0 f196506c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7e0(yqd0 yqd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f196506c = yqd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f196504a = obj;
        this.f196505b |= Integer.MIN_VALUE;
        return this.f196506c.emit(null, this);
    }
}
