package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class l3e1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f129317a;

    /* JADX INFO: renamed from: b */
    public int f129318b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jpc1 f129319c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3e1(jpc1 jpc1Var, fbk fbkVar) {
        super(fbkVar);
        this.f129319c = jpc1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f129317a = obj;
        this.f129318b |= Integer.MIN_VALUE;
        return this.f129319c.emit(null, this);
    }
}
