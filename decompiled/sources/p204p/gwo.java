package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class gwo extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f85053a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hwo f85054b;

    /* JADX INFO: renamed from: c */
    public int f85055c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gwo(hwo hwoVar, ibk ibkVar) {
        super(ibkVar);
        this.f85054b = hwoVar;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f85053a = obj;
        this.f85055c |= Integer.MIN_VALUE;
        return hwo.m48942a(this.f85054b, this);
    }
}
