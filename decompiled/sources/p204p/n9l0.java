package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class n9l0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f151817a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r9l0 f151818b;

    /* JADX INFO: renamed from: c */
    public int f151819c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9l0(r9l0 r9l0Var, fbk fbkVar) {
        super(fbkVar);
        this.f151818b = r9l0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f151817a = obj;
        this.f151819c |= Integer.MIN_VALUE;
        return r9l0.m75079b(this.f151818b, this);
    }
}
