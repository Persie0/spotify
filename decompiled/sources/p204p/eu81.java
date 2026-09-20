package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class eu81 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f62913a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c400 f62914b;

    /* JADX INFO: renamed from: c */
    public int f62915c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu81(c400 c400Var, fbk fbkVar) {
        super(fbkVar);
        this.f62914b = c400Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f62913a = obj;
        this.f62915c |= Integer.MIN_VALUE;
        return this.f62914b.m31417a(null, this);
    }
}
