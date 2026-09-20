package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class jwl0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f116654a;

    /* JADX INFO: renamed from: b */
    public int f116655b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f116656c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jwl0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f116656c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f116654a = obj;
        this.f116655b |= Integer.MIN_VALUE;
        return this.f116656c.emit(null, this);
    }
}
