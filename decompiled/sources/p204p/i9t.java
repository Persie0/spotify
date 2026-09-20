package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class i9t extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f100071a;

    /* JADX INFO: renamed from: b */
    public int f100072b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ b3t f100073c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9t(b3t b3tVar, fbk fbkVar) {
        super(fbkVar);
        this.f100073c = b3tVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f100071a = obj;
        this.f100072b |= Integer.MIN_VALUE;
        return this.f100073c.emit(null, this);
    }
}
