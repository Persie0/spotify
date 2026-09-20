package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ykv0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f273845a;

    /* JADX INFO: renamed from: b */
    public int f273846b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jcu0 f273847c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ykv0(jcu0 jcu0Var, fbk fbkVar) {
        super(fbkVar);
        this.f273847c = jcu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f273845a = obj;
        this.f273846b |= Integer.MIN_VALUE;
        return this.f273847c.emit(null, this);
    }
}
