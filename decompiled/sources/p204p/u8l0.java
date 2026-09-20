package p204p;

import com.spotify.messages.OnDemandSetFetchMismatch;
import com.spotify.ondemandselector.proto.OndemandResponse;
import io.reactivex.rxjava3.internal.operators.completable.CompletableAndThenCompletable;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class u8l0 {

    /* JADX INFO: renamed from: a */
    public final r8l0 f227970a;

    /* JADX INFO: renamed from: b */
    public final kpi0 f227971b;

    /* JADX INFO: renamed from: c */
    public final qre0 f227972c;

    public u8l0(r8l0 r8l0Var, kpi0 kpi0Var, qre0 qre0Var) {
        this.f227970a = r8l0Var;
        this.f227971b = kpi0Var;
        this.f227972c = qre0Var;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e9, code lost:
    
        if (p204p.zn91.m96565n(r11, r0) == r6) goto L50;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m82586a(Set set, ibk ibkVar) {
        t8l0 t8l0Var;
        Set set2;
        Object obj;
        if (ibkVar instanceof t8l0) {
            t8l0Var = (t8l0) ibkVar;
            int i = t8l0Var.f218106e;
            if ((i & Integer.MIN_VALUE) != 0) {
                t8l0Var.f218106e = i - Integer.MIN_VALUE;
            } else {
                t8l0Var = new t8l0(this, ibkVar);
            }
        } else {
            t8l0Var = new t8l0(this, ibkVar);
        }
        Object objM74982a = t8l0Var.f218104c;
        int i2 = t8l0Var.f218106e;
        qre0 qre0Var = this.f227972c;
        yuk yukVar = yuk.f276404a;
        try {
            if (i2 == 0) {
                bga.m29073P(objM74982a);
                r8l0 r8l0Var = this.f227970a;
                t8l0Var.f218102a = set;
                t8l0Var.f218103b = null;
                t8l0Var.f218106e = 1;
                objM74982a = r8l0Var.m74982a(t8l0Var);
                if (objM74982a == yukVar) {
                }
                return yukVar;
            }
            if (i2 == 1) {
                set = t8l0Var.f218102a;
                bga.m29073P(objM74982a);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = t8l0Var.f218103b;
                Set set3 = t8l0Var.f218102a;
                bga.m29073P(objM74982a);
            }
            if (s6x0.m77348a(obj) != null) {
                s8l0 s8l0VarM14272q = OnDemandSetFetchMismatch.m14272q();
                s8l0VarM14272q.m77522r();
                qre0Var.m73616a(s8l0VarM14272q.build());
            }
            return w2a1.f247311a;
            OndemandResponse ondemandResponse = (OndemandResponse) objM74982a;
            set2 = set;
            obj = ondemandResponse;
        } catch (Throwable th) {
            c6x0 c6x0Var = new c6x0(th);
            set2 = set;
            obj = c6x0Var;
        }
        if (!(obj instanceof c6x0)) {
            OndemandResponse ondemandResponse2 = (OndemandResponse) obj;
            Collection urisList = set2;
            if (urisList == null || urisList.isEmpty()) {
                urisList = ondemandResponse2.getUrisList();
            } else if (!ondemandResponse2.getUrisList().isEmpty() && wj50.m88271j(set2, ondemandResponse2.getUrisList())) {
                urisList = ondemandResponse2.getUrisList();
            }
            if (urisList == null) {
                urisList = gbu.f78413a;
            }
            if (set2 != null && !set2.equals(g6f.m43736n1(ondemandResponse2.getUrisList()))) {
                s8l0 s8l0VarM14272q2 = OnDemandSetFetchMismatch.m14272q();
                s8l0VarM14272q2.m77520m(ondemandResponse2.getUrisList().isEmpty());
                s8l0VarM14272q2.m77521q(set2.isEmpty());
                qre0Var.m73616a(s8l0VarM14272q2.build());
            }
            CompletableAndThenCompletable completableAndThenCompletableM90215c = ((x8l0) this.f227971b).m90215c(g6f.m43736n1(urisList));
            t8l0Var.f218102a = null;
            t8l0Var.f218103b = obj;
            t8l0Var.f218106e = 2;
        }
        if (s6x0.m77348a(obj) != null) {
            s8l0 s8l0VarM14272q3 = OnDemandSetFetchMismatch.m14272q();
            s8l0VarM14272q3.m77522r();
            qre0Var.m73616a(s8l0VarM14272q3.build());
        }
        return w2a1.f247311a;
    }
}
