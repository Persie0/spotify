package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class i13 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f97371a;

    /* JADX INFO: renamed from: b */
    public int f97372b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n03 f97373c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i13(n03 n03Var, fbk fbkVar) {
        super(fbkVar);
        this.f97373c = n03Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f97371a = obj;
        this.f97372b |= Integer.MIN_VALUE;
        return this.f97373c.emit(null, this);
    }
}
