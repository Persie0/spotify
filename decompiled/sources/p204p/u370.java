package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class u370 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f226283a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i791 f226284b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f226285c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u370(i791 i791Var, gh00 gh00Var, int i) {
        super(1);
        this.f226283a = i;
        this.f226284b = i791Var;
        this.f226285c = gh00Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f226283a) {
            case 0:
                t480 t480Var = (t480) obj;
                String str = t480Var.f216935a;
                boolean z = t480Var instanceof q480;
                i791 i791Var = this.f226284b;
                if (z) {
                    i791Var.m49859c(str);
                } else if (t480Var instanceof r480) {
                    i791Var.m49858b(str);
                }
                this.f226285c.invoke(new j370(t480Var));
                break;
            case 1:
                this.f226284b.m49859c("https://support.spotify.com/article/managed-accounts-for-premium-family/plain/");
                this.f226285c.invoke(new j370(q480.f185099b));
                break;
            default:
                this.f226284b.m49858b("https://www.spotify.com/legal/managed-account-parent-guardian-privacy-policy/plain/");
                this.f226285c.invoke(new j370(s480.f205511b));
                break;
        }
        return w2a1.f247311a;
    }
}
