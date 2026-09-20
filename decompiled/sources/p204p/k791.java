package p204p;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.tasks.Task;
import com.spotify.pending_events.esperanto.proto.CommitPendingEventRequest;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import spotify.collection.esperanto.proto.CollectionGetUnplayedEpisodesResponse;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequestHeader;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryFilters;
import spotify.your_library.proto.YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs;

/* JADX INFO: loaded from: classes4.dex */
public final class k791 implements Function, x05, ant, t6l0, uf41, w111, dne1, y8f1, r7l0, r9w0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f120027a;

    /* JADX INFO: renamed from: b */
    public final Object f120028b;

    public /* synthetic */ k791(Object obj, int i) {
        this.f120027a = i;
        this.f120028b = obj;
    }

    @Override // p204p.dne1
    /* JADX INFO: renamed from: a */
    public void mo29958a(int i, String str) {
        hsb1 hsb1Var = (hsb1) this.f120028b;
        kv91 kv91Var = (kv91) hsb1Var.f94654b;
        dkh0 dkh0Var = (dkh0) hsb1Var.f94656d;
        dkh0Var.getClass();
        yt91 yt91VarM96903c = dkh0Var.f49977a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("list", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        Integer numValueOf = Integer.valueOf(i);
        yt91 yt91VarM96903c2 = zt91VarM94607a.m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("option", str, numValueOf, null, null));
        yt91VarM96903c2.f276056j = true;
        kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_select", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }

    @Override // p204p.r9w0
    public void accept(Object obj, Object obj2) {
        m3g1 m3g1Var = new m3g1((bqg1) this.f120028b, (ev61) obj2);
        u5g1 u5g1Var = (u5g1) ((l6g1) obj).m37438q();
        Parcel parcelM43604d2 = u5g1Var.m43604d2();
        fmf1.m42108c(parcelM43604d2, m3g1Var);
        u5g1Var.m43606f2(2, parcelM43604d2);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0057  */
    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        boolean z;
        boolean z2;
        nrd1 nrd1Var;
        switch (this.f120027a) {
            case 1:
                qt91 qt91Var = (qt91) this.f120028b;
                qt91Var.getClass();
                aw91 aw91Var = ((bw91) obj).f31591c;
                jnf jnfVarM16967p = CommitPendingEventRequest.m16967p();
                jnfVarM16967p.m53821m(aw91Var.f20439a);
                jnfVarM16967p.m53822q(aw91Var.f20440b);
                return qt91Var.f192344a.callSingle("spotify.pending_events.esperanto.proto.PendingEvents", "CommitPendingEvent", (CommitPendingEventRequest) jnfVarM16967p.build()).map(t2z.f216652V0).flatMapCompletable(qgr0.f188531T0);
            case 2:
                return q2a1.m71992a((q2a1) this.f120028b, (CollectionGetUnplayedEpisodesResponse) obj);
            case 8:
                return Observable.timer(800L, TimeUnit.MILLISECONDS, (Scheduler) this.f120028b).map(hcj0.f89812Q0);
            case 9:
                return ((lfd1) this.f120028b).f132925d.mo36425a((k291) obj);
            case 11:
                nrd1 nrd1Var2 = (nrd1) obj;
                prd1 prd1Var = (prd1) this.f120028b;
                List list = prd1Var.f180571j;
                boolean z3 = true;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            mrd1 mrd1Var = (mrd1) it.next();
                            if (mrd1Var.f146478a.mo26699o() && mrd1Var.f146479b) {
                                z = true;
                            }
                        } else {
                            z = false;
                        }
                    }
                } else {
                    z = false;
                }
                List list2 = prd1Var.f180571j;
                if (list2 == null || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            api apiVar = ((mrd1) it2.next()).f146478a;
                            if (!apiVar.mo26697m() && apiVar.mo26699o() && !apiVar.mo26700p()) {
                                z2 = true;
                            }
                        } else {
                            z2 = false;
                        }
                    }
                } else {
                    z2 = false;
                }
                List list3 = prd1Var.f180571j;
                if (list3 == null || !list3.isEmpty()) {
                    Iterator it3 = list3.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            mrd1 mrd1Var2 = (mrd1) it3.next();
                            if (mrd1Var2.f146478a.mo26697m() || !mrd1Var2.f146478a.mo26691g()) {
                            }
                        } else {
                            z3 = false;
                        }
                    }
                } else {
                    z3 = false;
                }
                if (!z2) {
                    nrd1Var = nrd1.NO_AVAILABLE_CONNECT_DEVICES_FOUND;
                } else if (z) {
                    nrd1Var = nrd1.ONGOING_JAM_IN_NETWORK;
                } else {
                    nrd1Var = z3 ? nrd1.CONNECT_TRANSFER_IN_PROGRESS : nrd1.ALL_CHECKS_CLEAR;
                }
                return prd1.m70709a(prd1Var, nrd1Var2, Single.just(nrd1Var));
            case 12:
                if (((Boolean) obj).booleanValue() && Build.VERSION.SDK_INT >= 26) {
                    le5 le5Var = ((dud1) this.f120028b).f53043d;
                    return Single.fromCallable(new je5(le5Var)).onErrorReturn(r101.f194671f).timeout(2L, TimeUnit.SECONDS, le5Var.f132464c, Single.just(Boolean.FALSE));
                }
                Single singleJust = Single.just(Boolean.FALSE);
                wj50.m88279p(singleJust);
                return singleJust;
            default:
                YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs = (YourLibraryConfig$YourLibraryPredefinedPlaylistConfigs) obj;
                jqe1 jqe1VarM98173q = YourLibraryRequest.m98173q();
                kqe1 kqe1VarM98179G = YourLibraryRequestHeader.m98179G();
                roa roaVar = (roa) this.f120028b;
                boolean z4 = roaVar.f201204g;
                String str = roaVar.f201199b;
                if (!z4) {
                    kqe1VarM98179G.m57093C(350);
                    aoe1 aoe1VarM98214r = YourLibraryConfig$YourLibraryFilters.m98214r();
                    boe1 boe1Var = boe1.DOWNLOADED;
                    aoe1VarM98214r.m26586q(boe1Var);
                    he41 he41VarM30579c = bup0.f31192a.m30579c(str);
                    if ((he41VarM30579c instanceof nvp0 ? (nvp0) he41VarM30579c : null) != null) {
                        boe1Var = boe1.PLAYLIST;
                    } else if (str.equals("com.spotify.your-albums")) {
                        boe1Var = boe1.ALBUM;
                    } else if (str.equals("com.spotify.your-artists")) {
                        boe1Var = boe1.ARTIST;
                    } else if (str.equals("com.spotify.your-playlists")) {
                        boe1Var = boe1.PLAYLIST;
                    } else if (str.equals("com.spotify.your-podcasts")) {
                        boe1Var = boe1.SHOW;
                    } else if (str.equals("com.spotify.your-audiobooks")) {
                        boe1Var = boe1.BOOK;
                    } else if (!str.equals("com.spotify.downloaded")) {
                        str.equals("com.spotify.your-library");
                        boe1Var = null;
                    }
                    if (boe1Var != null) {
                        aoe1VarM98214r.m26586q(boe1Var);
                    }
                    kqe1VarM98179G.m57107u((YourLibraryConfig$YourLibraryFilters) aoe1VarM98214r.build());
                }
                jqe1VarM98173q.m54085m(kqe1VarM98179G);
                jqe1VarM98173q.m54087r(yourLibraryConfig$YourLibraryPredefinedPlaylistConfigs);
                return (YourLibraryRequest) jqe1VarM98173q.build();
        }
    }

    /* JADX INFO: renamed from: b */
    public Intent m55636b() {
        return (Intent) this.f120028b;
    }

    /* JADX INFO: renamed from: c */
    public void m55637c() {
        ((Intent) this.f120028b).putExtra("extra_clear_backstack", true);
    }

    @Override // p204p.uf41
    /* JADX INFO: renamed from: d */
    public void mo55638d(Intent intent) {
        ((rmd1) this.f120028b).startActivityForResult(intent, 1780);
    }

    @Override // p204p.dne1
    /* JADX INFO: renamed from: e */
    public void mo29961e(int i, String str) {
        hsb1 hsb1Var = (hsb1) this.f120028b;
        kv91 kv91Var = (kv91) hsb1Var.f94654b;
        dkh0 dkh0Var = (dkh0) hsb1Var.f94656d;
        dkh0Var.getClass();
        yt91 yt91VarM96903c = dkh0Var.f49977a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("list", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        Integer numValueOf = Integer.valueOf(i);
        yt91 yt91VarM96903c2 = zt91VarM94607a.m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("option", str, numValueOf, null, null));
        yt91VarM96903c2.f276056j = true;
        zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = zt91VarM94607a2;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        kv91Var.mo57449i((ou91) nu91Var.m87248a(), null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public Object m55639f(String str, ibk ibkVar) {
        vfa1 vfa1Var;
        if (ibkVar instanceof vfa1) {
            vfa1Var = (vfa1) ibkVar;
            int i = vfa1Var.f240923c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vfa1Var.f240923c = i - Integer.MIN_VALUE;
            } else {
                vfa1Var = new vfa1(this, ibkVar);
            }
        } else {
            vfa1Var = new vfa1(this, ibkVar);
        }
        Object objM86755t = vfa1Var.f240921a;
        int i2 = vfa1Var.f240923c;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            prb0 prb0VarM81970l = ((tyd0) this.f120028b).m81970l(str);
            vfa1Var.f240923c = 1;
            objM86755t = vyf1.m86755t(prb0VarM81970l, vfa1Var);
            yuk yukVar = yuk.f276404a;
            if (objM86755t == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM86755t);
        }
        return new gad((List) objM86755t);
    }

    /* JADX INFO: renamed from: g */
    public void m55640g() {
        ((Intent) this.f120028b).putExtra(ContextTrack.Metadata.KEY_TITLE, "Settings");
    }

    @Override // p204p.x05
    public qhz get(int i) {
        return (aiz) this.f120028b;
    }

    /* JADX INFO: renamed from: h */
    public Bundle m55641h() {
        Bundle bundleM50936h = ikc0.m50936h("A", false);
        wsv0 wsv0Var = (wsv0) this.f120028b;
        if (!wsv0Var.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            kf40 kf40VarM69798r = wsv0Var.listIterator(0);
            while (kf40VarM69798r.hasNext()) {
                arrayList.add(((acv) kf40VarM69798r.next()).mo24309a());
            }
            bundleM50936h.putParcelableArrayList("C", arrayList);
        }
        return bundleM50936h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.w111
    /* JADX INFO: renamed from: l */
    public Object mo28227l(eo01 eo01Var, fbk fbkVar) throws Throwable {
        mee1 mee1Var;
        e2r e2rVar;
        String string;
        qee1 qee1Var;
        e2r e2rVar2;
        if (fbkVar instanceof mee1) {
            mee1Var = (mee1) fbkVar;
            int i = mee1Var.f142694f;
            if ((i & Integer.MIN_VALUE) != 0) {
                mee1Var.f142694f = i - Integer.MIN_VALUE;
            } else {
                mee1Var = new mee1(this, (ibk) fbkVar);
            }
        } else {
            mee1Var = new mee1(this, (ibk) fbkVar);
        }
        Object obj = mee1Var.f142692d;
        int i2 = mee1Var.f142694f;
        if (i2 == 0) {
            bga.m29073P(obj);
            Bundle bundle = eo01Var.f61265b;
            qee1 qee1Var2 = (qee1) zn91.m96523K(bundle, "wrapped.share.loader_params", qee1.class);
            if (qee1Var2 == null || (e2rVar = (e2r) zn91.m96523K(bundle, "wrapped.share.destination_list_configuration", e2r.class)) == null || (string = bundle.getString("wrapped.share.integration_id")) == null) {
                return null;
            }
            dc31 dc31Var = (dc31) this.f120028b;
            mee1Var.f142689a = qee1Var2;
            mee1Var.f142690b = e2rVar;
            mee1Var.f142691c = string;
            mee1Var.f142694f = 1;
            Object objM89557A = x0h1.m89557A((luk) dc31Var.f47418e, new lee1(qee1Var2, dc31Var, null), mee1Var);
            yuk yukVar = yuk.f276404a;
            if (objM89557A == yukVar) {
                return yukVar;
            }
            qee1Var = qee1Var2;
            obj = objM89557A;
            e2rVar2 = e2rVar;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            string = mee1Var.f142691c;
            e2rVar2 = mee1Var.f142690b;
            qee1Var = mee1Var.f142689a;
            bga.m29073P(obj);
        }
        return new e211((List) obj, qee1Var.f187916c, new gji(new ku01(e2rVar2)), string);
    }

    @Override // p204p.r7l0
    public void onComplete(Task task) {
        ebc ebcVar;
        wlf1 wlf1Var = (wlf1) this.f120028b;
        ura0 ura0Var = wlf1.f252543s;
        boolean z = wlf1Var.f252548p;
        if (task.mo1518j()) {
            Bundle bundle = (Bundle) task.mo1515g();
            boolean z2 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            ura0Var.m83848a("The module-to-client output switcher flag %s", true != z2 ? "not existed" : "existed");
            if (z2) {
                wlf1Var.f252549q = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            }
        }
        boolean z3 = wlf1Var.f252549q;
        if (wlf1Var.f252544l == null || (ebcVar = wlf1Var.f252545m) == null) {
            return;
        }
        boolean z4 = ebcVar.f57887X;
        boolean z5 = ebcVar.f57899t;
        boolean z6 = z3 && ebcVar.f57889Z;
        cnd0 cnd0Var = new cnd0();
        int i = Build.VERSION.SDK_INT;
        cnd0Var.f39982a = i >= 30;
        if (i >= 30) {
            cnd0Var.f39982a = z6;
        }
        if (i >= 30) {
            cnd0Var.f39984c = z4;
        }
        if (i >= 30) {
            cnd0Var.f39983b = z5;
        }
        boolean z7 = ebcVar.f57886P0;
        if (i >= 30) {
            cnd0Var.f39985d = z7;
        }
        dnd0 dnd0Var = new dnd0(cnd0Var);
        zmd0.m96426b();
        mg10 mg10VarM96427c = zmd0.m96427c();
        dnd0 dnd0Var2 = mg10VarM96427c.f143279u;
        eg10 eg10Var = mg10VarM96427c.f143259a;
        mg10VarM96427c.f143279u = dnd0Var;
        if (mg10VarM96427c.m61670i()) {
            if (mg10VarM96427c.f143276r == null) {
                old0 old0Var = new old0(mg10VarM96427c.f143265g, new z4y(mg10VarM96427c, 7));
                mg10VarM96427c.f143276r = old0Var;
                mg10VarM96427c.m61662a(old0Var, true);
                mg10VarM96427c.m61674m();
            }
            old0 old0Var2 = mg10VarM96427c.f143276r;
            boolean z8 = dnd0Var.f50762d;
            old0Var2.f166825N0 = z8;
            old0Var2.m67288l();
            n890 n890Var = mg10VarM96427c.f143261c;
            n890Var.f151474a = z8;
            n890Var.m63837h();
            if ((dnd0Var2 != null && dnd0Var2.f50761c) != dnd0Var.f50761c) {
                old0 old0Var3 = mg10VarM96427c.f143276r;
                old0Var3.f60891e = mg10VarM96427c.f143255A;
                if (!old0Var3.f60892f) {
                    old0Var3.f60892f = true;
                    old0Var3.f60889c.sendEmptyMessage(2);
                }
            }
        } else {
            old0 old0Var4 = mg10VarM96427c.f143276r;
            if (old0Var4 != null) {
                vmd0 vmd0VarM61665d = mg10VarM96427c.m61665d(old0Var4);
                if (vmd0VarM61665d != null) {
                    zmd0.m96426b();
                    old0Var4.f60890d = null;
                    old0Var4.m39416h(null);
                    mg10VarM96427c.m61676o(vmd0VarM61665d, null);
                    eg10Var.m38769b(514, vmd0VarM61665d);
                    mg10VarM96427c.f143270l.remove(vmd0VarM61665d);
                }
                mg10VarM96427c.f143276r = null;
                mg10VarM96427c.f143261c.m63837h();
            }
        }
        eg10Var.m38769b(769, dnd0Var);
        ura0Var.m83850c("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(z), Boolean.valueOf(z6), Boolean.valueOf(z4), Boolean.valueOf(z5));
        tnf1 tnf1Var = wlf1Var.f252547o;
        if (tnf1Var != null) {
            tnf1Var.f221968e = z && z6;
        }
        if (z && z6) {
            dyg1.m37339a(kug1.CAST_OUTPUT_SWITCHER_ENABLED);
        }
        if (z4) {
            dyg1.m37339a(kug1.CAST_TRANSFER_TO_LOCAL_ENABLED);
        }
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        n3c1 n3c1Var = (n3c1) obj;
        if (n3c1Var.f150003a.length() > 0) {
            ((qob1) this.f120028b).f190904f.mo33104m(n3c1Var.f150005c);
        }
    }

    @Override // p204p.t6l0
    /* JADX INFO: renamed from: x */
    public swd1 mo24684x(View view, swd1 swd1Var) {
        ((ViewGroup) this.f120028b).setPadding(0, swd1Var.f214650a.mo51806g(519).f53849b, 0, 0);
        return swd1.f214649b;
    }

    @Override // p204p.y8f1
    public Object zza(String str) throws GeneralSecurityException {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return ((a9f1) this.f120028b).mo24339b(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    public k791(roa roaVar, tuo0 tuo0Var) {
        this.f120027a = 15;
        this.f120028b = roaVar;
    }

    public /* synthetic */ k791(dxc1 dxc1Var) {
        this.f120027a = 19;
        this.f120028b = ((jf40) dxc1Var.f53930b).m53150g();
    }

    public k791(Context context, String str, Intent intent) {
        this.f120027a = 7;
        this.f120028b = intent;
        intent.setExtrasClassLoader(context.getClassLoader());
        intent.setClassName(context, str);
    }

    public k791(float f, float f2) {
        this.f120027a = 4;
        this.f120028b = new aiz(f, f2, 0.01f);
    }
}
