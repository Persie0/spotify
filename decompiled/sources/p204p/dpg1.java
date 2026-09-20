package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class dpg1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f51330a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rpe1 f51331b;

    /* JADX INFO: renamed from: c */
    public int f51332c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpg1(rpe1 rpe1Var, ibk ibkVar) {
        super(ibkVar);
        this.f51331b = rpe1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f51330a = obj;
        this.f51332c |= Integer.MIN_VALUE;
        return this.f51331b.m76139a(this);
    }
}
