package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class moo extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f145713a;

    /* JADX INFO: renamed from: b */
    public int f145714b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f145715c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public moo(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f145715c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f145713a = obj;
        this.f145714b |= Integer.MIN_VALUE;
        return this.f145715c.emit(null, this);
    }
}
