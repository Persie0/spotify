package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dri0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f52334a;

    /* JADX INFO: renamed from: b */
    public int f52335b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c3i0 f52336c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dri0(c3i0 c3i0Var, fbk fbkVar) {
        super(fbkVar);
        this.f52336c = c3i0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f52334a = obj;
        this.f52335b |= Integer.MIN_VALUE;
        return this.f52336c.emit(null, this);
    }
}
