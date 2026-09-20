package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class eeq0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f58837a;

    /* JADX INFO: renamed from: b */
    public int f58838b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ndp0 f58839c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eeq0(ndp0 ndp0Var, fbk fbkVar) {
        super(fbkVar);
        this.f58839c = ndp0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f58837a = obj;
        this.f58838b |= Integer.MIN_VALUE;
        return this.f58839c.emit(null, this);
    }
}
