package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ivo extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f106248a;

    /* JADX INFO: renamed from: b */
    public int f106249b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f106250c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivo(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f106250c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f106248a = obj;
        this.f106249b |= Integer.MIN_VALUE;
        return this.f106250c.emit(null, this);
    }
}
