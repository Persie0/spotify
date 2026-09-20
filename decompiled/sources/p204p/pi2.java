package p204p;

import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class pi2 {

    /* JADX INFO: renamed from: a */
    public final qld1 f177814a;

    /* JADX INFO: renamed from: b */
    public final epx f177815b;

    /* JADX INFO: renamed from: c */
    public final xuk f177816c;

    /* JADX INFO: renamed from: d */
    public final zv41 f177817d;

    /* JADX INFO: renamed from: e */
    public final nuu0 f177818e;

    /* JADX INFO: renamed from: f */
    public volatile tf60 f177819f;

    public pi2(qld1 qld1Var, epx epxVar, xuk xukVar) {
        this.f177814a = qld1Var;
        this.f177815b = epxVar;
        this.f177816c = xukVar;
        zv41 zv41VarM52819d = jag1.m52819d(ti2.f220534a);
        this.f177817d = zv41VarM52819d;
        this.f177818e = bzf1.m31021m(zv41VarM52819d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX INFO: renamed from: a */
    public static final Object m70067a(pi2 pi2Var, tf60 tf60Var, k37 k37Var, fbk fbkVar) {
        li2 li2Var;
        pi2Var.getClass();
        w2a1 w2a1Var = w2a1.f247311a;
        if (fbkVar instanceof li2) {
            li2Var = (li2) fbkVar;
            int i = li2Var.f133694e;
            if ((i & Integer.MIN_VALUE) != 0) {
                li2Var.f133694e = i - Integer.MIN_VALUE;
            } else {
                li2Var = new li2(pi2Var, fbkVar);
            }
        } else {
            li2Var = new li2(pi2Var, fbkVar);
        }
        Object objM70069c = li2Var.f133692c;
        Object obj = yuk.f276404a;
        int i2 = li2Var.f133694e;
        if (i2 == 0) {
            bga.m29073P(objM70069c);
            if (pi2Var.f177819f == tf60Var) {
                if (wj50.m88271j(k37Var, h37.f87153a)) {
                    zv41 zv41Var = pi2Var.f177817d;
                    ui2 ui2Var = ui2.f230568a;
                    zv41Var.getClass();
                    zv41Var.m97091m(null, ui2Var);
                    return w2a1Var;
                }
                if (wj50.m88271j(k37Var, f37.f65405a)) {
                    zv41 zv41Var2 = pi2Var.f177817d;
                    ri2 ri2Var = ri2.f199428a;
                    zv41Var2.getClass();
                    zv41Var2.m97091m(null, ri2Var);
                    return w2a1Var;
                }
                if (!(k37Var instanceof i37)) {
                    if (k37Var instanceof j37) {
                        Logger.m3969e("Audio recognition returned no match", new Object[0]);
                        zv41 zv41Var3 = pi2Var.f177817d;
                        xi2 xi2Var = new xi2(((j37) k37Var).m52251a());
                        zv41Var3.getClass();
                        zv41Var3.m97091m(null, xi2Var);
                        return w2a1Var;
                    }
                    if (!(k37Var instanceof g37)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Logger.m3966b("Audio recognition failed: %s", ((g37) k37Var).m43440a());
                    zv41 zv41Var4 = pi2Var.f177817d;
                    si2 si2Var = si2.f209344a;
                    zv41Var4.getClass();
                    zv41Var4.m97091m(null, si2Var);
                    return w2a1Var;
                }
                i37 i37Var = (i37) k37Var;
                Logger.m3969e("Audio recognition matched: %s", i37Var.m49574b());
                String strM49574b = i37Var.m49574b();
                li2Var.f133690a = tf60Var;
                li2Var.f133691b = i37Var;
                li2Var.f133694e = 1;
                objM70069c = pi2Var.m70069c(strM49574b, li2Var);
                if (objM70069c == obj) {
                    return obj;
                }
            }
            return w2a1Var;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k37Var = li2Var.f133691b;
        tf60Var = li2Var.f133690a;
        bga.m29073P(objM70069c);
        u9v0 u9v0Var = (u9v0) objM70069c;
        if (pi2Var.f177819f == tf60Var) {
            zv41 zv41Var5 = pi2Var.f177817d;
            i37 i37Var2 = (i37) k37Var;
            vi2 vi2Var = new vi2(i37Var2.m49574b(), i37Var2.m49573a(), u9v0Var);
            zv41Var5.getClass();
            zv41Var5.m97091m(null, vi2Var);
        }
        return w2a1Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m70068b() {
        tf60 tf60Var = this.f177819f;
        this.f177819f = null;
        if (tf60Var != null) {
            tf60Var.mo26601e(null);
        }
        zv41 zv41Var = this.f177817d;
        wi2 wi2Var = wi2.f251487a;
        zv41Var.getClass();
        zv41Var.m97091m(null, wi2Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m70069c(String str, ibk ibkVar) {
        mi2 mi2Var;
        v140 v140Var;
        List listM43727j0;
        List list;
        String str2;
        if (ibkVar instanceof mi2) {
            mi2Var = (mi2) ibkVar;
            int i = mi2Var.f143915d;
            if ((i & Integer.MIN_VALUE) != 0) {
                mi2Var.f143915d = i - Integer.MIN_VALUE;
            } else {
                mi2Var = new mi2(this, ibkVar);
            }
        } else {
            mi2Var = new mi2(this, ibkVar);
        }
        Object objM76980u = mi2Var.f143913b;
        int i2 = mi2Var.f143915d;
        fbk fbkVar = null;
        try {
            if (i2 == 0) {
                bga.m29073P(objM76980u);
                fa2 fa2Var = new fa2(this, str, fbkVar, 2);
                mi2Var.f143912a = str;
                mi2Var.f143915d = 1;
                objM76980u = s1h1.m76980u(3000L, fa2Var, mi2Var);
                yuk yukVar = yuk.f276404a;
                if (objM76980u == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = mi2Var.f143912a;
                bga.m29073P(objM76980u);
            }
            v140Var = (v140) objM76980u;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.m3967c(e2, "Failed to resolve audio recognition metadata for URI: %s", str);
            v140Var = null;
        }
        String string = (v140Var == null || (str2 = v140Var.f236243a) == null) ? null : wl51.m88491o1(str2).toString();
        if (string == null) {
            string = "";
        }
        if (v140Var == null || (list = v140Var.f236246d) == null) {
            listM43727j0 = null;
        } else {
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(wl51.m88491o1(((t140) it.next()).f216153a).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            listM43727j0 = g6f.m43727j0(arrayList2);
        }
        if (listM43727j0 == null) {
            listM43727j0 = lau.f131415a;
        }
        if (string.length() != 0 && !listM43727j0.isEmpty()) {
            return new u9v0(string, listM43727j0);
        }
        Logger.m3969e("Audio recognition metadata unavailable for URI: %s", str);
        return null;
    }
}
