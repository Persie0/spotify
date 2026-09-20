package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class a6m extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f12821a;

    /* JADX INFO: renamed from: b */
    public int f12822b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f12823c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6m(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f12823c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f12821a = obj;
        this.f12822b |= Integer.MIN_VALUE;
        return this.f12823c.emit(null, this);
    }
}
