package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vm60 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f242711a;

    /* JADX INFO: renamed from: b */
    public int f242712b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f242713c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm60(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f242713c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f242711a = obj;
        this.f242712b |= Integer.MIN_VALUE;
        return this.f242713c.emit(null, this);
    }
}
