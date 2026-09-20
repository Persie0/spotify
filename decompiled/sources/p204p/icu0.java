package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class icu0 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f100890a;

    /* JADX INFO: renamed from: b */
    public int f100891b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jcu0 f100892c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icu0(jcu0 jcu0Var, fbk fbkVar) {
        super(fbkVar);
        this.f100892c = jcu0Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f100890a = obj;
        this.f100891b |= Integer.MIN_VALUE;
        return this.f100892c.emit(null, this);
    }
}
