package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ui9 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f230640a;

    /* JADX INFO: renamed from: b */
    public int f230641b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s98 f230642c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui9(s98 s98Var, fbk fbkVar) {
        super(fbkVar);
        this.f230642c = s98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f230640a = obj;
        this.f230641b |= Integer.MIN_VALUE;
        return this.f230642c.emit(null, this);
    }
}
