package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class e0m extends ibk {

    /* JADX INFO: renamed from: a */
    public q0m f54993a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f54994b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ f0m f54995c;

    /* JADX INFO: renamed from: d */
    public int f54996d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0m(f0m f0mVar, ibk ibkVar) {
        super(ibkVar);
        this.f54995c = f0mVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f54994b = obj;
        this.f54996d |= Integer.MIN_VALUE;
        return this.f54995c.m40489d(null, this);
    }
}
