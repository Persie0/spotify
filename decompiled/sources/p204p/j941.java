package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class j941 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f110090a;

    /* JADX INFO: renamed from: b */
    public int f110091b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b941 f110092c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j941(b941 b941Var, fbk fbkVar) {
        super(fbkVar);
        this.f110092c = b941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f110090a = obj;
        this.f110091b |= Integer.MIN_VALUE;
        return this.f110092c.emit(null, this);
    }
}
