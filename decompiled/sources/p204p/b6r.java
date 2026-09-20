package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class b6r extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24019a;

    /* JADX INFO: renamed from: b */
    public int f24020b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hhq f24021c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6r(hhq hhqVar, fbk fbkVar) {
        super(fbkVar);
        this.f24021c = hhqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f24019a = obj;
        this.f24020b |= Integer.MIN_VALUE;
        return this.f24021c.emit(null, this);
    }
}
