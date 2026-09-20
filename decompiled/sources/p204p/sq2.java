package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class sq2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f212987a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vq2 f212988b;

    /* JADX INFO: renamed from: c */
    public int f212989c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq2(vq2 vq2Var, ibk ibkVar) {
        super(ibkVar);
        this.f212988b = vq2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f212987a = obj;
        this.f212989c |= Integer.MIN_VALUE;
        return this.f212988b.m86184d(this);
    }
}
