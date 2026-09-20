package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class u3k0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f226401a;

    /* JADX INFO: renamed from: b */
    public int f226402b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f226403c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3k0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f226403c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f226401a = obj;
        this.f226402b |= Integer.MIN_VALUE;
        return this.f226403c.emit(null, this);
    }
}
