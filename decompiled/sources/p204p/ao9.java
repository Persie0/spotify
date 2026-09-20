package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ao9 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f17608a;

    /* JADX INFO: renamed from: b */
    public int f17609b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ s98 f17610c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao9(s98 s98Var, fbk fbkVar) {
        super(fbkVar);
        this.f17610c = s98Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f17608a = obj;
        this.f17609b |= Integer.MIN_VALUE;
        return this.f17610c.emit(null, this);
    }
}
