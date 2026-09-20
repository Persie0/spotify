package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lde1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f132153a;

    /* JADX INFO: renamed from: b */
    public int f132154b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ di91 f132155c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lde1(di91 di91Var, fbk fbkVar) {
        super(fbkVar);
        this.f132155c = di91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f132153a = obj;
        this.f132154b |= Integer.MIN_VALUE;
        return this.f132155c.emit(null, this);
    }
}
