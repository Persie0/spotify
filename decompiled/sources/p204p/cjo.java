package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class cjo extends ibk {

    /* JADX INFO: renamed from: a */
    public boolean f38629a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f38630b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qzn f38631c;

    /* JADX INFO: renamed from: d */
    public int f38632d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjo(qzn qznVar, ibk ibkVar) {
        super(ibkVar);
        this.f38631c = qznVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f38630b = obj;
        this.f38632d |= Integer.MIN_VALUE;
        return this.f38631c.m74344f(false, this);
    }
}
