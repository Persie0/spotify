package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class s03 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f204289a;

    /* JADX INFO: renamed from: b */
    public int f204290b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n03 f204291c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s03(n03 n03Var, fbk fbkVar) {
        super(fbkVar);
        this.f204291c = n03Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f204289a = obj;
        this.f204290b |= Integer.MIN_VALUE;
        return this.f204291c.emit(null, this);
    }
}
