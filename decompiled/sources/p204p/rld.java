package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class rld extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f200280a;

    /* JADX INFO: renamed from: b */
    public int f200281b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqc f200282c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rld(kqc kqcVar, fbk fbkVar) {
        super(fbkVar);
        this.f200282c = kqcVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f200280a = obj;
        this.f200281b |= Integer.MIN_VALUE;
        return this.f200282c.emit(null, this);
    }
}
