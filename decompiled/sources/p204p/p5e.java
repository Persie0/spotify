package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class p5e extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f174153a;

    /* JADX INFO: renamed from: b */
    public int f174154b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f174155c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5e(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f174155c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f174153a = obj;
        this.f174154b |= Integer.MIN_VALUE;
        return this.f174155c.emit(null, this);
    }
}
