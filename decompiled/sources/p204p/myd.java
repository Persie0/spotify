package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class myd extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f148426a;

    /* JADX INFO: renamed from: b */
    public int f148427b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f148428c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myd(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f148428c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f148426a = obj;
        this.f148427b |= Integer.MIN_VALUE;
        return this.f148428c.emit(null, this);
    }
}
