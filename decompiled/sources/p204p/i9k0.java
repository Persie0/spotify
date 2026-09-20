package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class i9k0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f100030a;

    /* JADX INFO: renamed from: b */
    public int f100031b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w3k0 f100032c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9k0(w3k0 w3k0Var, fbk fbkVar) {
        super(fbkVar);
        this.f100032c = w3k0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f100030a = obj;
        this.f100031b |= Integer.MIN_VALUE;
        return this.f100032c.emit(null, this);
    }
}
