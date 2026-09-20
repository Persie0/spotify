package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ia0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f100114a;

    /* JADX INFO: renamed from: b */
    public int f100115b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2438u3 f100116c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia0(C2438u3 c2438u3, fbk fbkVar) {
        super(fbkVar);
        this.f100116c = c2438u3;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f100114a = obj;
        this.f100115b |= Integer.MIN_VALUE;
        return this.f100116c.emit(null, this);
    }
}
