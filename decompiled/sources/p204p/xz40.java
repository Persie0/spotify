package p204p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.music.R;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class xz40 extends zo01 {

    /* JADX INFO: renamed from: g */
    public final pli0 f267518g;

    /* JADX INFO: renamed from: h */
    public final boolean f267519h;

    /* JADX INFO: renamed from: i */
    public final sr31 f267520i;

    /* JADX INFO: renamed from: j */
    public final int f267521j;

    /* JADX INFO: renamed from: k */
    public final int f267522k;

    /* JADX INFO: renamed from: l */
    public final AbstractC2524w8 f267523l;

    /* JADX INFO: renamed from: m */
    public final np01 f267524m;

    /* JADX INFO: renamed from: n */
    public final vo01 f267525n;

    public xz40(wf0 wf0Var, pli0 pli0Var, boolean z, sr31 sr31Var) {
        super(wf0Var, opo.m67566p("com.instagram.android"), "com.instagram.share.ADD_TO_STORY", "image/png", null, 48);
        this.f267518g = pli0Var;
        this.f267519h = z;
        this.f267520i = sr31Var;
        this.f267521j = R.string.share_app_instagram_stories;
        this.f267522k = R.string.share_app_instagram_stories_content_description;
        this.f267523l = opo.m67566p(tj01.VIDEO_STORY, tj01.IMAGE_STORY, tj01.GRADIENT_STORY);
        this.f267524m = np01.f156838d;
        this.f267525n = new vo01(R.drawable.share_icn_instagram_circle, false);
    }

    @Override // p204p.bp01
    /* JADX INFO: renamed from: a */
    public final fq01 mo30099a() {
        return this.f267524m;
    }

    @Override // p204p.bp01
    /* JADX INFO: renamed from: b */
    public final AbstractC2524w8 mo30100b() {
        return this.f267523l;
    }

    @Override // p204p.yo01
    /* JADX INFO: renamed from: c */
    public final int mo43583c() {
        return this.f267522k;
    }

    @Override // p204p.yo01
    /* JADX INFO: renamed from: d */
    public final nsg1 mo43584d() {
        return this.f267525n;
    }

    @Override // p204p.yo01
    /* JADX INFO: renamed from: e */
    public final int mo43585e() {
        return this.f267521j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // p204p.zo01
    /* JADX INFO: renamed from: g */
    public final Object mo43586g(Intent intent, ys01 ys01Var, fbk fbkVar) {
        wz40 wz40Var;
        ho01 ho01Var;
        int i;
        Object obj;
        Intent intent2;
        Intent intent3 = intent;
        ys01 ys01Var2 = ys01Var;
        if (fbkVar instanceof wz40) {
            wz40Var = (wz40) fbkVar;
            int i2 = wz40Var.f256473h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wz40Var.f256473h = i2 - Integer.MIN_VALUE;
            } else {
                wz40Var = new wz40(this, (ibk) fbkVar);
            }
        } else {
            wz40Var = new wz40(this, (ibk) fbkVar);
        }
        Object obj2 = wz40Var.f256471f;
        int i3 = wz40Var.f256473h;
        Object obj3 = yuk.f276404a;
        if (i3 == 0) {
            bga.m29073P(obj2);
            ho01Var = ys01Var2.f275630a;
            if (!(ho01Var instanceof wd51)) {
                throw new IllegalStateException("InstagramStories requires share data to be StoryShareData");
            }
            wd51 wd51Var = (wd51) ho01Var;
            d3r d3rVarMo80493h = wd51Var.mo80493h();
            wz40Var.f256466a = ys01Var2;
            wz40Var.f256467b = intent3;
            wz40Var.f256468c = intent3;
            wz40Var.f256469d = wd51Var;
            i = 0;
            wz40Var.f256470e = 0;
            wz40Var.f256473h = 1;
            Object objM78997n = this.f267520i.m78997n(intent3, d3rVarMo80493h, wz40Var);
            if (objM78997n != obj3) {
                obj = objM78997n;
                intent2 = intent3;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Intent intent4 = wz40Var.f256467b;
            bga.m29073P(obj2);
            return intent4;
        }
        int i4 = wz40Var.f256470e;
        wd51 wd51Var2 = wz40Var.f256469d;
        Intent intent5 = wz40Var.f256468c;
        intent2 = wz40Var.f256467b;
        ys01 ys01Var3 = wz40Var.f256466a;
        bga.m29073P(obj2);
        i = i4;
        intent3 = intent5;
        ho01Var = wd51Var2;
        ys01Var2 = ys01Var3;
        obj = obj2;
        Parcelable parcelable = (Uri) obj;
        String str = ys01Var2.f275631b.f12672c;
        sd51 sd51VarMo80492g = ((wd51) ho01Var).mo80492g();
        Map mapMo26483d = ho01Var.mo26483d();
        if (parcelable != null) {
            intent3.putExtra("interactive_asset_uri", parcelable);
        }
        pqm0 pqm0Var = new pqm0("content_url", ys01Var2.f275631b.f12670a);
        Bundle bundle = (Bundle) ((d8y) this.f267518g.f178747b.getValue()).f46551b.getValue();
        String string = bundle != null ? bundle.getString("com.facebook.sdk.ApplicationId") : null;
        if (string == null) {
            string = "";
        }
        wtg1.m88925B(intent3, pqm0Var, new pqm0("source_application", string));
        kwg1.m57544p(intent3, sd51VarMo80492g.f207893a, "com.instagram.sharedSticker.entityURI");
        kwg1.m57534f(intent3, !sd51VarMo80492g.f207894b, mapMo26483d, sd51VarMo80492g.f207895c, 8);
        kwg1.m57546r(intent3, this.f267519h, "com.instagram.sharedSticker.entityURI", str, ys01Var2.f275632c);
        wz40Var.f256466a = null;
        wz40Var.f256467b = intent2;
        wz40Var.f256468c = null;
        wz40Var.f256469d = null;
        wz40Var.f256470e = i;
        wz40Var.f256473h = 2;
        return m92441i(intent3, (wd51) ho01Var, wz40Var) == obj3 ? obj3 : intent2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m92441i(Intent intent, wd51 wd51Var, ibk ibkVar) throws Throwable {
        vz40 vz40Var;
        ipg1 ipg1VarMo80491f;
        Object objM78992h;
        if (ibkVar instanceof vz40) {
            vz40Var = (vz40) ibkVar;
            int i = vz40Var.f246387e;
            if ((i & Integer.MIN_VALUE) != 0) {
                vz40Var.f246387e = i - Integer.MIN_VALUE;
            } else {
                vz40Var = new vz40(this, ibkVar);
            }
        } else {
            vz40Var = new vz40(this, ibkVar);
        }
        Object obj = vz40Var.f246385c;
        int i2 = vz40Var.f246387e;
        if (i2 == 0) {
            bga.m29073P(obj);
            ipg1VarMo80491f = wd51Var.mo80491f();
            if (ipg1VarMo80491f instanceof c3r) {
                c3r c3rVar = (c3r) ipg1VarMo80491f;
                wtg1.m88925B(intent, new pqm0("top_background_color", mif1.m61876j(c3rVar.f33734d)), new pqm0("bottom_background_color", mif1.m61876j(c3rVar.f33735e)));
            } else {
                ipg1 ipg1VarMo80491f2 = wd51Var.mo80491f();
                vz40Var.f246383a = intent;
                vz40Var.f246384b = ipg1VarMo80491f;
                vz40Var.f246387e = 1;
                objM78992h = this.f267520i.m78992h(intent, ipg1VarMo80491f2, vz40Var);
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
        ipg1 ipg1Var = vz40Var.f246384b;
        Intent intent2 = vz40Var.f246383a;
        bga.m29073P(obj);
        ipg1VarMo80491f = ipg1Var;
        intent = intent2;
        objM78992h = obj;
        kwg1.m57545q(intent, (Uri) objM78992h, ipg1VarMo80491f);
        return w2a1.f247311a;
    }
}
