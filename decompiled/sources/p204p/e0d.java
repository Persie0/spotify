package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class e0d extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f54941a;

    /* JADX INFO: renamed from: b */
    public int f54942b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f54943c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0d(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f54943c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f54941a = obj;
        this.f54942b |= Integer.MIN_VALUE;
        return this.f54943c.emit(null, this);
    }
}
