package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class f6a1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f66345a;

    /* JADX INFO: renamed from: b */
    public int f66346b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f66347c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6a1(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f66347c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f66345a = obj;
        this.f66346b |= Integer.MIN_VALUE;
        return this.f66347c.emit(null, this);
    }
}
