package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class nha1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f153912a;

    /* JADX INFO: renamed from: b */
    public int f153913b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f153914c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nha1(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f153914c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f153912a = obj;
        this.f153913b |= Integer.MIN_VALUE;
        return this.f153914c.emit(null, this);
    }
}
