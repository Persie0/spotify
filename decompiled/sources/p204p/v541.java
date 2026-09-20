package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class v541 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f237311a;

    /* JADX INFO: renamed from: b */
    public int f237312b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f237313c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v541(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f237313c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f237311a = obj;
        this.f237312b |= Integer.MIN_VALUE;
        return this.f237313c.emit(null, this);
    }
}
