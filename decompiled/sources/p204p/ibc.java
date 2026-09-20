package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ibc extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f100505a;

    /* JADX INFO: renamed from: b */
    public int f100506b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c2b f100507c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibc(c2b c2bVar, fbk fbkVar) {
        super(fbkVar);
        this.f100507c = c2bVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f100505a = obj;
        this.f100506b |= Integer.MIN_VALUE;
        return this.f100507c.emit(null, this);
    }
}
