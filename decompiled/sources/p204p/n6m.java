package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n6m extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f150925a;

    /* JADX INFO: renamed from: b */
    public int f150926b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f150927c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6m(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f150927c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f150925a = obj;
        this.f150926b |= Integer.MIN_VALUE;
        return this.f150927c.emit(null, this);
    }
}
