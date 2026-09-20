package p204p;

/* JADX INFO: renamed from: p.zs */
/* JADX INFO: loaded from: classes4.dex */
public final class C2661zs extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f285791a;

    /* JADX INFO: renamed from: b */
    public int f285792b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2587xs f285793c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2661zs(C2587xs c2587xs, fbk fbkVar) {
        super(fbkVar);
        this.f285793c = c2587xs;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f285791a = obj;
        this.f285792b |= Integer.MIN_VALUE;
        return this.f285793c.emit(null, this);
    }
}
