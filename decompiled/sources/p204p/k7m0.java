package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class k7m0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f120162a;

    /* JADX INFO: renamed from: b */
    public int f120163b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ i7m0 f120164c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7m0(i7m0 i7m0Var, fbk fbkVar) {
        super(fbkVar);
        this.f120164c = i7m0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f120162a = obj;
        this.f120163b |= Integer.MIN_VALUE;
        return this.f120164c.emit(null, this);
    }
}
