package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class xqi extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f265052a;

    /* JADX INFO: renamed from: b */
    public int f265053b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f265054c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqi(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f265054c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f265052a = obj;
        this.f265053b |= Integer.MIN_VALUE;
        return this.f265054c.emit(null, this);
    }
}
