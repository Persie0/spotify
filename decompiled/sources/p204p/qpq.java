package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qpq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f191361a;

    /* JADX INFO: renamed from: b */
    public int f191362b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hhq f191363c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qpq(hhq hhqVar, fbk fbkVar) {
        super(fbkVar);
        this.f191363c = hhqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f191361a = obj;
        this.f191362b |= Integer.MIN_VALUE;
        return this.f191363c.emit(null, this);
    }
}
