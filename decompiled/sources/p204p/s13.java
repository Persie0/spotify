package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class s13 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f204578a;

    /* JADX INFO: renamed from: b */
    public int f204579b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t13 f204580c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s13(t13 t13Var, fbk fbkVar) {
        super(fbkVar);
        this.f204580c = t13Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f204578a = obj;
        this.f204579b |= Integer.MIN_VALUE;
        return this.f204580c.emit(null, this);
    }
}
