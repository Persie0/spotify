package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class k611 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f119612a;

    /* JADX INFO: renamed from: b */
    public int f119613b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f119614c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k611(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f119614c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f119612a = obj;
        this.f119613b |= Integer.MIN_VALUE;
        return this.f119614c.emit(null, this);
    }
}
