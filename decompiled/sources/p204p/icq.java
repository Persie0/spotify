package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class icq extends ibk {

    /* JADX INFO: renamed from: a */
    public hcq f100868a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f100869b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mcq f100870c;

    /* JADX INFO: renamed from: d */
    public int f100871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icq(mcq mcqVar, ibk ibkVar) {
        super(ibkVar);
        this.f100870c = mcqVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f100869b = obj;
        this.f100871d |= Integer.MIN_VALUE;
        return mcq.m61469d(this.f100870c, null, this);
    }
}
