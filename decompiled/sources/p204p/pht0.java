package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pht0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f177722a;

    /* JADX INFO: renamed from: b */
    public int f177723b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f177724c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pht0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f177724c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f177722a = obj;
        this.f177723b |= Integer.MIN_VALUE;
        return this.f177724c.emit(null, this);
    }
}
