package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class oif0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f165806a;

    /* JADX INFO: renamed from: b */
    public int f165807b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nif0 f165808c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oif0(nif0 nif0Var, fbk fbkVar) {
        super(fbkVar);
        this.f165808c = nif0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f165806a = obj;
        this.f165807b |= Integer.MIN_VALUE;
        return this.f165808c.emit(null, this);
    }
}
