package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class txf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f224695a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wxf0 f224696b;

    /* JADX INFO: renamed from: c */
    public int f224697c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public txf0(wxf0 wxf0Var, ibk ibkVar) {
        super(ibkVar);
        this.f224696b = wxf0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f224695a = obj;
        this.f224697c |= Integer.MIN_VALUE;
        return this.f224696b.m89241i(this);
    }
}
