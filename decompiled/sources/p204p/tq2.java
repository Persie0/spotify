package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class tq2 extends ibk {

    /* JADX INFO: renamed from: a */
    public long f222655a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f222656b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vq2 f222657c;

    /* JADX INFO: renamed from: d */
    public int f222658d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq2(vq2 vq2Var, ibk ibkVar) {
        super(ibkVar);
        this.f222657c = vq2Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f222656b = obj;
        this.f222658d |= Integer.MIN_VALUE;
        return this.f222657c.m86186f(0L, this);
    }
}
