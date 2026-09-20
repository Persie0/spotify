package p204p;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.View;
import com.google.protobuf.Empty;
import com.spotify.proactiveplatforms.npvwidget.NpvWidgetProvider;
import com.spotify.widgets.npvwidget.WidgetUpdateCoordinator;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class ccj0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36421a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f36422b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ccj0(Object obj, int i) {
        super(0);
        this.f36421a = i;
        this.f36422b = obj;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        int i = this.f36421a;
        int i2 = 26;
        int i3 = 0;
        fbk fbkVar = null;
        int i4 = 1;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj = this.f36422b;
        switch (i) {
            case 0:
                ((dcj0) obj).f47571d.mo55546f();
                return w2a1Var;
            case 1:
                luk lukVar = ((pcj0) obj).f176141d;
                x461 x461VarM64613f = njg1.m64613f();
                lukVar.getClass();
                return opo.m67570t(lukVar, x461VarM64613f);
            case 2:
                luk lukVar2 = ((tcj0) obj).f219092c;
                x461 x461VarM64613f2 = njg1.m64613f();
                lukVar2.getClass();
                return opo.m67570t(lukVar2, x461VarM64613f2);
            case 3:
                ((fdj0) obj).f68514d.mo55548j();
                return w2a1Var;
            case 4:
                ((pdj0) obj).f176472d.mo55548j();
                return w2a1Var;
            case 5:
                jgj0 jgj0Var = new jgj0((ofj0) obj);
                jgj0Var.m53302g(true);
                return jgj0Var;
            case 6:
                return ((yfj0) obj).f272274d;
            case 7:
                return ((dgj0) obj).m35925H1();
            case 8:
                okj0 okj0Var = (okj0) obj;
                jke jkeVar = (jke) okj0Var.f166380a;
                int i5 = 8;
                return new vjz(new r1a(new tjz(new xif0(i5, gyf1.m46146l(xtm0.m92105z((hb11) jkeVar.f113293d, new nzx0(new lw2(jkeVar, fbkVar, i4)), bzf1.m31020l((hb11) okj0Var.f166383d)), 500L), okj0Var), new aw0(okj0Var, fbkVar, 17)), new ta1(okj0Var, fbkVar, 20), i5), new rph0(okj0Var, fbkVar, i2));
            case 9:
                bnj0 bnj0Var = (bnj0) obj;
                wqb wqbVar = bnj0Var.f28871h1;
                wj50.m88279p(wqbVar);
                bnj0Var.m30011R0(wqbVar, bnj0Var.f28870g1);
                return w2a1Var;
            case 10:
                clb clbVar = (clb) obj;
                pwj0 pwj0Var = (pwj0) clbVar.f39232c;
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 26) {
                    if (i6 >= 26) {
                        fz6.m43163s(pwj0Var.f182068b, "NOTIFICATION_CHANNEL_DEFAULT");
                    } else {
                        pwj0Var.getClass();
                    }
                    if (((s54) clbVar.f39231b).m77230l()) {
                        if (i6 >= 26) {
                            fz6.m43163s(pwj0Var.f182068b, "NOTIFICATION_CHANNEL_MESSAGES");
                        } else {
                            pwj0Var.getClass();
                        }
                    }
                }
                return w2a1Var;
            case 11:
                izj0 izj0Var = (izj0) obj;
                Map map = izj0Var.f107242e;
                q0k0 q0k0Var = izj0Var.f107241d;
                Object obj2 = map.get(q0k0Var.f184020b);
                if (obj2 != null) {
                    return (eyj0) obj2;
                }
                throw new IllegalArgumentException(("No NotificationOptInConfig registered for key " + q0k0Var.f184020b).toString());
            case 12:
                return (cq6) obj;
            case 13:
                eh00 eh00Var = (eh00) ((C2636z3) obj).f278723b;
                if (eh00Var != null) {
                    eh00Var.invoke();
                }
                return w2a1Var;
            case 14:
                return nxf1.m65842u(((hak0) obj).f89236d);
            case 15:
                ((sx4) obj).removeAllViews();
                return w2a1Var;
            case 16:
                return ((mck0) obj).f142180G1.mo24361d();
            case 17:
                return ((rck0) obj).f197886g.mo24361d();
            case 18:
                efk0 efk0Var = ((vck0) obj).f240151D1;
                if (efk0Var != null) {
                    return new dfk0(efk0Var.f59064d.incrementAndGet());
                }
                wj50.m88260d0("nowPlayingVisibilityStateUpdater");
                throw null;
            case 19:
                return (kv91) ((i4t0) ((dii0) obj).f49377b).get();
            case 20:
                kek0 kek0Var = (kek0) obj;
                return kek0Var.f121906b.mo31750k() instanceof yzq0 ? new View(kek0Var.f121907c) : kek0Var.f121905a;
            case 21:
                tek0 tek0Var = (tek0) obj;
                Flowable flowable = tek0Var.f219732c;
                d0k[] d0kVarArr = bmu0.f28619a;
                fiz fizVarM62953p = mvl0.m62953p(new onc(flowable));
                hvi0 hvi0Var = cks.f39079b;
                return bzf1.m31029u(new b7g0(mvl0.m62953p(new prb0(gyf1.m46147m(fizVarM62953p, jwg1.m54449D(100, ils.MILLISECONDS)), i4)), 24), n5h1.m63737m(tek0Var.f219730a), hf11.m47320a(3, 0L), null);
            case 22:
                yk0 yk0Var = (yk0) obj;
                Context context = (Context) yk0Var.f273514c;
                Intent intent = new Intent((Context) yk0Var.f273514c, (Class<?>) WidgetUpdateCoordinator.class);
                intent.setAction("com.spotify.widgets.widgets.ACTION_USER_LOGOUT");
                context.sendBroadcast(intent);
                return w2a1Var;
            case 23:
                er70 er70Var = ((NpvWidgetProvider) obj).f183374d;
                if (er70Var != null) {
                    return kkc0.m56706s0(((dtd1) er70Var.get()).f52801a);
                }
                wj50.m88260d0("bitmapCache");
                throw null;
            case 24:
                b301 b301VarMo25827d = ((afq0) ((ye90) obj).f271943b).mo25827d();
                C2275q c2275q = new C2275q();
                c2275q.f183869b = EmptyDisposable.f7220a;
                c2275q.f183869b = ((C2048kd) b301VarMo25827d.f22764g.f251777b).callStream("spotify.connectivity.auth.esperanto.proto.Session", "apPermanentError", Empty.m1933n()).map(hvi0.f95723L0).map(lxz0.f137920a).subscribe(C2234p.f172407b);
                return c2275q;
            case 25:
                return new C2515w((xdd0) ((uik0) obj).invoke(), i3);
            case 26:
                return new C2510vv(new xt3(true, (saw0) ((mik0) obj).invoke()));
            case 27:
                return new C2515w((ja0) ((yjk0) obj).invoke());
            case 28:
                return new C2275q((Set) ((ejk0) obj).invoke());
            default:
                return new C2515w((g261) ((ekk0) obj).invoke());
        }
    }
}
