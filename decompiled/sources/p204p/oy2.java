package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class oy2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f171642a;

    /* JADX INFO: renamed from: b */
    public int f171643b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f171644c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy2(gd1 gd1Var, fbk fbkVar) {
        super(fbkVar);
        this.f171644c = gd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f171642a = obj;
        this.f171643b |= Integer.MIN_VALUE;
        return this.f171644c.emit(null, this);
    }
}
