package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ma01 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f141423a;

    /* JADX INFO: renamed from: b */
    public int f141424b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f141425c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma01(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f141425c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f141423a = obj;
        this.f141424b |= Integer.MIN_VALUE;
        return this.f141425c.emit(null, this);
    }
}
