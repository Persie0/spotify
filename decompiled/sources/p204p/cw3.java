package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class cw3 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f42617a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dw3 f42618b;

    /* JADX INFO: renamed from: c */
    public int f42619c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw3(dw3 dw3Var, ibk ibkVar) {
        super(ibkVar);
        this.f42618b = dw3Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f42617a = obj;
        this.f42619c |= Integer.MIN_VALUE;
        return this.f42618b.m37133b(this);
    }
}
