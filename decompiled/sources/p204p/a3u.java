package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class a3u extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f12073a;

    /* JADX INFO: renamed from: b */
    public int f12074b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f12075c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3u(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f12075c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f12073a = obj;
        this.f12074b |= Integer.MIN_VALUE;
        return this.f12075c.emit(null, this);
    }
}
