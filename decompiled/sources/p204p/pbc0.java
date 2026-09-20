package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pbc0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f175770a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f175771b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qbc0 f175772c;

    /* JADX INFO: renamed from: d */
    public int f175773d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pbc0(qbc0 qbc0Var, ibk ibkVar) {
        super(ibkVar);
        this.f175772c = qbc0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f175771b = obj;
        this.f175773d |= Integer.MIN_VALUE;
        return this.f175772c.m72491a(null, this);
    }
}
