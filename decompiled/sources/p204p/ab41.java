package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ab41 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f13997a;

    /* JADX INFO: renamed from: b */
    public int f13998b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b941 f13999c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab41(b941 b941Var, fbk fbkVar) {
        super(fbkVar);
        this.f13999c = b941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f13997a = obj;
        this.f13998b |= Integer.MIN_VALUE;
        return this.f13999c.emit(null, this);
    }
}
