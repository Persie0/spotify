package p204p;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class h12 implements o9c {

    /* JADX INFO: renamed from: a */
    public boolean f86405a;

    /* JADX INFO: renamed from: b */
    public final Object f86406b;

    /* JADX INFO: renamed from: c */
    public final Object f86407c;

    /* JADX INFO: renamed from: d */
    public final Object f86408d;

    /* JADX INFO: renamed from: e */
    public Object f86409e;

    /* JADX INFO: renamed from: f */
    public Object f86410f;

    /* JADX INFO: renamed from: g */
    public Object f86411g;

    /* JADX INFO: renamed from: h */
    public Object f86412h;

    /* JADX INFO: renamed from: i */
    public Object f86413i;

    /* JADX INFO: renamed from: j */
    public Object f86414j;

    public /* synthetic */ h12(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, boolean z) {
        this.f86406b = obj;
        this.f86407c = obj2;
        this.f86408d = obj3;
        this.f86409e = obj4;
        this.f86410f = obj5;
        this.f86411g = obj6;
        this.f86412h = obj7;
        this.f86413i = obj8;
        this.f86414j = obj9;
        this.f86405a = z;
    }

    /* JADX INFO: renamed from: c */
    public static o0a0 m46375c(w2n0 w2n0Var, long j, long j2) {
        n0a0 n0a0Var = new n0a0(w2n0Var.f247391a, w2n0Var.f247392b, j);
        nz41 nz41Var = w2n0Var.f247394d;
        n0a0Var.f148955d = nz41Var.f159997c;
        n0a0Var.f148956e = nz41Var.f159998d;
        n0a0Var.f148957f = j2;
        n0a0Var.f148958g = nz41Var.f159996b;
        return new o0a0(n0a0Var);
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ t040 m46376d(h12 h12Var) {
        return (t040) h12Var.f86410f;
    }

    /* JADX INFO: renamed from: f */
    public static Object m46377f(h12 h12Var, String str, boolean z, String str2, g530 g530Var) {
        return h12Var.mo46378b(str, kaa0.f120848a, false, z, str2, null, false, null, g530Var);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:57:0x010b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0119  */
    /* JADX WARN: Code duplicated, block: B:66:0x012e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x012f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0027  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Throwable, p.o2x0] */
    @Override // p204p.o9c
    /* JADX INFO: renamed from: b */
    public Object mo46378b(String str, kaa0 kaa0Var, boolean z, boolean z2, String str2, String str3, boolean z3, String str4, ibk ibkVar) throws IOException {
        q9c q9cVar;
        int i;
        Object obj;
        h12 h12Var;
        Object c6x0Var;
        ?? r6;
        Throwable thM77348a;
        o2x0 o2x0Var;
        o2x0 o2x0Var2;
        r530 r530Var;
        kaa0 kaa0Var2 = kaa0Var;
        boolean z4 = z3;
        rb5 rb5Var = (rb5) this.f86409e;
        xre xreVar = (xre) this.f86407c;
        xp4 xp4Var = (xp4) this.f86412h;
        if (ibkVar instanceof q9c) {
            q9cVar = (q9c) ibkVar;
            int i2 = q9cVar.f186563f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q9cVar.f186563f = i2 - Integer.MIN_VALUE;
            } else {
                q9cVar = new q9c(this, ibkVar);
            }
        } else {
            q9cVar = new q9c(this, ibkVar);
        }
        Object objM69370a = q9cVar.f186561d;
        int i3 = q9cVar.f186563f;
        if (i3 == 0) {
            bga.m29073P(objM69370a);
            try {
                p9c p9cVar = (p9c) this.f86406b;
                String strM79916h = ((t2n) this.f86414j).m79916h();
                ((wy3) xreVar).getClass();
                String id = TimeZone.getDefault().getID();
                String strM46379e = m46379e(z2, kaa0Var2);
                String strM85812s = ((t9k) this.f86411g).f218321a.m85812s();
                String strM50615A = ihf1.m50615A(ihf1.m50636t());
                boolean zM91624j = xp4Var.m91624j();
                String str5 = xp4Var.m91632n() ? str3 : null;
                Boolean boolValueOf = Boolean.valueOf(e0b1.m37490b((Context) this.f86413i));
                if (!xp4Var.m91601V()) {
                    boolValueOf = null;
                }
                Boolean bool = z4 ? Boolean.TRUE : null;
                q9cVar.f186558a = kaa0Var2;
                q9cVar.f186559b = this;
                q9cVar.f186560c = z4;
                q9cVar.f186563f = 1;
                obj = null;
                i = 1;
                try {
                    objM69370a = p9cVar.m69370a(strM46379e, strM85812s, zM91624j, str5, boolValueOf, str, strM79916h, id, z, strM50615A, str2, bool, str4, q9cVar);
                    yuk yukVar = yuk.f276404a;
                    if (objM69370a == yukVar) {
                        return yukVar;
                    }
                    h12Var = this;
                    obj = obj;
                    c6x0Var = (o2x0) objM69370a;
                    r6 = obj;
                } catch (Throwable th) {
                    th = th;
                    h12Var = this;
                    c6x0Var = new c6x0(th);
                    r6 = obj;
                    if (!(c6x0Var instanceof c6x0)) {
                        o2x0Var2 = (o2x0) c6x0Var;
                        rb5Var.m75148F(o2x0Var2, r6);
                        if (!z4) {
                            q530 q530Var = (q530) this.f86410f;
                            if (bga.m29065H(o2x0Var2)) {
                                r530Var = new r530(i);
                            } else {
                                r530Var = new r530(i);
                            }
                            q530Var.mo40805i(r530Var);
                        }
                    }
                    thM77348a = s6x0.m77348a(c6x0Var);
                    if (thM77348a != null) {
                        rb5Var.m75148F(r6, thM77348a);
                    }
                    bga.m29073P(c6x0Var);
                    o2x0Var = (o2x0) c6x0Var;
                    h12Var.getClass();
                    if (o2x0Var.f161171a.f149852O0) {
                        return o2x0Var;
                    }
                    n2x0 n2x0Var = o2x0Var.f161171a;
                    throw new IOException(ikc0.m50939k("HTTP ", " ", n2x0Var.f149860d, n2x0Var.f149859c));
                }
            } catch (Throwable th2) {
                th = th2;
                i = 1;
                obj = null;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z5 = q9cVar.f186560c;
            h12 h12Var2 = q9cVar.f186559b;
            kaa0 kaa0Var3 = q9cVar.f186558a;
            try {
                bga.m29073P(objM69370a);
                h12Var = h12Var2;
                obj = null;
                z4 = z5;
                kaa0Var2 = kaa0Var3;
                i = 1;
                try {
                    c6x0Var = (o2x0) objM69370a;
                    r6 = obj;
                } catch (Throwable th3) {
                    th = th3;
                    c6x0Var = new c6x0(th);
                    r6 = obj;
                }
            } catch (Throwable th4) {
                th = th4;
                h12Var = h12Var2;
                obj = null;
                z4 = z5;
                kaa0Var2 = kaa0Var3;
                i = 1;
                c6x0Var = new c6x0(th);
                r6 = obj;
                if (!(c6x0Var instanceof c6x0)) {
                    o2x0Var2 = (o2x0) c6x0Var;
                    rb5Var.m75148F(o2x0Var2, r6);
                    if (!z4) {
                        q530 q530Var2 = (q530) this.f86410f;
                        if (bga.m29065H(o2x0Var2)) {
                            r530Var = new r530(i);
                        } else {
                            r530Var = new r530(i);
                        }
                        q530Var2.mo40805i(r530Var);
                    }
                }
                thM77348a = s6x0.m77348a(c6x0Var);
                if (thM77348a != null) {
                    rb5Var.m75148F(r6, thM77348a);
                }
                bga.m29073P(c6x0Var);
                o2x0Var = (o2x0) c6x0Var;
                h12Var.getClass();
                if (o2x0Var.f161171a.f149852O0) {
                    return o2x0Var;
                }
                n2x0 n2x0Var2 = o2x0Var.f161171a;
                throw new IOException(ikc0.m50939k("HTTP ", " ", n2x0Var2.f149860d, n2x0Var2.f149859c));
            }
        }
        if (!(c6x0Var instanceof c6x0)) {
            o2x0Var2 = (o2x0) c6x0Var;
            rb5Var.m75148F(o2x0Var2, r6);
            if (!z4) {
                q530 q530Var3 = (q530) this.f86410f;
                if (bga.m29065H(o2x0Var2) || kaa0Var2 == kaa0.f120848a) {
                    r530Var = new r530(i);
                } else {
                    r530Var = new r530(2);
                }
                q530Var3.mo40805i(r530Var);
            }
        }
        thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null && !(thM77348a instanceof CancellationException)) {
            rb5Var.m75148F(r6, thM77348a);
        }
        bga.m29073P(c6x0Var);
        o2x0Var = (o2x0) c6x0Var;
        h12Var.getClass();
        if (o2x0Var.f161171a.f149852O0) {
            return o2x0Var;
        }
        n2x0 n2x0Var3 = o2x0Var.f161171a;
        throw new IOException(ikc0.m50939k("HTTP ", " ", n2x0Var3.f149860d, n2x0Var3.f149859c));
    }

    /* JADX INFO: renamed from: e */
    public String m46379e(boolean z, kaa0 kaa0Var) {
        if (this.f86405a) {
            b3b b3bVar = b3b.f22994n;
            b3bVar.getClass();
            return z520.m95444x(b3bVar);
        }
        if (((z430) ((w430) this.f86408d)).f279107a.mo48713h(z430.f279106b, false)) {
            return "no-cache";
        }
        if (kaa0Var == kaa0.f120848a) {
            b3b b3bVar2 = b3b.f22995o;
            b3bVar2.getClass();
            return z520.m95444x(b3bVar2);
        }
        if (kaa0Var == kaa0.f120853f) {
            b3b b3bVar3 = b3b.f22994n;
            b3bVar3.getClass();
            return z520.m95444x(b3bVar3);
        }
        if (z || kaa0Var != kaa0.f120849b) {
            return "";
        }
        b3b b3bVar4 = b3b.f22995o;
        b3bVar4.getClass();
        return z520.m95444x(b3bVar4);
    }

    /* JADX INFO: renamed from: g */
    public void m46380g() {
        c95.m31855u(this.f86405a);
        Uri uri = (Uri) this.f86409e;
        uri.getClass();
        Uri.Builder builderBuildUpon = uri.buildUpon();
        dmu dmuVar = (dmu) this.f86410f;
        dmuVar.getClass();
        x43 x43Var = (x43) dmuVar.f50612b;
        c95.m31855u(x43Var.f257959b);
        for (Map.Entry entry : new TreeMap(xf40.m90455n("_HLS_pathway", (String) x43Var.f257956Y, "_HLS_throughput", String.valueOf(((at8) x43Var.f257962e).mo27126e()))).entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        Map map = Collections.EMPTY_MAP;
        Uri uriBuild = builderBuildUpon.build();
        uriBuild.getClass();
        w2n0 w2n0Var = new w2n0(((yaz) this.f86406b).mo30418p0(), new sjo(uriBuild, 0L, 1, null, map, 0L, -1L, null, 0, null), 8, new bx3(27));
        s1e1 s1e1Var = (s1e1) this.f86414j;
        s1e1Var.getClass();
        s1e1Var.m76959q(w2n0Var, (d501) this.f86407c, 0);
    }

    /* JADX INFO: renamed from: h */
    public Completable m46381h(final String str, final String str2, final long j, final d850 d850Var, final long j2, final long j3) {
        return this.f86405a ? ((ron0) this.f86413i).m76074b("episode-defaultplaypauseinteractor", Collections.singletonList(str2), false).map(new two(str2, 3)).onErrorReturnItem(g52.f76566a).flatMapCompletable(new Function() { // from class: p.oxp
            @Override // io.reactivex.rxjava3.functions.Function
            /* JADX INFO: renamed from: apply */
            public final Object mo98394apply(Object obj) {
                i52 i52Var = (i52) obj;
                boolean z = i52Var instanceof h52;
                h12 h12Var = this.f171477a;
                d850 d850Var2 = d850Var;
                if (!z) {
                    return h12Var.m46382i(str, str2, j, d850Var2, j2, j3);
                }
                int i = ((h52) i52Var).f87703a;
                h62 h62Var = (h62) h12Var.f86414j;
                n52 n52Var = new n52(i);
                i62 i62Var = (i62) h62Var;
                i62Var.getClass();
                i62Var.m49792c(new i92(n52Var), true, d850Var2, null);
                return CompletableEmpty.f7437a;
            }
        }) : m46382i(str, str2, j, d850Var, j2, j3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.spotify.player.model.command.options.SkipToTrack] */
    /* JADX WARN: Type inference failed for: r3v24, types: [com.google.protobuf.g, p.ilw] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX INFO: renamed from: i */
    public Completable m46382i(String str, String str2, long j, d850 d850Var, long j2, long j3) {
        Single singleM94144a;
        lyp lypVar = (lyp) this.f86409e;
        hrw hrwVar = (hrw) this.f86406b;
        d9p d9pVar = (d9p) this.f86410f;
        if (((PlayerState) this.f86412h).isPlaying()) {
            xul0 xul0VarTrack = ((PlayerState) this.f86412h).track();
            if (xul0VarTrack.mo49279c() && ((ContextTrack) xul0VarTrack.mo49278b()).uri().equals(str2) && j >= 0) {
                Single singleMo48412a = hrwVar.mo48412a(new z7p0(j));
                if (((PlayerState) this.f86412h).isPaused()) {
                    singleMo48412a = singleMo48412a.flatMap(new ori(hrwVar.mo48412a(new x7p0("episode-defaultplaypauseinteractor", false)), 20));
                }
                return Completable.m23288l(singleMo48412a);
            }
        }
        z650 z650Var = d850Var != null ? d850Var.f46380a : null;
        String str3 = z650Var != null ? z650Var.f279709a : "";
        Bundle bundle = ((m5w) d9pVar.f46870b).f140295b;
        String string = bundle != null ? bundle.getString("extra_playback_context_uri") : null;
        if (kgg1.m56363z(string)) {
            m2q0 m2q0Var = new m2q0(str, str2, j, str3, Long.valueOf(j2), Long.valueOf(j3));
            yxp yxpVar = lypVar.f138086d;
            r6q r6qVar = yxpVar.f277295c;
            if (yxpVar.f277296d.m57985c()) {
                vl11 vl11VarM74868a = r6qVar.m74868a(str2);
                Set set = dd41.f47702f;
                String strM35710h = r46.m74726U(str).m35710h();
                o6w o6wVar = new o6w(str2);
                Integer num = vl11VarM74868a.f242360o;
                if (num == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                singleM94144a = yxpVar.f277294b.m42042a(new sl11(strM35710h, new p6w(o6wVar, num.intValue()), 0, null, vl11VarM74868a.f242347b, vl11VarM74868a.f242348c, vl11VarM74868a.f242352g, 130732)).map(ket.f121957W0);
            } else {
                yl11 yl11Var = yxpVar.f277293a;
                Set set2 = dd41.f47702f;
                singleM94144a = yl11Var.m94144a(r46.m74726U(str).m35710h(), r6qVar.m74868a(str2));
            }
            return singleM94144a.map(new z4n(27, yxpVar, str)).cache().observeOn(lypVar.f138087e).flatMapCompletable(new kyp(m2q0Var, lypVar, m2q0Var));
        }
        if (!((Boolean) this.f86407c).booleanValue()) {
            Bundle bundle2 = ((m5w) d9pVar.f46870b).f140295b;
            String string2 = bundle2 != null ? bundle2.getString("extra_playback_row_id") : null;
            boolean z = ((m5w) d9pVar.f46870b).f140302i;
            lypVar.getClass();
            ?? Build = string2 != null ? SkipToTrack.builder().pageIndex(0L).trackUid(string2).trackIndex(0L).build() : null;
            com.spotify.player.model.Context contextFromUri = com.spotify.player.model.Context.fromUri(string);
            PreparePlayOptions preparePlayOptionsM70488a = poo0.m70488a(Build, j, null, z, 4);
            bho0 bho0Var = lypVar.f138084b;
            wj50.m88279p(contextFromUri);
            PlayCommand.Builder builderOptions = PlayCommand.builder(contextFromUri, bho0Var.f27222a).options(preparePlayOptionsM70488a);
            builderOptions.loggingParams(lypVar.m60261a(str3));
            return lypVar.f138083a.m83821a(builderOptions.build()).ignoreElement();
        }
        cgp cgpVar = (cgp) this.f86408d;
        z650 z650Var2 = z650Var;
        Bundle bundle3 = ((m5w) d9pVar.f46870b).f140295b;
        i6w i6wVar = new i6w(string, bundle3 != null ? bundle3.getString("extra_playback_row_id") : null, j, z650Var2);
        d9p d9pVar2 = cgpVar.f37754a;
        if (d9pVar2.m35383d() == null || !(d9pVar2.m35383d() instanceof st80)) {
            throw new IllegalStateException("Attempting to play using a playlist without passing the PlaylistEndpoint.Configuration. Did you forget to pass it to the Episode fragment?");
        }
        SkipToTrack skipToTrackBuild = SkipToTrack.builder().trackUid(i6wVar.f99340b).build();
        ?? M17768t = EsLoggingParams$LoggingParams.m17768t();
        z650 z650Var3 = i6wVar.f99342d;
        String str4 = z650Var3 != null ? z650Var3.f279709a : null;
        if (str4 == null) {
            str4 = "";
        }
        M17768t.m51043m(str4);
        kbm0 kbm0Var = cgpVar.f37758e.get();
        Object obj = kbm0Var != null ? kbm0Var.f121231a : null;
        M17768t.m51044q(obj != null ? obj : "");
        umw umwVarM17777q = EsOptional$OptionalInt64.m17777q();
        ((wy3) cgpVar.f37756c).getClass();
        umwVarM17777q.m83492m(System.currentTimeMillis());
        M17768t.m51047t(umwVarM17777q);
        return g0b1.m43282x(cgpVar.f37759f, new fol(10, cgpVar, i6wVar, skipToTrackBuild, (EsLoggingParams$LoggingParams) M17768t.build(), null));
    }

    public h12(c12 c12Var, n95 n95Var, koc0 koc0Var, boolean z, jiz jizVar, luk lukVar, ofm0 ofm0Var) {
        this.f86406b = c12Var;
        this.f86407c = n95Var;
        this.f86408d = koc0Var;
        this.f86405a = z;
        this.f86409e = jizVar;
        this.f86410f = new t040(ofm0Var.mo15684j0(q040.class));
        this.f86414j = kk40.m56661c(opo.m67570t(njg1.m64613f(), lukVar).mo26608y(new g12(efy.f59152X0, 0)));
    }

    public h12(p9c p9cVar, xre xreVar, w430 w430Var, rb5 rb5Var, q530 q530Var, t9k t9kVar, boolean z, xp4 xp4Var, Context context, ajp0 ajp0Var, t2n t2nVar) {
        this.f86406b = p9cVar;
        this.f86407c = xreVar;
        this.f86408d = w430Var;
        this.f86409e = rb5Var;
        this.f86410f = q530Var;
        this.f86411g = t9kVar;
        this.f86405a = z;
        this.f86412h = xp4Var;
        this.f86413i = context;
        this.f86414j = t2nVar;
    }

    public h12(d9p d9pVar, hrw hrwVar, PlayOrigin playOrigin, uqw uqwVar, bho0 bho0Var, ron0 ron0Var, h62 h62Var, boolean z, kun kunVar, rpn rpnVar, Flowable flowable, Scheduler scheduler) {
        this.f86411g = new iwr();
        new iwr();
        this.f86412h = PlayerState.EMPTY;
        this.f86408d = kunVar.m57408a(d9pVar, playOrigin);
        son sonVar = rpnVar.f201618a.f285186b;
        nbm0 nbm0Var = (nbm0) sonVar.f212263me.get();
        aqn aqnVar = sonVar.f211919a;
        this.f86409e = new lyp(uqwVar, bho0Var, nbm0Var, new yxp((yl11) aqnVar.f18508a.f211509Kp.get(), (fm11) aqnVar.f18477W1.get(), new r6q(), aqnVar.m26861f(), new dm4((bji) aqnVar.f18508a.f212567y1.get()).m36394a(), aqnVar.m26861f().m57983a()), (Scheduler) sonVar.f212489v1.get());
        this.f86410f = d9pVar;
        this.f86406b = hrwVar;
        this.f86407c = Boolean.valueOf(hc1.m47086o(d9pVar));
        flowable.m23332L(scheduler);
        this.f86413i = ron0Var;
        this.f86414j = h62Var;
        this.f86405a = z;
    }

    public h12(yaz yazVar) {
        this.f86406b = yazVar;
        this.f86407c = new d501(this, 11);
        this.f86408d = new kh61(new Handler(h0b1.m46276D(), null));
    }
}
