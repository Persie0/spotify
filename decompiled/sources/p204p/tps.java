package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class tps extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f222589a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wps f222590b;

    /* JADX INFO: renamed from: c */
    public int f222591c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tps(wps wpsVar, ibk ibkVar) {
        super(ibkVar);
        this.f222590b = wpsVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f222589a = obj;
        this.f222591c |= Integer.MIN_VALUE;
        return this.f222590b.m88722a(null, this);
    }
}
