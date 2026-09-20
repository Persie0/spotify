package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class e5v0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f56478a;

    /* JADX INFO: renamed from: b */
    public int f56479b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jcu0 f56480c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5v0(jcu0 jcu0Var, fbk fbkVar) {
        super(fbkVar);
        this.f56480c = jcu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f56478a = obj;
        this.f56479b |= Integer.MIN_VALUE;
        return this.f56480c.emit(null, this);
    }
}
