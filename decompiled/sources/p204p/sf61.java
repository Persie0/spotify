package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class sf61 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f208480a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uf61 f208481b;

    /* JADX INFO: renamed from: c */
    public int f208482c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf61(uf61 uf61Var, fbk fbkVar) {
        super(fbkVar);
        this.f208481b = uf61Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f208480a = obj;
        this.f208482c |= Integer.MIN_VALUE;
        return this.f208481b.invoke(this);
    }
}
