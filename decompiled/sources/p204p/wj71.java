package p204p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.music.R;
import com.spotify.share.resultactivity.api.ShareResultActivity;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class wj71 extends zo01 {

    /* JADX INFO: renamed from: g */
    public final pli0 f251890g;

    /* JADX INFO: renamed from: h */
    public final sr31 f251891h;

    /* JADX INFO: renamed from: i */
    public final Context f251892i;

    /* JADX INFO: renamed from: j */
    public final int f251893j;

    /* JADX INFO: renamed from: k */
    public final int f251894k;

    /* JADX INFO: renamed from: l */
    public final AbstractC2524w8 f251895l;

    /* JADX INFO: renamed from: m */
    public final zp01 f251896m;

    /* JADX INFO: renamed from: n */
    public final vo01 f251897n;

    public wj71(wf0 wf0Var, boolean z, pli0 pli0Var, sr31 sr31Var, Context context) {
        super(wf0Var, tj71.f220845a, "com.tiktok.opensdk.share.MUSIC_FEED", "image/png", null, 16);
        this.f251890g = pli0Var;
        this.f251891h = sr31Var;
        this.f251892i = context;
        this.f251893j = R.string.share_app_tiktok_feed;
        this.f251894k = R.string.share_app_tiktok_feed_content_description;
        ro80 ro80VarM44508o = geg1.m44508o();
        if (z) {
            ro80VarM44508o.add(tj01.VIDEO_STORY);
        }
        ro80VarM44508o.add(tj01.IMAGE_STORY);
        ro80VarM44508o.add(tj01.GRADIENT_STORY);
        this.f251895l = opo.m67546C(geg1.m44506m(ro80VarM44508o));
        this.f251896m = zp01.f284897d;
        this.f251897n = new vo01(R.drawable.share_icn_tiktok, false);
    }

    @Override // p204p.bp01
    /* JADX INFO: renamed from: a */
    public final fq01 mo30099a() {
        return this.f251896m;
    }

    @Override // p204p.bp01
    /* JADX INFO: renamed from: b */
    public final AbstractC2524w8 mo30100b() {
        return this.f251895l;
    }

    @Override // p204p.yo01
    /* JADX INFO: renamed from: c */
    public final int mo43583c() {
        return this.f251894k;
    }

    @Override // p204p.yo01
    /* JADX INFO: renamed from: d */
    public final nsg1 mo43584d() {
        return this.f251897n;
    }

    @Override // p204p.yo01
    /* JADX INFO: renamed from: e */
    public final int mo43585e() {
        return this.f251893j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // p204p.zo01
    /* JADX INFO: renamed from: g */
    public final Object mo43586g(Intent intent, ys01 ys01Var, fbk fbkVar) {
        vj71 vj71Var;
        Intent intent2;
        Object obj;
        ho01 ho01Var;
        int i;
        Intent intent3 = intent;
        ys01 ys01Var2 = ys01Var;
        if (fbkVar instanceof vj71) {
            vj71Var = (vj71) fbkVar;
            int i2 = vj71Var.f241915h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vj71Var.f241915h = i2 - Integer.MIN_VALUE;
            } else {
                vj71Var = new vj71(this, (ibk) fbkVar);
            }
        } else {
            vj71Var = new vj71(this, (ibk) fbkVar);
        }
        Object obj2 = vj71Var.f241913f;
        int i3 = vj71Var.f241915h;
        Object obj3 = yuk.f276404a;
        if (i3 == 0) {
            bga.m29073P(obj2);
            ho01 ho01Var2 = ys01Var2.f275630a;
            if (!(ho01Var2 instanceof wd51)) {
                throw new IllegalStateException("TiktokFeed requires share data to be StoryShareData");
            }
            wd51 wd51Var = (wd51) ho01Var2;
            d3r d3rVarMo80493h = wd51Var.mo80493h();
            vj71Var.f241908a = ys01Var2;
            vj71Var.f241909b = intent3;
            vj71Var.f241910c = intent3;
            vj71Var.f241911d = wd51Var;
            vj71Var.f241912e = 0;
            vj71Var.f241915h = 1;
            Object objM78997n = this.f251891h.m78997n(intent3, d3rVarMo80493h, vj71Var);
            if (objM78997n != obj3) {
                intent2 = intent3;
                obj = objM78997n;
                ho01Var = ho01Var2;
                i = 0;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Intent intent4 = vj71Var.f241909b;
            bga.m29073P(obj2);
            return intent4;
        }
        int i4 = vj71Var.f241912e;
        wd51 wd51Var2 = vj71Var.f241911d;
        Intent intent5 = vj71Var.f241910c;
        intent2 = vj71Var.f241909b;
        ys01 ys01Var3 = vj71Var.f241908a;
        bga.m29073P(obj2);
        i = i4;
        intent3 = intent5;
        ho01Var = wd51Var2;
        ys01Var2 = ys01Var3;
        obj = obj2;
        Uri uri = (Uri) obj;
        String str = ys01Var2.f275631b.f12672c;
        Map mapMo26483d = ho01Var.mo26483d();
        intent3.addCategory("android.intent.category.DEFAULT");
        pqm0 pqm0Var = new pqm0("com.tiktok.opensdk.share.extra.CLIENT_KEY", this.f251890g.f178746a.getApplicationContext().getString(R.string.share_tiktok_client_id));
        pqm0 pqm0Var2 = new pqm0("com.tiktok.opensdk.share.extra.LINK", Uri.parse(ys01Var2.f275631b.f12670a).buildUpon().appendQueryParameter("noInput", "1").build().toString());
        if (wj50.m88271j(mapMo26483d.get("feature"), "wrapped")) {
            str = "spotify:wrapped:share";
        }
        wtg1.m88925B(intent3, pqm0Var, pqm0Var2, new pqm0("com.tiktok.opensdk.share.extra.ENTITY_URI", str), new pqm0("com.tiktok.opensdk.share.extra.CALLER_PACKAGE_NAME", this.f251892i.getPackageName()), new pqm0("com.tiktok.opensdk.share.extra.CALLER_RETURNED_LOCAL_ENTRY", String.valueOf(qpv0.f191387a.mo54112b(ShareResultActivity.class).mo29110D())));
        intent3.setFlags(335544320);
        wtg1.m88925B(intent3, new pqm0("com.tiktok.opensdk.share.extra.MEDIA", h6f.m46710G(String.valueOf(uri))), new pqm0("com.tiktok.opensdk.share.extra.COVER_IMAGE_SIZE", 0));
        intent3.putExtra("com.tiktok.opensdk.share.extra.COVER_IMAGE_SIZE", uri == null ? 1 : 0);
        wd51 wd51Var3 = (wd51) ho01Var;
        boolean z = uri != null;
        vj71Var.f241908a = null;
        vj71Var.f241909b = intent2;
        vj71Var.f241910c = null;
        vj71Var.f241911d = null;
        vj71Var.f241912e = i;
        vj71Var.f241915h = 2;
        return m88287i(intent3, wd51Var3, z, vj71Var) == obj3 ? obj3 : intent2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX INFO: renamed from: i */
    public final Object m88287i(Intent intent, wd51 wd51Var, boolean z, ibk ibkVar) throws Throwable {
        uj71 uj71Var;
        boolean z2;
        ?? r1;
        if (ibkVar instanceof uj71) {
            uj71Var = (uj71) ibkVar;
            int i = uj71Var.f230932f;
            if ((i & Integer.MIN_VALUE) != 0) {
                uj71Var.f230932f = i - Integer.MIN_VALUE;
            } else {
                uj71Var = new uj71(this, ibkVar);
            }
        } else {
            uj71Var = new uj71(this, ibkVar);
        }
        Object objM78992h = uj71Var.f230930d;
        int i2 = uj71Var.f230932f;
        if (i2 == 0) {
            bga.m29073P(objM78992h);
            ipg1 ipg1VarMo80491f = wd51Var.mo80491f();
            z2 = ipg1VarMo80491f instanceof e3r;
            if (ipg1VarMo80491f instanceof c3r) {
                c3r c3rVar = (c3r) ipg1VarMo80491f;
                wtg1.m88925B(intent, new pqm0("com.tiktok.opensdk.share.extra.BACKGROUND_TOP_COLOR_HEX", mif1.m61876j(c3rVar.f33734d)), new pqm0("com.tiktok.opensdk.share.extra.BACKGROUND_BOTTOM_COLOR_HEX", mif1.m61876j(c3rVar.f33735e)));
            } else {
                ipg1 ipg1VarMo80491f2 = wd51Var.mo80491f();
                uj71Var.f230927a = intent;
                uj71Var.f230928b = z;
                uj71Var.f230929c = z2 ? 1 : 0;
                uj71Var.f230932f = 1;
                objM78992h = this.f251891h.m78992h(intent, ipg1VarMo80491f2, uj71Var);
                yuk yukVar = yuk.f276404a;
                if (objM78992h == yukVar) {
                    r1 = z2;
                    return yukVar;
                }
            }
            return w2a1.f247311a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i3 = uj71Var.f230929c;
        z = uj71Var.f230928b;
        Intent intent2 = uj71Var.f230927a;
        bga.m29073P(objM78992h);
        r1 = i3;
        intent = intent2;
        r1 = z2;
        Uri uri = (Uri) objM78992h;
        intent.setType(r1 != 0 ? "video/*" : "image/*");
        wj50.m88279p(intent.putExtra(z ? "com.tiktok.opensdk.share.extra.BACKGROUND_IMAGE" : "com.tiktok.opensdk.share.extra.MEDIA", h6f.m46710G(uri.toString())));
        return w2a1.f247311a;
    }
}
