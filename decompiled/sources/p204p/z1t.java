package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class z1t extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f278413a;

    /* JADX INFO: renamed from: b */
    public int f278414b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a1s f278415c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1t(a1s a1sVar, fbk fbkVar) {
        super(fbkVar);
        this.f278415c = a1sVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f278413a = obj;
        this.f278414b |= Integer.MIN_VALUE;
        return this.f278415c.emit(null, this);
    }
}
