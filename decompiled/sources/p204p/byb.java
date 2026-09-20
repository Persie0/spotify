package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class byb extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f32124a;

    /* JADX INFO: renamed from: b */
    public int f32125b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f32126c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byb(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f32126c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f32124a = obj;
        this.f32125b |= Integer.MIN_VALUE;
        return this.f32126c.emit(null, this);
    }
}
