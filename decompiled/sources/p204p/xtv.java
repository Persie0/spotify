package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xtv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f265931a;

    /* JADX INFO: renamed from: b */
    public int f265932b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gtt f265933c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xtv(gtt gttVar, fbk fbkVar) {
        super(fbkVar);
        this.f265933c = gttVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f265931a = obj;
        this.f265932b |= Integer.MIN_VALUE;
        return this.f265933c.emit(null, this);
    }
}
