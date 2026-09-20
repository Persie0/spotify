package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ib40 extends ibk {

    /* JADX INFO: renamed from: a */
    public int f100432a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f100433b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kb40 f100434c;

    /* JADX INFO: renamed from: d */
    public int f100435d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib40(kb40 kb40Var, ibk ibkVar) {
        super(ibkVar);
        this.f100434c = kb40Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f100433b = obj;
        this.f100435d |= Integer.MIN_VALUE;
        return kb40.m55928e(this.f100434c, null, false, this);
    }
}
