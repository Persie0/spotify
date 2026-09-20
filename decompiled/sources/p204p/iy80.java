package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class iy80 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f106898a;

    /* JADX INFO: renamed from: b */
    public int f106899b;

    /* JADX INFO: renamed from: c */
    public niz f106900c;

    /* JADX INFO: renamed from: d */
    public int f106901d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ qiy f106902e;

    /* JADX INFO: renamed from: f */
    public vhe0 f106903f;

    /* JADX INFO: renamed from: g */
    public fiz f106904g;

    /* JADX INFO: renamed from: h */
    public int f106905h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy80(qiy qiyVar, fbk fbkVar) {
        super(fbkVar);
        this.f106902e = qiyVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f106898a = obj;
        this.f106899b |= Integer.MIN_VALUE;
        return this.f106902e.emit(null, this);
    }
}
