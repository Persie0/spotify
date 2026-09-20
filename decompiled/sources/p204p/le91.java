package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class le91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f132493a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pe91 f132494b;

    /* JADX INFO: renamed from: c */
    public int f132495c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le91(pe91 pe91Var, ibk ibkVar) {
        super(ibkVar);
        this.f132494b = pe91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f132493a = obj;
        this.f132495c |= Integer.MIN_VALUE;
        return this.f132494b.m69713r(this);
    }
}
