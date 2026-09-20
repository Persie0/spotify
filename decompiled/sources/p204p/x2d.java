package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class x2d extends ibk {

    /* JADX INFO: renamed from: a */
    public zx9 f257416a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f257417b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ y2d f257418c;

    /* JADX INFO: renamed from: d */
    public int f257419d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2d(y2d y2dVar, ibk ibkVar) {
        super(ibkVar);
        this.f257418c = y2dVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f257417b = obj;
        this.f257419d |= Integer.MIN_VALUE;
        return this.f257418c.m92696a(null, this);
    }
}
