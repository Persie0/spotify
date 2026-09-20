package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qbe extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f187074a;

    /* JADX INFO: renamed from: b */
    public int f187075b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f187076c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbe(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f187076c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f187074a = obj;
        this.f187075b |= Integer.MIN_VALUE;
        return this.f187076c.emit(null, this);
    }
}
