package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ic90 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f100760a;

    /* JADX INFO: renamed from: b */
    public int f100761b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qb90 f100762c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic90(qb90 qb90Var, fbk fbkVar) {
        super(fbkVar);
        this.f100762c = qb90Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f100760a = obj;
        this.f100761b |= Integer.MIN_VALUE;
        return this.f100762c.emit(null, this);
    }
}
