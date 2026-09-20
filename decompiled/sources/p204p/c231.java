package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class c231 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33285a;

    /* JADX INFO: renamed from: b */
    public int f33286b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aq21 f33287c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c231(aq21 aq21Var, fbk fbkVar) {
        super(fbkVar);
        this.f33287c = aq21Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f33285a = obj;
        this.f33286b |= Integer.MIN_VALUE;
        return this.f33287c.emit(null, this);
    }
}
