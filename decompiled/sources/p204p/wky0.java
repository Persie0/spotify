package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class wky0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f252321a;

    /* JADX INFO: renamed from: b */
    public int f252322b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ady0 f252323c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wky0(ady0 ady0Var, fbk fbkVar) {
        super(fbkVar);
        this.f252323c = ady0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f252321a = obj;
        this.f252322b |= Integer.MIN_VALUE;
        return this.f252323c.emit(null, this);
    }
}
