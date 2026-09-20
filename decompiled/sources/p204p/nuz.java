package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class nuz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f158741a;

    /* JADX INFO: renamed from: b */
    public int f158742b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ muz f158743c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nuz(muz muzVar, fbk fbkVar) {
        super(fbkVar);
        this.f158743c = muzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f158741a = obj;
        this.f158742b |= Integer.MIN_VALUE;
        return this.f158743c.emit(null, this);
    }
}
