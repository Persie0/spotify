package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class q560 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f185411a;

    /* JADX INFO: renamed from: b */
    public int f185412b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f185413c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q560(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f185413c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f185411a = obj;
        this.f185412b |= Integer.MIN_VALUE;
        return this.f185413c.emit(null, this);
    }
}
