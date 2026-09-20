package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class lg4 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f133066a;

    /* JADX INFO: renamed from: b */
    public int f133067b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n03 f133068c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg4(n03 n03Var, fbk fbkVar) {
        super(fbkVar);
        this.f133068c = n03Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f133066a = obj;
        this.f133067b |= Integer.MIN_VALUE;
        return this.f133068c.emit(null, this);
    }
}
