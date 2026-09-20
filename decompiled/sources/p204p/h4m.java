package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class h4m extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f87562a;

    /* JADX INFO: renamed from: b */
    public int f87563b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f87564c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4m(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f87564c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f87562a = obj;
        this.f87563b |= Integer.MIN_VALUE;
        return this.f87564c.emit(null, this);
    }
}
