package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class x1r0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f257261a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ y1r0 f257262b;

    /* JADX INFO: renamed from: c */
    public int f257263c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1r0(y1r0 y1r0Var, ibk ibkVar) {
        super(ibkVar);
        this.f257262b = y1r0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f257261a = obj;
        this.f257263c |= Integer.MIN_VALUE;
        Object objM92665k = this.f257262b.m92665k(this);
        return objM92665k == yuk.f276404a ? objM92665k : new s6x0(objM92665k);
    }
}
