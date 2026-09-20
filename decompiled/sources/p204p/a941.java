package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class a941 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f13468a;

    /* JADX INFO: renamed from: b */
    public int f13469b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b941 f13470c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a941(b941 b941Var, fbk fbkVar) {
        super(fbkVar);
        this.f13470c = b941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f13468a = obj;
        this.f13469b |= Integer.MIN_VALUE;
        return this.f13470c.emit(null, this);
    }
}
