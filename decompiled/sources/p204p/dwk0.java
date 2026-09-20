package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dwk0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f53719a;

    /* JADX INFO: renamed from: b */
    public int f53720b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f53721c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwk0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f53721c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f53719a = obj;
        this.f53720b |= Integer.MIN_VALUE;
        return this.f53721c.emit(null, this);
    }
}
