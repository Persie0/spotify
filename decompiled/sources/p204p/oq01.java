package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class oq01 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f168048a;

    /* JADX INFO: renamed from: b */
    public int f168049b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f168050c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oq01(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f168050c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f168048a = obj;
        this.f168049b |= Integer.MIN_VALUE;
        return this.f168050c.emit(null, this);
    }
}
