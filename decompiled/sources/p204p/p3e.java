package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class p3e extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f173618a;

    /* JADX INFO: renamed from: b */
    public int f173619b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f173620c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3e(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f173620c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f173618a = obj;
        this.f173619b |= Integer.MIN_VALUE;
        return this.f173620c.emit(null, this);
    }
}
