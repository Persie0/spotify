package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bg01 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f26810a;

    /* JADX INFO: renamed from: b */
    public int f26811b;

    /* JADX INFO: renamed from: c */
    public niz f26812c;

    /* JADX INFO: renamed from: d */
    public int f26813d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ cg01 f26814e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg01(cg01 cg01Var, fbk fbkVar) {
        super(fbkVar);
        this.f26814e = cg01Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f26810a = obj;
        this.f26811b |= Integer.MIN_VALUE;
        return this.f26814e.emit(null, this);
    }
}
