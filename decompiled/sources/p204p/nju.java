package p204p;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class nju implements qwf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f154658a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dju f154659b;

    public /* synthetic */ nju(dju djuVar, int i) {
        this.f154658a = i;
        this.f154659b = djuVar;
    }

    @Override // p204p.qwf
    /* JADX INFO: renamed from: a */
    public final ovf mo26174a(hwf hwfVar) {
        switch (this.f154658a) {
            case 0:
                if (hwfVar == null) {
                    return new wup(this.f154659b.f49744b, 11);
                }
                throw new ClassCastException();
            case 1:
                dju djuVar = this.f154659b;
                zoh zohVar = new zoh(djuVar.f49744b, new fyf(new C2061kp(djuVar, 2), true, 1852832427));
                zohVar.f284793d.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return zohVar;
            case 2:
                bl11 bl11Var = (bl11) hwfVar;
                boolean z = bl11Var instanceof bl11;
                dju djuVar2 = this.f154659b;
                if (z) {
                    return new byo(djuVar2.f49744b, djuVar2.f49743a, bl11Var.f28057a, 2);
                }
                if (bl11Var == null) {
                    return new byo(djuVar2.f49744b, djuVar2.f49743a, false, 2);
                }
                throw new NoWhenBranchMatchedException();
            case 3:
                jr11 jr11Var = (jr11) hwfVar;
                boolean z2 = jr11Var instanceof jr11;
                dju djuVar3 = this.f154659b;
                if (z2) {
                    return new syo(djuVar3.f49744b, jr11Var.f115055a, djuVar3.f49743a, jr11Var.f115056b);
                }
                if (jr11Var != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return new syo(djuVar3.f49744b, v64.DEFAULT, djuVar3.f49743a, false);
            case 4:
                if (hwfVar == null) {
                    return new xzo(this.f154659b.f49744b, 19);
                }
                throw new ClassCastException();
            case 5:
                if (hwfVar == null) {
                    return new f6q(this.f154659b.f49744b, 16);
                }
                throw new ClassCastException();
            case 6:
                if (hwfVar == null) {
                    return new suo(this.f154659b.f49744b);
                }
                throw new ClassCastException();
            case 7:
                if (hwfVar == null) {
                    return new xzo(this.f154659b.f49744b, 21);
                }
                throw new ClassCastException();
            case 8:
                fe81 fe81Var = (fe81) hwfVar;
                if (fe81Var == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (!(fe81Var instanceof fe81)) {
                    throw new NoWhenBranchMatchedException();
                }
                dju djuVar4 = this.f154659b;
                return new rcq(djuVar4.f49744b, djuVar4.f49743a, fe81Var.f68713a);
            case 9:
                if (hwfVar != null) {
                    throw new ClassCastException();
                }
                dju djuVar5 = this.f154659b;
                return new y1q(djuVar5.f49744b, djuVar5.f49743a, new fju(djuVar5, 13));
            case 10:
                hwf eo81Var = (ho81) hwfVar;
                if (eo81Var == null) {
                    eo81Var = new eo81();
                }
                dju djuVar6 = this.f154659b;
                e940 e940Var = djuVar6.f49743a;
                Context context = djuVar6.f49744b;
                if (eo81Var instanceof fo81) {
                    return new za7(context, e940Var, 21);
                }
                if (eo81Var instanceof go81) {
                    return new tcr0(context, e940Var);
                }
                if (eo81Var instanceof eo81) {
                    return new p36(context, e940Var, new fju(djuVar6, 13));
                }
                throw new NoWhenBranchMatchedException();
            case 11:
                gq81 gq81Var = (gq81) hwfVar;
                boolean z3 = gq81Var instanceof gq81;
                dju djuVar7 = this.f154659b;
                if (z3) {
                    return new vdq(djuVar7.f49744b, gq81Var.f83386b, djuVar7.f49743a, gq81Var.f83385a);
                }
                if (gq81Var != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return new vdq(djuVar7.f49744b, v64.DEFAULT, djuVar7.f49743a, false);
            case 12:
                if (hwfVar == null) {
                    return new f6q(this.f154659b.f49744b, 17);
                }
                throw new ClassCastException();
            case 13:
                if (hwfVar == null) {
                    return new xzo(this.f154659b.f49744b, 25);
                }
                throw new ClassCastException();
            case 14:
                if (hwfVar == null) {
                    return new xzo(this.f154659b.f49744b, 26);
                }
                throw new ClassCastException();
            case 15:
                if (hwfVar == null) {
                    return new za7(this.f154659b.f49744b, 10);
                }
                throw new ClassCastException();
            case 16:
                if (hwfVar == null) {
                    return new f6q(this.f154659b.f49744b, 10);
                }
                throw new ClassCastException();
            case 17:
                if (hwfVar == null) {
                    return new xzo(this.f154659b.f49744b, 12);
                }
                throw new ClassCastException();
            case 18:
                if (hwfVar != null) {
                    throw new ClassCastException();
                }
                dju djuVar8 = this.f154659b;
                return new dwo(djuVar8.f49744b, djuVar8.f49743a, 1);
            case 19:
                un81 un81Var = (un81) hwfVar;
                dju djuVar9 = this.f154659b;
                Context context2 = djuVar9.f49744b;
                e940 e940Var2 = djuVar9.f49743a;
                if (un81Var == null) {
                    un81Var = sn81.f210853a;
                }
                return new p36(context2, e940Var2, un81Var);
            default:
                if (hwfVar == null) {
                    return new xzo(this.f154659b.f49744b, 24);
                }
                throw new ClassCastException();
        }
    }
}
