package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class h6m extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f88191a;

    /* JADX INFO: renamed from: b */
    public int f88192b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f88193c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6m(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f88193c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f88191a = obj;
        this.f88192b |= Integer.MIN_VALUE;
        return this.f88193c.emit(null, this);
    }
}
