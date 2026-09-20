package p204p;

import android.graphics.Region;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC0110a;
import com.spotify.adsdisplay.browser.BreadcrumbException;
import com.spotify.download.esperanto.proto.EsDownload$SegmentFileStreamerId;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.Restrictions;
import com.spotify.playlist.proto.C1203a;
import com.spotify.playlist.proto.ModificationRequest;
import com.spotify.recently_played_esperanto.proto.GetRecentlyPlayedTracksResponse;
import com.spotify.recently_played_esperanto.proto.RecentlyPlayedEntity;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class qst0 implements Function, InterfaceC2207oa, ant, BiFunction, udc1, y0m, orq0, w111 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f192184a;

    /* JADX INFO: renamed from: b */
    public final Object f192185b;

    public /* synthetic */ qst0(Object obj, int i) {
        this.f192184a = i;
        this.f192185b = obj;
    }

    @Override // p204p.orq0
    /* JADX INFO: renamed from: a */
    public pfm0 mo61278a() {
        return (pfm0) ((d6o) this.f192185b).f45804g1.get();
    }

    @Override // p204p.InterfaceC1698bb
    public boolean accept(Object obj) {
        switch (this.f192184a) {
            case 2:
                return ((xfp0) this.f192185b).f261054b && ((ihi) obj).f102295b;
            default:
                return ((ihi) obj).f102295b && ((pxi0) this.f192185b).f182311b;
        }
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        Object objInvoke;
        int i = this.f192184a;
        int i2 = 3;
        fbk fbkVar = null;
        int i3 = 1;
        Object obj2 = this.f192185b;
        switch (i) {
            case 1:
                return (dcv0) obj2;
            case 4:
                t6f0 t6f0Var = ((q3v0) obj2).f184972a;
                ae50 ae50VarM20237n = ((GetRecentlyPlayedTracksResponse) obj).m20237n();
                ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM20237n, 10));
                Iterator<E> it = ae50VarM20237n.iterator();
                while (it.hasNext()) {
                    arrayList.add(((RecentlyPlayedEntity) it.next()).m20271n().m20305o().getLink());
                }
                return t6f0Var.m80159a(arrayList);
            case 6:
                p2x0 p2x0Var = (p2x0) obj;
                agv0 agv0Var = new agv0((kz5) obj2, i3);
                if (p2x0Var instanceof k2x0) {
                    objInvoke = CompletableEmpty.f7437a;
                } else {
                    if (!(p2x0Var instanceof m2x0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objInvoke = agv0Var.invoke(((m2x0) p2x0Var).f139474a);
                }
                return (CompletableSource) objInvoke;
            case 9:
                PlayerState playerState = (PlayerState) obj;
                lvv0 lvv0Var = (lvv0) obj2;
                Set set = lvv0.f137407i;
                Restrictions restrictions = playerState.restrictions();
                if (zxc.m97189i(playerState) == 1 && !restrictions.disallowTogglingRepeatTrackReasons().isEmpty()) {
                    return wj50.m88271j(restrictions.disallowTogglingRepeatTrackReasons(), lvv0.f137407i) ? new CompletableFromAction(new jn10(19, lvv0Var, playerState)) : CompletableEmpty.f7437a;
                }
                int iM97189i = zxc.m97189i(playerState);
                int iM97195o = zxc.m97195o(iM97189i, playerState.restrictions());
                if (iM97189i != iM97195o) {
                    Completable completableIgnoreElement = lvv0Var.f137409b.setRepeatMode(iM97195o).ignoreElement();
                    wj50.m88279p(completableIgnoreElement);
                    return completableIgnoreElement;
                }
                CompletableEmpty completableEmpty = CompletableEmpty.f7437a;
                wj50.m88279p(completableEmpty);
                return completableEmpty;
            case 13:
                mz71 mz71Var = (mz71) ((s8w0) obj2).f206800b;
                Uri uri = Uri.parse(((bv90) obj).f31310a);
                jyx0 jyx0Var = mz71Var.f148639a;
                wj50.m88279p(uri);
                return jyx0Var.m54823b(uri).observeOn(mz71Var.f148641c).doOnSuccess(new s651(mz71Var, 7)).ignoreElement().m23307y();
            case 15:
                gqx gqxVar = (gqx) obj;
                xj11 xj11Var = (xj11) obj2;
                return new pqm0(gqxVar.mo45449a(ok11.class, xj11Var.f261993a), gqxVar.mo45449a(tu00.class, xj11Var.f261993a));
            case 16:
                throw new CompositeException((Throwable) obj, (BreadcrumbException) obj2);
            case 17:
                mlr mlrVar = (mlr) obj2;
                return vjf1.m85770t(dau.f47107a, new eka(x0h1.m89574q(mlrVar.f144911d, null, 0, new blv0(mlrVar, (ffs0) obj, fbkVar, 27), 3), fbkVar, i3)).flatMapObservable(alr0.f16974t).onErrorReturnItem(new fhs0(false));
            case 19:
                PlayerState playerState2 = (PlayerState) obj;
                if (hdi.m47210B(playerState2).equals("") && wj50.m88271j(playerState2.contextUri(), "")) {
                    return new kty0(bro0.f30124a);
                }
                String strM47210B = hdi.m47210B(playerState2);
                String strContextUri = playerState2.contextUri();
                ((vyr0) obj2).getClass();
                if (playerState2.isPlaying() && !playerState2.isPaused()) {
                    i2 = 2;
                } else if (!playerState2.isPlaying() || !playerState2.isPaused()) {
                    i2 = 1;
                }
                return new kty0(new jro0(strM47210B, strContextUri, i2));
            case 21:
                int iM9558o = ((EsDownload$SegmentFileStreamerId) obj).m9558o();
                Integer numValueOf = Integer.valueOf(iM9558o);
                ((agz0) obj2).f15563i = Integer.valueOf(iM9558o);
                return numValueOf;
            default:
                i431 i431Var = (i431) obj2;
                return i431Var.m49652k("reset", null, null).flatMapCompletable(new g431(i3, ((ty21) obj).f224813a, i431Var)).m23296h(hyx0.f96709R0).m23299p(Functions.f7232h).m23307y();
        }
    }

    @Override // p204p.udc1
    /* JADX INFO: renamed from: b */
    public int mo61124b(View view) {
        return AbstractC0110a.m1082Q(view) - ((ViewGroup.MarginLayoutParams) ((ojv0) view.getLayoutParams())).topMargin;
    }

    @Override // p204p.udc1
    /* JADX INFO: renamed from: c */
    public int mo61125c() {
        return ((AbstractC0110a) this.f192185b).getPaddingTop();
    }

    @Override // p204p.y0m
    public void clear() {
        ((ArrayList) this.f192185b).clear();
    }

    @Override // p204p.y0m
    /* JADX INFO: renamed from: d */
    public pf40 mo45063d(long j) {
        int iM73756o = m73756o(j);
        if (iM73756o == 0) {
            kf40 kf40Var = pf40.f176960b;
            return wsv0.f254763e;
        }
        z0m z0mVar = (z0m) ((ArrayList) this.f192185b).get(iM73756o - 1);
        long j2 = z0mVar.f278139d;
        if (j2 == -9223372036854775807L || j < j2) {
            return z0mVar.f278136a;
        }
        kf40 kf40Var2 = pf40.f176960b;
        return wsv0.f254763e;
    }

    @Override // p204p.y0m
    /* JADX INFO: renamed from: e */
    public long mo45064e(long j) {
        ArrayList arrayList = (ArrayList) this.f192185b;
        if (arrayList.isEmpty() || j < ((z0m) arrayList.get(0)).f278137b) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            long j2 = ((z0m) arrayList.get(i)).f278137b;
            if (j == j2) {
                return j2;
            }
            if (j < j2) {
                z0m z0mVar = (z0m) arrayList.get(i - 1);
                long j3 = z0mVar.f278139d;
                return (j3 == -9223372036854775807L || j3 > j) ? z0mVar.f278137b : j3;
            }
        }
        z0m z0mVar2 = (z0m) nhg1.m64500t(arrayList);
        long j4 = z0mVar2.f278139d;
        return (j4 == -9223372036854775807L || j < j4) ? z0mVar2.f278137b : j4;
    }

    @Override // p204p.y0m
    /* JADX INFO: renamed from: f */
    public long mo45065f(long j) {
        ArrayList arrayList = (ArrayList) this.f192185b;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < ((z0m) arrayList.get(0)).f278137b) {
            return ((z0m) arrayList.get(0)).f278137b;
        }
        for (int i = 1; i < arrayList.size(); i++) {
            z0m z0mVar = (z0m) arrayList.get(i);
            long j2 = z0mVar.f278137b;
            long j3 = z0mVar.f278137b;
            if (j < j2) {
                long j4 = ((z0m) arrayList.get(i - 1)).f278139d;
                return (j4 == -9223372036854775807L || j4 <= j || j4 >= j3) ? j3 : j4;
            }
        }
        long j5 = ((z0m) nhg1.m64500t(arrayList)).f278139d;
        if (j5 == -9223372036854775807L || j >= j5) {
            return Long.MIN_VALUE;
        }
        return j5;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    @Override // p204p.y0m
    /* JADX INFO: renamed from: g */
    public boolean mo45066g(z0m z0mVar, long j) {
        boolean z;
        ArrayList arrayList = (ArrayList) this.f192185b;
        long j2 = z0mVar.f278137b;
        c95.m31843i(j2 != -9223372036854775807L);
        if (j2 <= j) {
            long j3 = z0mVar.f278139d;
            if (j3 == -9223372036854775807L || j < j3) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j2 >= ((z0m) arrayList.get(size)).f278137b) {
                arrayList.add(size + 1, z0mVar);
                return z;
            }
            if (((z0m) arrayList.get(size)).f278137b <= j) {
                z = false;
            }
        }
        arrayList.add(0, z0mVar);
        return z;
    }

    @Override // p204p.udc1
    /* JADX INFO: renamed from: h */
    public int mo61127h() {
        AbstractC0110a abstractC0110a = (AbstractC0110a) this.f192185b;
        return abstractC0110a.f1289N0 - abstractC0110a.getPaddingBottom();
    }

    @Override // p204p.udc1
    /* JADX INFO: renamed from: i */
    public View mo61128i(int i) {
        return ((AbstractC0110a) this.f192185b).m1096H(i);
    }

    @Override // p204p.udc1
    /* JADX INFO: renamed from: j */
    public int mo61129j(View view) {
        return AbstractC0110a.m1078L(view) + ((ViewGroup.MarginLayoutParams) ((ojv0) view.getLayoutParams())).bottomMargin;
    }

    @Override // p204p.y0m
    /* JADX INFO: renamed from: k */
    public void mo45067k(long j) {
        ArrayList arrayList = (ArrayList) this.f192185b;
        int iM73756o = m73756o(j);
        if (iM73756o == 0) {
            return;
        }
        long j2 = ((z0m) arrayList.get(iM73756o - 1)).f278139d;
        if (j2 == -9223372036854775807L || j2 >= j) {
            iM73756o--;
        }
        arrayList.subList(0, iM73756o).clear();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p204p.w111
    /* JADX INFO: renamed from: l */
    public Object mo28227l(eo01 eo01Var, fbk fbkVar) throws Throwable {
        x511 x511Var;
        if (fbkVar instanceof x511) {
            x511Var = (x511) fbkVar;
            int i = x511Var.f258248d;
            if ((i & Integer.MIN_VALUE) != 0) {
                x511Var.f258248d = i - Integer.MIN_VALUE;
            } else {
                x511Var = new x511(this, (ibk) fbkVar);
            }
        } else {
            x511Var = new x511(this, (ibk) fbkVar);
        }
        Object objM89557A = x511Var.f258246b;
        int i2 = x511Var.f258248d;
        if (i2 == 0) {
            bga.m29073P(objM89557A);
            lu01 lu01Var = eo01Var.f61264a;
            if (lu01Var == null) {
                return null;
            }
            qr81 qr81Var = (qr81) this.f192185b;
            ir81 ir81Var = new ir81(lu01Var);
            x511Var.f258245a = eo01Var;
            x511Var.f258248d = 1;
            objM89557A = x0h1.m89557A(qr81Var.f191770g, new or81(ir81Var, qr81Var, null), x511Var);
            yuk yukVar = yuk.f276404a;
            if (objM89557A == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eo01Var = x511Var.f258245a;
            bga.m29073P(objM89557A);
        }
        zr01 zr01Var = (zr01) objM89557A;
        return new e211(zr01Var.f285503a, zr01Var.f285504b, fji.f70297b, eo01Var.f61266c.f129799a);
    }

    @Override // p204p.orq0
    /* JADX INFO: renamed from: m */
    public r4m0 mo61282m() {
        d6o d6oVar = (d6o) this.f192185b;
        wax0 wax0Var = (wax0) d6oVar.f45784a.f41043J.get();
        jg31.m53271i(wax0Var);
        return new hyy0(wax0Var, (w3o) d6oVar.f45840w.get(), (s4o) d6oVar.f45819l1.get(), (pfm0) d6oVar.f45804g1.get());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public Object m73755n(cjt cjtVar, ibk ibkVar) {
        ejw0 ejw0Var;
        if (ibkVar instanceof ejw0) {
            ejw0Var = (ejw0) ibkVar;
            int i = ejw0Var.f60315d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ejw0Var.f60315d = i - Integer.MIN_VALUE;
            } else {
                ejw0Var = new ejw0(this, ibkVar);
            }
        } else {
            ejw0Var = new ejw0(this, ibkVar);
        }
        Object obj = ejw0Var.f60313b;
        int i2 = ejw0Var.f60315d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ivw ivwVar = ejw0Var.f60312a;
            bga.m29073P(obj);
            return ivwVar;
        }
        bga.m29073P(obj);
        yz80 yz80Var = (yz80) this.f192185b;
        String str = cjtVar.f38685a;
        ivw ivwVar2 = ivw.f106292a;
        ejw0Var.f60312a = ivwVar2;
        ejw0Var.f60315d = 1;
        C1203a c1203aM18507s = ModificationRequest.Attributes.m18507s();
        c1203aM18507s.m18676s("");
        Object objM63323t = ((n090) yz80Var).m63323t(str, c1203aM18507s, ejw0Var);
        yuk yukVar = yuk.f276404a;
        return objM63323t == yukVar ? yukVar : ivwVar2;
    }

    /* JADX INFO: renamed from: o */
    public int m73756o(long j) {
        ArrayList arrayList = (ArrayList) this.f192185b;
        for (int i = 0; i < arrayList.size(); i++) {
            if (j < ((z0m) arrayList.get(i)).f278137b) {
                return i;
            }
        }
        return arrayList.size();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public Object m73757p(ibk ibkVar) {
        irv0 irv0Var;
        if (ibkVar instanceof irv0) {
            irv0Var = (irv0) ibkVar;
            int i = irv0Var.f105060c;
            if ((i & Integer.MIN_VALUE) != 0) {
                irv0Var.f105060c = i - Integer.MIN_VALUE;
            } else {
                irv0Var = new irv0(this, ibkVar);
            }
        } else {
            irv0Var = new irv0(this, ibkVar);
        }
        Object obj = irv0Var.f105058a;
        int i2 = irv0Var.f105060c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                e3p e3pVar = (e3p) this.f192185b;
                irv0Var.f105060c = 1;
                Object objM37658C = e3pVar.m37658C(irv0Var);
                yuk yukVar = yuk.f276404a;
                if (objM37658C == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return w2a1.f247311a;
        } catch (Throwable th) {
            return new c6x0(th);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m73758q(c450 c450Var) {
        ((Region) this.f192185b).set(c450Var.f33848a, c450Var.f33849b, c450Var.f33850c, c450Var.f33851d);
    }

    /* JADX INFO: renamed from: r */
    public void m73759r(clq0 clq0Var) {
        ((fvl0) this.f192185b).m42878a(new x4t0(7));
    }

    @Override // p204p.ant
    /* JADX INFO: renamed from: t */
    public void mo25099t(Object obj) {
        ((mou0) this.f192185b).f145746a.setBackgroundColor(((Number) obj).intValue());
    }

    public qst0(int i) {
        this.f192184a = i;
        switch (i) {
            case 23:
                this.f192185b = new Region();
                break;
            default:
                this.f192185b = new ArrayList();
                break;
        }
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        cav0 cav0Var;
        Map map = (Map) obj;
        iav0 iav0Var = (iav0) obj2;
        Set set = (Set) this.f192185b;
        int iM31820L = c95.m31820L(i6f.m49804T(set, 10));
        if (iM31820L < 16) {
            iM31820L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM31820L);
        for (Object obj3 : set) {
            String str = (String) obj3;
            y5f y5fVar = (y5f) map.get(str);
            if ((y5fVar != null && y5fVar.f269417a) || iav0Var.f100351a.containsKey(str)) {
                cav0Var = cav0.f35938b;
            } else {
                cav0Var = cav0.f35937a;
            }
            linkedHashMap.put(obj3, cav0Var);
        }
        return linkedHashMap;
    }
}
