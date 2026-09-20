package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class wnv0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f253303a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ynv0 f253304b;

    /* JADX INFO: renamed from: c */
    public int f253305c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wnv0(ynv0 ynv0Var, ibk ibkVar) {
        super(ibkVar);
        this.f253304b = ynv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f253303a = obj;
        this.f253305c |= Integer.MIN_VALUE;
        return this.f253304b.m94261b(null, this);
    }
}
