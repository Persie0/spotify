package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class krc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f125607a;

    /* JADX INFO: renamed from: b */
    public int f125608b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f125609c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krc(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f125609c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f125607a = obj;
        this.f125608b |= Integer.MIN_VALUE;
        return this.f125609c.emit(null, this);
    }
}
