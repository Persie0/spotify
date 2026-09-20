package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class wpv extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f253844a;

    /* JADX INFO: renamed from: b */
    public int f253845b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ umv f253846c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpv(umv umvVar, fbk fbkVar) {
        super(fbkVar);
        this.f253846c = umvVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f253844a = obj;
        this.f253845b |= Integer.MIN_VALUE;
        return this.f253846c.emit(null, this);
    }
}
