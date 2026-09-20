package p204p;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.C0142c;
import java.util.Calendar;

/* JADX INFO: loaded from: classes4.dex */
public final class e3d0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55754a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0142c f55755b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ f3d0 f55756c;

    public /* synthetic */ e3d0(f3d0 f3d0Var, C0142c c0142c, int i) {
        this.f55754a = i;
        this.f55756c = f3d0Var;
        this.f55755b = c0142c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f55754a) {
            case 0:
                f3d0 f3d0Var = this.f55756c;
                int iM939g1 = ((LinearLayoutManager) f3d0Var.f65479H1.getLayoutManager()).m939g1() + 1;
                if (iM939g1 < f3d0Var.f65479H1.getAdapter().mo1617e()) {
                    Calendar calendarM57746a = kza1.m57746a(this.f55755b.f2121e.f162755a.f74745a);
                    calendarM57746a.add(2, iM939g1);
                    f3d0Var.m40652i1(new fyh0(calendarM57746a));
                }
                break;
            default:
                f3d0 f3d0Var2 = this.f55756c;
                int iM942i1 = ((LinearLayoutManager) f3d0Var2.f65479H1.getLayoutManager()).m942i1() - 1;
                if (iM942i1 >= 0) {
                    Calendar calendarM57746a2 = kza1.m57746a(this.f55755b.f2121e.f162755a.f74745a);
                    calendarM57746a2.add(2, iM942i1);
                    f3d0Var2.m40652i1(new fyh0(calendarM57746a2));
                }
                break;
        }
    }
}
