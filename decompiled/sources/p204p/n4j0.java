package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n4j0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f150361a;

    /* JADX INFO: renamed from: b */
    public int f150362b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f150363c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4j0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f150363c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f150361a = obj;
        this.f150362b |= Integer.MIN_VALUE;
        return this.f150363c.emit(null, this);
    }
}
