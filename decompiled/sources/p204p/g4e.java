package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class g4e extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f76396a;

    /* JADX INFO: renamed from: b */
    public int f76397b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f76398c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4e(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f76398c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f76396a = obj;
        this.f76397b |= Integer.MIN_VALUE;
        return this.f76398c.emit(null, this);
    }
}
