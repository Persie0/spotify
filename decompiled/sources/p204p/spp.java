package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class spp extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f212906a;

    /* JADX INFO: renamed from: b */
    public int f212907b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f212908c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spp(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f212908c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f212906a = obj;
        this.f212907b |= Integer.MIN_VALUE;
        return this.f212908c.emit(null, this);
    }
}
