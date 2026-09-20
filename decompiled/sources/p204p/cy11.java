package p204p;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.media.SoundPool;
import android.os.Bundle;
import com.spotify.encoreconsumermobile.elements.smartshufflebutton.SmartShuffleButtonView;
import com.spotify.messaging.messagingplatformimpl.slate.SlateMessageHostActivity;
import com.spotify.signup.signup.p150v2.proto.ClientInfo;
import io.reactivex.rxjava3.core.Observable;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes10.dex */
public final class cy11 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43140a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f43141b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cy11(Object obj, int i) {
        super(0);
        this.f43140a = i;
        this.f43141b = obj;
    }

    /* JADX WARN: Type inference failed for: r2v19, types: [p.eh00, p.qe70] */
    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f43140a) {
            case 0:
                j6m0 j6m0Var = (j6m0) this.f43141b;
                AtomicReferenceArray atomicReferenceArray = cbm0.f36163e;
                return j6m0Var.m52579b(xgg1.m90662N1("SIDEDRAWER", "sidedrawer", 1822, "sidedrawer"), new voc1("spotify:activitycenter").m86091c());
            case 1:
                ((if0) this.f43141b).m50410b(true);
                return w2a1.f247311a;
            case 2:
                return ((u621) this.f43141b).m82433c(f321.f65339a);
            case 3:
                ((c7a1) ((b621) this.f43141b).m28244h1()).m31703F();
                return w2a1.f247311a;
            case 4:
                dke dkeVarM21319t = ClientInfo.m21319t();
                dkeVarM21319t.m36300q(f321.f65339a);
                y621 y621Var = (y621) this.f43141b;
                dkeVarM21319t.m36303t(y621Var.f269594d.m36836b());
                dkeVarM21319t.m36302s(y621Var.f269592b);
                dkeVarM21319t.m36304u();
                dkeVarM21319t.m36301r(y621Var.f269593c);
                dkeVarM21319t.m36299m(Collections.singletonList(xtb.CAPABILITY_WEB_INTERACTION_V1));
                return (ClientInfo) dkeVarM21319t.build();
            case 5:
                mwx0 mwx0Var = ((xb21) this.f43141b).f259826g;
                if (mwx0Var.f147896c != null) {
                    mwx0Var.m63071c();
                    if (mwx0Var.f147896c != null) {
                        throw new IllegalStateException("Loader is already running.");
                    }
                    mwx0Var.f147896c = mwx0Var.f147894a.subscribe(new xc5(mwx0Var, 17));
                }
                return w2a1.f247311a;
            case 6:
                return (mwx0) ((flw0) this.f43141b).f70878b;
            case 7:
                return (Bundle) this.f43141b;
            case 8:
                File file = (File) ((bh21) this.f43141b).f27058a.invoke();
                String absolutePath = file.getAbsolutePath();
                synchronized (bh21.f27057k) {
                    LinkedHashSet linkedHashSet = bh21.f27056j;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    linkedHashSet.add(absolutePath);
                }
                return file;
            case 9:
                vk21 vk21Var = (vk21) this.f43141b;
                return vk21Var.f242116a.m74492a(vk21Var.f242120e, false, false, vk21Var.f242118c);
            case 10:
                return Boolean.valueOf(((pn21) ((qn21) this.f43141b)).f179296f);
            case 11:
                er70 er70Var = ((SlateMessageHostActivity) this.f43141b).f5514Z0;
                if (er70Var != null) {
                    return (qo21) er70Var.get();
                }
                wj50.m88260d0("daggerDependencies");
                throw null;
            case 12:
                ((dmw0) this.f43141b).f50625d.invoke(jp21.f114557a);
                return w2a1.f247311a;
            case 13:
                rq21 rq21Var = (rq21) this.f43141b;
                bji bjiVar = rq21Var.f201731b;
                if (bjiVar != null) {
                    return (rq21) bjiVar.mo29483e(new jzn0(rq21Var, 11));
                }
                return null;
            case 14:
                sq21 sq21Var = (sq21) this.f43141b;
                bji bjiVar2 = sq21Var.f212997c;
                if (bjiVar2 != null) {
                    return (sq21) bjiVar2.mo29483e(new jzn0(sq21Var, 12));
                }
                return null;
            case 15:
                SmartShuffleButtonView smartShuffleButtonView = (SmartShuffleButtonView) this.f43141b;
                ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(smartShuffleButtonView.getLoading(), "level", 0, 10000);
                objectAnimatorOfInt.setDuration(3500L);
                objectAnimatorOfInt.setRepeatCount(-1);
                objectAnimatorOfInt.addUpdateListener(new rx4(smartShuffleButtonView, 18));
                return objectAnimatorOfInt;
            case 16:
                i031 i031Var = (i031) this.f43141b;
                k331 k331Var = i031Var.f97123a;
                i4t0 i4t0Var = k331Var.f118755a;
                gys0 gys0Var = new gys0(((qq4) i4t0Var.get()).m73498z(), 3, ((qq4) i4t0Var.get()).m73496x(), ((qq4) i4t0Var.get()).m73497y(), ((qq4) i4t0Var.get()).m73482j(), ((qq4) i4t0Var.get()).m73489q(), k331Var.m55226b(), ((qq4) i4t0Var.get()).m73469D(), ((qq4) i4t0Var.get()).m73474b(), ((qq4) i4t0Var.get()).m73477e(), ((qq4) i4t0Var.get()).m73476d(), ((qq4) i4t0Var.get()).m73478f(), ((qq4) i4t0Var.get()).m73473a(), ((qq4) i4t0Var.get()).m73484l(), ((qq4) i4t0Var.get()).m73483k());
                nau nauVar = nau.f152117a;
                return Observable.defer(new g031(i031Var, new AtomicReference(new k031(gys0Var, new ubp0(), nauVar, nauVar, nauVar, new jf31(null, null), null, null, true, false, 0, lau.f131415a, nauVar, nauVar, gbu.f78413a, 0, 0, nauVar, false)))).serialize().replay(1).m23778f();
            case 17:
                return new cjc0(((x131) this.f43141b).f257052b, o131.f160608f);
            case 18:
                o7o o7oVar = ((u231) this.f43141b).f225976Z1;
                if (o7oVar == null) {
                    wj50.m88260d0("smartShufflePlayModePickerLoggerFactory");
                    throw null;
                }
                kv91 kv91Var = (kv91) ((r231) ((p7o) o7oVar.f162593a.f225273b).f174733c).f195046c.get();
                jg31.m53271i(kv91Var);
                return new v231(kv91Var);
            case 19:
                i431 i431Var = (i431) this.f43141b;
                rlv0 rlv0Var = new rlv0();
                rlv0Var.f200373a = lau.f131415a;
                return Observable.defer(new ve0(16, rlv0Var, i431Var)).doOnNext(new tgi(rlv0Var, 6)).replay(1).m23778f();
            case 20:
                return (ijc1) ((r531) this.f43141b).invoke();
            case 21:
                ((q831) this.f43141b).f186234h.m97090l(null);
                return w2a1.f247311a;
            case 22:
                ay21 ay21Var = (ay21) this.f43141b;
                lh10 lh10Var = (lh10) ay21Var.f21069d;
                if (lh10Var != null) {
                    lh10Var.m58941a();
                }
                ay21Var.f21069d = null;
                return w2a1.f247311a;
            case 23:
                f13 f13Var = (f13) this.f43141b;
                y7o y7oVar = (y7o) f13Var.f64776d;
                y7oVar.getClass();
                Context context = (Context) ((pfn) ((r8n) y7oVar.f270117a.f225273b).f196820c).f177115b.f212437t1.f246642a;
                jg31.m53271i(context);
                return new cjc0(new mo31(context), new qwz0(f13Var, 7));
            case 24:
                return new C1873fu((kvc) this.f43141b);
            case 25:
                pgo pgoVar = ((f8n) ((z7o) this.f43141b).f280261a.f225273b).f67020a.f42051b;
                jg31.m53271i(pgoVar);
                return new hgo(new as5(pgoVar, 15), un31.f232037W0);
            case 26:
                ((gq31) this.f43141b).dismiss();
                return w2a1.f247311a;
            case 27:
                qt31 qt31Var = (qt31) this.f43141b;
                SoundPool soundPool = (SoundPool) qt31Var.f192274b.get();
                soundPool.setOnLoadCompleteListener(new pt31(qt31Var));
                return soundPool;
            case 28:
                dmw0 dmw0Var = (dmw0) this.f43141b;
                gh00 gh00Var = dmw0Var.f50625d;
                Rect rect = new Rect();
                dmw0Var.f50626e.getGlobalVisibleRect(rect);
                gh00Var.invoke(new z041(new y041(rect.left, rect.top, rect.right, rect.bottom)));
                return w2a1.f247311a;
            default:
                n541 n541Var = (n541) this.f43141b;
                iin iinVar = (iin) n541Var.f150489b.f99817a.f225273b;
                bji bjiVar3 = (bji) ((zfn) iinVar.f102606b).f282351a.f212567y1.get();
                jg31.m53271i(bjiVar3);
                dg10 dg10Var = new dg10(new ve4(bjiVar3), 27);
                pgo pgoVar2 = ((cu50) iinVar.f102608d).f42051b;
                jg31.m53271i(pgoVar2);
                return new hgo(new k541(dg10Var, pgoVar2, ((l3n) iinVar.f102607c).m58011d(), ((zfn) iinVar.f102606b).f282351a.m78781i2(), 0), new qwz0(n541Var, 8));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy11(j6m0 j6m0Var, dy11 dy11Var) {
        super(0);
        this.f43140a = 0;
        this.f43141b = j6m0Var;
    }
}
