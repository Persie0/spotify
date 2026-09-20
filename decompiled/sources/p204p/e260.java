package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e260 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f55367a;

    /* JADX INFO: renamed from: b */
    public int f55368b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wk8 f55369c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e260(wk8 wk8Var, fbk fbkVar) {
        super(fbkVar);
        this.f55369c = wk8Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f55367a = obj;
        this.f55368b |= Integer.MIN_VALUE;
        return this.f55369c.emit(null, this);
    }
}
