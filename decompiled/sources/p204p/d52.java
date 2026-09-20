package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class d52 extends ibk {

    /* JADX INFO: renamed from: a */
    public zr9 f45304a;

    /* JADX INFO: renamed from: b */
    public int f45305b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f45306c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ f52 f45307d;

    /* JADX INFO: renamed from: e */
    public int f45308e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d52(f52 f52Var, fbk fbkVar) {
        super(fbkVar);
        this.f45307d = f52Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f45306c = obj;
        this.f45308e |= Integer.MIN_VALUE;
        return f52.m40742a(this.f45307d, null, this);
    }
}
