package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class myd0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f148429a;

    /* JADX INFO: renamed from: b */
    public int f148430b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f148431c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public myd0(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f148431c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f148429a = obj;
        this.f148430b |= Integer.MIN_VALUE;
        return this.f148431c.emit(null, this);
    }
}
