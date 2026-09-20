package p204p;

import android.content.Context;
import android.content.Intent;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.R;
import com.spotify.musicappplatform.state.foregroundkeeperservice.impl.ForegroundKeeperService;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: classes10.dex */
public final class uu4 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f234100a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f234101b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uu4(Object obj, int i) {
        super(0);
        this.f234100a = i;
        this.f234101b = obj;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f234100a) {
            case 0:
                vu4 vu4Var = (vu4) this.f234101b;
                bji bjiVar = vu4Var.f244861b;
                if (bjiVar != null) {
                    return (vu4) bjiVar.mo29483e(new pt4(vu4Var, 9));
                }
                return null;
            case 1:
                Logger.m3969e("[WebSocket] Closing channel flow.", new Object[0]);
                try {
                    yvu0 yvu0Var = ((zu4) this.f234101b).f286340e;
                    if (yvu0Var != null) {
                        zuu0 zuu0Var = yvu0Var.f276758h;
                        wj50.m88279p(zuu0Var);
                        zuu0Var.cancel();
                        break;
                    }
                    return w2a1.f247311a;
                } finally {
                    ((zu4) this.f234101b).f286340e = null;
                }
            case 2:
                av4 av4Var = (av4) this.f234101b;
                bji bjiVar2 = av4Var.f20091b;
                if (bjiVar2 != null) {
                    return (av4) bjiVar2.mo29483e(new pt4(av4Var, 10));
                }
                return null;
            case 3:
                bv4 bv4Var = (bv4) this.f234101b;
                bji bjiVar3 = bv4Var.f31271b;
                if (bjiVar3 != null) {
                    return (bv4) bjiVar3.mo29483e(new pt4(bv4Var, 11));
                }
                return null;
            case 4:
                cv4 cv4Var = (cv4) this.f234101b;
                bji bjiVar4 = cv4Var.f42289b;
                if (bjiVar4 != null) {
                    return (cv4) bjiVar4.mo29483e(new pt4(cv4Var, 12));
                }
                return null;
            case 5:
                dv4 dv4Var = (dv4) this.f234101b;
                bji bjiVar5 = dv4Var.f53358b;
                if (bjiVar5 != null) {
                    return (dv4) bjiVar5.mo29483e(new pt4(dv4Var, 13));
                }
                return null;
            case 6:
                ev4 ev4Var = (ev4) this.f234101b;
                bji bjiVar6 = ev4Var.f63137c;
                if (bjiVar6 != null) {
                    return (ev4) bjiVar6.mo29483e(new pt4(ev4Var, 14));
                }
                return null;
            case 7:
                gv4 gv4Var = (gv4) this.f234101b;
                bji bjiVar7 = gv4Var.f84605b;
                if (bjiVar7 != null) {
                    return (gv4) bjiVar7.mo29483e(new pt4(gv4Var, 15));
                }
                return null;
            case 8:
                hv4 hv4Var = (hv4) this.f234101b;
                wy91 wy91Var = hv4Var.f95581b;
                if (wy91Var != null) {
                    return (hv4) wy91Var.mo29483e(new pt4(hv4Var, 16));
                }
                return null;
            case 9:
                jv4 jv4Var = (jv4) this.f234101b;
                bji bjiVar8 = jv4Var.f116250j;
                if (bjiVar8 != null) {
                    return (jv4) bjiVar8.mo29483e(new pt4(jv4Var, 17));
                }
                return null;
            case 10:
                kv4 kv4Var = (kv4) this.f234101b;
                wy91 wy91Var2 = kv4Var.f126773b;
                if (wy91Var2 != null) {
                    return (kv4) wy91Var2.mo29483e(new pt4(kv4Var, 18));
                }
                return null;
            case 11:
                lv4 lv4Var = (lv4) this.f234101b;
                wy91 wy91Var3 = lv4Var.f137217b;
                if (wy91Var3 != null) {
                    return (lv4) wy91Var3.mo29483e(new pt4(lv4Var, 19));
                }
                return null;
            case 12:
                mv4 mv4Var = (mv4) this.f234101b;
                bji bjiVar9 = mv4Var.f147509b;
                if (bjiVar9 != null) {
                    return (mv4) bjiVar9.mo29483e(new pt4(mv4Var, 20));
                }
                return null;
            case 13:
                xv4 xv4Var = (xv4) this.f234101b;
                bji bjiVar10 = xv4Var.f266272f;
                if (bjiVar10 != null) {
                    return (xv4) bjiVar10.mo29483e(new pt4(xv4Var, 21));
                }
                return null;
            case 14:
                yv4 yv4Var = (yv4) this.f234101b;
                bji bjiVar11 = yv4Var.f276564b;
                if (bjiVar11 != null) {
                    return (yv4) bjiVar11.mo29483e(new pt4(yv4Var, 22));
                }
                return null;
            case 15:
                aw4 aw4Var = (aw4) this.f234101b;
                bji bjiVar12 = aw4Var.f20376i;
                if (bjiVar12 != null) {
                    return (aw4) bjiVar12.mo29483e(new pt4(aw4Var, 23));
                }
                return null;
            case 16:
                c791 c791Var = (c791) this.f234101b;
                Object objMo38160Z0 = c791Var.f34827a.mo38160Z0();
                fbv fbvVar = fbv.f67905c;
                return Boolean.valueOf(objMo38160Z0 == fbvVar && c791Var.f34830d.getValue() == fbvVar);
            case 17:
                return (RecyclerView) ((gb5) this.f234101b).f78193a.findViewById(R.id.icons_view);
            case 18:
                return BehaviorSubject.m23796g(((kb5) this.f234101b).m55931a());
            case 19:
                ((SingleEmitter) this.f234101b).onSuccess(ma5.f141463a);
                return w2a1.f247311a;
            case 20:
                lv31 lv31VarEdit = ((wh70) ((vh70) ((tb5) this.f234101b).f218756b)).f251273a.edit();
                lv31VarEdit.m60053f(wh70.f251272b);
                lv31VarEdit.m60054g();
                return w2a1.f247311a;
            case 21:
                zb5 zb5Var = (zb5) this.f234101b;
                if (wj50.m88271j((qg5) ((h240) ((z140) zb5Var.f281248e)).f86886c.getValue(), pg5.f177228a)) {
                    Logger.m3965a("Quasar scopes are exited, app is idle, Stopping ForegroundKeeperService.", new Object[0]);
                    Context context = zb5Var.f281245b;
                    n200 n200Var = (n200) zb5Var.f281247d;
                    n200Var.getClass();
                    context.stopService(new Intent(n200Var.f149576a.getApplicationContext(), (Class<?>) ForegroundKeeperService.class));
                } else {
                    Logger.m3965a("App is still active, not stopping ForegroundKeeperService as scopes will re-enter.", new Object[0]);
                }
                return w2a1.f247311a;
            case 22:
                return (kv91) ((rc5) this.f234101b).f197731a.get();
            case 23:
                ((we5) this.f234101b).f250443i.getValue();
                return w2a1.f247311a;
            case 24:
                ((k5m0) ((pgq0) this.f234101b).f177386c).mo55546f();
                return w2a1.f247311a;
            case 25:
                rg5 rg5Var = (rg5) this.f234101b;
                rg5Var.f198833b.mo31986a(rg5Var);
                return w2a1.f247311a;
            case 26:
                ai5 ai5Var = (ai5) this.f234101b;
                bji bjiVar13 = ai5Var.f15886c;
                if (bjiVar13 != null) {
                    return (ai5) bjiVar13.mo29483e(new pt4(ai5Var, 25));
                }
                return null;
            case 27:
                bi5 bi5Var = (bi5) this.f234101b;
                wy91 wy91Var4 = bi5Var.f27336b;
                if (wy91Var4 != null) {
                    return (bi5) wy91Var4.mo29483e(new pt4(bi5Var, 26));
                }
                return null;
            case 28:
                ci5 ci5Var = (ci5) this.f234101b;
                bji bjiVar14 = ci5Var.f38224l;
                if (bjiVar14 != null) {
                    return (ci5) bjiVar14.mo29483e(new pt4(ci5Var, 27));
                }
                return null;
            default:
                gi5 gi5Var = (gi5) this.f234101b;
                bji bjiVar15 = gi5Var.f80069s;
                if (bjiVar15 != null) {
                    return (gi5) bjiVar15.mo29483e(new pt4(gi5Var, 28));
                }
                return null;
        }
    }
}
