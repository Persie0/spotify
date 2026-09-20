package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class mht0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f143868a;

    /* JADX INFO: renamed from: b */
    public int f143869b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f143870c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mht0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f143870c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f143868a = obj;
        this.f143869b |= Integer.MIN_VALUE;
        return this.f143870c.emit(null, this);
    }
}
