package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class raf extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f197298a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2470ut f197299b;

    /* JADX INFO: renamed from: c */
    public int f197300c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public raf(C2470ut c2470ut, fbk fbkVar) {
        super(fbkVar);
        this.f197299b = c2470ut;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f197298a = obj;
        this.f197300c |= Integer.MIN_VALUE;
        return this.f197299b.emit(null, this);
    }
}
