package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class zb10 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f281202a;

    /* JADX INFO: renamed from: b */
    public int f281203b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ flz f281204c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb10(flz flzVar, fbk fbkVar) {
        super(fbkVar);
        this.f281204c = flzVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f281202a = obj;
        this.f281203b |= Integer.MIN_VALUE;
        return this.f281204c.emit(null, this);
    }
}
