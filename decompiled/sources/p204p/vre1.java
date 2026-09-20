package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class vre1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f244196a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zre1 f244197b;

    /* JADX INFO: renamed from: c */
    public int f244198c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vre1(zre1 zre1Var, ibk ibkVar) {
        super(ibkVar);
        this.f244197b = zre1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f244196a = obj;
        this.f244198c |= Integer.MIN_VALUE;
        return this.f244197b.m96761b(null, this);
    }
}
