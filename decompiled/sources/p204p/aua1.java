package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class aua1 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f19901a;

    /* JADX INFO: renamed from: b */
    public int f19902b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ie91 f19903c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aua1(ie91 ie91Var, fbk fbkVar) {
        super(fbkVar);
        this.f19903c = ie91Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f19901a = obj;
        this.f19902b |= Integer.MIN_VALUE;
        return this.f19903c.emit(null, this);
    }
}
