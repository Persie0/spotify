package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mgf0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f143461a;

    /* JADX INFO: renamed from: b */
    public int f143462b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqd0 f143463c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mgf0(yqd0 yqd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f143463c = yqd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f143461a = obj;
        this.f143462b |= Integer.MIN_VALUE;
        return this.f143463c.emit(null, this);
    }
}
