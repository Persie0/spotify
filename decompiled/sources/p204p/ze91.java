package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ze91 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f281982a;

    /* JADX INFO: renamed from: b */
    public int f281983b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f281984c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze91(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f281984c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f281982a = obj;
        this.f281983b |= Integer.MIN_VALUE;
        return this.f281984c.emit(null, this);
    }
}
