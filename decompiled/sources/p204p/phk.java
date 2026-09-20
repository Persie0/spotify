package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class phk extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f177675a;

    /* JADX INFO: renamed from: b */
    public int f177676b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f177677c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public phk(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f177677c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f177675a = obj;
        this.f177676b |= Integer.MIN_VALUE;
        return this.f177677c.emit(null, this);
    }
}
