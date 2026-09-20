package p204p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.music.R;
import com.spotify.player.model.ContextTrack;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class v8y extends zo01 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f238746g = 1;

    /* JADX INFO: renamed from: h */
    public final sr31 f238747h;

    /* JADX INFO: renamed from: i */
    public final boolean f238748i;

    /* JADX INFO: renamed from: j */
    public final boolean f238749j;

    /* JADX INFO: renamed from: k */
    public final int f238750k;

    /* JADX INFO: renamed from: l */
    public final int f238751l;

    /* JADX INFO: renamed from: m */
    public final AbstractC2524w8 f238752m;

    /* JADX INFO: renamed from: n */
    public final vo01 f238753n;

    /* JADX INFO: renamed from: o */
    public final Object f238754o;

    /* JADX INFO: renamed from: p */
    public final fq01 f238755p;

    public v8y(wf0 wf0Var, pli0 pli0Var, boolean z, boolean z2, sr31 sr31Var) {
        super(wf0Var, opo.m67566p("com.facebook.katana"), "com.facebook.stories.ADD_TO_STORY", "image/png", null, 48);
        this.f238754o = pli0Var;
        this.f238748i = z;
        this.f238749j = z2;
        this.f238747h = sr31Var;
        this.f238750k = R.string.share_app_facebook_stories;
        this.f238751l = R.string.share_app_facebook_stories_content_description;
        this.f238752m = opo.m67566p(tj01.VIDEO_STORY, tj01.IMAGE_STORY, tj01.GRADIENT_STORY);
        this.f238755p = jp01.f114542d;
        this.f238753n = new vo01(R.drawable.share_icn_facebook_stories, false);
    }

    @Override // p204p.bp01
    /* JADX INFO: renamed from: a */
    public final fq01 mo30099a() {
        switch (this.f238746g) {
            case 0:
                return (jp01) this.f238755p;
            default:
                return (dq01) this.f238755p;
        }
    }

    @Override // p204p.bp01
    /* JADX INFO: renamed from: b */
    public final AbstractC2524w8 mo30100b() {
        switch (this.f238746g) {
            case 0:
                break;
        }
        return this.f238752m;
    }

    @Override // p204p.yo01
    /* JADX INFO: renamed from: c */
    public final int mo43583c() {
        switch (this.f238746g) {
            case 0:
                break;
        }
        return this.f238751l;
    }

    @Override // p204p.yo01
    /* JADX INFO: renamed from: d */
    public final nsg1 mo43584d() {
        switch (this.f238746g) {
            case 0:
                break;
        }
        return this.f238753n;
    }

    @Override // p204p.yo01
    /* JADX INFO: renamed from: e */
    public final int mo43585e() {
        switch (this.f238746g) {
            case 0:
                break;
        }
        return this.f238750k;
    }

    @Override // p204p.zo01
    /* JADX INFO: renamed from: f */
    public boolean mo75991f() {
        switch (this.f238746g) {
            case 1:
                return r35.m74575E((Context) this.f238754o, this.f284611b) >= 253176000;
            default:
                return super.mo75991f();
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x013a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0020  */
    @Override // p204p.zo01
    /* JADX INFO: renamed from: g */
    public final Object mo43586g(Intent intent, ys01 ys01Var, fbk fbkVar) {
        u8y u8yVar;
        Intent intent2;
        Object obj;
        ho01 ho01Var;
        int i;
        oqd1 oqd1Var;
        Intent intent3;
        Object obj2;
        ho01 ho01Var2;
        int i2;
        Object obj3;
        Intent intent4;
        int i3;
        Intent intent5 = intent;
        ys01 ys01Var2 = ys01Var;
        switch (this.f238746g) {
            case 0:
                if (fbkVar instanceof u8y) {
                    u8yVar = (u8y) fbkVar;
                    int i4 = u8yVar.f228037h;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        u8yVar.f228037h = i4 - Integer.MIN_VALUE;
                    } else {
                        u8yVar = new u8y(this, (ibk) fbkVar);
                    }
                } else {
                    u8yVar = new u8y(this, (ibk) fbkVar);
                }
                Object obj4 = u8yVar.f228035f;
                int i5 = u8yVar.f228037h;
                Object obj5 = yuk.f276404a;
                if (i5 == 0) {
                    bga.m29073P(obj4);
                    ho01 ho01Var3 = ys01Var2.f275630a;
                    if (!(ho01Var3 instanceof wd51)) {
                        throw new IllegalStateException("FacebookStories requires share data to be StoryShareData");
                    }
                    wd51 wd51Var = (wd51) ho01Var3;
                    d3r d3rVarMo80493h = wd51Var.mo80493h();
                    u8yVar.f228030a = ys01Var2;
                    u8yVar.f228031b = intent5;
                    u8yVar.f228032c = intent5;
                    u8yVar.f228033d = wd51Var;
                    u8yVar.f228034e = 0;
                    u8yVar.f228037h = 1;
                    Object objM78997n = this.f238747h.m78997n(intent5, d3rVarMo80493h, u8yVar);
                    if (objM78997n == obj5) {
                        return obj5;
                    }
                    intent2 = intent5;
                    obj = objM78997n;
                    ho01Var = ho01Var3;
                    i = 0;
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Intent intent6 = u8yVar.f228031b;
                        bga.m29073P(obj4);
                        return intent6;
                    }
                    int i6 = u8yVar.f228034e;
                    wd51 wd51Var2 = u8yVar.f228033d;
                    Intent intent7 = u8yVar.f228032c;
                    intent2 = u8yVar.f228031b;
                    ys01 ys01Var3 = u8yVar.f228030a;
                    bga.m29073P(obj4);
                    i = i6;
                    intent5 = intent7;
                    ho01Var = wd51Var2;
                    ys01Var2 = ys01Var3;
                    obj = obj4;
                }
                Parcelable parcelable = (Uri) obj;
                String str = ys01Var2.f275631b.f12672c;
                sd51 sd51VarMo80492g = ((wd51) ho01Var).mo80492g();
                Map mapMo26483d = ho01Var.mo26483d();
                if (parcelable != null) {
                    intent5.putExtra("interactive_asset_uri", parcelable);
                }
                pqm0 pqm0Var = new pqm0("content_url", ys01Var2.f275631b.f12670a);
                Bundle bundle = (Bundle) ((d8y) ((pli0) this.f238754o).f178747b.getValue()).f46551b.getValue();
                String string = bundle != null ? bundle.getString("com.facebook.sdk.ApplicationId") : null;
                if (string == null) {
                    string = "";
                }
                wtg1.m88925B(intent5, pqm0Var, new pqm0("com.facebook.platform.extra.APPLICATION_ID", string));
                kwg1.m57544p(intent5, sd51VarMo80492g.f207893a, ContextTrack.Metadata.KEY_ENTITY_URI);
                kwg1.m57546r(intent5, this.f238748i, ContextTrack.Metadata.KEY_ENTITY_URI, str, ys01Var2.f275632c);
                kwg1.m57534f(intent5, this.f238749j && !sd51VarMo80492g.f207894b, mapMo26483d, sd51VarMo80492g.f207895c, 8);
                u8yVar.f228030a = null;
                u8yVar.f228031b = intent2;
                u8yVar.f228032c = null;
                u8yVar.f228033d = null;
                u8yVar.f228034e = i;
                u8yVar.f228037h = 2;
                return m84931i(intent5, (wd51) ho01Var, u8yVar) == obj5 ? obj5 : intent2;
            default:
                if (fbkVar instanceof oqd1) {
                    oqd1Var = (oqd1) fbkVar;
                    int i7 = oqd1Var.f168176h;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        oqd1Var.f168176h = i7 - Integer.MIN_VALUE;
                    } else {
                        oqd1Var = new oqd1(this, (ibk) fbkVar);
                    }
                } else {
                    oqd1Var = new oqd1(this, (ibk) fbkVar);
                }
                Object obj6 = oqd1Var.f168174f;
                int i8 = oqd1Var.f168176h;
                Object obj7 = yuk.f276404a;
                if (i8 == 0) {
                    bga.m29073P(obj6);
                    ho01 ho01Var4 = ys01Var2.f275630a;
                    if (!(ho01Var4 instanceof wd51)) {
                        throw new IllegalStateException("WhatsappStatus requires share data to be StoryShareData");
                    }
                    wd51 wd51Var3 = (wd51) ho01Var4;
                    d3r d3rVarMo80493h2 = wd51Var3.mo80493h();
                    oqd1Var.f168169a = ys01Var2;
                    oqd1Var.f168170b = intent5;
                    oqd1Var.f168171c = intent5;
                    oqd1Var.f168172d = wd51Var3;
                    oqd1Var.f168173e = 0;
                    oqd1Var.f168176h = 1;
                    Object objM78997n2 = this.f238747h.m78997n(intent5, d3rVarMo80493h2, oqd1Var);
                    if (objM78997n2 == obj7) {
                        obj3 = obj7;
                    } else {
                        intent3 = intent5;
                        obj2 = objM78997n2;
                        ho01Var2 = ho01Var4;
                        i2 = 0;
                    }
                    return obj3;
                }
                if (i8 == 1) {
                    int i9 = oqd1Var.f168173e;
                    wd51 wd51Var4 = oqd1Var.f168172d;
                    Intent intent8 = oqd1Var.f168171c;
                    intent3 = oqd1Var.f168170b;
                    ys01 ys01Var4 = oqd1Var.f168169a;
                    bga.m29073P(obj6);
                    i2 = i9;
                    intent5 = intent8;
                    ho01Var2 = wd51Var4;
                    ys01Var2 = ys01Var4;
                    obj2 = obj6;
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    intent5 = oqd1Var.f168171c;
                    Intent intent9 = oqd1Var.f168170b;
                    bga.m29073P(obj6);
                    intent4 = intent9;
                    i3 = 1;
                }
                intent5.setFlags(i3);
                intent5.setData(Uri.parse("https://wa.me/status"));
                return intent4;
                Parcelable parcelable2 = (Uri) obj2;
                Map mapMo26483d2 = ho01Var2.mo26483d();
                String str2 = ys01Var2.f275631b.f12672c;
                wd51 wd51Var5 = (wd51) ho01Var2;
                sd51 sd51VarMo80492g2 = wd51Var5.mo80492g();
                intent5.setPackage((String) this.f284611b.get(0));
                wtg1.m88925B(intent5, new pqm0("source_app_package_name", ((Context) this.f238754o).getPackageName()), new pqm0("share_type", "SHARE_TO_STATUS"), new pqm0("media_attribution_url", ys01Var2.f275631b.f12670a));
                kwg1.m57544p(intent5, sd51VarMo80492g2.f207893a, ContextTrack.Metadata.KEY_ENTITY_URI);
                kwg1.m57546r(intent5, this.f238748i, ContextTrack.Metadata.KEY_ENTITY_URI, str2, ys01Var2.f275632c);
                kwg1.m57534f(intent5, this.f238749j && !sd51VarMo80492g2.f207894b, mapMo26483d2, sd51VarMo80492g2.f207895c, 8);
                if (parcelable2 != null) {
                    intent5.putExtra("foreground_media", parcelable2);
                }
                oqd1Var.f168169a = null;
                oqd1Var.f168170b = intent3;
                oqd1Var.f168171c = intent5;
                oqd1Var.f168172d = null;
                oqd1Var.f168173e = i2;
                oqd1Var.f168176h = 2;
                obj3 = obj7;
                if (m84932j(intent5, wd51Var5, oqd1Var) != obj3) {
                    intent4 = intent3;
                    i3 = 1;
                    intent5.setFlags(i3);
                    intent5.setData(Uri.parse("https://wa.me/status"));
                    return intent4;
                }
                return obj3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public Object m84931i(Intent intent, wd51 wd51Var, ibk ibkVar) throws Throwable {
        t8y t8yVar;
        ipg1 ipg1VarMo80491f;
        Object objM78992h;
        if (ibkVar instanceof t8y) {
            t8yVar = (t8y) ibkVar;
            int i = t8yVar.f218156e;
            if ((i & Integer.MIN_VALUE) != 0) {
                t8yVar.f218156e = i - Integer.MIN_VALUE;
            } else {
                t8yVar = new t8y(this, ibkVar);
            }
        } else {
            t8yVar = new t8y(this, ibkVar);
        }
        Object obj = t8yVar.f218154c;
        int i2 = t8yVar.f218156e;
        if (i2 == 0) {
            bga.m29073P(obj);
            ipg1VarMo80491f = wd51Var.mo80491f();
            if (ipg1VarMo80491f instanceof c3r) {
                c3r c3rVar = (c3r) ipg1VarMo80491f;
                wtg1.m88925B(intent, new pqm0("top_background_color", mif1.m61876j(c3rVar.f33734d)), new pqm0("bottom_background_color", mif1.m61876j(c3rVar.f33735e)));
            } else {
                ipg1 ipg1VarMo80491f2 = wd51Var.mo80491f();
                t8yVar.f218152a = intent;
                t8yVar.f218153b = ipg1VarMo80491f;
                t8yVar.f218156e = 1;
                objM78992h = this.f238747h.m78992h(intent, ipg1VarMo80491f2, t8yVar);
                yuk yukVar = yuk.f276404a;
                if (objM78992h == yukVar) {
                    return yukVar;
                }
            }
            return w2a1.f247311a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ipg1 ipg1Var = t8yVar.f218153b;
        Intent intent2 = t8yVar.f218152a;
        bga.m29073P(obj);
        ipg1VarMo80491f = ipg1Var;
        intent = intent2;
        objM78992h = obj;
        kwg1.m57545q(intent, (Uri) objM78992h, ipg1VarMo80491f);
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public Object m84932j(Intent intent, wd51 wd51Var, ibk ibkVar) throws Throwable {
        nqd1 nqd1Var;
        if (ibkVar instanceof nqd1) {
            nqd1Var = (nqd1) ibkVar;
            int i = nqd1Var.f157240d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nqd1Var.f157240d = i - Integer.MIN_VALUE;
            } else {
                nqd1Var = new nqd1(this, ibkVar);
            }
        } else {
            nqd1Var = new nqd1(this, ibkVar);
        }
        Object objM78992h = nqd1Var.f157238b;
        int i2 = nqd1Var.f157240d;
        if (i2 == 0) {
            bga.m29073P(objM78992h);
            ipg1 ipg1VarMo80491f = wd51Var.mo80491f();
            if (ipg1VarMo80491f instanceof c3r) {
                c3r c3rVar = (c3r) ipg1VarMo80491f;
                wtg1.m88925B(intent, new pqm0("color_gradient_top", mif1.m61876j(c3rVar.f33734d)), new pqm0("color_gradient_bottom", mif1.m61876j(c3rVar.f33735e)));
            } else {
                ipg1 ipg1VarMo80491f2 = wd51Var.mo80491f();
                nqd1Var.f157237a = intent;
                nqd1Var.f157240d = 1;
                objM78992h = this.f238747h.m78992h(intent, ipg1VarMo80491f2, nqd1Var);
                yuk yukVar = yuk.f276404a;
                if (objM78992h == yukVar) {
                    return yukVar;
                }
            }
            return w2a1.f247311a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        intent = nqd1Var.f157237a;
        bga.m29073P(objM78992h);
        wj50.m88279p(intent.putExtra("android.intent.extra.STREAM", (Uri) objM78992h));
        return w2a1.f247311a;
    }

    public v8y(wf0 wf0Var, Context context, sr31 sr31Var, boolean z, boolean z2, boolean z3) {
        super(wf0Var, opo.m67566p("com.whatsapp"), "android.intent.action.VIEW", null, "https://wa.me/status", 40);
        this.f238754o = context;
        this.f238747h = sr31Var;
        this.f238748i = z2;
        this.f238749j = z3;
        this.f238750k = R.string.share_app_whats_app_status;
        this.f238751l = R.string.share_app_whats_app_status_content_description;
        ro80 ro80VarM44508o = geg1.m44508o();
        if (z) {
            ro80VarM44508o.add(tj01.VIDEO_STORY);
        }
        ro80VarM44508o.add(tj01.IMAGE_STORY);
        ro80VarM44508o.add(tj01.GRADIENT_STORY);
        this.f238752m = opo.m67546C(geg1.m44506m(ro80VarM44508o));
        this.f238755p = dq01.f51788d;
        this.f238753n = new vo01(R.drawable.share_icn_whatsapp_status, false);
    }
}
