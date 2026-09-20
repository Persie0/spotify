package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class f4e extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65765a;

    /* JADX INFO: renamed from: b */
    public int f65766b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f65767c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4e(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f65767c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f65765a = obj;
        this.f65766b |= Integer.MIN_VALUE;
        return this.f65767c.emit(null, this);
    }
}
