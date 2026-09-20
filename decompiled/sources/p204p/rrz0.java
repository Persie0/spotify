package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rrz0 extends ibk {

    /* JADX INFO: renamed from: a */
    public pcu0 f202143a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f202144b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hrv0 f202145c;

    /* JADX INFO: renamed from: d */
    public int f202146d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rrz0(hrv0 hrv0Var, ibk ibkVar) {
        super(ibkVar);
        this.f202145c = hrv0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f202144b = obj;
        this.f202146d |= Integer.MIN_VALUE;
        Object objM48410b = this.f202145c.m48410b(null, false, this);
        return objM48410b == yuk.f276404a ? objM48410b : new s6x0(objM48410b);
    }
}
