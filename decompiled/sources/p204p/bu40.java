package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class bu40 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f31011a;

    /* JADX INFO: renamed from: b */
    public d850 f31012b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f31013c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ cu40 f31014d;

    /* JADX INFO: renamed from: e */
    public int f31015e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu40(cu40 cu40Var, ibk ibkVar) {
        super(ibkVar);
        this.f31014d = cu40Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f31013c = obj;
        this.f31015e |= Integer.MIN_VALUE;
        return this.f31014d.m33860d(null, null, this);
    }
}
