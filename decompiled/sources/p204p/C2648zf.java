package p204p;

import android.os.Bundle;
import android.webkit.WebView;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.disposables.Disposable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: p.zf */
/* JADX INFO: loaded from: classes3.dex */
public final class C2648zf implements ewr {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f282164a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f282165b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f282166c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f282167d;

    public /* synthetic */ C2648zf(Object obj, Object obj2, Object obj3, int i) {
        this.f282164a = i;
        this.f282165b = obj;
        this.f282166c = obj2;
        this.f282167d = obj3;
    }

    @Override // p204p.ewr
    public final void dispose() {
        g2q g2qVarM75604G;
        e030 e030Var;
        y9r0 y9r0Var;
        e030 e030Var2;
        fbk fbkVar = null;
        switch (this.f282164a) {
            case 0:
                ((eh00) this.f282165b).invoke();
                ((hc80) this.f282166c).getLifecycle().mo31988d((C2531wf) this.f282167d);
                return;
            case 1:
                xr2 xr2Var = (xr2) this.f282165b;
                zr2 zr2Var = xr2Var.f265232b;
                es2 es2Var = xr2Var.f265236f;
                if (((Boolean) ((kqi0) this.f282166c).getValue()).booleanValue()) {
                    es2Var.f62260a.mo46962a(new bs2(zr2Var.f285524a, (d850) ((kqi0) this.f282167d).getValue()));
                    return;
                } else {
                    es2Var.f62260a.mo46962a(new cs2(zr2Var.f285524a));
                    return;
                }
            case 2:
                gb31 gb31Var = (gb31) this.f282165b;
                Object obj = this.f282166c;
                gb31Var.remove(obj);
                ((lx4) this.f282167d).f137720e.m33627k(obj);
                return;
            case 3:
                uxf uxfVar = (uxf) ((bxb) this.f282165b).f31813b;
                kxf kxfVar = (kxf) this.f282166c;
                vwf vwfVar = (vwf) this.f282167d;
                LinkedHashMap linkedHashMap = uxfVar.f234913a;
                Class<?> cls = vwfVar.getClass();
                Object arrayList = linkedHashMap.get(cls);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(cls, arrayList);
                }
                List list = (List) arrayList;
                if (list.size() < 5) {
                    list.add(kxfVar);
                    return;
                }
                return;
            case 4:
                l8p l8pVar = (l8p) this.f282165b;
                h7p h7pVar = (h7p) l8pVar.f130916h.getValue();
                x0h1.m89578u(h7pVar.f88500f, null, 0, new c7p(h7pVar, ((obj) this.f282166c).f163658f, fbkVar, 1), 3);
                p8p p8pVar = (p8p) l8pVar.f130915g.getValue();
                di41 di41Var = p8pVar.f175015c;
                if (di41Var != null) {
                    di41Var.mo26601e(null);
                }
                x7q x7qVar = p8pVar.f175016d;
                if (x7qVar != null) {
                    x7qVar.m90160a();
                }
                p8pVar.f175016d = null;
                ((kqi0) this.f282167d).setValue(null);
                return;
            case 5:
                ((hc80) this.f282166c).getLifecycle().mo31988d((ne2) this.f282165b);
                r9r r9rVar = (r9r) this.f282167d;
                zcp zcpVar = r9rVar.f197107d;
                zv41 zv41Var = zcpVar.f281555a;
                yyn0 yyn0Var = yyn0.f277547b;
                zv41Var.getClass();
                zv41Var.m97091m(null, yyn0Var);
                zv41 zv41Var2 = zcpVar.f281556b;
                Boolean bool = Boolean.FALSE;
                zv41Var2.getClass();
                zv41Var2.m97091m(null, bool);
                zv41 zv41Var3 = zcpVar.f281555a;
                yyn0 yyn0Var2 = yyn0.f277548c;
                zv41Var3.getClass();
                zv41Var3.m97091m(null, yyn0Var2);
                v5p v5pVar = r9rVar.f197110g;
                AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
                xgg1.m90759b1();
                v5pVar.m84740i();
                r9rVar.f197112i.m69600b();
                return;
            case 6:
                hhr hhrVar = (hhr) this.f282165b;
                uxi0 uxi0Var = (uxi0) this.f282166c;
                hhrVar.m25253b().m97201b(uxi0Var);
                ((gb31) this.f282167d).remove(uxi0Var);
                return;
            case 7:
                b250 b250Var = (b250) ((slv0) this.f282165b).f210497a;
                if (b250Var == null || (g2qVarM75604G = riw0.m75604G(b250Var)) == null) {
                    return;
                }
                g2qVarM75604G.m43409n((String) this.f282166c, ((gw41) this.f282167d).mo31974h());
                return;
            case 8:
                ((hc80) this.f282166c).getLifecycle().mo31988d((xb80) this.f282165b);
                lc80 lc80Var = (lc80) ((rlv0) this.f282167d).f200373a;
                if (lc80Var != null) {
                    lc80Var.mo34406a();
                    return;
                }
                return;
            case 9:
                ((era0) this.f282165b).f62055g.f60742b.f99396e.f74381d.mo31988d((smj0) this.f282166c);
                ((ic80) this.f282167d).f100757a.m66676g(ta80.ON_DESTROY);
                return;
            case 10:
                gb31 gb31Var2 = (gb31) this.f282165b;
                i1m0 i1m0Var = (i1m0) this.f282166c;
                gb31Var2.remove(i1m0Var);
                ((b8y0) this.f282167d).mo28440a(i1m0Var.f97550a);
                return;
            case 11:
                UUID uuid = (UUID) this.f282167d;
                gb31 gb31Var3 = ((k1m0) this.f282165b).f118390b;
                if (gb31Var3 == null || !gb31Var3.isEmpty()) {
                    ListIterator listIterator = gb31Var3.listIterator();
                    do {
                        e030Var = (e030) listIterator;
                        if (e030Var.hasNext()) {
                        }
                    } while (!wj50.m88271j(((i1m0) e030Var.next()).f97550a, uuid));
                    return;
                }
                ((b8y0) this.f282166c).mo28440a(uuid);
                return;
            case 12:
                WebView webView = (WebView) ((kqi0) this.f282165b).getValue();
                if (webView == null) {
                    return;
                }
                webView.stopLoading();
                if (((miq0) this.f282166c) == null) {
                    webView.saveState((Bundle) this.f282167d);
                    webView.loadUrl("about:blank");
                    return;
                }
                return;
            case 13:
                ((Disposable) this.f282165b).dispose();
                ((MobiusLoop) this.f282166c).dispose();
                z9r0 z9r0Var = (z9r0) this.f282167d;
                synchronized (z9r0Var.f280866b) {
                    y9r0Var = z9r0Var.f280867c;
                }
                if (y9r0Var != null) {
                    y9r0Var.m93159b(3);
                    return;
                }
                return;
            case 14:
                c8y0 c8y0Var = (c8y0) this.f282165b;
                cqi0 cqi0Var = c8y0Var.f35333b;
                Object obj2 = this.f282166c;
                Object objM33627k = cqi0Var.m33627k(obj2);
                h8y0 h8y0Var = (h8y0) this.f282167d;
                if (objM33627k == h8y0Var) {
                    Map map = c8y0Var.f35332a;
                    Map mapMo38134c = h8y0Var.mo38134c();
                    if (mapMo38134c.isEmpty()) {
                        map.remove(obj2);
                        return;
                    } else {
                        map.put(obj2, mapMo38134c);
                        return;
                    }
                }
                return;
            case 15:
                ((nf01) this.f282165b).f153209d.m92313f((String) this.f282166c, (svz) this.f282167d);
                return;
            case 16:
                p8p0 p8p0Var = (p8p0) this.f282166c;
                if (((Boolean) ((kqi0) this.f282167d).getValue()).booleanValue()) {
                    return;
                }
                up0 up0Var = ((m641) this.f282165b).f140385l;
                wj50.m88279p(p8p0Var);
                up0Var.m83641b(p8p0Var);
                return;
            default:
                UUID uuid2 = (UUID) this.f282167d;
                gb31 gb31Var4 = ((ih41) this.f282165b).f102167a;
                if (gb31Var4 == null || !gb31Var4.isEmpty()) {
                    ListIterator listIterator2 = gb31Var4.listIterator();
                    do {
                        e030Var2 = (e030) listIterator2;
                        if (e030Var2.hasNext()) {
                        }
                    } while (!wj50.m88271j(((fh41) e030Var2.next()).f69574a, uuid2));
                    return;
                }
                ((b8y0) this.f282166c).mo28440a(uuid2);
                return;
        }
    }

    public /* synthetic */ C2648zf(hc80 hc80Var, zb80 zb80Var, Object obj, int i) {
        this.f282164a = i;
        this.f282166c = hc80Var;
        this.f282165b = zb80Var;
        this.f282167d = obj;
    }

    public C2648zf(slv0 slv0Var, String str, gw41 gw41Var, int i) {
        this.f282164a = 7;
        this.f282165b = slv0Var;
        this.f282166c = str;
        this.f282167d = gw41Var;
    }
}
