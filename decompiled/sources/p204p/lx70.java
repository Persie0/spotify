package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class lx70 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f137748a;

    /* JADX INFO: renamed from: b */
    public int f137749b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x360 f137750c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lx70(x360 x360Var, fbk fbkVar) {
        super(fbkVar);
        this.f137750c = x360Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f137748a = obj;
        this.f137749b |= Integer.MIN_VALUE;
        return this.f137750c.emit(null, this);
    }
}
