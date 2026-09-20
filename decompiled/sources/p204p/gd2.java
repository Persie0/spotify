package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class gd2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f78709a;

    /* JADX INFO: renamed from: b */
    public int f78710b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f78711c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd2(gd1 gd1Var, fbk fbkVar) {
        super(fbkVar);
        this.f78711c = gd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f78709a = obj;
        this.f78710b |= Integer.MIN_VALUE;
        return this.f78711c.emit(null, this);
    }
}
