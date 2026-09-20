package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ht71 extends ibk {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f94949a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ it71 f94950b;

    /* JADX INFO: renamed from: c */
    public int f94951c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht71(it71 it71Var, fbk fbkVar) {
        super(fbkVar);
        this.f94950b = it71Var;
    }

    @Override // p204p.ly8
    public final Object invokeSuspend(Object obj) {
        this.f94949a = obj;
        this.f94951c |= Integer.MIN_VALUE;
        return it71.m51611c(this.f94950b, this);
    }
}
