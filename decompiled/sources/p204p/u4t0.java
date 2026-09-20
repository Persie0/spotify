package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class u4t0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f226796a;

    /* JADX INFO: renamed from: b */
    public int f226797b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ a4t0 f226798c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4t0(a4t0 a4t0Var, fbk fbkVar) {
        super(fbkVar);
        this.f226798c = a4t0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f226796a = obj;
        this.f226797b |= Integer.MIN_VALUE;
        return this.f226798c.emit(null, this);
    }
}
