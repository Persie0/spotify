package p204p;

import com.spotify.encoreconsumermobile.elements.quickactions.QuickActionView;

/* JADX INFO: loaded from: classes6.dex */
public final class mut0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f147435a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ QuickActionView f147436b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mut0(QuickActionView quickActionView, int i) {
        super(1);
        this.f147435a = i;
        this.f147436b = quickActionView;
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r2v15, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r2v3, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r2v7, types: [p.gh00, p.qe70] */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f147435a) {
            case 0:
                this.f147436b.f3724a.invoke(jut0.f116167a);
                break;
            case 1:
                ((Boolean) obj).getClass();
                this.f147436b.f3724a.invoke(jut0.f116169c);
                break;
            case 2:
                this.f147436b.f3724a.invoke(jut0.f116170d);
                break;
            default:
                ((Boolean) obj).getClass();
                this.f147436b.f3724a.invoke(jut0.f116168b);
                break;
        }
        return w2a1.f247311a;
    }
}
