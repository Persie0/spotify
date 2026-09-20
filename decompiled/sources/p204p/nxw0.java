package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nxw0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f159626a;

    /* JADX INFO: renamed from: b */
    public int f159627b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bvv0 f159628c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxw0(bvv0 bvv0Var, fbk fbkVar) {
        super(fbkVar);
        this.f159628c = bvv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f159626a = obj;
        this.f159627b |= Integer.MIN_VALUE;
        return this.f159628c.emit(null, this);
    }
}
