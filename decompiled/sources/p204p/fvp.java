package p204p;

import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes8.dex */
public final class fvp extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f73831a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LinearLayout f73832b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fvp(LinearLayout linearLayout, int i) {
        super(1);
        this.f73831a = i;
        this.f73832b = linearLayout;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f73831a) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                LinearLayout linearLayout = this.f73832b;
                wj50.m88279p(linearLayout);
                linearLayout.setVisibility(!zBooleanValue ? 0 : 8);
                break;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                LinearLayout linearLayout2 = this.f73832b;
                wj50.m88279p(linearLayout2);
                linearLayout2.setVisibility(!zBooleanValue2 ? 0 : 8);
                break;
            default:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                LinearLayout linearLayout3 = this.f73832b;
                wj50.m88279p(linearLayout3);
                linearLayout3.setVisibility(!zBooleanValue3 ? 0 : 8);
                break;
        }
        return w2a1.f247311a;
    }
}
