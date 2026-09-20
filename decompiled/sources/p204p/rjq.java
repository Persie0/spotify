package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class rjq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f199882a;

    /* JADX INFO: renamed from: b */
    public int f199883b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hop f199884c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rjq(hop hopVar, fbk fbkVar) {
        super(fbkVar);
        this.f199884c = hopVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f199882a = obj;
        this.f199883b |= Integer.MIN_VALUE;
        return this.f199884c.emit(null, this);
    }
}
