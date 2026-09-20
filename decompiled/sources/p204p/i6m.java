package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class i6m extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f99290a;

    /* JADX INFO: renamed from: b */
    public int f99291b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f99292c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6m(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f99292c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f99290a = obj;
        this.f99291b |= Integer.MIN_VALUE;
        return this.f99292c.emit(null, this);
    }
}
