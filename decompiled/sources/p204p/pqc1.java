package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes10.dex */
public final class pqc1 extends enk0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f180262b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qqc1 f180263c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqc1(ixb1 ixb1Var, qqc1 qqc1Var) {
        super(ixb1Var);
        this.f180262b = 2;
        this.f180263c = qqc1Var;
    }

    @Override // p204p.enk0
    /* JADX INFO: renamed from: a */
    public final void mo34343a(qr60 qr60Var, Object obj, Object obj2) {
        View view;
        View view2;
        switch (this.f180262b) {
            case 0:
                if (!wj50.m88271j((dx40) obj, (dx40) obj2)) {
                    qqc1.m73514b(this.f180263c);
                }
                break;
            case 1:
                if (!wj50.m88271j((dx40) obj, (dx40) obj2)) {
                    qqc1.m73514b(this.f180263c);
                }
                break;
            case 2:
                if (!wj50.m88271j((eh00) obj, (eh00) obj2)) {
                    qqc1.m73514b(this.f180263c);
                }
                break;
            default:
                oqc1 oqc1Var = this.f180263c.f191541i;
                uwb0 uwb0Var = (uwb0) obj2;
                uwb0 uwb0Var2 = (uwb0) obj;
                if (uwb0Var2 != null && (view2 = uwb0Var2.f234621a) != null) {
                    view2.removeOnLayoutChangeListener(oqc1Var);
                }
                if (uwb0Var != null && (view = uwb0Var.f234621a) != null) {
                    view.addOnLayoutChangeListener(oqc1Var);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqc1(qqc1 qqc1Var, int i) {
        super(dx40.f53847e);
        this.f180262b = i;
        this.f180263c = qqc1Var;
        switch (i) {
            case 1:
                super(dx40.f53847e);
                break;
            case 2:
            default:
                break;
            case 3:
                super(null);
                break;
        }
    }
}
