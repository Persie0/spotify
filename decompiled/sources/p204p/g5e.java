package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class g5e extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f76648a;

    /* JADX INFO: renamed from: b */
    public int f76649b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f76650c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5e(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f76650c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f76648a = obj;
        this.f76649b |= Integer.MIN_VALUE;
        return this.f76650c.emit(null, this);
    }
}
