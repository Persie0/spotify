package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class r7m extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f196605a;

    /* JADX INFO: renamed from: b */
    public int f196606b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f196607c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7m(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f196607c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f196605a = obj;
        this.f196606b |= Integer.MIN_VALUE;
        return this.f196607c.emit(null, this);
    }
}
