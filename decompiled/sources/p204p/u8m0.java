package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class u8m0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f227980a;

    /* JADX INFO: renamed from: b */
    public int f227981b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bj1 f227982c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8m0(bj1 bj1Var, fbk fbkVar) {
        super(fbkVar);
        this.f227982c = bj1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f227980a = obj;
        this.f227981b |= Integer.MIN_VALUE;
        return this.f227982c.emit(null, this);
    }
}
