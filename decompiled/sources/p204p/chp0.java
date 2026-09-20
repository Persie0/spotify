package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class chp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f38058a;

    /* JADX INFO: renamed from: b */
    public int f38059b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dhp0 f38060c;

    /* JADX INFO: renamed from: d */
    public bqz0 f38061d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chp0(dhp0 dhp0Var, ibk ibkVar) {
        super(ibkVar);
        this.f38060c = dhp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f38058a = obj;
        this.f38059b |= Integer.MIN_VALUE;
        return this.f38060c.mo15629a(null, null, this);
    }
}
