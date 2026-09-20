package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class djc1 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f49654a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f49655b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fjc1 f49656c;

    /* JADX INFO: renamed from: d */
    public int f49657d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djc1(fjc1 fjc1Var, ibk ibkVar) {
        super(ibkVar);
        this.f49656c = fjc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f49655b = obj;
        this.f49657d |= Integer.MIN_VALUE;
        return this.f49656c.m41801c(null, null, false, this);
    }
}
