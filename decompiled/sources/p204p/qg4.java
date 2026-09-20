package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qg4 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f188369a;

    /* JADX INFO: renamed from: b */
    public int f188370b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n03 f188371c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg4(n03 n03Var, fbk fbkVar) {
        super(fbkVar);
        this.f188371c = n03Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f188369a = obj;
        this.f188370b |= Integer.MIN_VALUE;
        return this.f188371c.emit(null, this);
    }
}
