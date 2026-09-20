package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class bgz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f27031a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cgz f27032b;

    /* JADX INFO: renamed from: c */
    public int f27033c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bgz(cgz cgzVar, fbk fbkVar) {
        super(fbkVar);
        this.f27032b = cgzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f27031a = obj;
        this.f27033c |= Integer.MIN_VALUE;
        this.f27032b.collect(null, this);
        return yuk.f276404a;
    }
}
