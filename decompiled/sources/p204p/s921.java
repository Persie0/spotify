package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s921 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f206827a;

    /* JADX INFO: renamed from: b */
    public int f206828b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ sc11 f206829c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s921(sc11 sc11Var, fbk fbkVar) {
        super(fbkVar);
        this.f206829c = sc11Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f206827a = obj;
        this.f206828b |= Integer.MIN_VALUE;
        return this.f206829c.emit(null, this);
    }
}
