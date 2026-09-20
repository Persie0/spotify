package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class w6v0 extends ibk {

    /* JADX INFO: renamed from: a */
    public niz f248472a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f248473b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ x6v0 f248474c;

    /* JADX INFO: renamed from: d */
    public int f248475d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6v0(x6v0 x6v0Var, fbk fbkVar) {
        super(fbkVar);
        this.f248474c = x6v0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f248473b = obj;
        this.f248475d |= Integer.MIN_VALUE;
        this.f248474c.collect(null, this);
        return yuk.f276404a;
    }
}
