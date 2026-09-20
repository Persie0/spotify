package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class t2p extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f216600a;

    /* JADX INFO: renamed from: b */
    public int f216601b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s2p f216602c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2p(s2p s2pVar, fbk fbkVar) {
        super(fbkVar);
        this.f216602c = s2pVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f216600a = obj;
        this.f216601b |= Integer.MIN_VALUE;
        return this.f216602c.emit(null, this);
    }
}
