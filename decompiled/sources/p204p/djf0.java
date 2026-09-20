package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class djf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f49681a;

    /* JADX INFO: renamed from: b */
    public int f49682b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f49683c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djf0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f49683c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f49681a = obj;
        this.f49682b |= Integer.MIN_VALUE;
        return this.f49683c.emit(null, this);
    }
}
