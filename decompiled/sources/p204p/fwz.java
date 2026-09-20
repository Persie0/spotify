package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class fwz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f74199a;

    /* JADX INFO: renamed from: b */
    public int f74200b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f74201c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwz(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f74201c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f74199a = obj;
        this.f74200b |= Integer.MIN_VALUE;
        return this.f74201c.emit(null, this);
    }
}
