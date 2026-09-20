package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bcp0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f25930a;

    /* JADX INFO: renamed from: b */
    public int f25931b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ q17 f25932c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcp0(q17 q17Var, fbk fbkVar) {
        super(fbkVar);
        this.f25932c = q17Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f25930a = obj;
        this.f25931b |= Integer.MIN_VALUE;
        return this.f25932c.emit(null, this);
    }
}
