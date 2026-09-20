package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class f260 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f65118a;

    /* JADX INFO: renamed from: b */
    public int f65119b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f65120c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f260(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f65120c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f65118a = obj;
        this.f65119b |= Integer.MIN_VALUE;
        return this.f65120c.emit(null, this);
    }
}
