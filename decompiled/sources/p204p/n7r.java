package p204p;

import com.spotify.devicelocation.configurationimpl.events.proto.DeviceLocationConsentCheck;
import com.spotify.devicelocation.configurationimpl.events.proto.DeviceLocationConsentGrant;
import com.spotify.devicelocation.configurationimpl.events.proto.DeviceLocationFixOutcome;
import com.spotify.devicelocation.configurationimpl.events.proto.DeviceLocationPermissionOutcome;
import com.spotify.devicelocation.configurationimpl.events.proto.DeviceLocationWrite;
import com.spotify.voiceassistants.playermodels.SearchEndpointResponseKt;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class n7r {

    /* JADX INFO: renamed from: a */
    public final qre0 f151203a;

    public n7r(qre0 qre0Var) {
        this.f151203a = qre0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m63806a(a5j a5jVar, int i, String str) {
        String str2;
        c7r c7rVarM9232q = DeviceLocationConsentCheck.m9232q();
        if (a5jVar != null) {
            int iOrdinal = a5jVar.ordinal();
            if (iOrdinal == 0) {
                str2 = "INELIGIBLE";
            } else if (iOrdinal == 1) {
                str2 = "ELIGIBLE_NOT_GRANTED";
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "GRANTED";
            }
        } else {
            str2 = "";
        }
        c7rVarM9232q.m31756m(str2);
        c7rVarM9232q.m31757q(i);
        if (str.length() == 0) {
            str = "unspecified";
        }
        c7rVarM9232q.m31758r(str);
        this.f151203a.m73616a(c7rVarM9232q.build());
    }

    /* JADX INFO: renamed from: b */
    public final void m63807b(boolean z, a5j a5jVar, int i, String str) {
        String str2;
        d7r d7rVarM9237r = DeviceLocationConsentGrant.m9237r();
        d7rVarM9237r.m35231m(z ? "GRANT" : "REVOKE");
        if (a5jVar != null) {
            int iOrdinal = a5jVar.ordinal();
            if (iOrdinal == 0) {
                str2 = "INELIGIBLE";
            } else if (iOrdinal == 1) {
                str2 = "ELIGIBLE_NOT_GRANTED";
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "GRANTED";
            }
        } else {
            str2 = "UNKNOWN";
        }
        d7rVarM9237r.m35233r(str2);
        d7rVarM9237r.m35232q(i);
        if (str.length() == 0) {
            str = "unspecified";
        }
        d7rVarM9237r.m35234s(str);
        this.f151203a.m73616a(d7rVarM9237r.build());
    }

    /* JADX INFO: renamed from: c */
    public final void m63808c(int i, String str, String str2, long j) {
        String str3;
        m7r m7rVarM9244t = DeviceLocationFixOutcome.m9244t();
        m7rVarM9244t.m61084q(j);
        m7rVarM9244t.m61086s();
        if (str2.length() == 0) {
            str2 = "unspecified";
        }
        m7rVarM9244t.m61088u(str2);
        int iM38547C = edb.m38547C(i);
        if (iM38547C == 0) {
            str3 = "TIMEOUT";
        } else if (iM38547C == 1) {
            str3 = "PERMISSION_DENIED";
        } else {
            if (iM38547C != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str3 = "FAILED";
        }
        m7rVarM9244t.m61087t(str3);
        m7rVarM9244t.m61085r(str);
        m7rVarM9244t.m61083m(-1.0d);
        this.f151203a.m73616a(m7rVarM9244t.build());
    }

    /* JADX INFO: renamed from: d */
    public final void m63809d(int i, int i2, boolean z) {
        u7r u7rVarM9249r = DeviceLocationPermissionOutcome.m9249r();
        u7rVarM9249r.m82544q(nap.m64032y(i));
        u7rVarM9249r.m82545r(nap.m64032y(i2));
        u7rVarM9249r.m82543m(z);
        u7rVarM9249r.m82546s("unspecified");
        this.f151203a.m73616a(u7rVarM9249r.build());
    }

    /* JADX INFO: renamed from: e */
    public final void m63810e(ima0 ima0Var, int i, double d, String str) {
        h9r h9rVarM9254r = DeviceLocationWrite.m9254r();
        h9rVarM9254r.m46902r(ima0Var == ima0.f103653a ? SearchEndpointResponseKt.RESULT_SUCCESS : "FAILURE");
        h9rVarM9254r.m46901q(i);
        h9rVarM9254r.m46900m(d);
        if (str.length() == 0) {
            str = "unspecified";
        }
        h9rVarM9254r.m46903s(str);
        this.f151203a.m73616a(h9rVarM9254r.build());
    }
}
