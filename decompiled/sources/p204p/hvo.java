package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class hvo extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f95753a;

    /* JADX INFO: renamed from: b */
    public int f95754b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f95755c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hvo(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f95755c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f95753a = obj;
        this.f95754b |= Integer.MIN_VALUE;
        return this.f95755c.emit(null, this);
    }
}
