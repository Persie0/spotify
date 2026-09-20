package p204p;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.LruCache;
import androidx.compose.p002ui.geometry.Offset;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class u201 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f225946a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f225947b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f225948c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f225949d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f225950e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f225951f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f225952g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u201(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        super(1);
        this.f225946a = i;
        this.f225947b = obj;
        this.f225948c = obj2;
        this.f225949d = obj3;
        this.f225950e = obj4;
        this.f225951f = obj5;
        this.f225952g = obj6;
    }

    /* JADX INFO: renamed from: a */
    private final Object m82235a(Object obj) {
        Object next;
        pjo pjoVar;
        k35 k35Var = (k35) this.f225947b;
        Iterator it = ((List) obj).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!wj50.m88271j((k35) ((pqm0) next).f180350a, k35Var));
        pqm0 pqm0Var = (pqm0) next;
        if (pqm0Var != null && (pjoVar = (pjo) pqm0Var.f180351b) != null) {
            Object obj2 = this.f225948c;
            frv0 frv0Var = (frv0) this.f225949d;
            nlv0 nlv0Var = (nlv0) this.f225950e;
            sir0 sir0Var = (sir0) this.f225951f;
            ArrayList arrayList = (ArrayList) this.f225952g;
            synchronized (obj2) {
                try {
                    frv0Var.getClass();
                    u3s u3sVarM42507k = frv0.m42507k(pjoVar);
                    if (nlv0Var.f155174a) {
                        sir0Var.mo30231j(u3sVarM42507k);
                    } else {
                        arrayList.add(u3sVarM42507k);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: e */
    private final Object m82236e(Object obj) {
        return xtm0.m92074U((fiz) this.f225947b, new eq0(3, (co21) this.f225948c, (fiz) this.f225949d, (fiz) this.f225950e, (fiz) this.f225951f, (fiz) this.f225952g, (fbk) null));
    }

    /* JADX INFO: renamed from: f */
    private final Object m82237f(Object obj) {
        Context context = (Context) obj;
        Activity activity = (Activity) context;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) activity.findViewById(R.id.bottom_sheet_content);
        l551 l551Var = new l551(activity, new fyf(new kd11((fyf) this.f225951f, 3), true, -135732336), (kv91) this.f225947b, (lt91) this.f225948c, (e940) this.f225949d, (b250) this.f225950e);
        l551Var.getViewTreeObserver().addOnGlobalLayoutListener(new dnd(5, (gh00) this.f225952g, l551Var));
        if (l551Var.getParent() == null && coordinatorLayout != null) {
            coordinatorLayout.addView(l551Var);
        }
        i551 i551Var = new i551(context, l551Var);
        i551Var.setVisibility(8);
        i551Var.addOnAttachStateChangeListener(new ay1(l551Var, 18));
        return i551Var;
    }

    /* JADX INFO: renamed from: g */
    private final Object m82238g(Object obj) {
        return new mgq0(x0h1.m89578u((xuk) this.f225947b, null, 0, new xt61(9, (luk) this.f225948c, (LruCache) this.f225949d, (Uri) this.f225950e, (Context) this.f225951f, (kqi0) this.f225952g, null), 3), 18);
    }

    /* JADX INFO: renamed from: i */
    private final Object m82239i(Object obj) {
        x0h1.m89578u((xuk) this.f225947b, null, 0, new ly2((gh00) this.f225948c, (Uri) obj, (z0r) this.f225949d, (String) this.f225950e, (kqi0) this.f225951f, (kqi0) this.f225952g, null), 3);
        return w2a1.f247311a;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f225946a) {
            case 0:
                qhy0 qhy0Var = (qhy0) obj;
                nj7 nj7Var = (nj7) this.f225947b;
                zl8 zl8Var = (zl8) this.f225948c;
                lji ljiVar = (lji) this.f225949d;
                afq0 afq0Var = (afq0) this.f225950e;
                umn umnVar = (umn) this.f225951f;
                uzz0 uzz0Var = (uzz0) this.f225952g;
                zl8Var.mo64724c();
                b9k b9kVar = qhy0Var.f188883a;
                int i = 0;
                int i2 = 0;
                v050 v050VarM28490h = b9kVar.m28490h("DataPreloadingService", new qik0(new l02(0, uzz0Var.f235845w1, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0, 24), new mkk0(0, uzz0Var.f235853y1, i4t0.class, "get", "get()Ljava/lang/Object;", 0, i, 18), new mkk0(0, uzz0Var.f235849x1, i4t0.class, "get", "get()Ljava/lang/Object;", i, i2, 19), 2));
                int i3 = 0;
                int i4 = 0;
                v050 v050VarM28490h2 = b9kVar.m28490h("PlayerControlsService", new qik0(new lkk0(umnVar, 1), new l02(0, uzz0Var.f235763c, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0, 26), new nkk0(i2, uzz0Var.f235692H0, i4t0.class, "get", "get()Ljava/lang/Object;", i4, i3, 28), 20));
                v050 v050VarM28490h3 = b9kVar.m28490h("PlaybackStatusObserverService", new rik0(25, new nkk0(i2, uzz0Var.f235744W0, i4t0.class, "get", "get()Ljava/lang/Object;", i4, i3, 22), new nkk0(i2, uzz0Var.f235767d, i4t0.class, "get", "get()Ljava/lang/Object;", i4, i3, 23)));
                int i5 = 0;
                v050 v050VarM28490h4 = b9kVar.m28490h("BluetoothLoggerService", new vvs(new mkk0(i2, uzz0Var.f235767d, i4t0.class, "get", "get()Ljava/lang/Object;", i4, i3, 4), new vik0(v050VarM28490h3, 13), new mkk0(0, uzz0Var.f235773e1, i4t0.class, "get", "get()Ljava/lang/Object;", i3, i5, 5), new mkk0(0, uzz0Var.f235807n, i4t0.class, "get", "get()Ljava/lang/Object;", i5, 0, 6), 26));
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                v050 v050VarM28490h5 = b9kVar.m28490h("SessionPluginsHostingService", new skk0(new pkk0(0, uzz0Var.f235767d, i4t0.class, "get", "get()Ljava/lang/Object;", 0, i6, 13), new pkk0(0, uzz0Var.f235775f, i4t0.class, "get", "get()Ljava/lang/Object;", i6, i7, 14), new pkk0(0, uzz0Var.f235827s, i4t0.class, "get", "get()Ljava/lang/Object;", i7, i8, 15), new wjk0(qhy0Var, 10), new pkk0(0, uzz0Var.f235755a, i4t0.class, "get", "get()Ljava/lang/Object;", i8, i9, 16), new pkk0(0, uzz0Var.f235735T0, i4t0.class, "get", "get()Ljava/lang/Object;", i9, i10, 17), new pkk0(0, uzz0Var.f235799l, i4t0.class, "get", "get()Ljava/lang/Object;", i10, i11, 18), new pkk0(0, uzz0Var.f235740V, i4t0.class, "get", "get()Ljava/lang/Object;", i11, i12, 19), new pkk0(0, uzz0Var.f235791j, i4t0.class, "get", "get()Ljava/lang/Object;", i12, i13, 20), new pkk0(0, uzz0Var.f235753Z0, i4t0.class, "get", "get()Ljava/lang/Object;", i13, i14, 8), new pkk0(0, uzz0Var.f235771e, i4t0.class, "get", "get()Ljava/lang/Object;", i14, i15, 9), new pkk0(0, uzz0Var.f235711M, i4t0.class, "get", "get()Ljava/lang/Object;", i15, i16, 10), new vik0(v050VarM28490h, 26), new vik0(v050VarM28490h2, 27), new pkk0(0, uzz0Var.f235744W0, i4t0.class, "get", "get()Ljava/lang/Object;", i16, i17, 11), new pkk0(0, uzz0Var.f235807n, i4t0.class, "get", "get()Ljava/lang/Object;", i17, 0, 12), new vik0(v050VarM28490h4, 28)));
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                v050 v050VarM28490h6 = b9kVar.m28490h("AudioSessionManagerService", new k380(new mkk0(i19, uzz0Var.f235779g, i4t0.class, "get", "get()Ljava/lang/Object;", i20, i18, 2), new gkk0(umnVar, 6), new mkk0(i19, uzz0Var.f235767d, i4t0.class, "get", "get()Ljava/lang/Object;", i20, i18, 3), 29));
                int i21 = 0;
                v050 v050VarM28490h7 = b9kVar.m28490h("DecipherChatStreamService", new vvs(new gkk0(umnVar, 7), new ye90(uzz0Var, 29), new mkk0(i19, uzz0Var.f235722P, i4t0.class, "get", "get()Ljava/lang/Object;", i20, i18, 20), new mkk0(0, uzz0Var.f235829s1, i4t0.class, "get", "get()Ljava/lang/Object;", i18, i21, 21), 28));
                v050 v050VarM28490h8 = b9kVar.m28490h("SpotifyWidgetPlayerService", new ckk0(6, new vik0(v050VarM28490h2, 29), new dkk0(uzz0Var, 22)));
                int i22 = 0;
                int i23 = 0;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                int i28 = 0;
                v050 v050VarM28490h9 = b9kVar.m28490h("SpotifyWidgetUpdaterService", new pxt(new pkk0(0, uzz0Var.f235744W0, i4t0.class, "get", "get()Ljava/lang/Object;", i18, i21, 22), new pkk0(0, uzz0Var.f235767d, i4t0.class, "get", "get()Ljava/lang/Object;", i21, i22, 23), new pkk0(0, uzz0Var.f235771e, i4t0.class, "get", "get()Ljava/lang/Object;", i22, i23, 24), new pkk0(0, uzz0Var.f235775f, i4t0.class, "get", "get()Ljava/lang/Object;", i23, i24, 25), new pkk0(0, uzz0Var.f235735T0, i4t0.class, "get", "get()Ljava/lang/Object;", i24, i25, 26), new pkk0(0, uzz0Var.f235755a, i4t0.class, "get", "get()Ljava/lang/Object;", i25, i26, 27), new pkk0(0, uzz0Var.f235753Z0, i4t0.class, "get", "get()Ljava/lang/Object;", i26, i27, 28), new pkk0(0, uzz0Var.f235791j, i4t0.class, "get", "get()Ljava/lang/Object;", i27, 0, 29), new rkk0(0, uzz0Var.f235799l, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0, 0), new pkk0(0, uzz0Var.f235692H0, i4t0.class, "get", "get()Ljava/lang/Object;", i28, 0, 21)));
                int i29 = 0;
                int i30 = 0;
                int i31 = 0;
                v050 v050VarM28490h10 = b9kVar.m28490h("MediaButtonActionHandlerService", new oo5(new nkk0(0, uzz0Var.f235747X0, i4t0.class, "get", "get()Ljava/lang/Object;", 0, i29, 1), new nkk0(0, uzz0Var.f235744W0, i4t0.class, "get", "get()Ljava/lang/Object;", i29, i30, 2), new nkk0(0, uzz0Var.f235767d, i4t0.class, "get", "get()Ljava/lang/Object;", i30, i31, 3), new vik0(v050VarM28490h2, 17), new vik0(v050VarM28490h4, 18), 29));
                int i32 = 0;
                int i33 = 0;
                int i34 = 0;
                int i35 = 0;
                int i36 = 0;
                int i37 = 0;
                int i38 = 0;
                v050 v050VarM28490h11 = b9kVar.m28490h("PushNotificationService", new bkk0(new gkk0(umnVar, 11), new okk0(i31, uzz0Var.f235756a0, i4t0.class, "get", "get()Ljava/lang/Object;", 0, i28, 23), new okk0(0, uzz0Var.f235752Z, i4t0.class, "get", "get()Ljava/lang/Object;", i28, i32, 24), new okk0(0, uzz0Var.f235749Y, i4t0.class, "get", "get()Ljava/lang/Object;", i32, i33, 25), new okk0(0, uzz0Var.f235746X, i4t0.class, "get", "get()Ljava/lang/Object;", i33, i34, 26), new okk0(i36, uzz0Var.f235743W, i4t0.class, "get", "get()Ljava/lang/Object;", i34, i35, 27), new okk0(i36, uzz0Var.f235775f, i4t0.class, "get", "get()Ljava/lang/Object;", i34, i35, 28), new okk0(i36, uzz0Var.f235767d, i4t0.class, "get", "get()Ljava/lang/Object;", i34, i35, 29), new l02(0, uzz0Var.f235771e, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0, 27), new okk0(i36, uzz0Var.f235825r1, i4t0.class, "get", "get()Ljava/lang/Object;", i34, i35, 8), new okk0(i36, uzz0Var.f235833t1, i4t0.class, "get", "get()Ljava/lang/Object;", i34, i35, 9), new okk0(i36, uzz0Var.f235791j, i4t0.class, "get", "get()Ljava/lang/Object;", i34, i35, 10), new okk0(i36, uzz0Var.f235664A0, i4t0.class, "get", "get()Ljava/lang/Object;", i34, i35, 11), new okk0(i36, uzz0Var.f235668B0, i4t0.class, "get", "get()Ljava/lang/Object;", i34, i35, 12), new okk0(i36, uzz0Var.f235672C0, i4t0.class, "get", "get()Ljava/lang/Object;", i34, i35, 13), new okk0(i36, uzz0Var.f235755a, i4t0.class, "get", "get()Ljava/lang/Object;", i34, i35, 14), new okk0(i36, uzz0Var.f235676D0, i4t0.class, "get", "get()Ljava/lang/Object;", i34, i35, 15), new okk0(i36, uzz0Var.f235680E0, i4t0.class, "get", "get()Ljava/lang/Object;", i34, i35, 16), new okk0(i36, uzz0Var.f235857z1, i4t0.class, "get", "get()Ljava/lang/Object;", i34, i35, 17), new okk0(i36, uzz0Var.f235713M1, i4t0.class, "get", "get()Ljava/lang/Object;", i34, i35, 18), new okk0(i36, uzz0Var.f235717N1, i4t0.class, "get", "get()Ljava/lang/Object;", i34, i35, 19), new okk0(i37, uzz0Var.f235721O1, i4t0.class, "get", "get()Ljava/lang/Object;", i35, 0, 20), new gkk0(umnVar, 12), new okk0(0, uzz0Var.f235701J1, i4t0.class, "get", "get()Ljava/lang/Object;", 0, i38, 21), new okk0(0, uzz0Var.f235765c1, i4t0.class, "get", "get()Ljava/lang/Object;", i38, 0, 22)));
                int i39 = 0;
                int i40 = 0;
                v050 v050VarM28490h12 = b9kVar.m28490h("ContributionDataSourceService", new gik0(new mkk0(i40, uzz0Var.f235724P1, i4t0.class, "get", "get()Ljava/lang/Object;", i37, i39, 17), 21));
                v050 v050VarM28490h13 = b9kVar.m28490h("ContributionMutationNotifierService", l3b0.f129285h);
                int i41 = 0;
                int i42 = 0;
                int i43 = 0;
                int i44 = 0;
                v050 v050VarM28490h14 = b9kVar.m28490h("EndlessNotificationService", new jq9(new mkk0(i40, uzz0Var.f235715N, i4t0.class, "get", "get()Ljava/lang/Object;", i37, i39, 25), new mkk0(0, uzz0Var.f235763c, i4t0.class, "get", "get()Ljava/lang/Object;", i39, i41, 26), new mkk0(0, uzz0Var.f235848x0, i4t0.class, "get", "get()Ljava/lang/Object;", i41, i42, 27), new mkk0(0, uzz0Var.f235731S, i4t0.class, "get", "get()Ljava/lang/Object;", i42, i43, 28), new mkk0(0, uzz0Var.f235852y0, i4t0.class, "get", "get()Ljava/lang/Object;", i43, i44, 29), new nkk0(0, uzz0Var.f235791j, i4t0.class, "get", "get()Ljava/lang/Object;", i44, 0, 0), 13));
                int i45 = 0;
                int i46 = 0;
                int i47 = 0;
                int i48 = 0;
                int i49 = 0;
                v050 v050VarM28490h15 = b9kVar.m28490h("CollectionNotificationService", new jq9(new mkk0(0, uzz0Var.f235755a, i4t0.class, "get", "get()Ljava/lang/Object;", 0, i45, 11), new mkk0(0, uzz0Var.f235692H0, i4t0.class, "get", "get()Ljava/lang/Object;", i45, i46, 12), new mkk0(0, uzz0Var.f235837u1, i4t0.class, "get", "get()Ljava/lang/Object;", i46, i47, 13), new mkk0(0, uzz0Var.f235791j, i4t0.class, "get", "get()Ljava/lang/Object;", i47, i48, 14), new mkk0(0, uzz0Var.f235857z1, i4t0.class, "get", "get()Ljava/lang/Object;", i48, i49, 15), new mkk0(0, uzz0Var.f235669B1, i4t0.class, "get", "get()Ljava/lang/Object;", i49, 0, 16), 11));
                b9k b9kVar2 = qhy0Var.f188883a;
                int i50 = 0;
                int i51 = 0;
                int i52 = 0;
                int i53 = 0;
                v050 v050VarM28490h16 = b9kVar2.m28490h("PlaybackNotificationPlayerService", new ha40(new nkk0(0, uzz0Var.f235744W0, i4t0.class, "get", "get()Ljava/lang/Object;", 0, i50, 17), new nkk0(0, uzz0Var.f235715N, i4t0.class, "get", "get()Ljava/lang/Object;", i50, i51, 18), new nkk0(0, uzz0Var.f235763c, i4t0.class, "get", "get()Ljava/lang/Object;", i51, i52, 19), new nkk0(0, uzz0Var.f235791j, i4t0.class, "get", "get()Ljava/lang/Object;", i52, i53, 20), new vik0(v050VarM28490h2, 21), new gkk0(umnVar, 9), new nkk0(0, uzz0Var.f235796k0, i4t0.class, "get", "get()Ljava/lang/Object;", i53, 0, 21), 7));
                int i54 = 0;
                pkk0 pkk0Var = new pkk0(0, uzz0Var.f235755a, i4t0.class, "get", "get()Ljava/lang/Object;", 0, i54, 1);
                pkk0 pkk0Var2 = new pkk0(0, uzz0Var.f235771e, i4t0.class, "get", "get()Ljava/lang/Object;", i54, 0, 2);
                l02 l02Var = new l02(0, uzz0Var.f235819q, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0, 28);
                qkk0 qkk0Var = new qkk0(zl8Var, 0);
                pkk0 pkk0Var3 = new pkk0(0, uzz0Var.f235823r, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0, 3);
                int i55 = 4;
                pkk0 pkk0Var4 = new pkk0(0, uzz0Var.f235789i1, i4t0.class, "get", "get()Ljava/lang/Object;", 0, 0, i55);
                pkk0 pkk0Var5 = new pkk0(uzz0Var.f235808n0, 5);
                i4t0 i4t0Var = uzz0Var.f235811o;
                v050 v050VarM28490h17 = b9kVar2.m28490h("RemoteConfigAuthenticatedFetcherService", new ins(pkk0Var, pkk0Var2, l02Var, qkk0Var, pkk0Var3, pkk0Var4, pkk0Var5, new pkk0(i4t0Var, 6), 1));
                v050 v050VarM28490h18 = ((b9k) qhy0Var.m72846a()).m28490h("RemoteConfigAuthResolverService", new qik0(new nik0(ljiVar, 13), new pkk0(i4t0Var, 7), new qkk0(zl8Var, 1), 21));
                v050 v050VarM28490h19 = ((b9k) qhy0Var.m72846a()).m28490h("ProductStateResolverService", new eik0(new nkk0(uzz0Var.f235815p, 29), new vik0(v050VarM28490h17, 24), new okk0(uzz0Var.m84347u(), 0), new okk0(uzz0Var.f235812o0, 1), new okk0(uzz0Var.m84336j(), 2), new lik0(zl8Var, 1), new vik0(v050VarM28490h18, 25), new kkk0(afq0Var, 1), 4));
                v050 v050VarM28490h20 = ((b9k) qhy0Var.m72846a()).m28490h("PostLoginFlowRemotePropertiesService", new wjk0(new vik0(v050VarM28490h18, 23), 3));
                z8k z8kVarM72846a = qhy0Var.m72846a();
                i4t0 i4t0Var2 = uzz0Var.f235709L1;
                okk0 okk0Var = new okk0(i4t0Var2, 3);
                i4t0 i4t0Var3 = uzz0Var.f235857z1;
                v050 v050VarM28490h21 = ((b9k) z8kVarM72846a).m28490h("PromptedPlaylistGenerationService", new vjk0(okk0Var, new okk0(i4t0Var3, 4), new okk0(uzz0Var.f235665A1, 5), new okk0(uzz0Var.m84346t(), 6), new okk0(uzz0Var.f235733S1, 7), 4));
                v050 v050VarM28490h22 = ((b9k) qhy0Var.m72846a()).m28490h("MediaFocusManagerService", new ha40(new nkk0(uzz0Var.m84336j(), 4), new vik0(v050VarM28490h2, 19), new nkk0(uzz0Var.f235777f1, 5), new gkk0(umnVar, 8), new nkk0(uzz0Var.m84319E(), 6), new nkk0(uzz0Var.f235767d, 7), new nkk0(uzz0Var.f235817p1, 8), i55));
                z8k z8kVarM72846a2 = qhy0Var.m72846a();
                l02 l02Var2 = new l02(uzz0Var.m84319E(), 25);
                i4t0 i4t0Var4 = uzz0Var.f235763c;
                v050 v050VarM28490h23 = ((b9k) z8kVarM72846a2).m28490h("PiPPlayerService", new bjk0(l02Var2, new nkk0(i4t0Var4, 15), new vik0(v050VarM28490h2, 20), new nkk0(uzz0Var.f235791j, 16), 11));
                v050 v050VarM28490h24 = ((b9k) qhy0Var.m72846a()).m28490h("StsService", new sik0(new l02(uzz0Var.m84336j(), 29), new rkk0(uzz0Var.f235689G1, 3), new rkk0(i4t0Var2, 4), new rkk0(i4t0Var3, 5), new rkk0(uzz0Var.f235672C0, 6), new rkk0(uzz0Var.f235835u, 7), new rkk0(uzz0Var.f235803m, 8), new rkk0(uzz0Var.f235705K1, 9), new rkk0(uzz0Var.f235693H1, 10), new rkk0(uzz0Var.f235697I1, 1), new rkk0(uzz0Var.m84346t(), 2), 1));
                z8k z8kVarM72846a3 = qhy0Var.m72846a();
                rkk0 rkk0Var = new rkk0(uzz0Var.f235685F1, 12);
                rkk0 rkk0Var2 = new rkk0(uzz0Var.f235681E1, 13);
                rkk0 rkk0Var3 = new rkk0(uzz0Var.f235729R0, 14);
                i4t0 i4t0Var5 = uzz0Var.f235829s1;
                v050 v050VarM28490h25 = ((b9k) z8kVarM72846a3).m28490h("WidgetPlaybackAttributionService", new vjk0(rkk0Var, rkk0Var2, rkk0Var3, new rkk0(i4t0Var5, 15), new rkk0(uzz0Var.f235757a1, 16), 10));
                v050 v050VarM28490h26 = ((b9k) qhy0Var.m72846a()).m28490h("XrProjectedService", new qik0(new rkk0(uzz0Var.m84336j(), 17), new rkk0(i4t0Var5, 18), new rkk0(uzz0Var.f235696I0, 19), 27));
                v050 v050VarM28490h27 = ((b9k) qhy0Var.m72846a()).m28490h("SearchObservationService", l3b0.f129272Y);
                z8k z8kVarM72846a4 = qhy0Var.m72846a();
                i4t0 i4t0Var6 = uzz0Var.f235718N2;
                v050 v050VarM28490h28 = ((b9k) z8kVarM72846a4).m28490h("CampfireFeatureAvailabilityService", new mii0(27, new mkk0(i4t0Var6, 7), new mkk0(uzz0Var.f235831t, 8)));
                v050 v050VarM28490h29 = ((b9k) qhy0Var.m72846a()).m28490h("RecentEmojisRepositoryService", new ckk0(0, new dkk0(uzz0Var, 21), new pkk0(uzz0Var.m84346t(), 0)));
                z8k z8kVarM72846a5 = qhy0Var.m72846a();
                nkk0 nkk0Var = new nkk0(uzz0Var.f235783h, 9);
                nkk0 nkk0Var2 = new nkk0(uzz0Var.f235698I2, 10);
                dkk0 dkk0Var = new dkk0(uzz0Var, 17);
                i4t0 i4t0Var7 = uzz0Var.f235759b;
                v050 v050VarM28490h30 = ((b9k) z8kVarM72846a5).m28490h("MediaUploadChatService", new ha40(nkk0Var, nkk0Var2, dkk0Var, new nkk0(i4t0Var7, 11), new nkk0(uzz0Var.m84346t(), 12), new nkk0(uzz0Var.f235706K2, 13), new nkk0(i4t0Var6, 14), 5));
                v050 v050VarM28490h31 = ((b9k) qhy0Var.m72846a()).m28490h("ReceiptSettingsService", new rik0(29, new dkk0(uzz0Var, 19), new dkk0(uzz0Var, 20)));
                v050 v050VarM28490h32 = ((b9k) qhy0Var.m72846a()).m28490h("CampfireImageStorageService", new gik0(new mkk0(i4t0Var7, 9), 8));
                v050 v050VarM28490h33 = ((b9k) qhy0Var.m72846a()).m28490h("DownloadImageService", new qik0(new mkk0(uzz0Var.f235735T0, 22), new vik0(v050VarM28490h32, 14), new mkk0(uzz0Var.m84346t(), 23), 4));
                v050 v050VarM28490h34 = ((b9k) qhy0Var.m72846a()).m28490h("DownloadVideoService", new qik0(new vik0(((b9k) qhy0Var.m72846a()).m28490h("VideoFileProviderService", new wjk0(new rkk0(uzz0Var.f235710L2, 11), 16)), 15), new vik0(((b9k) qhy0Var.m72846a()).m28490h("CampfireVideoStorageService", new gik0(new mkk0(i4t0Var7, 10), 9)), 16), new mkk0(uzz0Var.m84346t(), 24), 5));
                v050 v050VarM28490h35 = ((b9k) qhy0Var.m72846a()).m28490h("PlayedReceiptTrackerService", new jq9(new nkk0(i4t0Var4, 24), new dkk0(uzz0Var, 18), new vik0(v050VarM28490h31, 22), new nkk0(i4t0Var6, 25), new nkk0(uzz0Var.m84319E(), 26), new nkk0(uzz0Var.m84346t(), 27), 17));
                v050 v050VarM28490h36 = ((b9k) qhy0Var.m72846a()).m28490h("PlaybackSettingsService", new wjk0(new gkk0(umnVar, 10), 1));
                uqw uqwVarM83478p = umnVar.m83478p();
                umnVar.getClass();
                return new n101(v050VarM28490h5, v050VarM28490h6, v050VarM28490h7, v050VarM28490h8, v050VarM28490h9, v050VarM28490h10, v050VarM28490h11, v050VarM28490h3, v050VarM28490h12, v050VarM28490h13, v050VarM28490h14, v050VarM28490h, v050VarM28490h15, v050VarM28490h16, v050VarM28490h17, v050VarM28490h18, v050VarM28490h19, v050VarM28490h20, v050VarM28490h4, v050VarM28490h2, v050VarM28490h21, v050VarM28490h22, v050VarM28490h23, v050VarM28490h24, v050VarM28490h25, v050VarM28490h26, v050VarM28490h27, v050VarM28490h28, v050VarM28490h29, v050VarM28490h30, v050VarM28490h31, v050VarM28490h33, v050VarM28490h34, v050VarM28490h35, v050VarM28490h36, nj7Var, afq0Var, uqwVarM83478p, BehaviorSubject.m23795f(), umnVar.m83480r(), (Observable) ((h4t0) umnVar.f231916c).get(), (Observable) ((h4t0) umnVar.f231917d).get());
            case 1:
                return m82235a(obj);
            case 2:
                return m82236e(obj);
            case 3:
                return m82237f(obj);
            case 4:
                return m82238g(obj);
            case 5:
                return m82239i(obj);
            default:
                ((vh00) this.f225948c).mo24510D0(Integer.valueOf(did1.m36076b((kqi0) this.f225949d, (kqi0) this.f225950e, (kqi0) this.f225951f, (kqi0) this.f225952g, Float.intBitsToFloat((int) (((Offset) obj).f493a >> 32)), (int) (((ub61) ((o6q0) this.f225947b)).f228647W0 >> 32))), Boolean.FALSE, wef0.f250523a);
                return w2a1.f247311a;
        }
    }
}
