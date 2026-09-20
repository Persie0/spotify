package p204p;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.media3.session.legacy.MediaBrowserProtocol;
import com.spotify.aiplaylist.promptcreation.presentation.MessageInputView;
import com.spotify.base.java.logging.Logger;
import com.spotify.endless.sessionstarter.EndlessActivity;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Consumer;
import com.spotify.mobius.functions.Producer;
import com.spotify.mostplayed.p112v1.Chart;
import com.spotify.mostplayed.p112v1.ChartEntry;
import com.spotify.offline_esperanto.proto.C1091c;
import com.spotify.offline_esperanto.proto.EsOffline$GetContextsRequest;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.userinteractivityservice.usercomments.p178v1.proto.ListRepliesResponse;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableJust;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class pj70 implements Function, w1j0, InterfaceC2207oa, rdc1, qio, pqa0, ant, lmr, yld0, Producer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f178195a;

    /* JADX INFO: renamed from: b */
    public final Object f178196b;

    public /* synthetic */ pj70(Object obj, int i) {
        this.f178195a = i;
        this.f178196b = obj;
    }

    @Override // p204p.lmr
    /* JADX INFO: renamed from: a */
    public void mo38842a() {
        Consumer consumer = (Consumer) ((q58) this.f178196b).f185456b;
        if (consumer != null) {
            consumer.accept(jdc0.f111325a);
        }
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        switch (this.f178195a) {
            case 5:
                return ((de4) this.f178196b).m35761a() && ((ihi) obj).f102296c == u300.LISTEN_LATER;
            default:
                return !((zd4) this.f178196b).m95914b();
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f178195a) {
            case 0:
                oj70 oj70Var = (oj70) ((qj70) this.f178196b).f189177f.getValue();
                int i = oj70Var.f165989c;
                return oj70Var.mo33239f(xtm0.m92067N((Drawable) obj, i, i, 4), null, null);
            case 1:
                String str = (String) obj;
                n280 n280Var = (n280) this.f178196b;
                wj50.m88279p(str);
                if (n280Var.f149683d.m74888c(str)) {
                    return n280Var.f149681b.m87992e(str);
                }
                MaybeEmpty maybeEmpty = MaybeEmpty.f8264a;
                wj50.m88279p(maybeEmpty);
                return maybeEmpty;
            case 3:
                Logger.m3967c((Throwable) obj, "Assisted Curation: Failed to fetch next page of Liked Songs", new Object[0]);
                return (rnm0) this.f178196b;
            case 4:
                gx80 gx80Var = (gx80) obj;
                xq80 xq80Var = (xq80) this.f178196b;
                hcj hcjVar = gx80Var.f85223b;
                i6a0 i6a0Var = gx80Var.f85222a;
                ArrayList arrayListM46717N = h6f.m46717N((i6a0Var.getCount() == 0 && i6a0Var.mo27291h().isEmpty()) ? new tu80(xq80Var.f264908a, i6a0Var.getFilters()) : new uu80(xq80Var.f264908a, i6a0Var));
                if (!wj50.m88271j(hcjVar, fcj.f68131a)) {
                    arrayListM46717N.add(new su80(hcjVar));
                }
                return Observable.fromIterable(arrayListM46717N);
            case 7:
                return (Boolean) ((PlayerState) obj).track().mo49284i(new oy10((vnt0) ((ia70) this.f178196b).f100167c, 1)).mo49280e(Boolean.FALSE);
            case 8:
                return Completable.m23287k(new kk00((yr90) this.f178196b, 11));
            case 10:
                ListRepliesResponse listRepliesResponse = (ListRepliesResponse) obj;
                yjf yjfVar = (yjf) this.f178196b;
                String str2 = yjfVar.f273356a;
                qf40 qf40VarM67574x = opo.m67574x(listRepliesResponse.m22208o());
                String str3 = yjfVar.f273357b;
                String nextPageToken = listRepliesResponse.getNextPageToken();
                if (nextPageToken.length() == 0) {
                    nextPageToken = null;
                }
                return new jlf(str2, new enw0(qf40VarM67574x, listRepliesResponse.m22207n(), str3, nextPageToken, yjfVar.f273358c, 1));
            case 13:
                String str4 = (String) obj;
                if (str4.length() == 0) {
                    return Observable.just(Boolean.FALSE);
                }
                y3l0 y3l0Var = (y3l0) ((ykn) this.f178196b).f273764t;
                List listSingletonList = Collections.singletonList(str4);
                fwk0 fwk0Var = y3l0Var.f268961a;
                C1091c c1091cM16137t = EsOffline$GetContextsRequest.m16137t();
                c1091cM16137t.m16213m(listSingletonList);
                return fwk0Var.m42969c((EsOffline$GetContextsRequest) c1091cM16137t.build()).map(r4z.f195885T0).map(wby.f249893Y);
            case 14:
                fnb0 fnb0Var = ((aeb0) obj).f14825a;
                if (!(fnb0Var instanceof dnb0) || !((dnb0) fnb0Var).f50726a.f206350a.f249437g.f239175a) {
                    return Observable.just(new lfb0(false));
                }
                bsc1 bsc1Var = (bsc1) this.f178196b;
                return Observable.combineLatest(bsc1Var.f30292c.mo27556b(), new ObservableFromPublisher(bsc1Var.f30291b.m23360y(ykq0.f273801X0).m23356t(zkq0.f283816W0)), new dz31(bsc1Var, 26)).map(a0y.f11182L0);
            case 21:
                return new aae0(!((o9e0) this.f178196b).f163008c);
            case 23:
                ref0 ref0Var = (ref0) obj;
                FlowableJust flowableJustM23313I = Flowable.m23313I(ref0Var.f198363a);
                long j = ref0Var.f198364b == 0 ? 0L : 100L;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                return flowableJustM23313I.m23354r(j, (Scheduler) ((sef0) this.f178196b).f208286c);
            case 26:
                t6f0 t6f0Var = ((b1i0) this.f178196b).f22359d;
                ae50 ae50VarM15673n = ((Chart) obj).m15673n();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : ae50VarM15673n) {
                    ChartEntry chartEntry = (ChartEntry) obj2;
                    if (chartEntry.m15674n().m15677p() && chartEntry.m15674n().m15676o().hasAlbum()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ChartEntry) it.next()).getUri());
                }
                return t6f0Var.m80159a(arrayList2);
            default:
                kbj0 kbj0Var = (kbj0) this.f178196b;
                return Integer.valueOf(kbj0Var.f121217a.mo35842b(kbj0Var.f121221e, (String) obj).mo48717l(fv31.f73628b.m78181M("key_bt_permissions_system_dialog_count"), 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: b */
    public Object m70124b(sht shtVar, ibk ibkVar) throws Throwable {
        f2j0 f2j0Var;
        if (ibkVar instanceof f2j0) {
            f2j0Var = (f2j0) ibkVar;
            int i = f2j0Var.f65201c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f2j0Var.f65201c = i - Integer.MIN_VALUE;
            } else {
                f2j0Var = new f2j0(this, ibkVar);
            }
        } else {
            f2j0Var = new f2j0(this, ibkVar);
        }
        Object obj = f2j0Var.f65199a;
        int i2 = f2j0Var.f65201c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                gfi0 gfi0Var = (gfi0) this.f178196b;
                String str = "spotify:listening-activity:group-details:" + Uri.encode(shtVar.f209259a);
                d850 d850Var = shtVar.f209260b;
                Bundle bundleM70529j = pp91.m70529j(new pqm0("isOpenedFromChat", Boolean.TRUE));
                f2j0Var.f65201c = 1;
                Object objM44623d = gfi0Var.m44623d(str, d850Var, bundleM70529j, f2j0Var);
                yuk yukVar = yuk.f276404a;
                if (objM44623d == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (Exception e) {
            Logger.m3966b(edb.m38564m("BUZZ: ListeningActivityButton navigate to group details failed: ", e.getMessage()), new Object[0]);
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public Object m70125c(bit bitVar, ibk ibkVar) throws Throwable {
        e2j0 e2j0Var;
        if (ibkVar instanceof e2j0) {
            e2j0Var = (e2j0) ibkVar;
            int i = e2j0Var.f55477c;
            if ((i & Integer.MIN_VALUE) != 0) {
                e2j0Var.f55477c = i - Integer.MIN_VALUE;
            } else {
                e2j0Var = new e2j0(this, ibkVar);
            }
        } else {
            e2j0Var = new e2j0(this, ibkVar);
        }
        Object obj = e2j0Var.f55475a;
        int i2 = e2j0Var.f55477c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                gfi0 gfi0Var = (gfi0) this.f178196b;
                String str = "spotify:listening-activity:details:" + Uri.encode(bitVar.f27539a);
                d850 d850Var = bitVar.f27544f;
                Bundle bundleM70529j = pp91.m70529j(new pqm0("entityUri", bitVar.f27540b), new pqm0("contextUri", bitVar.f27541c), new pqm0("isPlaying", Boolean.valueOf(bitVar.f27542d)), new pqm0("timestamp", bitVar.f27543e), new pqm0("isOpenedFromChat", Boolean.TRUE), new pqm0("groupChatId", bitVar.f27545g));
                e2j0Var.f55477c = 1;
                Object objM44623d = gfi0Var.m44623d(str, d850Var, bundleM70529j, e2j0Var);
                yuk yukVar = yuk.f276404a;
                if (objM44623d == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
        } catch (Exception e) {
            Logger.m3966b(edb.m38564m("BUZZ: ListeningActivityButton navigate to user details failed: ", e.getMessage()), new Object[0]);
        }
        return w2a1.f247311a;
    }

    @Override // p204p.yld0
    /* JADX INFO: renamed from: d */
    public void mo53252d(zld0 zld0Var, tld0 tld0Var, Collection collection) {
        ((jmd0) this.f178196b).mo45233g(zld0Var, tld0Var, collection);
    }

    @Override // p204p.pqa0
    /* JADX INFO: renamed from: e */
    public void mo37400e(String str, String str2) {
        ((opa0) this.f178196b).f167825a.m76103a('I', "Spotify", opa0.m67520g(str, str2), null);
    }

    /* JADX INFO: renamed from: f */
    public boolean m70126f(ContextTrack contextTrack) {
        boolean z = contextTrack.metadata().get("live.deeplink_url") != null;
        String str = (String) contextTrack.metadata().get(ContextTrack.Metadata.KEY_CONTEXT_URI);
        if (str == null) {
            str = "";
        }
        return m70128i(str, z);
    }

    @Override // p204p.w1j0
    /* JADX INFO: renamed from: g */
    public v1j0 mo24517g(Intent intent, e301 e301Var) {
        Serializable serializableExtra = intent.getSerializableExtra("extra_interaction_id");
        z650 z650Var = serializableExtra instanceof z650 ? (z650) serializableExtra : null;
        m500 m500Var = (m500) this.f178196b;
        int i = EndlessActivity.f3838k1;
        Set set = dd41.f47702f;
        dd41 dd41VarM74726U = r46.m74726U(intent.getDataString());
        String str = e301Var.f55571a;
        Intent intent2 = new Intent(m500Var, (Class<?>) EndlessActivity.class);
        intent2.putExtra("com.spotify.endless.sessionstarter.KEY_EXTRA_DEEPLINK", dd41VarM74726U.m35694A());
        intent2.putExtra("com.spotify.endless.sessionstarter.KEY_USERNAME", str);
        if (z650Var != null) {
            intent2.putExtra("com.spotify.endless.sessionstarter.KEY_INTERACTION_ID", z650Var);
        }
        m500Var.startActivity(intent2);
        return p1j0.f173119a;
    }

    @Override // com.spotify.mobius.functions.Producer
    public Object get() {
        return new DispatcherWorker(((snh0) this.f178196b).f210937b);
    }

    @Override // p204p.rdc1
    public View getRoot() {
        return (ConstraintLayout) this.f178196b;
    }

    /* JADX INFO: renamed from: h */
    public boolean m70127h(PlayerState playerState) {
        if (playerState.track().mo49279c()) {
            String strUri = ((ContextTrack) playerState.track().mo49278b()).uri();
            ef41 ef41VarM64319a = nf41.m64319a(gn80.LIVE_ROOM);
            if (ef41VarM64319a != null ? new uoc1(ef41VarM64319a.f58942d).m83613a(strUri) : false) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public boolean m70128i(String str, boolean z) {
        if (z) {
            ef41 ef41VarM64319a = nf41.m64319a(gn80.LIVE_ROOM);
            if (ef41VarM64319a != null ? new uoc1(ef41VarM64319a.f58942d).m83613a(str) : false) {
                return true;
            }
        }
        if (((Boolean) ((ni00) this.f178196b).invoke()).booleanValue()) {
            he41 he41VarM30579c = bup0.f31192a.m30579c(str);
            xtp0 xtp0Var = he41VarM30579c instanceof xtp0 ? (xtp0) he41VarM30579c : null;
            if (wj50.m88271j(xtp0Var != null ? xtp0Var.f265907a : null, "listening-party")) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public dng0 m70129j(String str, String str2) {
        return new dng0(str, str2, (st91) this.f178196b);
    }

    @Override // p204p.pqa0
    /* JADX INFO: renamed from: k */
    public void mo37402k(String str, String str2, Throwable th) {
        ((opa0) this.f178196b).f167825a.m76103a('I', "Spotify", opa0.m67520g(str, str2), th);
    }

    /* JADX INFO: renamed from: l */
    public void m70130l(String str, List list, Bundle bundle) throws RemoteException {
        Bundle bundle2 = new Bundle();
        bundle2.putString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID, str);
        bundle2.putBundle(MediaBrowserProtocol.DATA_OPTIONS, bundle);
        bundle2.putBundle(MediaBrowserProtocol.DATA_NOTIFY_CHILDREN_CHANGED_OPTIONS, null);
        if (list != null) {
            bundle2.putParcelableArrayList(MediaBrowserProtocol.DATA_MEDIA_ITEM_LIST, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
        }
        m70131m(3, bundle2);
    }

    /* JADX INFO: renamed from: m */
    public void m70131m(int i, Bundle bundle) throws RemoteException {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = 2;
        messageObtain.setData(bundle);
        ((Messenger) this.f178196b).send(messageObtain);
    }

    @Override // p204p.qio
    /* JADX INFO: renamed from: p0 */
    public uio mo30418p0() {
        return new pgj(((sba0) this.f178196b).f207405a);
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        switch (this.f178195a) {
            case 15:
                jkb0 jkb0Var = (jkb0) this.f178196b;
                if (((okb0) obj).equals(mkb0.f144546b)) {
                    Button button = jkb0Var.f113270a2;
                    if (button != null) {
                        button.setEnabled(false);
                        return;
                    } else {
                        wj50.m88260d0("continueButton");
                        throw null;
                    }
                }
                Button button2 = jkb0Var.f113270a2;
                if (button2 != null) {
                    button2.setEnabled(true);
                    return;
                } else {
                    wj50.m88260d0("continueButton");
                    throw null;
                }
            default:
                ((MessageInputView) this.f178196b).setCreateButtonClickListener((String) ((xul0) obj).mo49283h());
                return;
        }
    }

    public pj70(uc5 uc5Var, ni00 ni00Var) {
        this.f178195a = 18;
        this.f178196b = ni00Var;
    }

    public pj70(ConstraintLayout constraintLayout, CoordinatorLayout coordinatorLayout) {
        this.f178195a = 6;
        this.f178196b = constraintLayout;
    }
}
