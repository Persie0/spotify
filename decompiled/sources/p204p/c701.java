package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class c701 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f34692a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ d701 f34693b;

    /* JADX INFO: renamed from: c */
    public int f34694c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c701(d701 d701Var, ibk ibkVar) {
        super(ibkVar);
        this.f34693b = d701Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f34692a = obj;
        this.f34694c |= Integer.MIN_VALUE;
        return this.f34693b.m35162c(null, null, this);
    }
}
