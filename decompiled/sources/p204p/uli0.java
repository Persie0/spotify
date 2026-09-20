package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class uli0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f231568a;

    /* JADX INFO: renamed from: b */
    public int f231569b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f231570c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uli0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f231570c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f231568a = obj;
        this.f231569b |= Integer.MIN_VALUE;
        return this.f231570c.emit(null, this);
    }
}
