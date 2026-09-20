package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class kkb1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f123560a;

    /* JADX INFO: renamed from: b */
    public int f123561b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lkb1 f123562c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkb1(lkb1 lkb1Var, ibk ibkVar) {
        super(ibkVar);
        this.f123562c = lkb1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f123560a = obj;
        this.f123561b |= Integer.MIN_VALUE;
        return this.f123562c.mo15629a(null, null, this);
    }
}
