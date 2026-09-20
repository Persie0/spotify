package p204p;

import android.text.style.URLSpan;

/* JADX INFO: loaded from: classes8.dex */
public final class p15 implements gm80 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f172946a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ai00 f172947b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f172948c;

    public /* synthetic */ p15(int i, Object obj, ai00 ai00Var) {
        this.f172946a = i;
        this.f172947b = ai00Var;
        this.f172948c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [p.gh00, p.qe70] */
    @Override // p204p.gm80
    /* JADX INFO: renamed from: a */
    public final void mo28832a(yl80 yl80Var) {
        switch (this.f172946a) {
            case 0:
                ((gh00) this.f172947b).invoke(((URLSpan) this.f172948c).getURL());
                break;
            case 1:
                if (yl80Var instanceof xl80) {
                    String str = ((xl80) yl80Var).f263064a;
                    if (!wj50.m88271j(str, "REQUEST_FULL_PRICE_OFFER")) {
                        ((ht4) this.f172948c).m48571a(str);
                    } else {
                        ((eh00) this.f172947b).invoke();
                    }
                }
                break;
            default:
                ((qe70) this.f172947b).invoke((String) this.f172948c);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p15(String str, gh00 gh00Var) {
        this.f172946a = 2;
        this.f172947b = (qe70) gh00Var;
        this.f172948c = str;
    }
}
