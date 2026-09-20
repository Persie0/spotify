package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ha0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f89080a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2132mm f89081b;

    /* JADX INFO: renamed from: c */
    public int f89082c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha0(C2132mm c2132mm, fbk fbkVar) {
        super(fbkVar);
        this.f89081b = c2132mm;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f89080a = obj;
        this.f89082c |= Integer.MIN_VALUE;
        return this.f89081b.m62253b(null, this);
    }
}
