package p204p;

/* JADX INFO: renamed from: p.ws */
/* JADX INFO: loaded from: classes4.dex */
public final class C2546ws extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f254469a;

    /* JADX INFO: renamed from: b */
    public int f254470b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2587xs f254471c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2546ws(C2587xs c2587xs, fbk fbkVar) {
        super(fbkVar);
        this.f254471c = c2587xs;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f254469a = obj;
        this.f254470b |= Integer.MIN_VALUE;
        return this.f254471c.emit(null, this);
    }
}
