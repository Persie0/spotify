package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class k311 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f118746a;

    /* JADX INFO: renamed from: b */
    public int f118747b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f118748c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k311(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f118748c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f118746a = obj;
        this.f118747b |= Integer.MIN_VALUE;
        return this.f118748c.emit(null, this);
    }
}
