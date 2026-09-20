package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hx5 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f96138a;

    /* JADX INFO: renamed from: b */
    public int f96139b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f96140c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx5(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f96140c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f96138a = obj;
        this.f96139b |= Integer.MIN_VALUE;
        return this.f96140c.emit(null, this);
    }
}
