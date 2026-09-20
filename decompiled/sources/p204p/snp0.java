package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class snp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f210978a;

    /* JADX INFO: renamed from: b */
    public int f210979b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ndp0 f210980c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public snp0(ndp0 ndp0Var, fbk fbkVar) {
        super(fbkVar);
        this.f210980c = ndp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f210978a = obj;
        this.f210979b |= Integer.MIN_VALUE;
        return this.f210980c.emit(null, this);
    }
}
