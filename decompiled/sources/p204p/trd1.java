package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class trd1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f223050a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vrd1 f223051b;

    /* JADX INFO: renamed from: c */
    public int f223052c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public trd1(vrd1 vrd1Var, ibk ibkVar) {
        super(ibkVar);
        this.f223051b = vrd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f223050a = obj;
        this.f223052c |= Integer.MIN_VALUE;
        return this.f223051b.m86296d(this);
    }
}
