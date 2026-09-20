package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ohk extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f165473a;

    /* JADX INFO: renamed from: b */
    public int f165474b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f165475c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohk(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f165475c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f165473a = obj;
        this.f165474b |= Integer.MIN_VALUE;
        return this.f165475c.emit(null, this);
    }
}
