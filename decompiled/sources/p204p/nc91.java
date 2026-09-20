package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class nc91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f152478a;

    /* JADX INFO: renamed from: b */
    public int f152479b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ud71 f152480c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc91(ud71 ud71Var, fbk fbkVar) {
        super(fbkVar);
        this.f152480c = ud71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f152478a = obj;
        this.f152479b |= Integer.MIN_VALUE;
        return this.f152480c.emit(null, this);
    }
}
