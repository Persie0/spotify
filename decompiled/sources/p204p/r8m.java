package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class r8m extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f196809a;

    /* JADX INFO: renamed from: b */
    public int f196810b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f196811c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8m(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f196811c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f196809a = obj;
        this.f196810b |= Integer.MIN_VALUE;
        return this.f196811c.emit(null, this);
    }
}
