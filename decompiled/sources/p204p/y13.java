package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class y13 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f268164a;

    /* JADX INFO: renamed from: b */
    public int f268165b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n03 f268166c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y13(n03 n03Var, fbk fbkVar) {
        super(fbkVar);
        this.f268166c = n03Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f268164a = obj;
        this.f268165b |= Integer.MIN_VALUE;
        return this.f268166c.emit(null, this);
    }
}
