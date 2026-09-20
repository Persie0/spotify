package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fso0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f72911a;

    /* JADX INFO: renamed from: b */
    public int f72912b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wli0 f72913c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fso0(wli0 wli0Var, fbk fbkVar) {
        super(fbkVar);
        this.f72913c = wli0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f72911a = obj;
        this.f72912b |= Integer.MIN_VALUE;
        return this.f72913c.emit(null, this);
    }
}
