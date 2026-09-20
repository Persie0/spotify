package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class me91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f142640a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pe91 f142641b;

    /* JADX INFO: renamed from: c */
    public int f142642c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me91(pe91 pe91Var, ibk ibkVar) {
        super(ibkVar);
        this.f142641b = pe91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f142640a = obj;
        this.f142642c |= Integer.MIN_VALUE;
        return this.f142641b.m69714s(this);
    }
}
