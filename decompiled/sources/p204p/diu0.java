package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class diu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f49488a;

    /* JADX INFO: renamed from: b */
    public int f49489b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sn2 f49490c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public diu0(sn2 sn2Var, fbk fbkVar) {
        super(fbkVar);
        this.f49490c = sn2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f49488a = obj;
        this.f49489b |= Integer.MIN_VALUE;
        return this.f49490c.emit(null, this);
    }
}
