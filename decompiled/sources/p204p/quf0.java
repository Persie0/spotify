package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class quf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f192699a;

    /* JADX INFO: renamed from: b */
    public int f192700b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f192701c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public quf0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f192701c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f192699a = obj;
        this.f192700b |= Integer.MIN_VALUE;
        return this.f192701c.emit(null, this);
    }
}
