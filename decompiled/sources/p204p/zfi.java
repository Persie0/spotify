package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zfi extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f282325a;

    /* JADX INFO: renamed from: b */
    public int f282326b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7i f282327c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfi(i7i i7iVar, fbk fbkVar) {
        super(fbkVar);
        this.f282327c = i7iVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f282325a = obj;
        this.f282326b |= Integer.MIN_VALUE;
        return this.f282327c.emit(null, this);
    }
}
