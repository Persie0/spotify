package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class at2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f19561a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bt2 f19562b;

    /* JADX INFO: renamed from: c */
    public int f19563c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at2(bt2 bt2Var, ibk ibkVar) {
        super(ibkVar);
        this.f19562b = bt2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f19561a = obj;
        this.f19563c |= Integer.MIN_VALUE;
        return this.f19562b.m30449b(this);
    }
}
