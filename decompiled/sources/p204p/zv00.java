package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zv00 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f286575a;

    /* JADX INFO: renamed from: b */
    public int f286576b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f286577c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv00(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f286577c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f286575a = obj;
        this.f286576b |= Integer.MIN_VALUE;
        return this.f286577c.emit(null, this);
    }
}
