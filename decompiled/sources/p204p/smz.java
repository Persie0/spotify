package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class smz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f210751a;

    /* JADX INFO: renamed from: b */
    public int f210752b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f210753c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public smz(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f210753c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f210751a = obj;
        this.f210752b |= Integer.MIN_VALUE;
        return this.f210753c.emit(null, this);
    }
}
