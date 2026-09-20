package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ci91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f38258a;

    /* JADX INFO: renamed from: b */
    public int f38259b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ di91 f38260c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci91(di91 di91Var, fbk fbkVar) {
        super(fbkVar);
        this.f38260c = di91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f38258a = obj;
        this.f38259b |= Integer.MIN_VALUE;
        return this.f38260c.emit(null, this);
    }
}
