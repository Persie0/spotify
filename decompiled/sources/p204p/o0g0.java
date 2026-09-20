package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class o0g0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f160383a;

    /* JADX INFO: renamed from: b */
    public qu80 f160384b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f160385c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ p0g0 f160386d;

    /* JADX INFO: renamed from: e */
    public int f160387e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0g0(p0g0 p0g0Var, ibk ibkVar) {
        super(ibkVar);
        this.f160386d = p0g0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f160385c = obj;
        this.f160387e |= Integer.MIN_VALUE;
        return this.f160386d.m68697a(null, this);
    }
}
