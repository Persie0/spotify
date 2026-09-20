package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public final class wph extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f253769a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hr91 f253770b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wph(hr91 hr91Var, int i) {
        super(1);
        this.f253769a = i;
        this.f253770b = hr91Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f253769a) {
            case 0:
                hr91 hr91Var = this.f253770b;
                hr91Var.start();
                return new C1865fm(hr91Var, 23);
            default:
                return (View) this.f253770b.getView();
        }
    }
}
