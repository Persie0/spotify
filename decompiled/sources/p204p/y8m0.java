package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class y8m0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f270317a;

    /* JADX INFO: renamed from: b */
    public int f270318b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7m0 f270319c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8m0(i7m0 i7m0Var, fbk fbkVar) {
        super(fbkVar);
        this.f270319c = i7m0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f270317a = obj;
        this.f270318b |= Integer.MIN_VALUE;
        return this.f270319c.emit(null, this);
    }
}
