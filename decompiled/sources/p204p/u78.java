package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class u78 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f227529a;

    /* JADX INFO: renamed from: b */
    public int f227530b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wd5 f227531c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u78(wd5 wd5Var, fbk fbkVar) {
        super(fbkVar);
        this.f227531c = wd5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f227529a = obj;
        this.f227530b |= Integer.MIN_VALUE;
        return this.f227531c.emit(null, this);
    }
}
