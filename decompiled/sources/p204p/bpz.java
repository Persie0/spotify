package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bpz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f29626a;

    /* JADX INFO: renamed from: b */
    public int f29627b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f29628c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpz(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f29628c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f29626a = obj;
        this.f29627b |= Integer.MIN_VALUE;
        return this.f29628c.emit(null, this);
    }
}
