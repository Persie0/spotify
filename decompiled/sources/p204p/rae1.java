package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rae1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f197295a;

    /* JADX INFO: renamed from: b */
    public int f197296b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ di91 f197297c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rae1(di91 di91Var, fbk fbkVar) {
        super(fbkVar);
        this.f197297c = di91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f197295a = obj;
        this.f197296b |= Integer.MIN_VALUE;
        return this.f197297c.emit(null, this);
    }
}
