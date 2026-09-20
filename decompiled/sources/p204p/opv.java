package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class opv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f168027a;

    /* JADX INFO: renamed from: b */
    public int f168028b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f168029c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opv(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f168029c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f168027a = obj;
        this.f168028b |= Integer.MIN_VALUE;
        return this.f168029c.emit(null, this);
    }
}
