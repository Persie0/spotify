package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class d3u extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f45000a;

    /* JADX INFO: renamed from: b */
    public int f45001b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f45002c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3u(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f45002c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f45000a = obj;
        this.f45001b |= Integer.MIN_VALUE;
        return this.f45002c.emit(null, this);
    }
}
