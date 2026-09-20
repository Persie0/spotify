package p204p;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e651 extends ri00 implements eh00 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f56568h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e651(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f56568h = i4;
    }

    /* JADX WARN: Type inference failed for: r0v95, types: [java.lang.Iterable, java.lang.Object] */
    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f56568h) {
            case 0:
                ((f651) this.f78014b).getClass();
                return wr31.RECENTLY_PLAYED_OR_ADDED;
            case 1:
                ((f651) this.f78014b).getClass();
                return wr31.RECENTLY_PLAYED_OR_ADDED;
            case 2:
                ((f651) this.f78014b).getClass();
                return wr31.DATE;
            case 3:
                return ((f651) this.f78014b).m40829f().mo48713h(f651.f66269x, false) ? wr31.CUSTOM : wr31.RECENTLY_PLAYED_OR_ADDED;
            case 4:
                ((f651) this.f78014b).getClass();
                return wr31.RECENTLY_PLAYED_OR_ADDED;
            case 5:
                ((f651) this.f78014b).getClass();
                return wr31.RECENTLY_PLAYED_OR_ADDED;
            case 6:
                ((s461) this.f78014b).getClass();
                byte[] bArr = new byte[16];
                new SecureRandom().nextBytes(bArr);
                return bArr;
            case 7:
                ((sdm) this.f78014b).dispose();
                return w2a1.f247311a;
            case 8:
                xb81 xb81Var = (xb81) this.f78014b;
                xi8 xi8Var = new xi8(xb81Var.m49720s0());
                xi8Var.m91102m(xb81Var);
                xi8Var.m91095f();
                return w2a1.f247311a;
            case 9:
                ((tz60) this.f78014b).dispose();
                return w2a1.f247311a;
            case 10:
                ((Activity) this.f78014b).finish();
                return w2a1.f247311a;
            case 11:
                apa1 apa1Var = (apa1) this.f78014b;
                Activity activity = apa1Var.f17896d;
                if (apa1Var.f17898f == xf50.f260838a) {
                    activity.finish();
                } else {
                    activity.startActivity(new Intent().setComponent(new ComponentName(activity, "com.spotify.app.music.debugtools.menu.DebugMenuActivity")).addFlags(537001984));
                    activity.finish();
                }
                return w2a1.f247311a;
            case 12:
                ppa1 ppa1Var = (ppa1) this.f78014b;
                x0h1.m89578u(ppa1Var.f179998i, null, 0, new wm81(ppa1Var, null, 21), 3);
                return w2a1.f247311a;
            case 13:
                return ((ffx) this.f78014b).m41556a();
            case 14:
                qob1.m73386c((qob1) this.f78014b);
                return w2a1.f247311a;
            case 15:
                qob1.m73387d((qob1) this.f78014b);
                return w2a1.f247311a;
            case 16:
                qob1.m73386c((qob1) this.f78014b);
                return w2a1.f247311a;
            case 17:
                qob1.m73386c((qob1) this.f78014b);
                return w2a1.f247311a;
            case 18:
                qob1.m73387d((qob1) this.f78014b);
                return w2a1.f247311a;
            case 19:
                qob1.m73386c((qob1) this.f78014b);
                return w2a1.f247311a;
            case 20:
                qob1.m73386c((qob1) this.f78014b);
                return w2a1.f247311a;
            case 21:
                qob1.m73387d((qob1) this.f78014b);
                return w2a1.f247311a;
            case 22:
                ivb1 ivb1Var = (ivb1) this.f78014b;
                if (ivb1Var.f106185c) {
                    Object obj = ivb1Var.f106183a.get();
                    wj50.m88279p(obj);
                    return (gdk0) obj;
                }
                Object obj2 = ivb1Var.f106184b.get();
                wj50.m88279p(obj2);
                return (gdk0) obj2;
            case 23:
                ivb1 ivb1Var2 = (ivb1) this.f78014b;
                if (ivb1Var2.f106185c) {
                    Object obj3 = ivb1Var2.f106183a.get();
                    wj50.m88279p(obj3);
                    return (gdk0) obj3;
                }
                Object obj4 = ivb1Var2.f106184b.get();
                wj50.m88279p(obj4);
                return (gdk0) obj4;
            case 24:
                for (gde1 gde1Var : ((xmh0) this.f78014b).f263370b.f56382w) {
                    gde1Var.f78827c = false;
                    gde1Var.f78826b.dispose();
                }
                return w2a1.f247311a;
            case 25:
                return ((ffx) this.f78014b).m41556a();
            case 26:
                return ((ffx) this.f78014b).m41556a();
            case 27:
                ((tfd1) this.f78014b).f219929c.m38851a(cgd1.f37641a);
                return w2a1.f247311a;
            default:
                ((tfd1) this.f78014b).f219929c.m38851a(zfd1.f282287a);
                return w2a1.f247311a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e651() {
        super(0, px0.f182172g, s461.class, "defaultNonce", "defaultNonce()[B", 0, 0);
        this.f56568h = 6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e651(tz60 tz60Var) {
        super(0, tz60Var, tz60.class, "dispose", "dispose()V", 0, 0);
        this.f56568h = 9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e651(ppa1 ppa1Var) {
        super(0, ppa1Var, ppa1.class, "handleShakeDetected", "handleShakeDetected()V", 0, 0);
        this.f56568h = 12;
    }
}
