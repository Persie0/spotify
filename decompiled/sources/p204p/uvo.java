package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class uvo extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f234481a;

    /* JADX INFO: renamed from: b */
    public int f234482b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f234483c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uvo(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f234483c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f234481a = obj;
        this.f234482b |= Integer.MIN_VALUE;
        return this.f234483c.emit(null, this);
    }
}
