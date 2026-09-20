package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rd80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f198061a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ud80 f198062b;

    /* JADX INFO: renamed from: c */
    public int f198063c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rd80(ud80 ud80Var, ibk ibkVar) {
        super(ibkVar);
        this.f198062b = ud80Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f198061a = obj;
        this.f198063c |= Integer.MIN_VALUE;
        return this.f198062b.m82845e(null, this);
    }
}
