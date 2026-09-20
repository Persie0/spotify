package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rgo extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f198986a;

    /* JADX INFO: renamed from: b */
    public int f198987b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f198988c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rgo(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f198988c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f198986a = obj;
        this.f198987b |= Integer.MIN_VALUE;
        return this.f198988c.emit(null, this);
    }
}
