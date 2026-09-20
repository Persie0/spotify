package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class irv0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f105058a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ qst0 f105059b;

    /* JADX INFO: renamed from: c */
    public int f105060c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irv0(qst0 qst0Var, ibk ibkVar) {
        super(ibkVar);
        this.f105059b = qst0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f105058a = obj;
        this.f105060c |= Integer.MIN_VALUE;
        Object objM73757p = this.f105059b.m73757p(this);
        return objM73757p == yuk.f276404a ? objM73757p : new s6x0(objM73757p);
    }
}
