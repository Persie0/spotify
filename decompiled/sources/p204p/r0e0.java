package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class r0e0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f194474a;

    /* JADX INFO: renamed from: b */
    public int f194475b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqd0 f194476c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0e0(yqd0 yqd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f194476c = yqd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f194474a = obj;
        this.f194475b |= Integer.MIN_VALUE;
        return this.f194476c.emit(null, this);
    }
}
