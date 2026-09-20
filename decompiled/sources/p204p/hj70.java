package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hj70 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f91976a;

    /* JADX INFO: renamed from: b */
    public int f91977b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f91978c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj70(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f91978c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f91976a = obj;
        this.f91977b |= Integer.MIN_VALUE;
        return this.f91978c.emit(null, this);
    }
}
