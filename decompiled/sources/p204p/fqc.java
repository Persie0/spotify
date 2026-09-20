package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class fqc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f72146a;

    /* JADX INFO: renamed from: b */
    public int f72147b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f72148c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fqc(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f72148c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f72146a = obj;
        this.f72147b |= Integer.MIN_VALUE;
        return this.f72148c.emit(null, this);
    }
}
