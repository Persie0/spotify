package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class c5b0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f34131a;

    /* JADX INFO: renamed from: b */
    public int f34132b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ z4b0 f34133c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5b0(z4b0 z4b0Var, fbk fbkVar) {
        super(fbkVar);
        this.f34133c = z4b0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f34131a = obj;
        this.f34132b |= Integer.MIN_VALUE;
        return this.f34133c.emit(null, this);
    }
}
