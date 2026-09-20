package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wck extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f250062a;

    /* JADX INFO: renamed from: b */
    public int f250063b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f250064c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wck(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f250064c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f250062a = obj;
        this.f250063b |= Integer.MIN_VALUE;
        return this.f250064c.emit(null, this);
    }
}
