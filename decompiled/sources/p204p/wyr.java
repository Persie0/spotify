package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class wyr extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f256339a;

    /* JADX INFO: renamed from: b */
    public int f256340b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ksq f256341c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyr(ksq ksqVar, fbk fbkVar) {
        super(fbkVar);
        this.f256341c = ksqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f256339a = obj;
        this.f256340b |= Integer.MIN_VALUE;
        return this.f256341c.emit(null, this);
    }
}
