package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class tdm0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f219402a;

    /* JADX INFO: renamed from: b */
    public int f219403b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ evk0 f219404c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tdm0(evk0 evk0Var, fbk fbkVar) {
        super(fbkVar);
        this.f219404c = evk0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f219402a = obj;
        this.f219403b |= Integer.MIN_VALUE;
        return this.f219404c.emit(null, this);
    }
}
