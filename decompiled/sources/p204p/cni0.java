package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class cni0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f40029a;

    /* JADX INFO: renamed from: b */
    public int f40030b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f40031c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cni0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f40031c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f40029a = obj;
        this.f40030b |= Integer.MIN_VALUE;
        return this.f40031c.emit(null, this);
    }
}
