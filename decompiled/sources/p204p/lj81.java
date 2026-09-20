package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class lj81 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f134009a;

    /* JADX INFO: renamed from: b */
    public int f134010b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ud71 f134011c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj81(ud71 ud71Var, fbk fbkVar) {
        super(fbkVar);
        this.f134011c = ud71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f134009a = obj;
        this.f134010b |= Integer.MIN_VALUE;
        return this.f134011c.emit(null, this);
    }
}
