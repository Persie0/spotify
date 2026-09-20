package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class tqt0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f222884a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ uqt0 f222885b;

    /* JADX INFO: renamed from: c */
    public int f222886c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqt0(uqt0 uqt0Var, ibk ibkVar) {
        super(ibkVar);
        this.f222885b = uqt0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f222884a = obj;
        this.f222886c |= Integer.MIN_VALUE;
        return this.f222885b.m83814d(0, null, this);
    }
}
