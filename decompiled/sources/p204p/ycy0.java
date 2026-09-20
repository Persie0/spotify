package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ycy0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f271596a;

    /* JADX INFO: renamed from: b */
    public int f271597b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvv0 f271598c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ycy0(bvv0 bvv0Var, fbk fbkVar) {
        super(fbkVar);
        this.f271598c = bvv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f271596a = obj;
        this.f271597b |= Integer.MIN_VALUE;
        return this.f271598c.emit(null, this);
    }
}
