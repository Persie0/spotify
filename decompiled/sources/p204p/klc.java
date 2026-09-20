package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class klc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f123857a;

    /* JADX INFO: renamed from: b */
    public int f123858b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f123859c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public klc(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f123859c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f123857a = obj;
        this.f123858b |= Integer.MIN_VALUE;
        return this.f123859c.emit(null, this);
    }
}
