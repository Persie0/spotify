package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s950 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f206862a;

    /* JADX INFO: renamed from: b */
    public int f206863b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t950 f206864c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s950(t950 t950Var, fbk fbkVar) {
        super(fbkVar);
        this.f206864c = t950Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f206862a = obj;
        this.f206863b |= Integer.MIN_VALUE;
        return this.f206864c.emit(null, this);
    }
}
