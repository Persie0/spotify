package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class sjd0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f209808a;

    /* JADX INFO: renamed from: b */
    public int f209809b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tjd0 f209810c;

    /* JADX INFO: renamed from: d */
    public bqz0 f209811d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sjd0(tjd0 tjd0Var, ibk ibkVar) {
        super(ibkVar);
        this.f209810c = tjd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f209808a = obj;
        this.f209809b |= Integer.MIN_VALUE;
        return this.f209810c.mo15629a(null, null, this);
    }
}
