package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ywo0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f277017a;

    /* JADX INFO: renamed from: b */
    public int f277018b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pvn0 f277019c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ywo0(pvn0 pvn0Var, fbk fbkVar) {
        super(fbkVar);
        this.f277019c = pvn0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f277017a = obj;
        this.f277018b |= Integer.MIN_VALUE;
        return this.f277019c.emit(null, this);
    }
}
