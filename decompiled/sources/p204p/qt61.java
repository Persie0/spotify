package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qt61 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f192303a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rt61 f192304b;

    /* JADX INFO: renamed from: c */
    public int f192305c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt61(rt61 rt61Var, fbk fbkVar) {
        super(fbkVar);
        this.f192304b = rt61Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f192303a = obj;
        this.f192305c |= Integer.MIN_VALUE;
        return rt61.m76368a(this.f192304b, null, this);
    }
}
