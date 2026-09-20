package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class kpx extends ibk {

    /* JADX INFO: renamed from: a */
    public String f125145a;

    /* JADX INFO: renamed from: b */
    public jsi0 f125146b;

    /* JADX INFO: renamed from: c */
    public int f125147c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f125148d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ mpx f125149e;

    /* JADX INFO: renamed from: f */
    public int f125150f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kpx(mpx mpxVar, ibk ibkVar) {
        super(ibkVar);
        this.f125149e = mpxVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f125148d = obj;
        this.f125150f |= Integer.MIN_VALUE;
        return this.f125149e.mo46765a(null, null, null, this);
    }
}
