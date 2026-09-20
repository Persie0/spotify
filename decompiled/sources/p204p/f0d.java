package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class f0d extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f64610a;

    /* JADX INFO: renamed from: b */
    public int f64611b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f64612c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0d(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f64612c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f64610a = obj;
        this.f64611b |= Integer.MIN_VALUE;
        return this.f64612c.emit(null, this);
    }
}
