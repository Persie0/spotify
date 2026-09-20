package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vdu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f240491a;

    /* JADX INFO: renamed from: b */
    public int f240492b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jcu0 f240493c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdu0(jcu0 jcu0Var, fbk fbkVar) {
        super(fbkVar);
        this.f240493c = jcu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f240491a = obj;
        this.f240492b |= Integer.MIN_VALUE;
        return this.f240493c.emit(null, this);
    }
}
