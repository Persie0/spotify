package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class mif0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f144012a;

    /* JADX INFO: renamed from: b */
    public int f144013b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f144014c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mif0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f144014c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f144012a = obj;
        this.f144013b |= Integer.MIN_VALUE;
        return this.f144014c.emit(null, this);
    }
}
