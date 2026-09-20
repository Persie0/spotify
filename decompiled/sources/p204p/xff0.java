package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xff0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f260953a;

    /* JADX INFO: renamed from: b */
    public int f260954b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqd0 f260955c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xff0(yqd0 yqd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f260955c = yqd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f260953a = obj;
        this.f260954b |= Integer.MIN_VALUE;
        return this.f260955c.emit(null, this);
    }
}
