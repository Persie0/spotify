package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class j210 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f107900a;

    /* JADX INFO: renamed from: b */
    public int f107901b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f107902c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j210(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f107902c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f107900a = obj;
        this.f107901b |= Integer.MIN_VALUE;
        return this.f107902c.emit(null, this);
    }
}
