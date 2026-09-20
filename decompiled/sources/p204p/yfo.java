package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class yfo extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f272302a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ago f272303b;

    /* JADX INFO: renamed from: c */
    public int f272304c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yfo(ago agoVar, fbk fbkVar) {
        super(fbkVar);
        this.f272303b = agoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f272302a = obj;
        this.f272304c |= Integer.MIN_VALUE;
        return this.f272303b.mo25869e(null, null, null, this);
    }
}
