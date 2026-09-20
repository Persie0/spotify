package p204p;

import android.app.Activity;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes9.dex */
public final class gc60 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f78499a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kc60 f78500b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Activity f78501c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gc60(kc60 kc60Var, Activity activity, int i) {
        super(0);
        this.f78499a = i;
        this.f78500b = kc60Var;
        this.f78501c = activity;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f78499a) {
            case 0:
                kc60 kc60Var = this.f78500b;
                LinkedHashSet linkedHashSet = kc60Var.f121389g;
                Activity activity = this.f78501c;
                linkedHashSet.remove(activity);
                tv4 tv4Var = (tv4) kc60Var.f121388f.remove(activity);
                if (tv4Var != null) {
                    tv4Var.m81603a(false);
                }
                return kc60.m56012a(kc60Var, kc60.m56013b(kc60Var));
            default:
                kc60 kc60Var2 = this.f78500b;
                LinkedHashSet linkedHashSet2 = kc60Var2.f121389g;
                Activity activity2 = this.f78501c;
                linkedHashSet2.remove(activity2);
                tv4 tv4Var2 = (tv4) kc60Var2.f121388f.get(activity2);
                if (tv4Var2 != null) {
                    tv4Var2.m81603a(false);
                }
                return kc60.m56012a(kc60Var2, kc60.m56013b(kc60Var2));
        }
    }
}
