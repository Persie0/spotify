package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class s941 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f206850a;

    /* JADX INFO: renamed from: b */
    public int f206851b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b941 f206852c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s941(b941 b941Var, fbk fbkVar) {
        super(fbkVar);
        this.f206852c = b941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f206850a = obj;
        this.f206851b |= Integer.MIN_VALUE;
        return this.f206852c.emit(null, this);
    }
}
