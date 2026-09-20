package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rp41 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f201422a;

    /* JADX INFO: renamed from: b */
    public int f201423b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pp41 f201424c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp41(pp41 pp41Var, fbk fbkVar) {
        super(fbkVar);
        this.f201424c = pp41Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f201422a = obj;
        this.f201423b |= Integer.MIN_VALUE;
        return this.f201424c.emit(null, this);
    }
}
