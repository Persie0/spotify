package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class a361 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f11884a;

    /* JADX INFO: renamed from: b */
    public int f11885b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b941 f11886c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a361(b941 b941Var, fbk fbkVar) {
        super(fbkVar);
        this.f11886c = b941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f11884a = obj;
        this.f11885b |= Integer.MIN_VALUE;
        return this.f11886c.emit(null, this);
    }
}
