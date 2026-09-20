package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dif0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f49354a;

    /* JADX INFO: renamed from: b */
    public int f49355b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqd0 f49356c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dif0(yqd0 yqd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f49356c = yqd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f49354a = obj;
        this.f49355b |= Integer.MIN_VALUE;
        return this.f49356c.emit(null, this);
    }
}
