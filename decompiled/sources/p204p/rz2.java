package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class rz2 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f204035a;

    /* JADX INFO: renamed from: b */
    public int f204036b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gd1 f204037c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz2(gd1 gd1Var, fbk fbkVar) {
        super(fbkVar);
        this.f204037c = gd1Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f204035a = obj;
        this.f204036b |= Integer.MIN_VALUE;
        return this.f204037c.emit(null, this);
    }
}
