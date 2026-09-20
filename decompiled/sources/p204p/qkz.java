package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class qkz extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f189672a;

    /* JADX INFO: renamed from: b */
    public int f189673b;

    /* JADX INFO: renamed from: c */
    public niz f189674c;

    /* JADX INFO: renamed from: d */
    public int f189675d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ okz f189676e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qkz(okz okzVar, fbk fbkVar) {
        super(fbkVar);
        this.f189676e = okzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f189672a = obj;
        this.f189673b |= Integer.MIN_VALUE;
        return this.f189676e.emit(null, this);
    }
}
