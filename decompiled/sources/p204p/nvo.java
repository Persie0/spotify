package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nvo extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f158931a;

    /* JADX INFO: renamed from: b */
    public int f158932b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f158933c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nvo(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f158933c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f158931a = obj;
        this.f158932b |= Integer.MIN_VALUE;
        return this.f158933c.emit(null, this);
    }
}
