package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class s490 extends ibk {

    /* JADX INFO: renamed from: a */
    public String f205518a;

    /* JADX INFO: renamed from: b */
    public i490 f205519b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f205520c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ u490 f205521d;

    /* JADX INFO: renamed from: e */
    public int f205522e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s490(u490 u490Var, ibk ibkVar) {
        super(ibkVar);
        this.f205521d = u490Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f205520c = obj;
        this.f205522e |= Integer.MIN_VALUE;
        return this.f205521d.m82317b(null, this);
    }
}
