package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class v201 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f236511a;

    /* JADX INFO: renamed from: b */
    public int f236512b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f236513c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v201(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f236513c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f236511a = obj;
        this.f236512b |= Integer.MIN_VALUE;
        return this.f236513c.emit(null, this);
    }
}
