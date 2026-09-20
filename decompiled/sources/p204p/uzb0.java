package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class uzb0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f235461a;

    /* JADX INFO: renamed from: b */
    public int f235462b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i2a0 f235463c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzb0(i2a0 i2a0Var, fbk fbkVar) {
        super(fbkVar);
        this.f235463c = i2a0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f235461a = obj;
        this.f235462b |= Integer.MIN_VALUE;
        return this.f235463c.emit(null, this);
    }
}
