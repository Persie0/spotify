package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class yp71 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f274868a;

    /* JADX INFO: renamed from: b */
    public int f274869b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ud71 f274870c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp71(ud71 ud71Var, fbk fbkVar) {
        super(fbkVar);
        this.f274870c = ud71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f274868a = obj;
        this.f274869b |= Integer.MIN_VALUE;
        return this.f274870c.emit(null, this);
    }
}
