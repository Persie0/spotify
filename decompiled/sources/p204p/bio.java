package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bio extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f27514a;

    /* JADX INFO: renamed from: b */
    public int f27515b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hql f27516c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bio(hql hqlVar, fbk fbkVar) {
        super(fbkVar);
        this.f27516c = hqlVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f27514a = obj;
        this.f27515b |= Integer.MIN_VALUE;
        return this.f27516c.emit(null, this);
    }
}
