package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ay4 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f21091a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ by4 f21092b;

    /* JADX INFO: renamed from: c */
    public int f21093c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ay4(by4 by4Var, fbk fbkVar) {
        super(fbkVar);
        this.f21092b = by4Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f21091a = obj;
        this.f21093c |= Integer.MIN_VALUE;
        return this.f21092b.m30866I1(this);
    }
}
