package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class h5e extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f87809a;

    /* JADX INFO: renamed from: b */
    public int f87810b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i5e f87811c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5e(i5e i5eVar, fbk fbkVar) {
        super(fbkVar);
        this.f87811c = i5eVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f87809a = obj;
        this.f87810b |= Integer.MIN_VALUE;
        return this.f87811c.emit(null, this);
    }
}
