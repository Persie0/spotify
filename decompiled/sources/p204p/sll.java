package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sll extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f210436a;

    /* JADX INFO: renamed from: b */
    public int f210437b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f210438c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sll(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f210438c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f210436a = obj;
        this.f210437b |= Integer.MIN_VALUE;
        return this.f210438c.emit(null, this);
    }
}
