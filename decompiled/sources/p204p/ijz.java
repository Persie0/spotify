package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class ijz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f102930a;

    /* JADX INFO: renamed from: b */
    public int f102931b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ysk f102932c;

    /* JADX INFO: renamed from: d */
    public niz f102933d;

    /* JADX INFO: renamed from: e */
    public int f102934e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ijz(ysk yskVar, fbk fbkVar) {
        super(fbkVar);
        this.f102932c = yskVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f102930a = obj;
        this.f102931b |= Integer.MIN_VALUE;
        return this.f102932c.collect(null, this);
    }
}
