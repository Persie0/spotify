package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class hf80 extends ibk {

    /* JADX INFO: renamed from: a */
    public ze80 f90625a;

    /* JADX INFO: renamed from: b */
    public ts80 f90626b;

    /* JADX INFO: renamed from: c */
    public fw80 f90627c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f90628d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ nf80 f90629e;

    /* JADX INFO: renamed from: f */
    public int f90630f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf80(nf80 nf80Var, ibk ibkVar) {
        super(ibkVar);
        this.f90629e = nf80Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f90628d = obj;
        this.f90630f |= Integer.MIN_VALUE;
        return nf80.m64330f(this.f90629e, null, this);
    }
}
