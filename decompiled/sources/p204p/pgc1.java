package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pgc1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f177288a;

    /* JADX INFO: renamed from: b */
    public int f177289b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ di91 f177290c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgc1(di91 di91Var, fbk fbkVar) {
        super(fbkVar);
        this.f177290c = di91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f177288a = obj;
        this.f177289b |= Integer.MIN_VALUE;
        return this.f177290c.emit(null, this);
    }
}
