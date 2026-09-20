package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class mj80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f144182a;

    /* JADX INFO: renamed from: b */
    public int f144183b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c780 f144184c;

    /* JADX INFO: renamed from: d */
    public jj80 f144185d;

    /* JADX INFO: renamed from: e */
    public niz f144186e;

    /* JADX INFO: renamed from: f */
    public int f144187f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj80(c780 c780Var, fbk fbkVar) {
        super(fbkVar);
        this.f144184c = c780Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f144182a = obj;
        this.f144183b |= Integer.MIN_VALUE;
        return this.f144184c.emit(null, this);
    }
}
