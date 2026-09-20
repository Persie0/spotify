package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class tc30 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f218999a;

    /* JADX INFO: renamed from: b */
    public int f219000b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v020 f219001c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc30(v020 v020Var, fbk fbkVar) {
        super(fbkVar);
        this.f219001c = v020Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f218999a = obj;
        this.f219000b |= Integer.MIN_VALUE;
        return this.f219001c.emit(null, this);
    }
}
