package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class o8n0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f162837a;

    /* JADX INFO: renamed from: b */
    public int f162838b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ m8n0 f162839c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8n0(m8n0 m8n0Var, fbk fbkVar) {
        super(fbkVar);
        this.f162839c = m8n0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f162837a = obj;
        this.f162838b |= Integer.MIN_VALUE;
        return this.f162839c.emit(null, this);
    }
}
