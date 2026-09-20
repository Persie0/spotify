package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class rll extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f200335a;

    /* JADX INFO: renamed from: b */
    public int f200336b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f200337c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rll(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f200337c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f200335a = obj;
        this.f200336b |= Integer.MIN_VALUE;
        return this.f200337c.emit(null, this);
    }
}
