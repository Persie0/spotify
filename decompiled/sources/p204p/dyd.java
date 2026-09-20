package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dyd extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f54293a;

    /* JADX INFO: renamed from: b */
    public int f54294b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f54295c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dyd(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f54295c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f54293a = obj;
        this.f54294b |= Integer.MIN_VALUE;
        return this.f54295c.emit(null, this);
    }
}
