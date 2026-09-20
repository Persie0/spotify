package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class m311 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f139510a;

    /* JADX INFO: renamed from: b */
    public int f139511b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ czz0 f139512c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m311(czz0 czz0Var, fbk fbkVar) {
        super(fbkVar);
        this.f139512c = czz0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f139510a = obj;
        this.f139511b |= Integer.MIN_VALUE;
        return this.f139512c.emit(null, this);
    }
}
