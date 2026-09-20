package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class qy61 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f193837a;

    /* JADX INFO: renamed from: b */
    public int f193838b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b941 f193839c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qy61(b941 b941Var, fbk fbkVar) {
        super(fbkVar);
        this.f193839c = b941Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f193837a = obj;
        this.f193838b |= Integer.MIN_VALUE;
        return this.f193839c.emit(null, this);
    }
}
