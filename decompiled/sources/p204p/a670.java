package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class a670 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f12705a;

    /* JADX INFO: renamed from: b */
    public int f12706b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f12707c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a670(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f12707c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f12705a = obj;
        this.f12706b |= Integer.MIN_VALUE;
        return this.f12707c.emit(null, this);
    }
}
