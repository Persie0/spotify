package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zff0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f282304a;

    /* JADX INFO: renamed from: b */
    public int f282305b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqd0 f282306c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zff0(yqd0 yqd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f282306c = yqd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f282304a = obj;
        this.f282305b |= Integer.MIN_VALUE;
        return this.f282306c.emit(null, this);
    }
}
