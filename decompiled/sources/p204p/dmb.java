package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class dmb extends ibk {

    /* JADX INFO: renamed from: a */
    public lmb f50481a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f50482b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lmb f50483c;

    /* JADX INFO: renamed from: d */
    public int f50484d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmb(lmb lmbVar, ibk ibkVar) {
        super(ibkVar);
        this.f50483c = lmbVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f50482b = obj;
        this.f50484d |= Integer.MIN_VALUE;
        return this.f50483c.m59344u(null, this);
    }
}
