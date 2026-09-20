package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class qlq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f189898a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rb5 f189899b;

    /* JADX INFO: renamed from: c */
    public int f189900c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qlq(rb5 rb5Var, ibk ibkVar) {
        super(ibkVar);
        this.f189899b = rb5Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f189898a = obj;
        this.f189900c |= Integer.MIN_VALUE;
        return this.f189899b.mo62238b(null, 0, 0, this);
    }
}
