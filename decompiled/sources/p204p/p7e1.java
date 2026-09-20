package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class p7e1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f174664a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ r7e1 f174665b;

    /* JADX INFO: renamed from: c */
    public int f174666c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7e1(r7e1 r7e1Var, ibk ibkVar) {
        super(ibkVar);
        this.f174665b = r7e1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f174664a = obj;
        this.f174666c |= Integer.MIN_VALUE;
        return this.f174665b.m74900c(this);
    }
}
