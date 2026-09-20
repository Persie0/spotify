package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class fiz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f70025a;

    /* JADX INFO: renamed from: b */
    public int f70026b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ady0 f70027c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fiz0(ady0 ady0Var, fbk fbkVar) {
        super(fbkVar);
        this.f70027c = ady0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f70025a = obj;
        this.f70026b |= Integer.MIN_VALUE;
        return this.f70027c.emit(null, this);
    }
}
