package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class yli extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f274029a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zli f274030b;

    /* JADX INFO: renamed from: c */
    public int f274031c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yli(zli zliVar, ibk ibkVar) {
        super(ibkVar);
        this.f274030b = zliVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f274029a = obj;
        this.f274031c |= Integer.MIN_VALUE;
        return this.f274030b.m96382l(this);
    }
}
