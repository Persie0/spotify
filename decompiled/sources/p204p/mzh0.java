package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mzh0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f148713a;

    /* JADX INFO: renamed from: b */
    public int f148714b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f148715c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mzh0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f148715c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f148713a = obj;
        this.f148714b |= Integer.MIN_VALUE;
        return this.f148715c.emit(null, this);
    }
}
