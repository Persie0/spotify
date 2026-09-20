package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class kjz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f123450a;

    /* JADX INFO: renamed from: b */
    public int f123451b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ysk f123452c;

    /* JADX INFO: renamed from: d */
    public niz f123453d;

    /* JADX INFO: renamed from: e */
    public int f123454e;

    /* JADX INFO: renamed from: f */
    public int f123455f;

    /* JADX INFO: renamed from: g */
    public int f123456g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjz(ysk yskVar, fbk fbkVar) {
        super(fbkVar);
        this.f123452c = yskVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f123450a = obj;
        this.f123451b |= Integer.MIN_VALUE;
        return this.f123452c.collect(null, this);
    }
}
