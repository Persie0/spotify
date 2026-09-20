package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class wjs extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f252038a;

    /* JADX INFO: renamed from: b */
    public int f252039b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hhq f252040c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wjs(hhq hhqVar, fbk fbkVar) {
        super(fbkVar);
        this.f252040c = hhqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f252038a = obj;
        this.f252039b |= Integer.MIN_VALUE;
        return this.f252040c.emit(null, this);
    }
}
