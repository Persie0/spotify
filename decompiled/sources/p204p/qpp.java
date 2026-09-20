package p204p;

import android.view.View;
import android.widget.CheckBox;

/* JADX INFO: loaded from: classes8.dex */
public final class qpp implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f191351a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ umn f191352b;

    public /* synthetic */ qpp(umn umnVar, int i) {
        this.f191351a = i;
        this.f191352b = umnVar;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r2v6, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r2v9, types: [p.gh00, p.qe70] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f191351a) {
            case 0:
                boolean zIsChecked = ((CheckBox) view).isChecked();
                umn umnVar = this.f191352b;
                if (!zIsChecked) {
                    ((qe70) umnVar.f231916c).invoke(imc0.f103667a);
                } else {
                    ((qe70) umnVar.f231916c).invoke(hmc0.f92890a);
                }
                break;
            default:
                ((qe70) this.f191352b.f231916c).invoke(jmc0.f113819a);
                break;
        }
    }
}
