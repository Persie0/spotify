package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n8m extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f151560a;

    /* JADX INFO: renamed from: b */
    public int f151561b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f151562c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8m(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f151562c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f151560a = obj;
        this.f151561b |= Integer.MIN_VALUE;
        return this.f151562c.emit(null, this);
    }
}
