package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class m03 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f138493a;

    /* JADX INFO: renamed from: b */
    public int f138494b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n03 f138495c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m03(n03 n03Var, fbk fbkVar) {
        super(fbkVar);
        this.f138495c = n03Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f138493a = obj;
        this.f138494b |= Integer.MIN_VALUE;
        return this.f138495c.emit(null, this);
    }
}
