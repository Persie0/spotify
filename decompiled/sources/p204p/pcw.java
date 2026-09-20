package p204p;

import android.os.Bundle;
import android.view.View;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class pcw implements Connectable, clc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f176242a;

    /* JADX INFO: renamed from: b */
    public final Object f176243b;

    /* JADX INFO: renamed from: c */
    public final Object f176244c;

    /* JADX INFO: renamed from: d */
    public final Object f176245d;

    /* JADX INFO: renamed from: e */
    public Object f176246e;

    public pcw(tfm0 tfm0Var, y0i0 y0i0Var, hwq0 hwq0Var, m4w m4wVar) {
        this.f176242a = 1;
        this.f176243b = tfm0Var;
        this.f176244c = y0i0Var;
        this.f176245d = hwq0Var;
        this.f176246e = m4wVar;
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        int i = this.f176242a;
        int i2 = 14;
        Object obj = this.f176245d;
        Object obj2 = this.f176243b;
        switch (i) {
            case 0:
                lwr lwrVar = new lwr();
                lwrVar.m60127a(((PublishSubject) obj).subscribe(new C1784dn(consumer, 25)));
                pyu pyuVar = (pyu) obj2;
                lwrVar.m60127a(((zbw) pyuVar.f183520b).f281409f.subscribe(new C1784dn(consumer, 26)));
                ((ovf) ((wg61) pyuVar.f183523e).getValue()).mo2821c(new f6v(this, 24));
                return new C1747cn(18, lwrVar, this);
            case 1:
                tfm0 tfm0Var = (tfm0) obj2;
                nak0 nak0Var = new nak0(4, consumer, (m4w) this.f176246e);
                ((g0q) ((hr81) tfm0Var.f220020b).f94377d).mo2821c(new kfp0(nak0Var, 27));
                muq0 muq0Var = (muq0) tfm0Var.f220021c;
                muq0Var.f147409b.f49673b = nak0Var;
                muq0Var.f147410c.f49673b = nak0Var;
                muq0Var.f147411d.f49673b = nak0Var;
                muq0Var.f147412e.f49673b = nak0Var;
                muq0Var.f147413f.f49673b = nak0Var;
                return new rm90(this, i2);
            case 2:
                int i3 = 23;
                ((lwr) this.f176246e).m60127a(((FlowableMap) obj2).m23331J(new sp5(this, i3)).m23356t(Functions.f7225a).subscribe(new qw90(consumer, i2)));
                return new rm90(this, i3);
            default:
                Connectable[] connectableArr = {(kc01) obj, (kz5) obj2, (gvt0) this.f176246e};
                eo2 eo2Var = new eo2(consumer, 19);
                ArrayList arrayList = new ArrayList(3);
                for (int i4 = 0; i4 < 3; i4++) {
                    arrayList.add(connectableArr[i4].mo3269P(eo2Var));
                }
                return new brh(2, arrayList);
        }
    }

    @Override // p204p.clc1
    public View getView() {
        return (View) ((wg61) this.f176244c).getValue();
    }

    public pcw(FlowableMap flowableMap, l2j0 l2j0Var, gtp gtpVar, k231 k231Var) {
        this.f176242a = 2;
        this.f176243b = flowableMap;
        this.f176244c = l2j0Var;
        this.f176245d = gtpVar;
        this.f176246e = new lwr();
    }

    public pcw(pyu pyuVar) {
        this.f176242a = 0;
        this.f176243b = pyuVar;
        this.f176244c = new wg61(new zyv(this, 6));
        this.f176245d = new PublishSubject();
        this.f176246e = lau.f131415a;
    }

    public pcw(kz5 kz5Var, bwt0 bwt0Var, Bundle bundle, kc01 kc01Var, gvt0 gvt0Var) {
        this.f176242a = 3;
        this.f176243b = kz5Var;
        this.f176245d = kc01Var;
        this.f176246e = gvt0Var;
        this.f176244c = new wg61(new d4w(bwt0Var, 1));
        if (bundle != null) {
            kz5Var.f128017g = bundle.getParcelable("SettingsPageViewBinderImpl.savedState");
        }
    }
}
