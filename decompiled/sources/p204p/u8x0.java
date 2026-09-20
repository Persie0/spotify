package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class u8x0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f228027a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v8x0 f228028b;

    /* JADX INFO: renamed from: c */
    public int f228029c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8x0(v8x0 v8x0Var, fbk fbkVar) {
        super(fbkVar);
        this.f228028b = v8x0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f228027a = obj;
        this.f228029c |= Integer.MIN_VALUE;
        return this.f228028b.invoke(this);
    }
}
