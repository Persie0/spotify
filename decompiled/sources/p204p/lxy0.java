package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lxy0 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f137913a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f137914b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wiy0 f137915c;

    /* JADX INFO: renamed from: d */
    public int f137916d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lxy0(wiy0 wiy0Var, ibk ibkVar) {
        super(ibkVar);
        this.f137915c = wiy0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f137914b = obj;
        this.f137916d |= Integer.MIN_VALUE;
        return this.f137915c.m88228b(null, this);
    }
}
