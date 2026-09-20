package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tff0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f219949a;

    /* JADX INFO: renamed from: b */
    public int f219950b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ yqd0 f219951c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tff0(yqd0 yqd0Var, fbk fbkVar) {
        super(fbkVar);
        this.f219951c = yqd0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f219949a = obj;
        this.f219950b |= Integer.MIN_VALUE;
        return this.f219951c.emit(null, this);
    }
}
