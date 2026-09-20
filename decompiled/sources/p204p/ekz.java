package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class ekz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f60545a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fkz f60546b;

    /* JADX INFO: renamed from: c */
    public int f60547c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekz(fkz fkzVar, fbk fbkVar) {
        super(fbkVar);
        this.f60546b = fkzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f60545a = obj;
        this.f60547c |= Integer.MIN_VALUE;
        return this.f60546b.emit(null, this);
    }
}
