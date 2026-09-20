package p204p;

import com.spotify.kidsrequest.p089v1.GetPendingRequestsResponse;
import com.spotify.kidsrequest.p089v1.PendingAllowlistRequest;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class y670 {

    /* JADX INFO: renamed from: a */
    public final z670 f269698a;

    public y670(z670 z670Var) {
        this.f269698a = z670Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x004c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m92950a(String str, ibk ibkVar) {
        x670 x670Var;
        yn3 wn3Var;
        thn0 thn0Var;
        if (ibkVar instanceof x670) {
            x670Var = (x670) ibkVar;
            int i = x670Var.f258606c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x670Var.f258606c = i - Integer.MIN_VALUE;
            } else {
                x670Var = new x670(this, ibkVar);
            }
        } else {
            x670Var = new x670(this, ibkVar);
        }
        Object objM95473c = x670Var.f258604a;
        int i2 = x670Var.f258606c;
        if (i2 == 0) {
            bga.m29073P(objM95473c);
            x670Var.f258606c = 1;
            objM95473c = this.f269698a.m95473c(str, x670Var);
            yuk yukVar = yuk.f276404a;
            if (objM95473c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM95473c);
        }
        GetPendingRequestsResponse getPendingRequestsResponse = (GetPendingRequestsResponse) objM95473c;
        ae50<PendingAllowlistRequest> ae50VarM12242o = getPendingRequestsResponse.m12242o();
        ArrayList arrayList = new ArrayList();
        for (PendingAllowlistRequest pendingAllowlistRequest : ae50VarM12242o) {
            String strM12245p = pendingAllowlistRequest.m12245p();
            int iM12244o = pendingAllowlistRequest.m12244o();
            int i3 = iM12244o == 0 ? -1 : w670.f248272a[edb.m38547C(iM12244o)];
            if (i3 != 1) {
                if (i3 == 2) {
                    wn3Var = new xn3(pendingAllowlistRequest.m12246q().m12250q(), pendingAllowlistRequest.m12246q().m12248n(), pendingAllowlistRequest.m12246q().m12249o());
                } else {
                    if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    thn0Var = null;
                }
                if (thn0Var != null) {
                    arrayList.add(thn0Var);
                }
            } else {
                wn3Var = new wn3(pendingAllowlistRequest.m12243n().m12240n());
            }
            thn0Var = new thn0(strM12245p, wn3Var, TimeUnit.SECONDS.toMillis(pendingAllowlistRequest.getCreatedAt().m1969s()));
            if (thn0Var != null) {
                arrayList.add(thn0Var);
            }
        }
        return new mjn0(getPendingRequestsResponse.m12241n(), arrayList);
    }
}
