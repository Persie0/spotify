package p204p;

import android.content.Intent;
import com.spotify.support.assertion.Assertion$Note;
import io.reactivex.rxjava3.core.Single;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class cj8 implements v550 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38517a;

    /* JADX INFO: renamed from: b */
    public final Object f38518b;

    /* JADX INFO: renamed from: c */
    public final Object f38519c;

    /* JADX INFO: renamed from: d */
    public final Object f38520d;

    public /* synthetic */ cj8(Object obj, Object obj2, Object obj3, int i) {
        this.f38517a = i;
        this.f38518b = obj;
        this.f38519c = obj2;
        this.f38520d = obj3;
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ b7j0 m32929b(cj8 cj8Var) {
        return (b7j0) cj8Var.f38518b;
    }

    /* JADX INFO: renamed from: c */
    public static final u1j0 m32930c(cj8 cj8Var, Intent intent, gn80 gn80Var, boolean z, e301 e301Var, boolean z2) {
        jj11 jj11Var = (jj11) cj8Var.f38520d;
        boolean zM48240K = ((hqe1) cj8Var.f38518b).m48240K();
        uzq0 uzq0Var = uzq0.f235620a;
        if (zM48240K) {
            Set set = dd41.f47702f;
            String strM68854k = p1v.m68854k(intent);
            return new u1j0(nqe1.class, new gi3(strM68854k == null ? "" : strM68854k, gn80Var, e301Var.f55571a, intent.getStringExtra("filter"), z2, ((Boolean) jj11Var.mo24510D0(Boolean.valueOf(z), intent, e301Var.f55571a)).booleanValue()), uzq0Var);
        }
        Set set2 = dd41.f47702f;
        String strM68854k2 = p1v.m68854k(intent);
        return new u1j0(qh3.class, new gi3(strM68854k2 == null ? "" : strM68854k2, gn80Var, e301Var.f55571a, intent.getStringExtra("filter"), z2, ((Boolean) jj11Var.mo24510D0(Boolean.valueOf(z), intent, e301Var.f55571a)).booleanValue()), uzq0Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: d */
    public static final Object m32931d(cj8 cj8Var, Intent intent, e301 e301Var, String str, String str2, ibk ibkVar) {
        utr0 utr0Var;
        e301 e301Var2;
        Intent intent2;
        String strM35694A;
        String str3;
        String str4;
        boolean z;
        String str5 = str;
        String str6 = str2;
        if (ibkVar instanceof utr0) {
            utr0Var = (utr0) ibkVar;
            int i = utr0Var.f233974X;
            if ((i & Integer.MIN_VALUE) != 0) {
                utr0Var.f233974X = i - Integer.MIN_VALUE;
            } else {
                utr0Var = new utr0(cj8Var, ibkVar);
            }
        } else {
            utr0Var = new utr0(cj8Var, ibkVar);
        }
        Object objM39772b = utr0Var.f233983i;
        int i2 = utr0Var.f233974X;
        boolean z2 = false;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM39772b);
            era1 era1Var = (era1) cj8Var.f38519c;
            utr0Var.f233975a = intent;
            utr0Var.f233976b = e301Var;
            utr0Var.f233977c = str5;
            utr0Var.f233978d = str6;
            utr0Var.f233974X = 1;
            objM39772b = era1Var.m39772b(str5, str6, utr0Var);
            if (objM39772b != yukVar) {
                e301Var2 = e301Var;
                intent2 = intent;
            }
            return yukVar;
        }
        if (i2 == 1) {
            String str7 = utr0Var.f233978d;
            String str8 = utr0Var.f233977c;
            e301Var2 = utr0Var.f233976b;
            intent2 = utr0Var.f233975a;
            bga.m29073P(objM39772b);
            str6 = str7;
            str5 = str8;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = utr0Var.f233982h;
            str3 = utr0Var.f233981g;
            strM35694A = utr0Var.f233980f;
            str4 = utr0Var.f233979e;
            bga.m29073P(objM39772b);
        }
        if (((Boolean) objM39772b).booleanValue() && !wj50.m88271j(str3, str4)) {
            z2 = true;
        }
        return new u1j0(qtr0.class, new rtr0(16, strM35694A, str3, z, z2), uzq0.f235620a);
        String str9 = (String) objM39772b;
        p1j0 p1j0Var = p1j0.f173119a;
        if (str9 == null) {
            new Assertion$Note("ProfileEntityRouteGroup couldn't resolve username, account id is empty: " + (str5.length() == 0) + ", social handle is empty: " + (str6.length() == 0), null);
            return p1j0Var;
        }
        Set set = dd41.f47702f;
        strM35694A = r46.m74732a0(str9, null).m35694A();
        if (strM35694A == null) {
            return p1j0Var;
        }
        str3 = e301Var2.f55571a;
        boolean booleanExtra = intent2.getBooleanExtra("view_as_visitor", false);
        Single singleOnErrorReturn = ((rwx0) ((qwx0) cj8Var.f38518b)).f203428a.map(oyq0.f171863c).firstOrError().onErrorReturn(qyq0.f194007c);
        utr0Var.f233975a = null;
        utr0Var.f233976b = null;
        utr0Var.f233977c = null;
        utr0Var.f233978d = null;
        utr0Var.f233979e = str9;
        utr0Var.f233980f = strM35694A;
        utr0Var.f233981g = str3;
        utr0Var.f233982h = booleanExtra;
        utr0Var.f233974X = 2;
        Object objM96567o = zn91.m96567o(singleOnErrorReturn, utr0Var);
        if (objM96567o != yukVar) {
            str4 = str9;
            objM39772b = objM96567o;
            z = booleanExtra;
            if (((Boolean) objM39772b).booleanValue()) {
                z2 = true;
            }
            return new u1j0(qtr0.class, new rtr0(16, strM35694A, str3, z, z2), uzq0.f235620a);
        }
        return yukVar;
    }

    @Override // p204p.v550
    /* JADX INFO: renamed from: a */
    public final void mo27509a(cxe cxeVar) {
        int i = this.f38517a;
        Object obj = this.f38520d;
        fbk fbkVar = null;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = 0;
                cxeVar.m34270D("com.spotify.mobile.android.ui.action.view.CLEAR_BACKSTACK", "Should clear backstack", new aj8(this, i3));
                cxeVar.m34270D("com.spotify.mobile.android.ui.action.view.SPOTIFY_URI", "Should probably pop a fragment", new bj8(this, i3));
                cxeVar.m34270D("com.spotify.mobile.android.ui.action.ACTION_CLOSE_ALL_OVERLAYS", "Should clear overlay backstack", new bj8(this, i2));
                cxeVar.m34270D("com.spotify.mobile.android.ui.action.ACTION_CLOSE_ALL_OVERLAYS_FOR_LINK", "Should clear overlay backstack matching a specific link type", new bj8(this, 2));
                cxeVar.m34270D("com.spotify.mobile.android.ui.action.ACTION_CLOSE_ALL_OVERLAYS_FOR_URI_TYPE", "Should clear overlay backstack matching a specific URI type", new bj8(this, 3));
                break;
            case 1:
                cxeVar.m34279M(new spr(gn80.CHAT_DETAILS, 8), b2d.class.getSimpleName(), new e99(this, 12));
                break;
            case 2:
                int i4 = 8;
                q350.m72059n(cxeVar, stg1.m79275p(new spr(gn80.CHAT_SHARE, i4), new spr(gn80.CHAT_SHARE_CREATE_GROUP, i4), new spr(gn80.CHAT_MEMBERS_ADD, i4)), ltd.class.getSimpleName(), new eud(this, fbkVar, 0));
                break;
            case 3:
                cxeVar.m34271E(gn80.JAM_MANAGE_PARTICIPANTS_SHEET, "Open Jam Manage Participants Sheet", new oyz(this, 14));
                cxeVar.m34271E(gn80.JAM_PENDING_REQUESTS_SHEET, "Open Jam Pending Requests Sheet", new yps(this, 24));
                break;
            case 4:
                for (gn80 gn80Var : i760.f99437a) {
                    cxeVar.m34279M(new spr(gn80Var, 8), "Route to dialog that opens Jam", new i5z(24, this, gn80Var));
                }
                break;
            case 5:
                gn80 gn80Var2 = gn80.LEX_EXPERIMENTS;
                m500 m500Var = (m500) this.f38518b;
                cxeVar.m34280N(gn80Var2, "lex-experiments", new pj70(m500Var, 2));
                if (((l3v) obj).f129445a.m38344e()) {
                    q350.m72059n(cxeVar, new spr(gn80.LEXICON_SET, 8), "lexicon", new hc0(this, (fbk) null));
                } else {
                    cxeVar.m34280N(gn80.LEXICON_SET, "lexicon", new pj70(m500Var, 2));
                }
                break;
            case 6:
                cxeVar.m34279M(new spr(gn80.AUDIOBOOK_LISTENINGHOURSREQUEST, 8), "Handles an audiobooks listening hours request", new w090(this, i2));
                break;
            case 7:
                cxeVar.m34270D("com.spotify.mobile.android.ui.action.view.CLEAR_BACKSTACK", "Should clear backstack", new v4m0(this, 0));
                cxeVar.m34270D("com.spotify.mobile.android.ui.action.view.SPOTIFY_URI", "Closes page and navigates back", new v4m0(this, i2));
                cxeVar.m34270D("com.spotify.mobile.android.ui.action.view.CLOSE_PAGE_ACTIVITY", "Closes page activity", new v4m0(this, 2));
                cxeVar.m34270D("com.spotify.mobile.android.ui.action.ACTION_CLOSE_ALL_OVERLAYS", "Should clear overlay backstack", new v4m0(this, 3));
                cxeVar.m34270D("com.spotify.mobile.android.ui.action.ACTION_CLOSE_ALL_OVERLAYS_FOR_LINK", "Closes page activity", new v4m0(this, 4));
                cxeVar.m34270D("com.spotify.mobile.android.ui.action.ACTION_CLOSE_ALL_OVERLAYS_FOR_URI_TYPE", "Should clear overlay backstack matching a specific URI type", new v4m0(this, 5));
                break;
            case 8:
                cxeVar.m34280N(gn80.SHOW_EPISODE_SCROLL, "Handle routing to podcast specific entity page", new pqk0(this, 16));
                break;
            case 9:
                cxeVar.m34280N(gn80.OWN_PROFILE, "Current users profile", dxq0.f54065c);
                cxeVar.m34279M(new spr(gn80.PROFILE, 8), "Profiles of Spotify users", new fbk0(this, 26));
                if (((b2s0) obj).f22687a.m58268a()) {
                    q350.m72059n(cxeVar, new spr(dya1.f54265f, 9), "Profile via account ID with social handle", new nto0(this, fbkVar, 10));
                }
                break;
            case 10:
                q350.m72059n(cxeVar, new spr(gn80.SC_PAIR, 8), "Store Super Connect pending pairing from QR scan", new bp41(this, fbkVar, i2));
                break;
            default:
                for (pqm0 pqm0Var : h6f.m46715L(new pqm0(gn80.COLLECTION_ROOT, "Collection root: Your Library"), new pqm0(gn80.COLLECTION_ROOTLIST, "Collection rootlist: Your Library."), new pqm0(gn80.COLLECTION_ROOTLIST_BY_YOU, "Collection rootlist by you: Your Library"), new pqm0(gn80.COLLECTION_ALBUM_OVERVIEW, "Collection album overview: Your Library."), new pqm0(gn80.COLLECTION_ARTIST_OVERVIEW, "Collection artist overview: Your Library."), new pqm0(gn80.COLLECTION_PODCASTS_DOWNLOADS, "Collection podcasts downloads: Your Library"), new pqm0(gn80.COLLECTION_PODCASTS_FOLLOWING, "Collection podcasts following: Your Library"), new pqm0(gn80.COLLECTION_PODCASTS, "Collection podcasts: Your Library"), new pqm0(gn80.COLLECTION_SHOWS, "Collection podcasts: Your Library"), new pqm0(gn80.COLLECTION_UNPLAYED_VIDEOS, "Collection podcasts downloads: Your Library"), new pqm0(gn80.COLLECTION_OFFLINED_EPISODES, "Old downloads uri fallback navigate to Your Library"), new pqm0(gn80.COLLECTION_OFFLINE_EPISODES, "Old downloads uri fallback navigate to Your Library"), new pqm0(gn80.COLLECTION_AUDIOBOOKS, "Collection audiobooks: Your Library"), new pqm0(gn80.COLLECTION_DOWNLOADS, "All downloads: Your Library"), new pqm0(gn80.COLLECTION_EVENTS, "Collection events: Your Library"))) {
                    gn80 gn80Var3 = (gn80) pqm0Var.f180350a;
                    cxeVar.m34279M(new spr(gn80Var3, 8), (String) pqm0Var.f180351b, new y3d1(12, this, gn80Var3));
                }
                break;
        }
    }

    public cj8(g5m0 g5m0Var, w6j0 w6j0Var, m7j0 m7j0Var) {
        this.f38517a = 7;
        this.f38518b = g5m0Var;
        this.f38520d = w6j0Var;
        this.f38519c = m7j0Var;
    }

    public cj8(m500 m500Var, b7j0 b7j0Var, e3j0 e3j0Var, m7j0 m7j0Var, o7m o7mVar, w6j0 w6j0Var) {
        this.f38517a = 0;
        this.f38518b = b7j0Var;
        this.f38519c = m7j0Var;
        this.f38520d = new azp0(m500Var, b7j0Var, e3j0Var, o7mVar, w6j0Var, 17);
    }
}
