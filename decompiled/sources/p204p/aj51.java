package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class aj51 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f16173a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dj51 f16174b;

    /* JADX INFO: renamed from: c */
    public int f16175c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj51(dj51 dj51Var, fbk fbkVar) {
        super(fbkVar);
        this.f16174b = dj51Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f16173a = obj;
        this.f16175c |= Integer.MIN_VALUE;
        return this.f16174b.m36168W(null, this);
    }
}
