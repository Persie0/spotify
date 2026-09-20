package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class gvl extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f84777a;

    /* JADX INFO: renamed from: b */
    public int f84778b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f84779c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvl(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f84779c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f84777a = obj;
        this.f84778b |= Integer.MIN_VALUE;
        return this.f84779c.emit(null, this);
    }
}
