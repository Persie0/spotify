package p204p;

import android.os.Bundle;
import com.spotify.aipartner.aipartnerapi.proto.ResolveIntentRequest;
import com.spotify.externalintegration.externalaccessory.ExternalAccessoryDescription;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class ks2 implements o9d0 {

    /* JADX INFO: renamed from: a */
    public final tz8 f125784a;

    /* JADX INFO: renamed from: b */
    public final ezw0 f125785b;

    /* JADX INFO: renamed from: c */
    public final cxq0 f125786c;

    /* JADX INFO: renamed from: d */
    public final u7q f125787d;

    /* JADX INFO: renamed from: e */
    public final myx f125788e;

    /* JADX INFO: renamed from: f */
    public final sxi f125789f;

    /* JADX INFO: renamed from: g */
    public final vco0 f125790g;

    /* JADX INFO: renamed from: h */
    public final luk f125791h;

    public ks2(hji hjiVar, uzx uzxVar, xnd0 xnd0Var, vco0 vco0Var, ezw0 ezw0Var, cxq0 cxq0Var, byn bynVar, u7q u7qVar, myx myxVar, sxi sxiVar, luk lukVar) {
        this.f125784a = bynVar.m30898b(hjiVar, uzxVar, xnd0Var);
        this.f125785b = ezw0Var;
        this.f125786c = cxq0Var;
        this.f125787d = u7qVar;
        this.f125788e = myxVar;
        this.f125789f = sxiVar;
        this.f125790g = vco0Var;
        this.f125791h = lukVar;
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: a */
    public final Set mo36678a() {
        return this.f125784a.mo36678a();
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: b */
    public final void mo37696b(zvm0 zvm0Var) {
        this.f125784a.mo37696b(zvm0Var);
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: c */
    public final void mo36679c(zvm0 zvm0Var, Bundle bundle, gh00 gh00Var) {
        this.f125784a.mo36679c(zvm0Var, bundle, gh00Var);
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: d */
    public final zvm0 mo37697d() {
        return this.f125784a.f225177a.m47690c();
    }

    @Override // p204p.o9d0
    public final void destroy() {
        this.f125784a.destroy();
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: e */
    public final void mo36680e(String str, Bundle bundle, String str2, ye30 ye30Var, gh00 gh00Var, th00 th00Var, eh00 eh00Var) {
        String strM50632p;
        if (str.length() != 0) {
            ExternalAccessoryDescription externalAccessoryDescriptionM79644a = this.f125789f.m79644a(str2);
            myx myxVar = this.f125788e;
            myxVar.m63229q(externalAccessoryDescriptionM79644a, myxVar.f148555h.m38294o(), null);
        }
        Bundle bundleM53417k = jhl0.m53417k(bundle, h6f.m46715L("com.spotify.music.extras.TARGET_DEVICE", "com.spotify.music.extras.QUERY_TYPE"), th00Var);
        if (bundleM53417k == null) {
            return;
        }
        String string = bundleM53417k.getString("com.spotify.music.extras.QUERY_LANGUAGE");
        if (string == null || (strM50632p = vr4.m86268a("_", Locale.forLanguageTag(string))) == null) {
            strM50632p = ihf1.m50632p();
        }
        String str3 = strM50632p;
        Integer numM53424r = jhl0.m53424r("com.spotify.music.extras.QUERY_TYPE", bundleM53417k);
        ArrayList<Integer> integerArrayList = bundleM53417k.getIntegerArrayList("com.spotify.music.extras.QUERY_RESTRICTIONS");
        List listM43728j1 = integerArrayList != null ? g6f.m43728j1(integerArrayList) : lau.f131415a;
        Integer numM53424r2 = jhl0.m53424r("com.spotify.music.extras.LIMIT", bundleM53417k);
        Integer numM53424r3 = jhl0.m53424r("com.spotify.music.extras.MEDIA_TYPE", bundleM53417k);
        String string2 = bundleM53417k.getString("com.spotify.music.extras.AI_SEARCH_REQUEST_ID");
        if (string2 == null) {
            string2 = UUID.randomUUID().toString();
        }
        ResolveIntentRequest resolveIntentRequestM34331k = this.f125786c.m34331k(str, numM53424r, str3, listM43728j1, numM53424r2, this.f125790g, numM53424r3, string2, bundleM53417k.getInt("com.spotify.music.extras.TARGET_DEVICE", Integer.MIN_VALUE));
        resolveIntentRequestM34331k.toString();
        x0h1.m89578u(kk40.m56661c(this.f125791h), null, 0, new nd0(this, resolveIntentRequestM34331k, ye30Var, eh00Var, gh00Var, th00Var, (fbk) null), 3);
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: f */
    public final xnd0 mo37698f() {
        return this.f125784a.f225179c;
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: g */
    public final long mo37699g() {
        return this.f125784a.f225191o;
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: h */
    public final boolean mo37700h() {
        return this.f125784a.mo37700h();
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: i */
    public final void mo37701i(zvm0 zvm0Var) {
        this.f125784a.mo37701i(zvm0Var);
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: j */
    public final void mo37702j(zvm0 zvm0Var) {
        this.f125784a.mo37702j(zvm0Var);
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: k */
    public final boolean mo36681k() {
        return this.f125784a.mo36681k();
    }

    @Override // p204p.o9d0
    /* JADX INFO: renamed from: l */
    public final String mo37703l() {
        return this.f125784a.f225177a.m47689b();
    }
}
