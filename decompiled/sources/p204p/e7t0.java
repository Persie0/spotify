package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class e7t0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f57007a;

    /* JADX INFO: renamed from: b */
    public int f57008b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f57009c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7t0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f57009c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f57007a = obj;
        this.f57008b |= Integer.MIN_VALUE;
        return this.f57009c.emit(null, this);
    }
}
