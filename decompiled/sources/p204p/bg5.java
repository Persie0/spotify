package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bg5 extends ibk {

    /* JADX INFO: renamed from: a */
    public rf5 f26832a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f26833b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dg5 f26834c;

    /* JADX INFO: renamed from: d */
    public int f26835d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg5(dg5 dg5Var, ibk ibkVar) {
        super(ibkVar);
        this.f26834c = dg5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f26833b = obj;
        this.f26835d |= Integer.MIN_VALUE;
        return dg5.m35916a(this.f26834c, null, this);
    }
}
