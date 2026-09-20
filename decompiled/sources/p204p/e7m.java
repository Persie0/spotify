package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class e7m extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f56956a;

    /* JADX INFO: renamed from: b */
    public int f56957b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f56958c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7m(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f56958c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f56956a = obj;
        this.f56957b |= Integer.MIN_VALUE;
        return this.f56958c.emit(null, this);
    }
}
