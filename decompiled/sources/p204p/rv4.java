package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rv4 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f202993a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ az1 f202994b;

    /* JADX INFO: renamed from: c */
    public int f202995c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv4(az1 az1Var, ibk ibkVar) {
        super(ibkVar);
        this.f202994b = az1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f202993a = obj;
        this.f202995c |= Integer.MIN_VALUE;
        return this.f202994b.m27562c(null, this);
    }
}
