package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class mqw extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f146363a;

    /* JADX INFO: renamed from: b */
    public int f146364b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hhq f146365c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqw(hhq hhqVar, fbk fbkVar) {
        super(fbkVar);
        this.f146365c = hhqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f146363a = obj;
        this.f146364b |= Integer.MIN_VALUE;
        return this.f146365c.emit(null, this);
    }
}
