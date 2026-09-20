package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class qka extends ibk {

    /* JADX INFO: renamed from: a */
    public tiv0 f189506a;

    /* JADX INFO: renamed from: b */
    public Object[] f189507b;

    /* JADX INFO: renamed from: c */
    public int f189508c;

    /* JADX INFO: renamed from: d */
    public int f189509d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f189510e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ rka f189511f;

    /* JADX INFO: renamed from: g */
    public int f189512g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qka(rka rkaVar, fbk fbkVar) {
        super(fbkVar);
        this.f189511f = rkaVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f189510e = obj;
        this.f189512g |= Integer.MIN_VALUE;
        return this.f189511f.m75724a(null, this);
    }
}
