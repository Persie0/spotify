package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class w6g1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f248379a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ w7g1 f248380b;

    /* JADX INFO: renamed from: c */
    public int f248381c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6g1(w7g1 w7g1Var, ibk ibkVar) {
        super(ibkVar);
        this.f248380b = w7g1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f248379a = obj;
        this.f248381c |= Integer.MIN_VALUE;
        return this.f248380b.m87388a(this);
    }
}
