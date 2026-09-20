package p204p;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.familyviewservice.p066v1.GetMemberDetailsRequest;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.userinteractivityservice.usercomments.p178v1.proto.ListCommentsRequest;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableEmpty;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJust;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class t180 implements Function, w1j0, BiFunction, ObservableOnSubscribe, dn6, mu61, Predicate {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f216178a;

    /* JADX INFO: renamed from: b */
    public final Object f216179b;

    public /* synthetic */ t180(Object obj, int i) {
        this.f216178a = i;
        this.f216179b = obj;
    }

    /* JADX INFO: renamed from: a */
    public ComponentName m79867a() {
        return (ComponentName) this.f216179b;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        int i = this.f216178a;
        int i2 = 25;
        int i3 = 24;
        Object obj2 = this.f216179b;
        switch (i) {
            case 0:
                List list = (List) obj;
                return list.isEmpty() ? MaybeEmpty.f8264a : Maybe.m23363f(new s180(((a22) obj2).f11553a, list));
            case 1:
                h680 h680Var = (h680) obj;
                n680 n680Var = (n680) obj2;
                lrg1 lrg1VarM49524v = n680Var.f150742g.m49524v();
                h6v h6vVar = n680Var.f150741f;
                String strMo27974l = lrg1VarM49524v.mo27974l();
                h6vVar.getClass();
                return n680Var.f150738c.m72129a(new p3v(lrg1VarM49524v, h680Var.f88028b, h680Var.f88029c)).m23294e(n680Var.f150736a.mo53041b().m23360y(new po10(i2, lrg1VarM49524v, (String) i6v.f99336a.get(strMo27974l))).m23361z(PlayerState.EMPTY)).timeout(30L, TimeUnit.SECONDS).flatMapObservable(new m680(n680Var, lrg1VarM49524v)).onErrorReturn(a0y.f11211t);
            case 5:
                tm90 tm90Var = (tm90) obj2;
                if (((Boolean) obj).booleanValue()) {
                    return tm90Var.f221630c.m23331J(new z4y(tm90Var.f221633f, i3)).m23343X(new oyz(tm90Var, i2));
                }
                int i4 = Flowable.f7192a;
                return FlowableEmpty.f7745b;
            case 6:
                return ((PlayerState) obj).isPlaying() ? ((xr90) obj2).f265299e.mo48412a(new u7p0("listening-parties", false)).ignoreElement() : CompletableEmpty.f7437a;
            case 7:
                xjf xjfVar = (xjf) obj;
                vz90 vz90Var = (vz90) obj2;
                chf chfVar = vz90Var.f246418b;
                String str = xjfVar.f262121a;
                String str2 = xjfVar.f262122b;
                tsa1 tsa1Var = (tsa1) chfVar.f38000c.f242171b;
                zo80 zo80VarM22193q = ListCommentsRequest.m22193q();
                zo80VarM22193q.m96614m(str);
                if (str2 != null) {
                    zo80VarM22193q.m96615q(str2);
                }
                return tsa1Var.m81400f((ListCommentsRequest) zo80VarM22193q.build()).map(new oyz(vz90Var, xjfVar)).onErrorReturn(new m680(xjfVar, 7));
            case 12:
                return (ObservableSource) ((b6b0) obj2).invoke(obj);
            case 13:
                ucb0 ucb0Var = (ucb0) obj;
                bcb0 bcb0Var = ((cjb0) obj2).f38556a;
                wj50.m88279p(ucb0Var);
                return q0f1.m71844v(bcb0Var.f25822a, new ri80(i3, bcb0Var, ucb0Var));
            case 14:
                ((nub0) obj2).m65687a(new i250(2, ""));
                return new cyw0(wxw0.f256139a);
            case 19:
                zby zbyVar = (zby) obj2;
                String str3 = ((l9e0) obj).f131073b;
                u910 u910VarM10713p = GetMemberDetailsRequest.m10713p();
                u910VarM10713p.m82597m(str3);
                GetMemberDetailsRequest getMemberDetailsRequest = (GetMemberDetailsRequest) u910VarM10713p.build();
                acy acyVar = zbyVar.f281417a;
                wj50.m88279p(getMemberDetailsRequest);
                return acyVar.m25493g(getMemberDetailsRequest).map(new sp5(zbyVar, 11)).map(iaz.f100372L0).onErrorReturn(jaz.f110571L0);
            case 22:
                mc1 mc1Var = (mc1) obj2;
                return !((Boolean) obj).booleanValue() ? ((vwy0) ((er70) mc1Var.f142009b).get()).m86625a().map(t2z.f216644N0).flatMapCompletable(new m680(mc1Var, 18)).m23307y() : Observable.empty();
            case 25:
                return ((l6n0) obj2).m58378a(k6n0.BRANCH);
            case 26:
                ((rli0) obj2).getClass();
                int iOrdinal = ((s431) obj).f205428a.ordinal();
                if (iOrdinal == 0) {
                    return qli0.f189868a;
                }
                if (iOrdinal == 1) {
                    return qli0.f189869b;
                }
                if (iOrdinal == 2) {
                    return qli0.f189870c;
                }
                throw new NoWhenBranchMatchedException();
            case 27:
                kbj0 kbj0Var = (kbj0) obj2;
                hv31 hv31VarMo35842b = kbj0Var.f121217a.mo35842b(kbj0Var.f121221e, (String) obj);
                si5 si5Var = fv31.f73628b;
                int iMo48717l = hv31VarMo35842b.mo48717l(si5Var.m78181M("key_bt_permissions_flow_started_count_v2"), 0);
                lv31 lv31VarEdit = hv31VarMo35842b.edit();
                lv31VarEdit.m60049b(si5Var.m78181M("key_bt_permissions_flow_started_count_v2"), iMo48717l + 1);
                lv31VarEdit.m60054g();
                return CompletableEmpty.f7437a;
            case 28:
                vcj0 vcj0Var = (vcj0) obj2;
                hv31 hv31VarMo35842b2 = vcj0Var.f240140a.mo35842b(vcj0Var.f240144e, (String) obj);
                int iMo48717l2 = hv31VarMo35842b2.mo48717l(vcj0.m85190b(), 0);
                lv31 lv31VarEdit2 = hv31VarMo35842b2.edit();
                lv31VarEdit2.m60049b(vcj0.m85190b(), iMo48717l2 + 1);
                lv31VarEdit2.m60054g();
                return CompletableEmpty.f7437a;
            default:
                PlayerState playerState = (PlayerState) obj;
                izh izhVar = (izh) obj2;
                ContextTrack contextTrack = (ContextTrack) playerState.track().mo49278b();
                wj50.m88279p(contextTrack);
                String strM38000d0 = e72.m38000d0(contextTrack, ContextTrack.Metadata.KEY_CONTEXT_URI);
                if (strM38000d0 == null || strM38000d0.length() == 0) {
                    strM38000d0 = null;
                }
                if (strM38000d0 == null) {
                    strM38000d0 = playerState.contextUri();
                }
                FlowableJust flowableJustM23313I = Flowable.m23313I(contextTrack.uri());
                wj50.m88279p(strM38000d0);
                Observable observableM49650i = ((i431) izhVar.f107226e).m49650i(contextTrack.uid(), contextTrack.uri(), strM38000d0, Boolean.valueOf(e72.m37981O(contextTrack)));
                BackpressureStrategy backpressureStrategy = BackpressureStrategy.f7190d;
                Flowable flowable = observableM49650i.toFlowable(backpressureStrategy);
                String strUri = contextTrack.uri();
                Flowable flowableM23321g = Flowable.m23321g(flowableJustM23313I, flowable, z5f.m95457d((z5f) izhVar.f107231t, strM38000d0, new String[]{strUri}).map(new b93(strUri, 9)).toFlowable(backpressureStrategy), r4z.f195881P0);
                flowableM23321g.getClass();
                return flowableM23321g.m23356t(Functions.f7225a);
        }
    }

    /* JADX INFO: renamed from: b */
    public String m79868b() {
        return ((ComponentName) this.f216179b).getPackageName();
    }

    /* JADX INFO: renamed from: c */
    public ucg0 m79869c(int i) {
        return new ucg0(i, (st91) this.f216179b);
    }

    /* JADX INFO: renamed from: d */
    public void m79870d() {
        ((rhy0) this.f216179b).mo75534a("Notification close", gpa0.f83138b);
    }

    @Override // p204p.dn6
    /* JADX INFO: renamed from: g */
    public Single mo25091g(Intent intent, e301 e301Var) {
        return ((Observable) ((bt7) this.f216179b).f30527b.invoke()).firstOrError().map(new u550(intent)).onErrorReturn(dzx.f54766L0);
    }

    @Override // p204p.mu61
    public void onSuccess() {
        uoc0 uoc0VarM26771i1 = ((aqc0) this.f216179b).m26771i1();
        vnc0 vnc0Var = uoc0VarM26771i1.f232379a;
        if (uoc0VarM26771i1.f232393o) {
            return;
        }
        rrc0 rrc0Var = uoc0VarM26771i1.f232385g;
        rrc0Var.f202016a.mo57449i(rrc0Var.m76283a(vnc0Var.f243049a).mo24514e(), null);
        om0.m67311c(uoc0VarM26771i1.f232383e, qm0.IMPRESSION, vnc0Var.f243049a, null, null, null, null, null, 124);
        uoc0VarM26771i1.f232393o = true;
    }

    @Override // p204p.mu61
    /* JADX INFO: renamed from: p */
    public void mo25096p(Exception exc) {
        uoc0 uoc0VarM26771i1 = ((aqc0) this.f216179b).m26771i1();
        om0.m67311c(uoc0VarM26771i1.f232383e, qm0.ERROR, uoc0VarM26771i1.f232379a.f243049a, null, null, null, null, null, 124);
        aqc0 aqc0Var = uoc0VarM26771i1.f232392n;
        if (aqc0Var != null) {
            aqc0Var.m26772j1(new qoc0(uoc0VarM26771i1, 0));
        } else {
            wj50.m88260d0("viewBinder");
            throw null;
        }
    }

    @Override // io.reactivex.rxjava3.core.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) {
        observableEmitter.setCancellable(new zg0((d6a0) this.f216179b, 4));
        d6a0 d6a0Var = (d6a0) this.f216179b;
        b4w b4wVar = new b4w(observableEmitter, 1);
        AtomicReference atomicReference = d6a0Var.f45638b;
        c6a0 c6a0Var = c6a0.f34467a;
        c6a0 c6a0Var2 = c6a0.f34468b;
        while (!atomicReference.compareAndSet(c6a0Var, c6a0Var2)) {
            if (atomicReference.get() != c6a0Var) {
                throw new IllegalStateException("already started");
            }
        }
        d6a0Var.f45637a = b4wVar;
        d6a0Var.mo25474e();
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        return wj50.m88271j(((pqm0) obj).f180350a, (ee9) this.f216179b);
    }

    public String toString() {
        switch (this.f216178a) {
            case 18:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.f216179b).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    public t180(p830 p830Var, mqy0 mqy0Var) {
        this.f216178a = 8;
        this.f216179b = mqy0Var;
    }

    public t180(d9k d9kVar, v300 v300Var) {
        this.f216178a = 4;
        this.f216179b = d9kVar;
    }

    public t180() {
        this.f216178a = 17;
        this.f216179b = new Bundle();
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        rww0 rww0Var;
        sww0 sww0VarMo44420b;
        h390 h390Var = (h390) this.f216179b;
        Iterator it = h390Var.f87180a.m27674f(e301Var.f55571a).iterator();
        do {
            boolean zHasNext = it.hasNext();
            rww0Var = rww0.f203425a;
            if (!zHasNext) {
                sww0VarMo44420b = rww0Var;
                break;
            }
            sww0VarMo44420b = ((www0) it.next()).mo44420b(intent);
        } while (sww0VarMo44420b.equals(rww0Var));
        if (sww0VarMo44420b instanceof pww0) {
            pww0 pww0Var = (pww0) sww0VarMo44420b;
            h390.m46512b(h390Var, new c390(1), intent, pww0Var.f182148a);
            return pww0Var.f182149b;
        }
        if (sww0VarMo44420b instanceof qww0) {
            String str = ((qww0) sww0VarMo44420b).f193431a;
            h390.m46512b(h390Var, new d390(1), intent, str);
            return tm4.m81101y(o090.class, new u090(str, intent));
        }
        if (sww0VarMo44420b.equals(rww0Var)) {
            Set set = dd41.f47702f;
            String strM46513c = h390.m46513c(h390Var, r46.m74726U(intent.getDataString()));
            h390.m46512b(h390Var, new d390(1), intent, strM46513c);
            return tm4.m81101y(o090.class, new u090(strM46513c, intent));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        return new xty0("", ((mqy0) this.f216179b).f146382d, new h0z0((List) obj, (List) obj2));
    }
}
