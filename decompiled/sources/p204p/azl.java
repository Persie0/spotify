package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class azl extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f21640a;

    /* JADX INFO: renamed from: b */
    public int f21641b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f21642c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azl(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f21642c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f21640a = obj;
        this.f21641b |= Integer.MIN_VALUE;
        return this.f21642c.emit(null, this);
    }
}
