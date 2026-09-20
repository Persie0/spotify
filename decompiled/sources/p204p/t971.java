package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class t971 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f218201a;

    /* JADX INFO: renamed from: b */
    public int f218202b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b941 f218203c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t971(b941 b941Var, fbk fbkVar) {
        super(fbkVar);
        this.f218203c = b941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f218201a = obj;
        this.f218202b |= Integer.MIN_VALUE;
        return this.f218203c.emit(null, this);
    }
}
