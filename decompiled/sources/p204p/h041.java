package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class h041 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f86146a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ x041 f86147b;

    /* JADX INFO: renamed from: c */
    public int f86148c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h041(x041 x041Var, ibk ibkVar) {
        super(ibkVar);
        this.f86147b = x041Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f86146a = obj;
        this.f86148c |= Integer.MIN_VALUE;
        return x041.m89498d(this.f86147b, null, this);
    }
}
