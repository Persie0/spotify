package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class nmd extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f155407a;

    /* JADX INFO: renamed from: b */
    public int f155408b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f155409c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nmd(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f155409c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f155407a = obj;
        this.f155408b |= Integer.MIN_VALUE;
        return this.f155409c.emit(null, this);
    }
}
