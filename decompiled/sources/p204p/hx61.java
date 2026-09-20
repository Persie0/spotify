package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hx61 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f96148a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ix61 f96149b;

    /* JADX INFO: renamed from: c */
    public int f96150c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx61(ix61 ix61Var, fbk fbkVar) {
        super(fbkVar);
        this.f96149b = ix61Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f96148a = obj;
        this.f96150c |= Integer.MIN_VALUE;
        return ix61.m51859a(this.f96149b, this);
    }
}
