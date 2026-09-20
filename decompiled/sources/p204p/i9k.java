package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class i9k extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f100027a;

    /* JADX INFO: renamed from: b */
    public int f100028b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ lxi f100029c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9k(lxi lxiVar, fbk fbkVar) {
        super(fbkVar);
        this.f100029c = lxiVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f100027a = obj;
        this.f100028b |= Integer.MIN_VALUE;
        return this.f100029c.emit(null, this);
    }
}
