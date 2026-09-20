package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class awl extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f20548a;

    /* JADX INFO: renamed from: b */
    public int f20549b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f20550c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awl(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f20550c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f20548a = obj;
        this.f20549b |= Integer.MIN_VALUE;
        return this.f20550c.emit(null, this);
    }
}
