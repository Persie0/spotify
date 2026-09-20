package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
public final class ouo implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f170325a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ quo f170326b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f170327c;

    public /* synthetic */ ouo(quo quoVar, gh00 gh00Var, int i) {
        this.f170325a = i;
        this.f170326b = quoVar;
        this.f170327c = gh00Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1891gb c1891gbMo58589a;
        int i;
        C1891gb c1891gbMo58591c;
        int i2;
        switch (this.f170325a) {
            case 0:
                AbstractC2158nb abstractC2158nb = this.f170326b.f192747b;
                if (abstractC2158nb != null && (c1891gbMo58589a = abstractC2158nb.mo58589a()) != null && (i = c1891gbMo58589a.f78158b) != 0) {
                    this.f170327c.invoke(new C2009jb(i));
                    break;
                }
                break;
            default:
                AbstractC2158nb abstractC2158nb2 = this.f170326b.f192747b;
                if (abstractC2158nb2 != null && (c1891gbMo58591c = abstractC2158nb2.mo58591c()) != null && (i2 = c1891gbMo58591c.f78158b) != 0) {
                    this.f170327c.invoke(new C2009jb(i2));
                    break;
                }
                break;
        }
    }
}
