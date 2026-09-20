package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ueq extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f229579a;

    /* JADX INFO: renamed from: b */
    public int f229580b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ veq f229581c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ueq(veq veqVar, fbk fbkVar) {
        super(fbkVar);
        this.f229581c = veqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f229579a = obj;
        this.f229580b |= Integer.MIN_VALUE;
        return this.f229581c.emit(null, this);
    }
}
