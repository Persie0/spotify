package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nrl0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f157581a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ orl0 f157582b;

    /* JADX INFO: renamed from: c */
    public int f157583c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrl0(orl0 orl0Var, ibk ibkVar) {
        super(ibkVar);
        this.f157582b = orl0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f157581a = obj;
        this.f157583c |= Integer.MIN_VALUE;
        return this.f157582b.m67698a(null, null, false, this);
    }
}
