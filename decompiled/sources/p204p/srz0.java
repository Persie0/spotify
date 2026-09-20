package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class srz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f213434a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hrv0 f213435b;

    /* JADX INFO: renamed from: c */
    public int f213436c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srz0(hrv0 hrv0Var, ibk ibkVar) {
        super(ibkVar);
        this.f213435b = hrv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f213434a = obj;
        this.f213436c |= Integer.MIN_VALUE;
        Object objM48411c = this.f213435b.m48411c(null, null, this, false);
        return objM48411c == yuk.f276404a ? objM48411c : new s6x0(objM48411c);
    }
}
