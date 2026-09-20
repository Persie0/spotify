package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class s370 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f205194a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i791 f205195b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f205196c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gh00 f205197d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s370(i791 i791Var, String str, gh00 gh00Var, int i) {
        super(0);
        this.f205194a = i;
        this.f205195b = i791Var;
        this.f205196c = str;
        this.f205197d = gh00Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f205194a) {
            case 0:
                this.f205197d.invoke(new i370(this.f205195b.m49857a(this.f205196c)));
                break;
            default:
                this.f205197d.invoke(new i370(this.f205195b.m49857a(this.f205196c)));
                break;
        }
        return w2a1.f247311a;
    }
}
