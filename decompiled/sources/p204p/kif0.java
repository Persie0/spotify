package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kif0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f122959a;

    /* JADX INFO: renamed from: b */
    public int f122960b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqd0 f122961c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kif0(yqd0 yqd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f122961c = yqd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f122959a = obj;
        this.f122960b |= Integer.MIN_VALUE;
        return this.f122961c.emit(null, this);
    }
}
