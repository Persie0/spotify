package p204p;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.common.uri.SpotifyUriParserException;
import com.spotify.mainlayout.p106ui.view.MainLayout;
import com.spotify.mainlayout.p106ui.view.containers.MainLayoutContentContainerView;
import com.spotify.music.R;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes3.dex */
public final class si5 implements wi5, zd10, Function, n5c1, BiFunction, uyb0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f209358a;

    public /* synthetic */ si5(int i) {
        this.f209358a = i;
    }

    /* JADX INFO: renamed from: A */
    public static final fv31 m78160A(int i, String str) {
        fv31 fv31Var = wxj0.f256048f;
        return fv31.f73628b.m78181M(str + "_v" + i);
    }

    /* JADX INFO: renamed from: D */
    public static final void m78161D(Map map, udy0 udy0Var, String str, String str2) {
        if (str2 == null || str2.length() == 0) {
            return;
        }
        CharSequence charSequence = (CharSequence) map.get(str);
        if (charSequence == null || charSequence.length() == 0) {
            udy0Var.setAttribute(str, str2);
        }
    }

    /* JADX INFO: renamed from: I */
    public static kf60 m78162I() {
        return kf60.f122067d;
    }

    /* JADX INFO: renamed from: L */
    public static fv31 m78163L(String str) {
        if (str == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (bm51.m29803n0(str, "__", false)) {
            throw new AssertionError("Cannot create key in protected namespace");
        }
        fv31.f73629c.add(str);
        return new fv31(str);
    }

    /* JADX INFO: renamed from: N */
    public static Button m78164N(pvg1 pvg1Var, ConstraintLayout constraintLayout) {
        int i;
        if ((pvg1Var instanceof okn0) || (pvg1Var instanceof nkn0) || (pvg1Var instanceof skn0)) {
            i = R.layout.action_button_primary;
        } else {
            if (!(pvg1Var instanceof rkn0) && !(pvg1Var instanceof tkn0) && !(pvg1Var instanceof pkn0) && !(pvg1Var instanceof qkn0)) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.layout.action_button_secondary;
        }
        return (Button) LayoutInflater.from(constraintLayout.getContext()).inflate(i, (ViewGroup) constraintLayout, false);
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m78165Q(Uri uri, String str) {
        return uri != null && uri.getPathSegments() != null && uri.getPathSegments().size() > 0 && wj50.m88271j(uri.getPathSegments().get(0), str);
    }

    /* JADX INFO: renamed from: T */
    public static fv31 m78166T(String str) {
        if (str == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (bm51.m29803n0(str, "__", false)) {
            throw new AssertionError("Cannot create key in protected namespace");
        }
        HashSet hashSet = fv31.f73629c;
        if (hashSet.contains(str)) {
            throw new AssertionError("Requesting same string for a key previously defined somewhere else: ".concat(str));
        }
        hashSet.add(str);
        return new fv31(str);
    }

    /* JADX INFO: renamed from: e */
    public static final int m78167e(rv41 rv41Var) {
        return ((Number) rv41Var.getValue()).intValue();
    }

    /* JADX INFO: renamed from: g */
    public static final void m78168g(float f, kqi0 kqi0Var) {
        kqi0Var.setValue(Float.valueOf(f));
    }

    /* JADX INFO: renamed from: i */
    public static final void m78169i(udy0 udy0Var, gwo0 gwo0Var) {
        Set set = c1p0.f33168f;
        Map attributes = udy0Var.getAttributes();
        m78161D(attributes, udy0Var, "playback.id", gwo0Var.f85056a);
        m78161D(attributes, udy0Var, "ubi.interaction_id", gwo0Var.f85057b);
        m78161D(attributes, udy0Var, "playback.context_uri", gwo0Var.f85058c);
        m78161D(attributes, udy0Var, "playback.clip_uri", gwo0Var.f85059d);
        m78161D(attributes, udy0Var, "page.origin.id", gwo0Var.f85060e);
        m78161D(attributes, udy0Var, "page.origin.uri", gwo0Var.f85061f);
        m78161D(attributes, udy0Var, "page.destination.uri", gwo0Var.f85062g);
        m78161D(attributes, udy0Var, "ubi.action", gwo0Var.f85063h);
        m78161D(attributes, udy0Var, "ubi.interaction_type", gwo0Var.f85064i);
        m78161D(attributes, udy0Var, "ubi.element.leaf_specification_id", gwo0Var.f85065j);
        m78161D(attributes, udy0Var, "ubi.element.absolute_path", gwo0Var.f85066k);
        m78161D(attributes, udy0Var, "playback.context_type", gwo0Var.f85067l);
        m78161D(attributes, udy0Var, "playback.content_type", gwo0Var.f85068m);
        m78161D(attributes, udy0Var, "playback.audio_format", gwo0Var.f85069n);
        m78161D(attributes, udy0Var, "playback.video_format", gwo0Var.f85070o);
        m78161D(attributes, udy0Var, "playback.stack", gwo0Var.f85071p);
        m78161D(attributes, udy0Var, "playback.video_surface", gwo0Var.f85072q);
        m78161D(attributes, udy0Var, "app.state", gwo0Var.f85073r);
    }

    /* JADX INFO: renamed from: k */
    public static final f1s m78170k(boolean z, boolean z2, boolean z3) {
        return ((z2 && z3) || z) ? f1s.f64955a : f1s.f64956b;
    }

    /* JADX INFO: renamed from: l */
    public static final int m78171l(int i) {
        return (i & 2) != 0 ? i | 64 : i;
    }

    /* JADX INFO: renamed from: o */
    public static final String m78172o(String str) {
        try {
            String str2 = new gf41(str).f79272e;
            return str2 == null ? "" : str2;
        } catch (SpotifyUriParserException e) {
            Logger.m3967c(e, "Failed to get ID from playlist URI.", new Object[0]);
            return "";
        }
    }

    /* JADX INFO: renamed from: p */
    public static final knn0 m78173p(lnn0 lnn0Var) {
        int iOrdinal = lnn0Var.ordinal();
        if (iOrdinal == 0) {
            return knn0.ADMIN;
        }
        if (iOrdinal == 1) {
            return knn0.UNKNOWN;
        }
        if (iOrdinal == 2) {
            return knn0.BLOCKED;
        }
        if (iOrdinal == 3) {
            return knn0.VIEWER;
        }
        if (iOrdinal == 4) {
            return knn0.MADE_FOR;
        }
        if (iOrdinal == 5) {
            return knn0.CONTRIBUTOR;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: x */
    public static final int m78174x(udy0 udy0Var, gwo0 gwo0Var) {
        CharSequence charSequence;
        Set set = c1p0.f33168f;
        Map attributes = udy0Var.getAttributes();
        List listM46715L = h6f.m46715L(new pqm0("playback.id", gwo0Var.f85056a), new pqm0("ubi.interaction_id", gwo0Var.f85057b), new pqm0("playback.context_uri", gwo0Var.f85058c), new pqm0("playback.clip_uri", gwo0Var.f85059d));
        ArrayList<pqm0> arrayList = new ArrayList();
        for (Object obj : listM46715L) {
            pqm0 pqm0Var = (pqm0) obj;
            String str = (String) pqm0Var.f180350a;
            String str2 = (String) pqm0Var.f180351b;
            if (str2 != null && str2.length() != 0 && (charSequence = (CharSequence) attributes.get(str)) != null && charSequence.length() != 0) {
                arrayList.add(obj);
            }
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (pqm0 pqm0Var2 : arrayList) {
            String str3 = (String) pqm0Var2.f180350a;
            if (!wj50.m88271j(attributes.get(str3), (String) pqm0Var2.f180351b)) {
                z2 = true;
            } else if (c1p0.f33168f.contains(str3)) {
                z = true;
            }
            z3 = true;
        }
        if (!z) {
            if (z2) {
                return 2;
            }
            if (!z3) {
                return 3;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: y */
    public static final void m78175y(udy0 udy0Var, gwo0 gwo0Var) {
        CharSequence charSequence;
        Set set = c1p0.f33168f;
        Map attributes = udy0Var.getAttributes();
        List listM46715L = h6f.m46715L(new pqm0("playback.context_uri", gwo0Var.f85058c), new pqm0("playback.clip_uri", gwo0Var.f85059d));
        ArrayList<pqm0> arrayList = new ArrayList();
        for (Object obj : listM46715L) {
            pqm0 pqm0Var = (pqm0) obj;
            String str = (String) pqm0Var.f180350a;
            String str2 = (String) pqm0Var.f180351b;
            if (str2 != null && str2.length() != 0 && (charSequence = (CharSequence) attributes.get(str)) != null && charSequence.length() != 0) {
                arrayList.add(obj);
            }
        }
        for (pqm0 pqm0Var2 : arrayList) {
            String str3 = (String) pqm0Var2.f180350a;
            if (!wj50.m88271j(attributes.get(str3), (String) pqm0Var2.f180351b)) {
                udy0Var.setAttribute(str3, "");
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static final fv31 m78176z(int i) {
        fv31 fv31Var = wxj0.f256048f;
        return fv31.f73628b.m78181M("chat_page_nudge_dismissed_v" + i);
    }

    /* JADX INFO: renamed from: E */
    public tjo m78177E() {
        return new tjo(Collections.singletonList(new rko(zyx.f287705X, 2, pm51.f178914X0, new pko(pm51.f178918Z0), pm51.f178916Y0)), new vd41(this, 21));
    }

    @Override // p204p.uyb0
    /* JADX INFO: renamed from: F */
    public List mo75546F(MainLayout mainLayout, wyb0 wyb0Var, vyb0 vyb0Var) {
        uek0 uek0Var = vyb0Var.f246036a;
        ro80 ro80VarM44508o = geg1.m44508o();
        aj80 aj80Var = new aj80(80);
        aj80Var.mo55893c(mainLayout.getNavigationContainerTop());
        Iterator<T> it = mainLayout.getBottomGradientViews().iterator();
        while (it.hasNext()) {
            aj80Var.mo55893c((View) it.next());
        }
        uek0 uek0Var2 = uek0.f229554b;
        if (uek0Var == uek0Var2) {
            Iterator<T> it2 = mainLayout.getNowPlayingViews().iterator();
            while (it2.hasNext()) {
                aj80Var.mo55893c((View) it2.next());
            }
        }
        ro80VarM44508o.add(aj80Var);
        aj80 aj80Var2 = new aj80(48);
        aj80Var2.mo55893c(mainLayout.getBannerContainer());
        ro80VarM44508o.add(aj80Var2);
        if (uek0Var != uek0Var2) {
            aj80 aj80Var3 = new aj80(8388613);
            Iterator<T> it3 = mainLayout.getNowPlayingViews().iterator();
            while (it3.hasNext()) {
                aj80Var3.mo55893c((View) it3.next());
            }
            ro80VarM44508o.add(aj80Var3);
        }
        xjc xjcVar = new xjc();
        xjcVar.mo55893c(mainLayout.getFragmentContainer());
        xjcVar.mo55893c(mainLayout.getResponseAgentContainer());
        xjcVar.mo55893c(mainLayout.getThinkingAgentContainer());
        ro80VarM44508o.add(xjcVar);
        return geg1.m44506m(ro80VarM44508o);
    }

    /* JADX INFO: renamed from: H */
    public long m78178H() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: J */
    public synchronized fv31 m78179J() {
        return fv31.f73629c.contains("quickplay_taste_onboarding_completed") ? new fv31("quickplay_taste_onboarding_completed") : null;
    }

    /* JADX INFO: renamed from: K */
    public synchronized fv31 m78180K(String str) {
        return m78163L(str);
    }

    /* JADX INFO: renamed from: M */
    public synchronized fv31 m78181M(String str) {
        return m78163L(str);
    }

    /* JADX INFO: renamed from: S */
    public synchronized fv31 m78182S(String str) {
        return m78166T(str);
    }

    /* JADX INFO: renamed from: U */
    public synchronized fv31 m78183U(String str) {
        return m78166T(str);
    }

    @Override // p204p.uyb0
    /* JADX INFO: renamed from: a */
    public void mo75547a(MainLayout mainLayout, wyb0 wyb0Var) {
        czb0 czb0Var = (czb0) wyb0Var;
        View navigationContainerTop = mainLayout.getNavigationContainerTop();
        boolean z = czb0Var.f43517a;
        navigationContainerTop.setVisibility(z ? 0 : 8);
        Iterator<T> it = mainLayout.getNowPlayingViews().iterator();
        while (it.hasNext()) {
            ((ViewGroup) it.next()).setVisibility(czb0Var.f43518b ? 0 : 8);
        }
        mainLayout.getBannerContainer().setVisibility(czb0Var.f43519c ? 0 : 8);
        Iterator<T> it2 = mainLayout.getBottomGradientViews().iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).setVisibility(z ? 0 : 8);
        }
        View navigationContainerTop2 = z ? mainLayout.getNavigationContainerTop() : mainLayout.getFragmentContainer();
        MainLayoutContentContainerView responseAgentContainer = mainLayout.getResponseAgentContainer();
        ViewGroup.LayoutParams layoutParams = responseAgentContainer.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        h6j h6jVar = (h6j) layoutParams;
        h6jVar.f88164t = navigationContainerTop2.getId();
        h6jVar.f88166v = navigationContainerTop2.getId();
        responseAgentContainer.setLayoutParams(h6jVar);
        MainLayoutContentContainerView thinkingAgentContainer = mainLayout.getThinkingAgentContainer();
        ViewGroup.LayoutParams layoutParams2 = thinkingAgentContainer.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        h6j h6jVar2 = (h6j) layoutParams2;
        h6jVar2.f88164t = navigationContainerTop2.getId();
        h6jVar2.f88166v = navigationContainerTop2.getId();
        thinkingAgentContainer.setLayoutParams(h6jVar2);
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.f209358a) {
            case 13:
                int i = k730.f119911s1;
                return new j730(((Boolean) obj).booleanValue(), (q5c1) obj2);
            default:
                return new gqt0((v4j0) obj, ((Boolean) obj2).booleanValue());
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x028d  */
    /* JADX WARN: Code duplicated, block: B:101:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:104:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:105:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:112:0x030b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0326  */
    /* JADX WARN: Code duplicated, block: B:122:0x034f  */
    /* JADX WARN: Code duplicated, block: B:125:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:126:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:128:0x040c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0411  */
    /* JADX WARN: Code duplicated, block: B:133:0x041e  */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:62:0x010e  */
    /* JADX WARN: Code duplicated, block: B:65:0x011d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0130  */
    /* JADX WARN: Code duplicated, block: B:69:0x0152  */
    /* JADX WARN: Code duplicated, block: B:72:0x0183  */
    /* JADX WARN: Code duplicated, block: B:74:0x019f  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x0222  */
    /* JADX WARN: Code duplicated, block: B:88:0x0229  */
    /* JADX WARN: Code duplicated, block: B:89:0x022d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0255  */
    /* JADX WARN: Code duplicated, block: B:93:0x0265  */
    /* JADX WARN: Code duplicated, block: B:96:0x0270  */
    /* JADX WARN: Code duplicated, block: B:97:0x0281  */
    /* JADX INFO: renamed from: c */
    public void m78184c(yw70 yw70Var, fxh0 fxh0Var, Integer num, xq00 xq00Var, int i, int i2) {
        int i3;
        Integer num2;
        int i4;
        boolean z;
        xq00 xq00Var2;
        yw70 yw70Var2;
        Integer num3;
        pgv0 pgv0VarM91796v;
        yqq yqqVar;
        nv4 nv4Var;
        Object objM91750T;
        ia7 ia7Var;
        xuk xukVar;
        Object objM91750T2;
        kqi0 kqi0Var;
        Object objM91750T3;
        kqi0 kqi0Var2;
        Object objM91750T4;
        kqi0 kqi0Var3;
        Object objM91750T5;
        rv41 rv41Var;
        Object objM91750T6;
        kqi0 kqi0Var4;
        rv41 rv41Var2;
        Object objM91750T7;
        kqi0 kqi0Var5;
        Object objM91750T8;
        kqi0 kqi0Var6;
        rv41 rv41Var3;
        xuk xukVar2;
        kqi0 kqi0Var7;
        kqi0 kqi0Var8;
        yw70 yw70Var3;
        ues uesVar;
        cxh0 cxh0Var;
        fxh0 fxh0VarM61838v;
        rv41 rv41Var4;
        boolean z2;
        rv41 rv41Var5;
        kqi0 kqi0Var9;
        wb9 wb9Var;
        m6d0 m6d0VarM36007d;
        int iHashCode;
        wpn0 wpn0VarM91778m;
        fxh0 fxh0VarM48286s;
        C2087le c2087le;
        vlh vlhVar;
        Object objM91750T9;
        rv41 rv41Var6;
        Object objM91750T10;
        yqq yqqVar2;
        Object objM91750T11;
        vlh vlhVar2;
        long j;
        boolean z3;
        kqi0 kqi0Var10;
        boolean zM91768h;
        Object objM91750T12;
        fbk fbkVar;
        boolean zM91770i;
        Object objM91750T13;
        boolean z4;
        boolean zM91770i2;
        Object fny0Var;
        int i5;
        xq00Var.m91775k0(1219060841);
        ug5 ug5Var = xq00Var.f264811a;
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91770i(yw70Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= xq00Var.m91770i(fxh0Var) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                num2 = num;
                i3 |= xq00Var.m91766g(num2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if (xq00Var.m91766g(this)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i3 |= i5;
            }
            i4 = i3;
            if ((i4 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i4 & 1, z)) {
                if (i6 != 0) {
                    num3 = null;
                } else {
                    num3 = num2;
                }
                yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
                WeakHashMap weakHashMap = cxd1.f42984x;
                nv4Var = bxd1.m30815d(xq00Var).f42992h;
                objM91750T = xq00Var.m91750T();
                ia7Var = t6x0.f217647t;
                if (objM91750T == ia7Var) {
                    objM91750T = hz40.m49254z(dau.f47107a, xq00Var);
                    xq00Var.m91793t0(objM91750T);
                }
                xukVar = (xuk) objM91750T;
                objM91750T2 = xq00Var.m91750T();
                if (objM91750T2 == ia7Var) {
                    objM91750T2 = sam.m77645B(Float.valueOf(1.0f));
                    xq00Var.m91793t0(objM91750T2);
                }
                kqi0Var = (kqi0) objM91750T2;
                objM91750T3 = xq00Var.m91750T();
                if (objM91750T3 == ia7Var) {
                    objM91750T3 = sam.m77645B(Boolean.FALSE);
                    xq00Var.m91793t0(objM91750T3);
                }
                kqi0Var2 = (kqi0) objM91750T3;
                objM91750T4 = xq00Var.m91750T();
                if (objM91750T4 == ia7Var) {
                    objM91750T4 = sam.m77645B(Long.valueOf(System.currentTimeMillis()));
                    xq00Var.m91793t0(objM91750T4);
                }
                kqi0Var3 = (kqi0) objM91750T4;
                objM91750T5 = xq00Var.m91750T();
                if (objM91750T5 == ia7Var) {
                    objM91750T5 = sam.m77674m(new e6c0(yw70Var, 22));
                    xq00Var.m91793t0(objM91750T5);
                }
                rv41Var = (rv41) objM91750T5;
                objM91750T6 = xq00Var.m91750T();
                if (objM91750T6 == ia7Var) {
                    kqi0Var4 = kqi0Var;
                    objM91750T6 = sam.m77674m(new gny0(num3, yw70Var, nv4Var, yqqVar, 0));
                    xq00Var.m91793t0(objM91750T6);
                } else {
                    kqi0Var4 = kqi0Var;
                }
                rv41Var2 = (rv41) objM91750T6;
                objM91750T7 = xq00Var.m91750T();
                if (objM91750T7 == ia7Var) {
                    objM91750T7 = sam.m77645B(Float.valueOf(0.0f));
                    xq00Var.m91793t0(objM91750T7);
                }
                kqi0Var5 = (kqi0) objM91750T7;
                objM91750T8 = xq00Var.m91750T();
                if (objM91750T8 == ia7Var) {
                    kqi0Var6 = kqi0Var5;
                    rv41Var3 = rv41Var2;
                    kqi0Var7 = kqi0Var2;
                    C1726c2 c1726c2 = new C1726c2(this, xukVar, yw70Var, kqi0Var7, kqi0Var3, kqi0Var6, rv41Var, rv41Var3);
                    kqi0Var8 = kqi0Var3;
                    xukVar2 = xukVar;
                    yw70Var3 = yw70Var;
                    ww0 ww0Var = pes.f176839a;
                    objM91750T8 = new fep(c1726c2);
                    xq00Var.m91793t0(objM91750T8);
                } else {
                    kqi0Var6 = kqi0Var5;
                    rv41Var3 = rv41Var2;
                    xukVar2 = xukVar;
                    kqi0Var7 = kqi0Var2;
                    kqi0Var8 = kqi0Var3;
                    yw70Var3 = yw70Var;
                }
                uesVar = (ues) objM91750T8;
                xq00Var.m91771i0(-1008532154);
                cxh0Var = cxh0.f43038a;
                fxh0VarM61838v = mi21.m61838v(iny0.f104071a, mi21.m61819c(1.0f, cxh0Var));
                if (((Number) kqi0Var4.getValue()).floatValue() > 0.0f) {
                    xq00Var.m91771i0(1503763647);
                    boolean zM91770i3 = xq00Var.m91770i(xukVar2) | xq00Var.m91770i(kqi0Var7) | xq00Var.m91770i(kqi0Var8);
                    if ((i4 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zM91770i2 = zM91770i3 | z4 | xq00Var.m91770i(rv41Var3) | xq00Var.m91770i(rv41Var) | xq00Var.m91770i(kqi0Var6) | xq00Var.m91770i(yw70Var3);
                    Object objM91750T14 = xq00Var.m91750T();
                    if (!zM91770i2 || objM91750T14 == ia7Var) {
                        xuk xukVar3 = xukVar2;
                        kqi0 kqi0Var11 = kqi0Var8;
                        rv41 rv41Var7 = rv41Var3;
                        fny0Var = new fny0(this, xukVar3, yw70Var, kqi0Var7, kqi0Var11, kqi0Var6, rv41Var7, rv41Var);
                        rv41Var5 = rv41Var7;
                        yw70Var3 = yw70Var;
                        rv41Var4 = rv41Var;
                        kqi0Var9 = kqi0Var11;
                        xq00Var.m91793t0(fny0Var);
                    } else {
                        rv41 rv41Var8 = rv41Var3;
                        kqi0Var9 = kqi0Var8;
                        fny0Var = objM91750T14;
                        rv41Var4 = rv41Var;
                        rv41Var5 = rv41Var8;
                    }
                    fxh0VarM61838v = pb61.m69516a(fxh0VarM61838v, w2a1.f247311a, (PointerInputEventHandler) fny0Var);
                    z2 = false;
                    xq00Var.m91788r(false);
                } else {
                    cxh0Var = cxh0Var;
                    rv41Var4 = rv41Var;
                    z2 = false;
                    kqi0Var7 = kqi0Var7;
                    rv41Var5 = rv41Var3;
                    kqi0Var9 = kqi0Var8;
                    xq00Var.m91771i0(1504664321);
                    xq00Var.m91788r(false);
                }
                xq00Var.m91788r(z2);
                fxh0 fxh0VarMo34315F = fxh0Var.mo34315F(fxh0VarM61838v);
                wb9Var = d7f0.f46166e;
                m6d0VarM36007d = dha.m36007d(wb9Var, z2);
                iHashCode = Long.hashCode(xq00Var.f264809T);
                wpn0VarM91778m = xq00Var.m91778m();
                fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarMo34315F);
                soh.f211194A.getClass();
                c2087le = roh.f201257b;
                if (ug5Var != null) {
                    pmg1.m70360s();
                    throw null;
                }
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(c2087le);
                } else {
                    xq00Var.m91799w0();
                }
                yhh yhhVar = roh.f201262g;
                zsf1.m96835F(m6d0VarM36007d, yhhVar, xq00Var);
                yhh yhhVar2 = roh.f201261f;
                zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var);
                Integer numValueOf = Integer.valueOf(iHashCode);
                yhh yhhVar3 = roh.f201265j;
                zsf1.m96835F(numValueOf, yhhVar3, xq00Var);
                vlhVar = roh.f201266k;
                zsf1.m96833D(vlhVar, xq00Var);
                yhh yhhVar4 = roh.f201259d;
                zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var);
                objM91750T9 = xq00Var.m91750T();
                if (objM91750T9 == ia7Var) {
                    objM91750T9 = sam.m77674m(new vly0(yw70Var3, rv41Var4, 1));
                    xq00Var.m91793t0(objM91750T9);
                }
                rv41Var6 = (rv41) objM91750T9;
                objM91750T10 = xq00Var.m91750T();
                if (objM91750T10 == ia7Var) {
                    yqqVar2 = yqqVar;
                    objM91750T10 = sam.m77674m(new gyt0(yqqVar2, rv41Var6, rv41Var5, 14));
                    xq00Var.m91793t0(objM91750T10);
                } else {
                    yqqVar2 = yqqVar;
                }
                rv41 rv41Var9 = (rv41) objM91750T10;
                objM91750T11 = xq00Var.m91750T();
                if (objM91750T11 == ia7Var) {
                    vlhVar2 = vlhVar;
                    objM91750T11 = sam.m77674m(new bjk0(yw70Var, yqqVar2, rv41Var6, rv41Var5, 29));
                    xq00Var.m91793t0(objM91750T11);
                } else {
                    vlhVar2 = vlhVar;
                }
                rv41 rv41Var10 = (rv41) objM91750T11;
                if (((Boolean) kqi0Var7.getValue()).booleanValue()) {
                    xq00Var.m91771i0(-1307787749);
                    j = leu.m58815a(xq00Var).f112825c.f221220c;
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(-1307714496);
                    j = leu.m58815a(xq00Var).f112825c.f221219b;
                    xq00Var.m91788r(false);
                }
                kqi0 kqi0Var12 = kqi0Var9;
                xq00Var2 = xq00Var;
                yw70Var2 = yw70Var;
                rv41 rv41VarM83117a = uh21.m83117a(j, null, "Scroll bar thumb color", xq00Var2, 384, 10);
                if (!yw70Var2.f276897j.mo28415b() || ((Boolean) kqi0Var7.getValue()).booleanValue()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z3);
                kqi0Var10 = kqi0Var4;
                zM91768h = xq00Var2.m91768h(z3) | xq00Var2.m91770i(kqi0Var10);
                objM91750T12 = xq00Var2.m91750T();
                if (!zM91768h || objM91750T12 == ia7Var) {
                    fbkVar = null;
                    objM91750T12 = new lpf(z3, kqi0Var10, fbkVar, 4);
                    xq00Var2.m91793t0(objM91750T12);
                } else {
                    fbkVar = null;
                }
                hz40.m49237i(boolValueOf, (th00) objM91750T12, xq00Var2);
                Long lValueOf = Long.valueOf(((Number) kqi0Var12.getValue()).longValue());
                zM91770i = xq00Var2.m91770i(kqi0Var7);
                objM91750T13 = xq00Var2.m91750T();
                if (zM91770i || objM91750T13 == ia7Var) {
                    objM91750T13 = new u4e(11, fbkVar, kqi0Var7);
                    xq00Var2.m91793t0(objM91750T13);
                }
                hz40.m49237i(lValueOf, (th00) objM91750T13, xq00Var2);
                float f = ((ybs) rv41Var10.getValue()).f271238a;
                float f2 = iny0.f104073c;
                fxh0 fxh0VarM69727a = pes.m69727a(zxc.m97185e(((Number) kqi0Var10.getValue()).floatValue(), mi21.m61822f(1.0f, mi21.m61824h(((ybs) rv41Var9.getValue()).f271238a + f2 + f2, bga.m29071N(cxh0Var, 0.0f, f - f2, 1)))), uesVar, vvl0.f245248a, false, null, false, null, null, false, 252);
                m6d0 m6d0VarM36007d2 = dha.m36007d(wb9Var, false);
                int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
                wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
                fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, fxh0VarM69727a);
                xq00Var2.m91779m0();
                if (xq00Var2.f264808S) {
                    xq00Var2.m91776l(c2087le);
                } else {
                    xq00Var2.m91799w0();
                }
                zsf1.m96835F(m6d0VarM36007d2, yhhVar, xq00Var2);
                zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var2);
                AbstractC0000a.m20s(iHashCode2, xq00Var2, yhhVar3, xq00Var2, vlhVar2);
                zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var2);
                dha.m36004a(pha.f177517a.mo66945a(nec.m64246i(zsf1.m96831B(mi21.m61820d(1.0f, cxh0Var), iny0.f104074d, f2, iny0.f104072b, f2), ((n6f) rv41VarM83117a.getValue()).f150873a, hmx0.m47993b(4)), d7f0.f46174i), xq00Var2, 0);
                xq00Var2.m91788r(true);
                xq00Var2.m91788r(true);
            } else {
                xq00Var2 = xq00Var;
                yw70Var2 = yw70Var;
                xq00Var2.m91757b0();
                num3 = num2;
            }
            pgv0VarM91796v = xq00Var2.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new t8a0(this, yw70Var2, fxh0Var, num3, i, i2, 5);
            }
        }
        i3 |= 384;
        num2 = num;
        if ((i & 3072) == 0) {
            if (xq00Var.m91766g(this)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        i4 = i3;
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq00Var.m91752Y(i4 & 1, z)) {
            if (i6 != 0) {
                num3 = null;
            } else {
                num3 = num2;
            }
            yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
            WeakHashMap weakHashMap2 = cxd1.f42984x;
            nv4Var = bxd1.m30815d(xq00Var).f42992h;
            objM91750T = xq00Var.m91750T();
            ia7Var = t6x0.f217647t;
            if (objM91750T == ia7Var) {
                objM91750T = hz40.m49254z(dau.f47107a, xq00Var);
                xq00Var.m91793t0(objM91750T);
            }
            xukVar = (xuk) objM91750T;
            objM91750T2 = xq00Var.m91750T();
            if (objM91750T2 == ia7Var) {
                objM91750T2 = sam.m77645B(Float.valueOf(1.0f));
                xq00Var.m91793t0(objM91750T2);
            }
            kqi0Var = (kqi0) objM91750T2;
            objM91750T3 = xq00Var.m91750T();
            if (objM91750T3 == ia7Var) {
                objM91750T3 = sam.m77645B(Boolean.FALSE);
                xq00Var.m91793t0(objM91750T3);
            }
            kqi0Var2 = (kqi0) objM91750T3;
            objM91750T4 = xq00Var.m91750T();
            if (objM91750T4 == ia7Var) {
                objM91750T4 = sam.m77645B(Long.valueOf(System.currentTimeMillis()));
                xq00Var.m91793t0(objM91750T4);
            }
            kqi0Var3 = (kqi0) objM91750T4;
            objM91750T5 = xq00Var.m91750T();
            if (objM91750T5 == ia7Var) {
                objM91750T5 = sam.m77674m(new e6c0(yw70Var, 22));
                xq00Var.m91793t0(objM91750T5);
            }
            rv41Var = (rv41) objM91750T5;
            objM91750T6 = xq00Var.m91750T();
            if (objM91750T6 == ia7Var) {
                kqi0Var4 = kqi0Var;
                objM91750T6 = sam.m77674m(new gny0(num3, yw70Var, nv4Var, yqqVar, 0));
                xq00Var.m91793t0(objM91750T6);
            } else {
                kqi0Var4 = kqi0Var;
            }
            rv41Var2 = (rv41) objM91750T6;
            objM91750T7 = xq00Var.m91750T();
            if (objM91750T7 == ia7Var) {
                objM91750T7 = sam.m77645B(Float.valueOf(0.0f));
                xq00Var.m91793t0(objM91750T7);
            }
            kqi0Var5 = (kqi0) objM91750T7;
            objM91750T8 = xq00Var.m91750T();
            if (objM91750T8 == ia7Var) {
                kqi0Var6 = kqi0Var5;
                rv41Var3 = rv41Var2;
                kqi0Var7 = kqi0Var2;
                C1726c2 c1726c3 = new C1726c2(this, xukVar, yw70Var, kqi0Var7, kqi0Var3, kqi0Var6, rv41Var, rv41Var3);
                kqi0Var8 = kqi0Var3;
                xukVar2 = xukVar;
                yw70Var3 = yw70Var;
                ww0 ww0Var2 = pes.f176839a;
                objM91750T8 = new fep(c1726c3);
                xq00Var.m91793t0(objM91750T8);
            } else {
                kqi0Var6 = kqi0Var5;
                rv41Var3 = rv41Var2;
                xukVar2 = xukVar;
                kqi0Var7 = kqi0Var2;
                kqi0Var8 = kqi0Var3;
                yw70Var3 = yw70Var;
            }
            uesVar = (ues) objM91750T8;
            xq00Var.m91771i0(-1008532154);
            cxh0Var = cxh0.f43038a;
            fxh0VarM61838v = mi21.m61838v(iny0.f104071a, mi21.m61819c(1.0f, cxh0Var));
            if (((Number) kqi0Var4.getValue()).floatValue() > 0.0f) {
                xq00Var.m91771i0(1503763647);
                boolean zM91770i4 = xq00Var.m91770i(xukVar2) | xq00Var.m91770i(kqi0Var7) | xq00Var.m91770i(kqi0Var8);
                if ((i4 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zM91770i2 = zM91770i4 | z4 | xq00Var.m91770i(rv41Var3) | xq00Var.m91770i(rv41Var) | xq00Var.m91770i(kqi0Var6) | xq00Var.m91770i(yw70Var3);
                Object objM91750T15 = xq00Var.m91750T();
                if (zM91770i2) {
                    xuk xukVar4 = xukVar2;
                    kqi0 kqi0Var13 = kqi0Var8;
                    rv41 rv41Var11 = rv41Var3;
                    fny0Var = new fny0(this, xukVar4, yw70Var, kqi0Var7, kqi0Var13, kqi0Var6, rv41Var11, rv41Var);
                    rv41Var5 = rv41Var11;
                    yw70Var3 = yw70Var;
                    rv41Var4 = rv41Var;
                    kqi0Var9 = kqi0Var13;
                    xq00Var.m91793t0(fny0Var);
                } else {
                    xuk xukVar5 = xukVar2;
                    kqi0 kqi0Var14 = kqi0Var8;
                    rv41 rv41Var12 = rv41Var3;
                    fny0Var = new fny0(this, xukVar5, yw70Var, kqi0Var7, kqi0Var14, kqi0Var6, rv41Var12, rv41Var);
                    rv41Var5 = rv41Var12;
                    yw70Var3 = yw70Var;
                    rv41Var4 = rv41Var;
                    kqi0Var9 = kqi0Var14;
                    xq00Var.m91793t0(fny0Var);
                }
                fxh0VarM61838v = pb61.m69516a(fxh0VarM61838v, w2a1.f247311a, (PointerInputEventHandler) fny0Var);
                z2 = false;
                xq00Var.m91788r(false);
            } else {
                cxh0Var = cxh0Var;
                rv41Var4 = rv41Var;
                z2 = false;
                kqi0Var7 = kqi0Var7;
                rv41Var5 = rv41Var3;
                kqi0Var9 = kqi0Var8;
                xq00Var.m91771i0(1504664321);
                xq00Var.m91788r(false);
            }
            xq00Var.m91788r(z2);
            fxh0 fxh0VarMo34315F2 = fxh0Var.mo34315F(fxh0VarM61838v);
            wb9Var = d7f0.f46166e;
            m6d0VarM36007d = dha.m36007d(wb9Var, z2);
            iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0VarM91778m = xq00Var.m91778m();
            fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarMo34315F2);
            soh.f211194A.getClass();
            c2087le = roh.f201257b;
            if (ug5Var != null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            yhh yhhVar5 = roh.f201262g;
            zsf1.m96835F(m6d0VarM36007d, yhhVar5, xq00Var);
            yhh yhhVar6 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar6, xq00Var);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            yhh yhhVar7 = roh.f201265j;
            zsf1.m96835F(numValueOf2, yhhVar7, xq00Var);
            vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var);
            yhh yhhVar8 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar8, xq00Var);
            objM91750T9 = xq00Var.m91750T();
            if (objM91750T9 == ia7Var) {
                objM91750T9 = sam.m77674m(new vly0(yw70Var3, rv41Var4, 1));
                xq00Var.m91793t0(objM91750T9);
            }
            rv41Var6 = (rv41) objM91750T9;
            objM91750T10 = xq00Var.m91750T();
            if (objM91750T10 == ia7Var) {
                yqqVar2 = yqqVar;
                objM91750T10 = sam.m77674m(new gyt0(yqqVar2, rv41Var6, rv41Var5, 14));
                xq00Var.m91793t0(objM91750T10);
            } else {
                yqqVar2 = yqqVar;
            }
            rv41 rv41Var13 = (rv41) objM91750T10;
            objM91750T11 = xq00Var.m91750T();
            if (objM91750T11 == ia7Var) {
                vlhVar2 = vlhVar;
                objM91750T11 = sam.m77674m(new bjk0(yw70Var, yqqVar2, rv41Var6, rv41Var5, 29));
                xq00Var.m91793t0(objM91750T11);
            } else {
                vlhVar2 = vlhVar;
            }
            rv41 rv41Var14 = (rv41) objM91750T11;
            if (((Boolean) kqi0Var7.getValue()).booleanValue()) {
                xq00Var.m91771i0(-1307787749);
                j = leu.m58815a(xq00Var).f112825c.f221220c;
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(-1307714496);
                j = leu.m58815a(xq00Var).f112825c.f221219b;
                xq00Var.m91788r(false);
            }
            kqi0 kqi0Var15 = kqi0Var9;
            xq00Var2 = xq00Var;
            yw70Var2 = yw70Var;
            rv41 rv41VarM83117a2 = uh21.m83117a(j, null, "Scroll bar thumb color", xq00Var2, 384, 10);
            if (yw70Var2.f276897j.mo28415b()) {
                z3 = true;
            } else {
                z3 = true;
            }
            Boolean boolValueOf2 = Boolean.valueOf(z3);
            kqi0Var10 = kqi0Var4;
            zM91768h = xq00Var2.m91768h(z3) | xq00Var2.m91770i(kqi0Var10);
            objM91750T12 = xq00Var2.m91750T();
            if (zM91768h) {
                fbkVar = null;
                objM91750T12 = new lpf(z3, kqi0Var10, fbkVar, 4);
                xq00Var2.m91793t0(objM91750T12);
            } else {
                fbkVar = null;
                objM91750T12 = new lpf(z3, kqi0Var10, fbkVar, 4);
                xq00Var2.m91793t0(objM91750T12);
            }
            hz40.m49237i(boolValueOf2, (th00) objM91750T12, xq00Var2);
            Long lValueOf2 = Long.valueOf(((Number) kqi0Var15.getValue()).longValue());
            zM91770i = xq00Var2.m91770i(kqi0Var7);
            objM91750T13 = xq00Var2.m91750T();
            if (zM91770i) {
                objM91750T13 = new u4e(11, fbkVar, kqi0Var7);
                xq00Var2.m91793t0(objM91750T13);
            } else {
                objM91750T13 = new u4e(11, fbkVar, kqi0Var7);
                xq00Var2.m91793t0(objM91750T13);
            }
            hz40.m49237i(lValueOf2, (th00) objM91750T13, xq00Var2);
            float f3 = ((ybs) rv41Var14.getValue()).f271238a;
            float f4 = iny0.f104073c;
            fxh0 fxh0VarM69727a2 = pes.m69727a(zxc.m97185e(((Number) kqi0Var10.getValue()).floatValue(), mi21.m61822f(1.0f, mi21.m61824h(((ybs) rv41Var13.getValue()).f271238a + f4 + f4, bga.m29071N(cxh0Var, 0.0f, f3 - f4, 1)))), uesVar, vvl0.f245248a, false, null, false, null, null, false, 252);
            m6d0 m6d0VarM36007d3 = dha.m36007d(wb9Var, false);
            int iHashCode3 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m3 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var2, fxh0VarM69727a2);
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d3, yhhVar5, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m3, yhhVar6, xq00Var2);
            AbstractC0000a.m20s(iHashCode3, xq00Var2, yhhVar7, xq00Var2, vlhVar2);
            zsf1.m96835F(fxh0VarM48286s3, yhhVar8, xq00Var2);
            dha.m36004a(pha.f177517a.mo66945a(nec.m64246i(zsf1.m96831B(mi21.m61820d(1.0f, cxh0Var), iny0.f104074d, f4, iny0.f104072b, f4), ((n6f) rv41VarM83117a2.getValue()).f150873a, hmx0.m47993b(4)), d7f0.f46174i), xq00Var2, 0);
            xq00Var2.m91788r(true);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2 = xq00Var;
            yw70Var2 = yw70Var;
            xq00Var2.m91757b0();
            num3 = num2;
        }
        pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new t8a0(this, yw70Var2, fxh0Var, num3, i, i2, 5);
        }
    }

    @Override // p204p.uyb0
    /* JADX INFO: renamed from: f */
    public wyb0 mo75548f(xyb0 xyb0Var) {
        skm0 skm0Var = xyb0Var.f267269a;
        if (skm0Var instanceof pkm0) {
            return new czb0(true, true, true);
        }
        if (skm0Var instanceof qkm0) {
            return new czb0(false, false, false);
        }
        if (skm0Var instanceof rkm0) {
            return new czb0(true, true, true);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // p204p.wi5
    /* JADX INFO: renamed from: t */
    public void mo75551t(yqq yqqVar, int i, int[] iArr, ko70 ko70Var, int[] iArr2) {
        bj5.m29366c(i, iArr, iArr2, false);
    }

    public String toString() {
        switch (this.f209358a) {
            case 0:
                return "AbsoluteArrangement#Right";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ si5(Object obj, int i) {
        this.f209358a = i;
    }

    public /* synthetic */ si5(son sonVar, otn otnVar, int i) {
        this.f209358a = i;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        switch (this.f209358a) {
            case 4:
                ybv ybvVar = ((qu80) obj).f192599e;
                if (ybvVar.f271259d.m84311c(3).length() > 0) {
                    String string = uh30.m83118a(ybvVar.f271259d.m84311c(3)).toString();
                    wj50.m88279p(string);
                    return string;
                }
                return "";
            case 12:
                return new l2s(!wj50.m88271j((String) ((Map) obj).get("nft-disabled"), "1"), 1);
            case 19:
                fxx fxxVar = (fxx) obj;
                List list = fxxVar.f74479a;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (hashSet.add(((axx) obj2).f21021a)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.size() != list.size()) {
                    na6.m63971s("PME duplications found");
                }
                return new fxx(arrayList, fxxVar.f74480b, null, null);
            default:
                return xnq0.m91513a((Throwable) obj);
        }
    }
}
