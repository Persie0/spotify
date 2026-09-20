package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class xub1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f266044a;

    /* JADX INFO: renamed from: b */
    public int f266045b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ di91 f266046c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xub1(di91 di91Var, fbk fbkVar) {
        super(fbkVar);
        this.f266046c = di91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f266044a = obj;
        this.f266045b |= Integer.MIN_VALUE;
        return this.f266046c.emit(null, this);
    }
}
