package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class b8v0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f24670a;

    /* JADX INFO: renamed from: b */
    public int f24671b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jcu0 f24672c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8v0(jcu0 jcu0Var, fbk fbkVar) {
        super(fbkVar);
        this.f24672c = jcu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f24670a = obj;
        this.f24671b |= Integer.MIN_VALUE;
        return this.f24672c.emit(null, this);
    }
}
