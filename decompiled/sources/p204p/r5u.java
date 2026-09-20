package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class r5u extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f196121a;

    /* JADX INFO: renamed from: b */
    public int f196122b;

    /* JADX INFO: renamed from: c */
    public niz f196123c;

    /* JADX INFO: renamed from: d */
    public int f196124d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ l5u f196125e;

    /* JADX INFO: renamed from: f */
    public nyt f196126f;

    /* JADX INFO: renamed from: g */
    public qs0 f196127g;

    /* JADX INFO: renamed from: h */
    public ef81 f196128h;

    /* JADX INFO: renamed from: i */
    public int f196129i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5u(l5u l5uVar, fbk fbkVar) {
        super(fbkVar);
        this.f196125e = l5uVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f196121a = obj;
        this.f196122b |= Integer.MIN_VALUE;
        return this.f196125e.emit(null, this);
    }
}
