package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class zu21 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f286330a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ev21 f286331b;

    /* JADX INFO: renamed from: c */
    public int f286332c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu21(ev21 ev21Var, ibk ibkVar) {
        super(ibkVar);
        this.f286331b = ev21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f286330a = obj;
        this.f286332c |= Integer.MIN_VALUE;
        return this.f286331b.m40082b(null, this);
    }
}
