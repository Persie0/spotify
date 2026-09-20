package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class aqz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f18877a;

    /* JADX INFO: renamed from: b */
    public int f18878b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ady0 f18879c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqz0(ady0 ady0Var, fbk fbkVar) {
        super(fbkVar);
        this.f18879c = ady0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f18877a = obj;
        this.f18878b |= Integer.MIN_VALUE;
        return this.f18879c.emit(null, this);
    }
}
