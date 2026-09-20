package p204p;

import android.app.Application;
import android.content.Context;
import com.ravelin.core.model.DeviceId;
import com.ravelin.core.model.MobileError;
import com.ravelin.core.model.MobileReportRequest;
import com.ravelin.core.repository.MobileReportWorker;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public final class z2f1 implements xd70 {

    /* JADX INFO: renamed from: a */
    public final String f278567a;

    /* JADX INFO: renamed from: b */
    public final Context f278568b;

    /* JADX INFO: renamed from: c */
    public final p2f1 f278569c;

    public z2f1(String str, Application application, p2f1 p2f1Var) {
        this.f278567a = str;
        this.f278568b = application;
        this.f278569c = p2f1Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m95188a(MobileError mobileError) {
        MobileReportRequest mobileReportRequest = new MobileReportRequest("7.0.0-ravelinandroid", "android", null, DeviceId.INSTANCE.Lpt5().getId(), null);
        mobileReportRequest.lpt2(Collections.singletonList(mobileError));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Api", this.f278567a);
        linkedHashMap.put("MobileReportRequest", q0f1.m71831e(new p4b1(13)).m41881b(MobileReportRequest.INSTANCE.serializer(), mobileReportRequest));
        sco scoVar = new sco(linkedHashMap);
        n0e1.m63412T(scoVar);
        c1e1 c1e1VarM31259f = ((knl0) new knl0(MobileReportWorker.class).m31262i(scoVar)).m31259f(new a8j(new thj0(null), 2, false, false, false, false, -1L, -1L, g6f.m43736n1(new LinkedHashSet())));
        qzb0.m74313m(c1e1VarM31259f);
        lnl0 lnl0Var = (lnl0) ((knl0) c1e1VarM31259f.m31258e(to8.f222196a, 10L, TimeUnit.SECONDS)).m31255b();
        l0e1 l0e1VarM57799S = l0e1.m57799S(this.f278568b);
        l0e1VarM57799S.getClass();
        List listM44518y = geg1.m44518y(lnl0Var);
        if (listM44518y.isEmpty()) {
            throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
        }
        new yzd1(l0e1VarM57799S, listM44518y).m94985w0();
    }
}
