package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class xv0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f266235a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cw0 f266236b;

    /* JADX INFO: renamed from: c */
    public int f266237c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv0(cw0 cw0Var, ibk ibkVar) {
        super(ibkVar);
        this.f266236b = cw0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f266235a = obj;
        this.f266237c |= Integer.MIN_VALUE;
        return this.f266236b.m34076a(this);
    }
}
