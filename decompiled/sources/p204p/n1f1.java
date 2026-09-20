package p204p;

import android.content.Context;
import com.ravelin.core.model.DeviceId;
import com.ravelin.core.model.ErrorMetadata;
import com.ravelin.core.model.Events;
import com.ravelin.core.model.MobileError;
import com.ravelin.core.model.MobileReportRequest;
import com.ravelin.core.model.RavelinError;
import com.ravelin.core.model.RavelinJSONError;
import com.ravelin.core.model.SharedPackages;
import com.ravelin.core.repository.MobileReportWorker;
import com.ravelin.core.repository.RavelinWorker;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public class n1f1 implements p2f1 {

    /* JADX INFO: renamed from: g */
    public static final String f149409g;

    /* JADX INFO: renamed from: a */
    public final Context f149410a;

    /* JADX INFO: renamed from: b */
    public final String f149411b;

    /* JADX INFO: renamed from: c */
    public final h2f1 f149412c;

    /* JADX INFO: renamed from: d */
    public Events f149413d;

    /* JADX INFO: renamed from: e */
    public SharedPackages f149414e;

    /* JADX INFO: renamed from: f */
    public String f149415f;

    static {
        String canonicalName = n1f1.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = n1f1.class.getSimpleName();
        }
        f149409g = canonicalName;
    }

    public n1f1(Context context, String str, h2f1 h2f1Var) {
        this.f149410a = context;
        this.f149411b = str;
        this.f149412c = h2f1Var;
    }

    @Override // p204p.p2f1
    /* JADX INFO: renamed from: b */
    public void mo63481b(lau0 lau0Var) {
        x8b x8bVarMo63482c = mo63482c();
        if (x8bVarMo63482c != null) {
            if (!x8bVarMo63482c.mo52179f()) {
                x8bVarMo63482c.mo52182p(new s0f1(3, this, lau0Var));
            } else if (lau0Var != null) {
                lau0Var.mo46940a(new RavelinError("This request is already enqueued", null, 2, null));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public x8b mo63482c() {
        return this.f149412c.f86966a.m79873b(edb.m38564m("token ", this.f149411b), this.f149413d);
    }

    /* JADX INFO: renamed from: d */
    public String mo63483d() {
        return "RavelinSendInformation";
    }

    /* JADX INFO: renamed from: e */
    public a8j mo63484e() {
        return new a8j(new thj0(null), 2, false, false, false, false, -1L, -1L, g6f.m43736n1(new LinkedHashSet()));
    }

    /* JADX INFO: renamed from: f */
    public sco mo63485f() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Api", this.f149411b);
        linkedHashMap.put("Payload", q0f1.m71831e(new p4b1(13)).m41881b(epv0.m39700t(Events.INSTANCE.serializer()), this.f149413d));
        sco scoVar = new sco(linkedHashMap);
        n0e1.m63412T(scoVar);
        return scoVar;
    }

    /* JADX INFO: renamed from: g */
    public Class mo63486g() {
        return RavelinWorker.class;
    }

    /* JADX INFO: renamed from: h */
    public final void m63487h(RavelinJSONError ravelinJSONError, boolean z) {
        c1e1 c1e1VarM31259f = ((knl0) new knl0(mo63486g()).m31262i(mo63485f())).m31259f(mo63484e());
        qzb0.m74313m(c1e1VarM31259f);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        to8 to8Var = to8.f222196a;
        lnl0 lnl0Var = (lnl0) ((knl0) ((knl0) c1e1VarM31259f.m31258e(to8Var, 1L, timeUnit)).m31254a(mo63483d())).m31255b();
        l0e1 l0e1VarM57799S = l0e1.m57799S(this.f149410a);
        l0e1VarM57799S.getClass();
        List listM44518y = geg1.m44518y(lnl0Var);
        if (listM44518y.isEmpty()) {
            throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
        }
        yzd1 yzd1Var = new yzd1(l0e1VarM57799S, listM44518y);
        if (z) {
            yzd1Var.m94985w0();
            return;
        }
        knl0 knl0Var = new knl0(MobileReportWorker.class);
        MobileReportRequest mobileReportRequest = new MobileReportRequest("7.0.0-ravelinandroid", "android", null, DeviceId.INSTANCE.Lpt5().getId(), Collections.singletonList(new MobileError(ravelinJSONError, this.f149415f, new ErrorMetadata(300, "Connectivity", "An IO error occurred while trying to send an API request to a Ravelin endpoint", (String) null, pmf0.m70321g(), (String) null, (Integer) null, 104, (DefaultConstructorMarker) null))));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Api", this.f149411b);
        linkedHashMap.put("MobileReportRequest", q0f1.m71831e(new p4b1(13)).m41881b(MobileReportRequest.INSTANCE.serializer(), mobileReportRequest));
        sco scoVar = new sco(linkedHashMap);
        n0e1.m63412T(scoVar);
        c1e1 c1e1VarM31259f2 = ((knl0) knl0Var.m31262i(scoVar)).m31259f(mo63484e());
        qzb0.m74313m(c1e1VarM31259f2);
        List listSingletonList = Collections.singletonList((lnl0) ((knl0) c1e1VarM31259f2.m31258e(to8Var, 1L, timeUnit)).m31255b());
        if (!listSingletonList.isEmpty()) {
            yzd1Var = new yzd1(l0e1VarM57799S, null, 2, listSingletonList, Collections.singletonList(yzd1Var));
        }
        yzd1Var.m94985w0();
    }

    /* JADX INFO: renamed from: i */
    public final Events m63488i() {
        return this.f149413d;
    }
}
