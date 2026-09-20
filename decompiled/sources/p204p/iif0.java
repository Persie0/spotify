package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class iif0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f102554a;

    /* JADX INFO: renamed from: b */
    public int f102555b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqd0 f102556c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iif0(yqd0 yqd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f102556c = yqd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f102554a = obj;
        this.f102555b |= Integer.MIN_VALUE;
        return this.f102556c.emit(null, this);
    }
}
