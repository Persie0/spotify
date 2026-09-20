package p204p;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.localfiles.localfilesmonorepo.AudioMimeMatcher;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class la2 implements v550 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f131225a;

    /* JADX INFO: renamed from: b */
    public Object f131226b;

    /* JADX INFO: renamed from: b */
    public static final klf0 m58526b(la2 la2Var, Intent intent, dd41 dd41Var, String str) {
        he41 he41Var = dd41Var.f47710d;
        sup0 sup0Var = he41Var instanceof sup0 ? (sup0) he41Var : null;
        if (sup0Var == null) {
            throw new IllegalArgumentException((dd41Var + " URI is not supported, only the mixing URI is supported.").toString());
        }
        Set set = dd41.f47702f;
        String strM35694A = r46.m74728W(sup0Var.f214174a).m35694A();
        if (strM35694A == null) {
            throw new IllegalArgumentException(("Unable to convert " + dd41Var + " URI to a playlist V2 URI.").toString());
        }
        String str2 = sup0Var.f214177d;
        aox0 aox0Var = (aox0) pp91.m70538s(intent, "intent_argument_to_row", aox0.class);
        if (aox0Var == null) {
            throw new IllegalArgumentException("Missing or faulty toRow");
        }
        aox0 aox0Var2 = (aox0) pp91.m70538s(intent, "intent_argument_from_row", aox0.class);
        if (aox0Var2 != null) {
            return new klf0(strM35694A, str2, aox0Var2, aox0Var, null, str, 16);
        }
        throw new IllegalArgumentException("Missing or faulty fromRow");
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ z6g0 m58527c(la2 la2Var) {
        return (z6g0) la2Var.f131226b;
    }

    /* JADX INFO: renamed from: d */
    public static final u1j0 m58528d(la2 la2Var, dd41 dd41Var, e301 e301Var) {
        String strM35694A = dd41Var.m35694A();
        if (strM35694A == null) {
            strM35694A = "";
        }
        return new u1j0(mma.class, new oma(strM35694A, e301Var.f55571a, dd41Var.m35695B("page")), uzq0.f235620a);
    }

    /* JADX INFO: renamed from: e */
    public static final u1j0 m58529e(la2 la2Var, Intent intent, b370 b370Var) {
        agr0 agr0Var;
        dlx dlxVar;
        b370 b370Var2;
        v170 v170Var = (v170) la2Var.f131226b;
        Bundle extras = intent.getExtras();
        b370 b370Var3 = (extras == null || (b370Var2 = (b370) extras.getParcelable("key_flow_type")) == null) ? b370Var : b370Var2;
        int i = 4;
        int i2 = 1;
        char c = 1;
        if (!(b370Var3 instanceof a370)) {
            Bundle extras2 = intent.getExtras();
            w170 w170VarM86976c = w170.m86976c(v170Var.f236272d, null, null, null, null, null, null, false, false, extras2 != null ? extras2.getInt("entry-point-pages-count", 0) : 0, null, null, null, 7935);
            v170Var.f236272d = w170VarM86976c;
            v170Var.f236272d = w170.m86976c(w170VarM86976c, null, null, null, null, null, null, false, false, 0, null, b370Var3, null, 6143);
            return new u1j0(r170.class, new t170(b370Var3), new xzq0(1, (boolean) (1 == true ? 1 : 0), i));
        }
        Bundle extras3 = intent.getExtras();
        cpm0 cpm0Var = extras3 != null ? (cpm0) extras3.getParcelable("pages") : null;
        Bundle extras4 = intent.getExtras();
        if (extras4 == null || (agr0Var = (agr0) extras4.getParcelable("key_privacy_policy_consent_type")) == null) {
            agr0Var = agr0.f15482a;
        }
        agr0 agr0Var2 = agr0Var;
        int i3 = cpm0Var != null ? cpm0Var.f40578a : 0;
        int i4 = cpm0Var != null ? cpm0Var.f40579b : 0;
        Bundle extras5 = intent.getExtras();
        if (extras5 == null || (dlxVar = (dlx) extras5.getParcelable("expected_account_type")) == null) {
            dlxVar = blx.f28299a;
        }
        return new u1j0(v480.class, new k580(b370Var3, agr0Var2, i3, i4, dlxVar), new xzq0(i2, (boolean) (c == true ? 1 : 0), i));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public static final Object m58530f(la2 la2Var, ibk ibkVar) {
        uxe1 uxe1Var;
        if (ibkVar instanceof uxe1) {
            uxe1Var = (uxe1) ibkVar;
            int i = uxe1Var.f234912c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uxe1Var.f234912c = i - Integer.MIN_VALUE;
            } else {
                uxe1Var = new uxe1(la2Var, ibkVar);
            }
        } else {
            uxe1Var = new uxe1(la2Var, ibkVar);
        }
        Object objM86755t = uxe1Var.f234910a;
        int i2 = uxe1Var.f234912c;
        if (i2 == 0) {
            bga.m29073P(objM86755t);
            fiz fizVar = (fiz) la2Var.f131226b;
            uxe1Var.f234912c = 1;
            objM86755t = vyf1.m86755t(fizVar, uxe1Var);
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
        return Boolean.valueOf(!((Boolean) objM86755t).booleanValue());
    }

    @Override // p204p.v550
    /* JADX INFO: renamed from: a */
    public final void mo27509a(cxe cxeVar) {
        int i = 21;
        int i2 = 13;
        int i3 = 16;
        int i4 = 9;
        int i5 = 23;
        int i6 = 27;
        int i7 = 14;
        int i8 = 2;
        int i9 = 0;
        int i10 = 1;
        fbk fbkVar = null;
        int i11 = 8;
        switch (this.f131225a) {
            case 0:
                cxeVar.m34280N(gn80.AGE_ASSURANCE_WEB_COLLECT, "Handle age assurance routing for the web collect flow (without intro sheet).", new c730(this, 11));
                break;
            case 1:
                if (!((xu3) this.f131226b).m92118a()) {
                    lp7 lp7Var = new lp7(i4);
                    cxeVar.m34280N(gn80.ARTIST_ABOUT, "Show biography fragment", lp7Var);
                    cxeVar.m34280N(gn80.ARTIST_BIOGRAPHY, "Show biography fragment", lp7Var);
                    break;
                }
                break;
            case 2:
                px0 px0Var = new px0(this, i3);
                cxeVar.m34280N(gn80.FIND, "Page presenting the top level find content as an entry point to search and genres.", px0Var);
                cxeVar.m34280N(gn80.BROWSE_ROOT, "Page presenting the top level find content as an entry point to search and genres.", px0Var);
                cxeVar.m34280N(gn80.BROWSE_GENRES, "Page presenting a browse genre.", px0Var);
                cxeVar.m34280N(gn80.SPECIAL, "Page presenting special content in the scope of browse.", px0Var);
                cxeVar.m34270D("android.intent.action.SEARCH", "Open Find if NPT is enabled or Search if not.", new coa(new gd6(this, i6)));
                break;
            case 3:
                cxeVar.m34279M(new spr(gn80.CHILD_ACCOUNT_CLOSURE, i11), w2e.class.getSimpleName(), new a99(this, i2));
                break;
            case 4:
                cxeVar.m34279M(new spr(gn80.DATA_DOWNLOAD, i11), oeo.class.getSimpleName(), new rc9(this, 25));
                break;
            case 5:
                cxeVar.m34271E(gn80.CONNECT_DEVICE_PICKER, "Redirect to device picker page", new j3p(this, 15));
                cxeVar.m34271E(gn80.DEVICES, "Redirect to device picker page", new qro(this, i));
                break;
            case 6:
                Iterator it = ((Set) this.f131226b).iterator();
                while (it.hasNext()) {
                    ((v550) it.next()).mo27509a(cxeVar);
                }
                break;
            case 7:
                cxeVar.m34280N(gn80.SHOW_FIND, "Handle routing to a page to find episodes within a specific show.", new csy(this, i8));
                break;
            case 8:
                cxeVar.m34280N(gn80.HOME_AD, "Handle home ad routing", new wfx(this, i7));
                break;
            case 9:
                cxeVar.m34279M(new jib(3), "Playlist Collaboration: playlist uri with invite", new yps(this, i5));
                break;
            case 10:
                cxeVar.m34280N(gn80.KID_ACCOUNT_CREATION_LEGAL_CONSENT, "Legal consent step of the account creation flow", new csy(this, i2));
                cxeVar.m34280N(gn80.KID_ACCOUNT_TRANSITION_LEGAL_CONSENT, "Legal step of the account transition flow", new vux(this, i));
                break;
            case 11:
                if (((b2s0) this.f131226b).f22687a.m58279l()) {
                    cxeVar.m34280N(gn80.KIDS_AVATAR_PICKER, "Kids profile avatar/color picker", s2z.f205127i);
                    break;
                }
                break;
            case 12:
                cxeVar.m34279M(new spr(gn80.PUFFIN_PIGEON_ONBOARDING, i11), c6b0.class.getSimpleName(), new csy(this, 26));
                break;
            case 13:
                cxeVar.m34280N(gn80.MANAGE_BLOCKED_CONTENT_LEGACY, "Page for managing the blocked content for a managed account", new sp5(this, i3));
                q350.m72059n(cxeVar, stg1.m79275p(new spr(gn80.PARENTAL_CONTROL_CHILD_MANAGE_CONTENT_BLOCKED, i11), new spr(gn80.PARENTAL_CONTROL_CHILD_MANAGE_CONTENT_APPROVED, i11)), "Page for managing the blocked or approved content list for a managed account", new g3c0(this, fbkVar, i9));
                break;
            case 14:
                int i12 = 7;
                q350.m72059n(cxeVar, new spr(sup0.f214173e, i4), "Mixing", new wg4(this, fbkVar, i12));
                q350.m72059n(cxeVar, stg1.m79275p(new spr(gn80.TRANSITION, i11), new spr(gn80.TRANSITION_WITH_REVISION, i11)), "Mixing", new g3c0(this, fbkVar, i12));
                break;
            case 15:
                ju0 ju0Var = new ju0(this, fbkVar, i5);
                q350.m72059n(cxeVar, new spr(gn80.COLLECTION_PODCASTS_EPISODES, i11), "New episodes", ju0Var);
                q350.m72059n(cxeVar, new spr(gn80.COLLECTION_PODCASTS_EPISODES_UNFINISHED, i11), "Old unfinished uri fallback navigate to episodes tab", ju0Var);
                q350.m72059n(cxeVar, new spr(gn80.COLLECTION_UNPLAYED_PODCASTS_EPISODES, i11), "Old unplayed uri fallback navigate to episodes tab", ju0Var);
                q350.m72059n(cxeVar, new spr(gn80.COLLECTION_UNPLAYED_EPISODES, i11), "Old unplayed uri fallback navigate to episodes tab", ju0Var);
                break;
            case 16:
                if (!((f2k0) this.f131226b).f65203a.m74791f()) {
                    cxeVar.m34280N(gn80.PODCAST_NEW_EPISODE_NOTIFICATIONS_SETTINGS, "Podcast New Episode Notifications Settings page", zhi0.f282937d);
                    break;
                }
                break;
            case 17:
                if (!((jm4) this.f131226b).m53747b()) {
                    cxeVar.m34280N(gn80.SHOW_SETTINGS, "Handles routing to the Show settings page", dzx.f54786b1);
                    break;
                }
                break;
            case 18:
                q350.m72059n(cxeVar, stg1.m79274o(new spr(gn80.SHOW_RATINGS, i11)), "Map ratings intent action", new ju0(this, fbkVar, i6));
                break;
            case 19:
                cxeVar.m34271E(gn80.ACTIVITYCENTER, "Open the side drawer", new kq11(this, i10));
                break;
            case 20:
                if (((lo51) this.f131226b).f135306d) {
                    u1j0 u1j0Var = new u1j0(do51.class, new fo51(), uzq0.f235620a);
                    cxeVar.m34280N(gn80.LOCAL_FILES_ROOT, "STS Local Files: CWP page", new d501(u1j0Var, i7));
                    cxeVar.m34274H(AudioMimeMatcher.INSTANCE, "STS Local Files: Audio MIME open-with", new wiy0(u1j0Var, 22));
                    break;
                }
                break;
            case 21:
                b741 b741Var = new b741(this, 20);
                cxeVar.m34280N(gn80.UPSELL, "Handle upsell uri routing", b741Var);
                cxeVar.m34280N(gn80.START_TRIAL_UPSELL, "Handle start trial upsell uri routing", b741Var);
                break;
            default:
                q350.m72059n(cxeVar, new spr(gn80.NOTIFICATION_CENTER, i11), "YourUpdates Page", new igd(this, null));
                break;
        }
    }

    public /* synthetic */ la2(Object obj, int i) {
        this.f131225a = i;
        this.f131226b = obj;
    }

    public la2(vmz vmzVar) {
        this.f131225a = 22;
        this.f131226b = vmzVar.m86024a("restrict-showing-your-updates", false);
    }
}
