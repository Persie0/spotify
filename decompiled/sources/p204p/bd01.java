package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bd01 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f25973a;

    /* JADX INFO: renamed from: b */
    public int f25974b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f25975c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd01(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f25975c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f25973a = obj;
        this.f25974b |= Integer.MIN_VALUE;
        return this.f25975c.emit(null, this);
    }
}
