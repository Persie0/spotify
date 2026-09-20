package p204p;

import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import com.spotify.music.R;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class la31 extends zo01 {

    /* JADX INFO: renamed from: s */
    public static final pqm0 f131236s = new pqm0(Double.valueOf(0.5d), Double.valueOf(0.45d));

    /* JADX INFO: renamed from: t */
    public static final pqm0 f131237t = new pqm0(Double.valueOf(0.7d), Double.valueOf(0.53d));

    /* JADX INFO: renamed from: g */
    public final sr31 f131238g;

    /* JADX INFO: renamed from: h */
    public final pli0 f131239h;

    /* JADX INFO: renamed from: i */
    public final DisplayMetrics f131240i;

    /* JADX INFO: renamed from: j */
    public final wh51 f131241j;

    /* JADX INFO: renamed from: k */
    public final wc3 f131242k;

    /* JADX INFO: renamed from: l */
    public final boolean f131243l;

    /* JADX INFO: renamed from: m */
    public final boolean f131244m;

    /* JADX INFO: renamed from: n */
    public final int f131245n;

    /* JADX INFO: renamed from: o */
    public final int f131246o;

    /* JADX INFO: renamed from: p */
    public final AbstractC2524w8 f131247p;

    /* JADX INFO: renamed from: q */
    public final wp01 f131248q;

    /* JADX INFO: renamed from: r */
    public final vo01 f131249r;

    public la31(wf0 wf0Var, sr31 sr31Var, pli0 pli0Var, DisplayMetrics displayMetrics, wh51 wh51Var, wc3 wc3Var, boolean z, boolean z2) {
        super(wf0Var, opo.m67566p("com.snapchat.android"), "android.intent.action.SEND", "video/*", "snapchat://creativekit/preview/1", 32);
        this.f131238g = sr31Var;
        this.f131239h = pli0Var;
        this.f131240i = displayMetrics;
        this.f131241j = wh51Var;
        this.f131242k = wc3Var;
        this.f131243l = z;
        this.f131244m = z2;
        this.f131245n = R.string.share_app_snapchat;
        this.f131246o = R.string.share_app_snapchat_content_description;
        this.f131247p = opo.m67566p(tj01.GRADIENT_STORY, tj01.IMAGE_STORY, tj01.VIDEO_STORY);
        this.f131248q = wp01.f253636d;
        this.f131249r = new vo01(R.drawable.share_icn_snapchat, false);
    }

    @Override // p204p.bp01
    /* JADX INFO: renamed from: a */
    public final fq01 mo30099a() {
        return this.f131248q;
    }

    @Override // p204p.bp01
    /* JADX INFO: renamed from: b */
    public final AbstractC2524w8 mo30100b() {
        return this.f131247p;
    }

    @Override // p204p.yo01
    /* JADX INFO: renamed from: c */
    public final int mo43583c() {
        return this.f131246o;
    }

    @Override // p204p.yo01
    /* JADX INFO: renamed from: d */
    public final nsg1 mo43584d() {
        return this.f131249r;
    }

    @Override // p204p.yo01
    /* JADX INFO: renamed from: e */
    public final int mo43585e() {
        return this.f131245n;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x010e  */
    /* JADX WARN: Code duplicated, block: B:38:0x015c  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // p204p.zo01
    /* JADX INFO: renamed from: g */
    public final Object mo43586g(Intent intent, ys01 ys01Var, fbk fbkVar) throws Throwable {
        ka31 ka31Var;
        Object objM78992h;
        Intent intent2;
        ho01 ho01Var;
        int i;
        Intent intent3;
        int i2;
        ys01 ys01Var2;
        Uri uri;
        Intent intent4;
        ho01 ho01Var2;
        Uri uri2;
        Map mapMo26483d;
        String str;
        sd51 sd51VarMo80492g;
        Intent intent5;
        Intent intent6;
        ys01 ys01Var3;
        Uri uri3;
        String str2;
        sd51 sd51Var;
        Map map;
        boolean z;
        Intent intent7 = intent;
        ys01 ys01Var4 = ys01Var;
        if (fbkVar instanceof ka31) {
            ka31Var = (ka31) fbkVar;
            int i3 = ka31Var.f120779Y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ka31Var.f120779Y = i3 - Integer.MIN_VALUE;
            } else {
                ka31Var = new ka31(this, (ibk) fbkVar);
            }
        } else {
            ka31Var = new ka31(this, (ibk) fbkVar);
        }
        ka31 ka31Var2 = ka31Var;
        Object obj = ka31Var2.f120789t;
        int i4 = ka31Var2.f120779Y;
        sr31 sr31Var = this.f131238g;
        yuk yukVar = yuk.f276404a;
        if (i4 == 0) {
            bga.m29073P(obj);
            ho01 ho01Var3 = ys01Var4.f275630a;
            if (!(ho01Var3 instanceof wd51)) {
                throw new IllegalStateException("Snapchat requires share data to be StoryShareData");
            }
            ipg1 ipg1VarMo80491f = ((wd51) ho01Var3).mo80491f();
            ka31Var2.f120780a = ys01Var4;
            ka31Var2.f120781b = intent7;
            ka31Var2.f120782c = intent7;
            ka31Var2.f120783d = ho01Var3;
            ka31Var2.f120788i = 0;
            ka31Var2.f120779Y = 1;
            objM78992h = sr31Var.m78992h(intent7, ipg1VarMo80491f, ka31Var2);
            if (objM78992h != yukVar) {
                intent2 = intent7;
                ho01Var = ho01Var3;
                i = 0;
            }
            return yukVar;
        }
        if (i4 == 1) {
            int i5 = ka31Var2.f120788i;
            ho01 ho01Var4 = ka31Var2.f120783d;
            Intent intent8 = ka31Var2.f120782c;
            intent2 = ka31Var2.f120781b;
            ys01 ys01Var5 = ka31Var2.f120780a;
            bga.m29073P(obj);
            i = i5;
            intent7 = intent8;
            objM78992h = obj;
            ho01Var = ho01Var4;
            ys01Var4 = ys01Var5;
        } else {
            if (i4 == 2) {
                i2 = ka31Var2.f120788i;
                uri = ka31Var2.f120784e;
                ho01Var2 = ka31Var2.f120783d;
                intent3 = ka31Var2.f120782c;
                Intent intent9 = ka31Var2.f120781b;
                ys01 ys01Var6 = ka31Var2.f120780a;
                bga.m29073P(obj);
                intent4 = intent9;
                ys01Var2 = ys01Var6;
                uri2 = (Uri) obj;
                mapMo26483d = ho01Var2.mo26483d();
                str = ys01Var2.f275631b.f12672c;
                wd51 wd51Var = (wd51) ho01Var2;
                sd51VarMo80492g = wd51Var.mo80492g();
                kwg1.m57545q(intent3, Uri.parse("snapchat://creativekit/preview/1"), wd51Var.mo80491f());
                ka31Var2.f120780a = ys01Var2;
                ka31Var2.f120781b = intent4;
                ka31Var2.f120782c = intent3;
                ka31Var2.f120783d = null;
                ka31Var2.f120784e = uri;
                ka31Var2.f120785f = mapMo26483d;
                ka31Var2.f120786g = str;
                ka31Var2.f120787h = sd51VarMo80492g;
                ka31Var2.f120788i = i2;
                ka31Var2.f120779Y = 3;
                if (l6l.m58372u(intent3, this.f131240i, this.f131241j, this.f131242k, uri2, ka31Var2) != yukVar) {
                    intent5 = intent3;
                    intent6 = intent4;
                    ys01Var3 = ys01Var2;
                    uri3 = uri;
                    str2 = str;
                    sd51Var = sd51VarMo80492g;
                    map = mapMo26483d;
                }
                return yukVar;
            }
            if (i4 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sd51Var = ka31Var2.f120787h;
            str2 = ka31Var2.f120786g;
            map = ka31Var2.f120785f;
            uri3 = ka31Var2.f120784e;
            intent5 = ka31Var2.f120782c;
            intent6 = ka31Var2.f120781b;
            ys01Var3 = ka31Var2.f120780a;
            bga.m29073P(obj);
        }
        wtg1.m88925B(intent5, new pqm0("CLIENT_ID", this.f131239h.f178746a.getApplicationContext().getString(R.string.share_snapchat_client_id)), new pqm0("android.intent.extra.STREAM", uri3), new pqm0("attachmentUrl", ys01Var3.f275631b.f12670a));
        kwg1.m57544p(intent5, sd51Var.f207893a, "entityUri");
        kwg1.m57546r(intent5, this.f131243l, "entityUri", str2, ys01Var3.f275632c);
        if (this.f131244m || sd51Var.f207894b) {
            z = false;
        } else {
            z = true;
        }
        kwg1.m57534f(intent5, z, map, sd51Var.f207895c, 8);
        return intent6;
        Uri uri4 = (Uri) objM78992h;
        d3r d3rVarMo80493h = ((wd51) ho01Var).mo80493h();
        ka31Var2.f120780a = ys01Var4;
        ka31Var2.f120781b = intent2;
        ka31Var2.f120782c = intent7;
        ka31Var2.f120783d = ho01Var;
        ka31Var2.f120784e = uri4;
        ka31Var2.f120788i = i;
        ka31Var2.f120779Y = 2;
        Comparable comparableM78997n = sr31Var.m78997n(intent7, d3rVarMo80493h, ka31Var2);
        if (comparableM78997n != yukVar) {
            intent3 = intent7;
            i2 = i;
            obj = comparableM78997n;
            ys01Var2 = ys01Var4;
            uri = uri4;
            intent4 = intent2;
            ho01Var2 = ho01Var;
            uri2 = (Uri) obj;
            mapMo26483d = ho01Var2.mo26483d();
            str = ys01Var2.f275631b.f12672c;
            wd51 wd51Var2 = (wd51) ho01Var2;
            sd51VarMo80492g = wd51Var2.mo80492g();
            kwg1.m57545q(intent3, Uri.parse("snapchat://creativekit/preview/1"), wd51Var2.mo80491f());
            ka31Var2.f120780a = ys01Var2;
            ka31Var2.f120781b = intent4;
            ka31Var2.f120782c = intent3;
            ka31Var2.f120783d = null;
            ka31Var2.f120784e = uri;
            ka31Var2.f120785f = mapMo26483d;
            ka31Var2.f120786g = str;
            ka31Var2.f120787h = sd51VarMo80492g;
            ka31Var2.f120788i = i2;
            ka31Var2.f120779Y = 3;
            if (l6l.m58372u(intent3, this.f131240i, this.f131241j, this.f131242k, uri2, ka31Var2) != yukVar) {
                intent5 = intent3;
                intent6 = intent4;
                ys01Var3 = ys01Var2;
                uri3 = uri;
                str2 = str;
                sd51Var = sd51VarMo80492g;
                map = mapMo26483d;
                wtg1.m88925B(intent5, new pqm0("CLIENT_ID", this.f131239h.f178746a.getApplicationContext().getString(R.string.share_snapchat_client_id)), new pqm0("android.intent.extra.STREAM", uri3), new pqm0("attachmentUrl", ys01Var3.f275631b.f12670a));
                kwg1.m57544p(intent5, sd51Var.f207893a, "entityUri");
                kwg1.m57546r(intent5, this.f131243l, "entityUri", str2, ys01Var3.f275632c);
                if (this.f131244m) {
                    z = false;
                } else {
                    z = false;
                }
                kwg1.m57534f(intent5, z, map, sd51Var.f207895c, 8);
                return intent6;
            }
        }
        return yukVar;
    }
}
