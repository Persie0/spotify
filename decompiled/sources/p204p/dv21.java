package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class dv21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f53345a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ev21 f53346b;

    /* JADX INFO: renamed from: c */
    public int f53347c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv21(ev21 ev21Var, ibk ibkVar) {
        super(ibkVar);
        this.f53346b = ev21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f53345a = obj;
        this.f53347c |= Integer.MIN_VALUE;
        return this.f53346b.m40085e(null, this);
    }
}
