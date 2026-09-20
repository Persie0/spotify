package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class o3e extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f161347a;

    /* JADX INFO: renamed from: b */
    public int f161348b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f161349c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3e(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f161349c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f161347a = obj;
        this.f161348b |= Integer.MIN_VALUE;
        return this.f161349c.emit(null, this);
    }
}
