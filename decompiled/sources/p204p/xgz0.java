package p204p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.SignalCommand;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableIgnoreElementsCompletable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTakeUntilPredicate;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class xgz0 implements tgz0 {

    /* JADX INFO: renamed from: a */
    public final fb4 f261403a;

    /* JADX INFO: renamed from: b */
    public final hrw f261404b;

    /* JADX INFO: renamed from: c */
    public final jdp0 f261405c;

    /* JADX INFO: renamed from: d */
    public final wt80 f261406d;

    public xgz0(xre xreVar, fb4 fb4Var, hrw hrwVar, jdp0 jdp0Var, wt80 wt80Var) {
        this.f261403a = fb4Var;
        this.f261404b = hrwVar;
        this.f261405c = jdp0Var;
        this.f261406d = wt80Var;
    }

    /* JADX INFO: renamed from: b */
    public static final Completable m90940b(xgz0 xgz0Var, lcf lcfVar) {
        return lcfVar.m58693c() ? Completable.m23286j(new Throwable(edb.m38564m("PlayerControlCommand failed: ", lcfVar.m58692a().m47110g()))) : CompletableEmpty.f7437a;
    }

    /* JADX INFO: renamed from: d */
    public static ContextTrack m90941d(PlayerState playerState) {
        Object next;
        ContextTrack contextTrack;
        Object obj = null;
        if (hdi.m47223O(playerState)) {
            return null;
        }
        pf40 pf40VarNextTracks = playerState.nextTracks();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : pf40VarNextTracks) {
            if (((ContextTrack) obj2).isDelimiter()) {
                break;
            }
            arrayList.add(obj2);
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            contextTrack = (ContextTrack) next;
            wj50.m88279p(contextTrack);
        } while (!ygz0.m93612b(contextTrack));
        ContextTrack contextTrack2 = (ContextTrack) next;
        if (contextTrack2 != null) {
            return contextTrack2;
        }
        for (Object obj3 : arrayList) {
            ContextTrack contextTrack3 = (ContextTrack) obj3;
            wj50.m88279p(contextTrack3);
            if (ygz0.m93611a(contextTrack3)) {
                obj = obj3;
                break;
            }
        }
        return (ContextTrack) obj;
    }

    /* JADX INFO: renamed from: c */
    public final CompletableOnErrorComplete m90942c(int i, gh00 gh00Var) {
        Flowable flowableMo53041b = this.f261405c.mo53041b();
        nyy0 nyy0Var = new nyy0(gh00Var);
        flowableMo53041b.getClass();
        return new FlowableIgnoreElementsCompletable(new FlowableTakeUntilPredicate(flowableMo53041b, nyy0Var)).m23305v(i, TimeUnit.MILLISECONDS, Schedulers.f10369b, null).m23299p(Functions.f7232h);
    }

    /* JADX INFO: renamed from: e */
    public final FlowableDistinctUntilChanged m90943e(s121... s121VarArr) {
        return this.f261405c.mo53042c(0, 80).m23331J(new rwt0(s121VarArr, this)).m23356t(Functions.f7225a);
    }

    /* JADX INFO: renamed from: f */
    public final Completable m90944f(String str, String str2) {
        SignalCommand.Builder builderSignalId = SignalCommand.builder().signalId(str);
        if (str2 != null) {
            builderSignalId.parameters(str2);
        }
        return this.f261404b.mo48412a(h8p0.m46841i(builderSignalId.build())).flatMapCompletable(new wiy0(this, 4));
    }
}
