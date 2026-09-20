package p204p;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class zxd1 extends AbstractC2115m5 {

    /* JADX INFO: renamed from: a */
    public final zv41 f287291a;

    /* JADX INFO: renamed from: b */
    public final nuu0 f287292b;

    /* JADX INFO: renamed from: c */
    public yxd1 f287293c;

    public zxd1() {
        zv41 zv41VarM52819d = jag1.m52819d(null);
        this.f287291a = zv41VarM52819d;
        this.f287292b = bzf1.m31021m(zv41VarM52819d);
    }

    /* JADX INFO: renamed from: a */
    public final void m97196a(Activity activity) {
        rxd1.f203578a.getClass();
        qxd1 qxd1VarM79592a = ((sxd1) ((rxd1) ngd1.f153667X.invoke(sxd1.f214876b))).m79592a(activity);
        int iWidth = qxd1VarM79592a.m74115a().width();
        int iHeight = qxd1VarM79592a.m74115a().height();
        float f = activity.getResources().getDisplayMetrics().density;
        xxd1 xxd1VarM63733i = n5h1.m63733i(iWidth / f, iHeight / f);
        zv41 zv41Var = this.f287291a;
        zv41Var.getClass();
        zv41Var.m97091m(null, xxd1VarM63733i);
    }

    @Override // p204p.AbstractC2115m5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        yxd1 yxd1Var = new yxd1(activity, this);
        this.f287293c = yxd1Var;
        viewGroup.addView(yxd1Var);
        m97196a(activity);
    }

    @Override // p204p.AbstractC2115m5, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f287293c != null) {
            ((ViewGroup) activity.findViewById(R.id.content)).removeView(this.f287293c);
            this.f287293c = null;
        }
    }
}
