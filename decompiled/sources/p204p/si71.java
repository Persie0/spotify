package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class si71 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f209371a;

    /* JADX INFO: renamed from: b */
    public int f209372b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ud71 f209373c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si71(ud71 ud71Var, fbk fbkVar) {
        super(fbkVar);
        this.f209373c = ud71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f209371a = obj;
        this.f209372b |= Integer.MIN_VALUE;
        return this.f209373c.emit(null, this);
    }
}
