package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class yuo extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f276424a;

    /* JADX INFO: renamed from: b */
    public int f276425b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f276426c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yuo(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f276426c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f276424a = obj;
        this.f276425b |= Integer.MIN_VALUE;
        return this.f276426c.emit(null, this);
    }
}
