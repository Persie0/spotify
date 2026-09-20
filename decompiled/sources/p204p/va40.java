package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class va40 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f239118a;

    /* JADX INFO: renamed from: b */
    public String f239119b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f239120c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ya40 f239121d;

    /* JADX INFO: renamed from: e */
    public int f239122e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va40(ya40 ya40Var, ibk ibkVar) {
        super(ibkVar);
        this.f239121d = ya40Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f239120c = obj;
        this.f239122e |= Integer.MIN_VALUE;
        return this.f239121d.m93203c(null, null, this);
    }
}
