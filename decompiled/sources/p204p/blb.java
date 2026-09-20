package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class blb extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f28150a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2132mm f28151b;

    /* JADX INFO: renamed from: c */
    public int f28152c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public blb(C2132mm c2132mm, fbk fbkVar) {
        super(fbkVar);
        this.f28151b = c2132mm;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f28150a = obj;
        this.f28152c |= Integer.MIN_VALUE;
        return this.f28151b.m62254c(null, this);
    }
}
