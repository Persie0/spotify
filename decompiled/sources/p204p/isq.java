package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class isq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f105293a;

    /* JADX INFO: renamed from: b */
    public int f105294b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f105295c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isq(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f105295c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f105293a = obj;
        this.f105294b |= Integer.MIN_VALUE;
        return this.f105295c.emit(null, this);
    }
}
