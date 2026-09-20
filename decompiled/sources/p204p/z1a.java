package p204p;

import com.google.protobuf.AbstractC0269h;
import com.spotify.aipartner.aipartnerapi.proto.ResolveIntentRequest;
import com.spotify.aipartner.aipartnerapiwrapper.events.proto.PartnerAIResolveIntentError;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.bluetooth.events.proto.BluetoothLowEnergyStartAdvertisingFailed;
import com.spotify.messages.InconsistencyMonitorEvent;
import com.spotify.voiceassistants.playbackerrorlogger.events.proto.AssistantPlaybackErrorNonAuth;
import kotlin.NoWhenBranchMatchedException;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes5.dex */
public final class z1a {

    /* JADX INFO: renamed from: a */
    public final qre0 f278267a;

    public /* synthetic */ z1a(qre0 qre0Var) {
        this.f278267a = qre0Var;
    }

    /* JADX INFO: renamed from: a */
    public void m95095a(si50 si50Var) {
        ln40 ln40Var = si50Var.f209359a;
        String str = ln40Var.f135086a;
        String str2 = si50Var.f209360b;
        mn40 mn40VarM13915q = InconsistencyMonitorEvent.m13915q();
        mn40VarM13915q.m62348q(str);
        mn40VarM13915q.m62349r(str2);
        mn40VarM13915q.m62347m(true);
        InconsistencyMonitorEvent inconsistencyMonitorEvent = (InconsistencyMonitorEvent) mn40VarM13915q.build();
        wj50.m88279p(inconsistencyMonitorEvent);
        this.f278267a.m73616a(inconsistencyMonitorEvent);
        Logger.m3973i(edb.m38564m("[InteropMonitor] Inconsistency detected: ", ln40Var.f135086a), new Object[0]);
    }

    /* JADX INFO: renamed from: b */
    public void m95096b(AbstractC0269h abstractC0269h) {
        this.f278267a.m73616a(abstractC0269h);
    }

    /* JADX INFO: renamed from: c */
    public void m95097c(dc6 dc6Var) {
        String str;
        ec6 ec6VarM22340u = AssistantPlaybackErrorNonAuth.m22340u();
        switch (dc6Var.f47434c) {
            case 1:
                str = "backend_error";
                break;
            case 2:
                str = "player_error";
                break;
            case 3:
                str = "not_authenticated";
                break;
            case 4:
                str = "timeout";
                break;
            case 5:
                str = "gen_playlist_timeout";
                break;
            case 6:
                str = "exception";
                break;
            default:
                throw null;
        }
        ec6VarM22340u.m38477r(str);
        ec6VarM22340u.m38479t(dc6Var.f47432a);
        ec6VarM22340u.m38480u(dc6Var.f47433b);
        ec6VarM22340u.m38476q(dc6Var.f47435d);
        String str2 = dc6Var.f47436e;
        if (str2 != null) {
            ec6VarM22340u.m38478s(str2);
        }
        String str3 = dc6Var.f47437f;
        if (str3 != null) {
            ec6VarM22340u.m38475m(str3);
        }
        String str4 = dc6Var.f47438g;
        if (str4 != null) {
            ec6VarM22340u.m38481v(str4);
        }
        this.f278267a.m73616a(ec6VarM22340u.build());
    }

    /* JADX INFO: renamed from: d */
    public void m95098d(ResolveIntentRequest resolveIntentRequest, Throwable th) {
        String strName = resolveIntentRequest.m3072s().m3046s().name();
        String prompt = resolveIntentRequest.m3073t().getPrompt();
        String strM3074u = resolveIntentRequest.m3074u();
        String message = th.getMessage();
        if (message == null) {
            message = "Unknown error occurred";
        }
        k3n0 k3n0VarM3081s = PartnerAIResolveIntentError.m3081s();
        k3n0VarM3081s.m55277t(strM3074u);
        k3n0VarM3081s.m55274q(strName);
        k3n0VarM3081s.m55275r(message);
        k3n0VarM3081s.m55276s(prompt);
        if (th instanceof HttpException) {
            k3n0VarM3081s.m55273m(((HttpException) th).f288164a);
        }
        this.f278267a.m73616a(k3n0VarM3081s.build());
    }

    /* JADX INFO: renamed from: e */
    public void m95099e(ti50 ti50Var) {
        ln40 ln40Var = ti50Var.f220553a;
        String str = ln40Var.f135086a;
        String str2 = ti50Var.f220554b;
        mn40 mn40VarM13915q = InconsistencyMonitorEvent.m13915q();
        mn40VarM13915q.m62348q(str);
        mn40VarM13915q.m62349r(str2);
        mn40VarM13915q.m62347m(false);
        InconsistencyMonitorEvent inconsistencyMonitorEvent = (InconsistencyMonitorEvent) mn40VarM13915q.build();
        wj50.m88279p(inconsistencyMonitorEvent);
        this.f278267a.m73616a(inconsistencyMonitorEvent);
        Logger.m3973i(edb.m38564m("[InteropMonitor] Inconsistency resolved: ", ln40Var.f135086a), new Object[0]);
    }

    /* JADX INFO: renamed from: f */
    public void m95100f(g1a g1aVar) {
        String str;
        b3a b3aVarM12612o = BluetoothLowEnergyStartAdvertisingFailed.m12612o();
        if (wj50.m88271j(g1aVar, b1a.f22270a)) {
            str = "alreadyStarted";
        } else if (wj50.m88271j(g1aVar, c1a.f33032a)) {
            str = "bluetoothNotSupported";
        } else if (wj50.m88271j(g1aVar, f1a.f64832a)) {
            str = "permissionsMissing";
        } else if (wj50.m88271j(g1aVar, d1a.f44207a)) {
            str = "characteristicsMissing";
        } else {
            if (!(g1aVar instanceof e1a)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((e1a) g1aVar).f55153a;
        }
        b3aVarM12612o.m28005m(str);
        this.f278267a.m73616a(b3aVarM12612o.build());
    }
}
