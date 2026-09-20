package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class tf81 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f219881a;

    /* JADX INFO: renamed from: b */
    public int f219882b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ud71 f219883c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf81(ud71 ud71Var, fbk fbkVar) {
        super(fbkVar);
        this.f219883c = ud71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f219881a = obj;
        this.f219882b |= Integer.MIN_VALUE;
        return this.f219883c.emit(null, this);
    }
}
