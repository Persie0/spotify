package p204p;

import android.content.Context;
import android.os.Environment;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;
import com.spotify.eventsender.eventsender.EventSenderDatabase_Impl;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.music.R;
import com.spotify.puffin.core.data.filtermetadata.database.FilterMetadataDatabase_Impl;
import com.spotify.puffin.core.data.headphonefilterstate.database.HeadphoneFilterStateDatabase_Impl;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes2.dex */
public final class ias extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f100332a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f100333b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ias(Object obj, int i) {
        super(0);
        this.f100332a = i;
        this.f100333b = obj;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        boolean z;
        switch (this.f100332a) {
            case 0:
                jas jasVar = (jas) this.f100333b;
                MobiusLoop mobiusLoop = jasVar.f110538b;
                if (mobiusLoop == null) {
                    wj50.m88260d0("loop");
                    throw null;
                }
                pqm0 pqm0VarM65518d = nsf1.m65518d(mobiusLoop);
                Disposable disposable = (Disposable) pqm0VarM65518d.f180350a;
                lqi0 lqi0Var = (lqi0) pqm0VarM65518d.f180351b;
                jasVar.f110539c = disposable;
                return lqi0Var;
            case 1:
                ((j040) this.f100333b).mo45325C(null);
                return w2a1.f247311a;
            case 2:
                peu peuVar = (peu) this.f100333b;
                return new d9m(peuVar.f176850c, new k60(peuVar, 1));
            case 3:
                c1v c1vVar = (c1v) this.f100333b;
                ase0 ase0VarM31278d = c1vVar.m31278d();
                fbk fbkVar = null;
                if (ase0VarM31278d != null) {
                    return new d0r0(ote0.f169048a, ase0VarM31278d, new aqh(c1vVar, fbkVar, 5));
                }
                return null;
            case 4:
                return ((hlv) this.f100333b).f92755e;
            case 5:
                return new st80(((zuv) this.f100333b).f286543d, null, gbu.f78413a, false, new qt80(Collections.singleton(in80.f103929t)), a5u0.f12598a, null, 0, null, 458);
            case 6:
                return ((j5w) this.f100333b).f109132i.m45923a();
            case 7:
                return new u9x((EventSenderDatabase_Impl) this.f100333b);
            case 8:
                jex jexVar = (jex) this.f100333b;
                gex gexVar = jexVar.f111706t;
                q530 q530Var = jexVar.f111703g;
                hc80 hc80Var = jexVar.f111705i;
                h630 h630Var = h630.f87970P0;
                q530Var.mo40803g(h630Var);
                zfx zfxVar = jexVar.f111702f;
                zfxVar.f282446g = false;
                Iterator it = zfxVar.f282444e.iterator();
                while (it.hasNext()) {
                    ((p450) it.next()).start();
                }
                hc11 hc11Var = (hc11) zfxVar.f282445f;
                zv41 zv41Var = hc11Var.f89664c;
                if (((Map) zv41Var.getValue()).isEmpty()) {
                    String strMo48710e = hc11Var.f89662a.mo48710e(hc11.f89661d, "");
                    Map mapM44271a = nau.f152117a;
                    if (strMo48710e != null && strMo48710e.length() != 0) {
                        try {
                            mapM44271a = ((gc11) hc11Var.f89663b.m41880a(strMo48710e, gc11.Companion.serializer())).m44271a();
                        } catch (IOException e) {
                            Logger.m3967c(e, "Exception while reading the json string", new Object[0]);
                        } catch (SerializationException e2) {
                            Logger.m3967c(e2, "Unexpected json format", new Object[0]);
                        }
                    }
                    zv41Var.m97090l(mapM44271a);
                    break;
                }
                oge0 oge0Var = new oge0(jexVar.f111699Z.f24977a, hc80Var);
                Set set = zfxVar.f282444e;
                v5m v5mVarMo28301c = ((x5m) g6f.m43741q0(g6f.m43735n0(set, x5m.class))).mo28301c();
                MobiusLoop mobiusLoop2 = ((aex) g6f.m43741q0(g6f.m43735n0(set, aex.class))).f14980b;
                if (mobiusLoop2 == null) {
                    wj50.m88260d0("loop");
                    throw null;
                }
                zv41 zv41VarM29974j = bnf1.m29974j(mobiusLoop2);
                qhl qhlVar = (qhl) g6f.m43741q0(g6f.m43735n0(set, qhl.class));
                gexVar.m44534e(new ofx(v5mVarMo28301c, zv41VarM29974j, qhlVar, jexVar, zfxVar.f282440a, zfxVar.f282441b, zfxVar.f282442c, zfxVar.f282443d, (seq0) g6f.m43741q0(g6f.m43735n0(set, seq0.class)), (qgl) g6f.m43741q0(g6f.m43735n0(set, qgl.class)), oge0Var, (xfx) ((yfx) g6f.m43741q0(g6f.m43735n0(set, yfx.class))).f272368e.getValue()), new zyv(jexVar, 11), jexVar.f111704h.f183901a.path());
                z8g1.m95591k(gexVar.m44530a(), 3).m33099f(hc80Var, new iz0(jexVar, 12));
                q530Var.mo40812p(h630Var);
                hex hexVar = new hex(jexVar);
                jexVar.f111694U0 = hexVar;
                hc80Var.getLifecycle().mo31986a(hexVar);
                return w2a1.f247311a;
            case 9:
                return new j5s0(((s8v0) this.f100333b).f206797a, 2);
            case 10:
                ufx ufxVar = (ufx) this.f100333b;
                q530 q530Var2 = ufxVar.f229915g;
                q530Var2.mo40808l(ufxVar.f229911c.f111696W0);
                q530Var2.mo40812p(h630.f87966L0);
                q530Var2.mo40803g(h630.f87967M0);
                return w2a1.f247311a;
            case 11:
                ((RecyclerView) this.f100333b).mo1042z0(0);
                return w2a1.f247311a;
            case 12:
                d8y d8yVar = (d8y) this.f100333b;
                return d8yVar.f46550a.getPackageManager().getApplicationInfo(d8yVar.f46550a.getPackageName(), 128).metaData;
            case 13:
                sfy sfyVar = (sfy) this.f100333b;
                sfyVar.f208660c.m92437o();
                sfyVar.f208661d.m34249l();
                return w2a1.f247311a;
            case 14:
                vsy vsyVar = (vsy) this.f100333b;
                bji bjiVar = vsyVar.f244510b;
                if (bjiVar != null) {
                    return (vsy) bjiVar.mo29483e(new c3f(vsyVar, 12));
                }
                return null;
            case 15:
                mxy mxyVar = (mxy) this.f100333b;
                TreeMap treeMap = new TreeMap(new p3c(new kxy(0), 17));
                Context context = mxyVar.f148215b;
                String absolutePath = new File(context.getFilesDir(), "settings").getAbsolutePath();
                String strM29592O0 = bk5.m29592O0(new String[]{Environment.getExternalStorageDirectory().getAbsolutePath(), "Android/data/", ((edi0) mxyVar.f148216c).f58523a, "cache"}, File.separator, null, null, null, 62);
                String absolutePath2 = new File(context.getFilesDir(), "spotifycache").getAbsolutePath();
                String absolutePath3 = context.getCacheDir().getAbsolutePath();
                String absolutePath4 = Environment.getExternalStorageDirectory().getAbsolutePath();
                String absolutePath5 = context.getFilesDir().getAbsolutePath();
                File externalCacheDir = context.getExternalCacheDir();
                String absolutePath6 = externalCacheDir != null ? externalCacheDir.getAbsolutePath() : null;
                treeMap.put(absolutePath, g751.f77184b);
                g751 g751Var = g751.f77183a;
                treeMap.put(strM29592O0, g751Var);
                treeMap.put(absolutePath2, g751Var);
                treeMap.put(absolutePath3, g751.f77185c);
                if (absolutePath6 != null) {
                    treeMap.put(absolutePath6, g751.f77186d);
                }
                treeMap.put(absolutePath5, g751.f77187e);
                treeMap.put(absolutePath4, g751.f77188f);
                return treeMap;
            case 16:
                return new cy31((FilterMetadataDatabase_Impl) this.f100333b);
            case 17:
                return nxf1.m65842u(lyz.m60278b((lyz) this.f100333b));
            case 18:
                return ceg1.m32576o(((h24) this.f100333b).m46469a().f75829a);
            case 19:
                return (ViewGroup) ((fj00) this.f100333b).f70035g.findViewById(R.id.filters_container);
            case 20:
                bo20 bo20Var = (bo20) this.f100333b;
                return new cnl0(bo20Var.f28992e, bo20Var.f28989b);
            case 21:
                return new ezd1((HeadphoneFilterStateDatabase_Impl) this.f100333b);
            case 22:
                return Integer.valueOf(Objects.hash(((ds30) this.f100333b).impl));
            case 23:
                rv30 rv30Var = (rv30) this.f100333b;
                ReentrantLock reentrantLock = rv30Var.f202991b;
                reentrantLock.lock();
                try {
                    rv30Var.f202990a = null;
                    return w2a1.f247311a;
                } finally {
                    reentrantLock.unlock();
                }
            case 24:
                luk lukVar = ((dj40) this.f100333b).f49553e;
                x461 x461VarM64613f = njg1.m64613f();
                lukVar.getClass();
                return cct.m32296A(lukVar, x461VarM64613f);
            case 25:
                return new DispatcherWorker(((os40) this.f100333b).f168738e);
            case 26:
                return new DispatcherWorker(((wa50) this.f100333b).f249397g);
            case 27:
                return ((ofm0) this.f100333b).mo15684j0(pw71.class);
            case 28:
                ep80 ep80Var = (ep80) this.f100333b;
                eh00 eh00Var = ep80Var.f61570b;
                eh00 eh00Var2 = ep80Var.f61571c;
                up80 up80Var = ep80Var.f61569a;
                ArrayList arrayList = ep80Var.f61574f;
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(gga.m44667f((p020) it2.next()));
                }
                return new xp80(eh00Var, eh00Var2, arrayList2, hra.m48363i(arrayList), hra.m48361g(arrayList), hra.m48364j(arrayList), hra.m48362h(arrayList), hra.m48379y(arrayList), ep80Var.f61572d, hra.m48360f(arrayList), up80Var, ep80Var.f61573e);
            default:
                j7f0 j7f0Var = ((nw80) this.f100333b).f159061o;
                if (j7f0Var instanceof f7f0) {
                    z = false;
                } else if (j7f0Var instanceof ib81) {
                    z = ((ib81) j7f0Var).f100477g;
                } else {
                    if (!(j7f0Var instanceof f0w)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    z = ((f0w) j7f0Var).f64726d;
                }
                return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ias(lyz lyzVar, int i) {
        super(0);
        this.f100332a = 17;
        this.f100333b = lyzVar;
    }
}
