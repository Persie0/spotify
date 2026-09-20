package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vpf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f243682a;

    /* JADX INFO: renamed from: b */
    public int f243683b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f243684c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vpf0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f243684c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f243682a = obj;
        this.f243683b |= Integer.MIN_VALUE;
        return this.f243684c.emit(null, this);
    }
}
