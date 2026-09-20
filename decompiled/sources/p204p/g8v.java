package p204p;

import android.app.Activity;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Single;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes6.dex */
public final class g8v implements dut {

    /* JADX INFO: renamed from: a */
    public final Activity f77593a;

    /* JADX INFO: renamed from: b */
    public final xeu f77594b;

    /* JADX INFO: renamed from: c */
    public final q831 f77595c;

    /* JADX INFO: renamed from: d */
    public final jrr f77596d;

    /* JADX INFO: renamed from: e */
    public final wxh0 f77597e = uuf1.m83999s(g1v.f75731Q0, null, null, new fyf(new iy6(this, 6), true, -890490296), 6);

    /* JADX INFO: renamed from: f */
    public final i5x f77598f = mhf1.m61771p(this).m94133b(ccu.f36632Z, ccu.f36616L0);

    /* JADX INFO: renamed from: g */
    public final cph f77599g;

    public g8v(Activity activity, xeu xeuVar, q831 q831Var, jrr jrrVar) {
        this.f77593a = activity;
        this.f77594b = xeuVar;
        this.f77595c = q831Var;
        this.f77596d = jrrVar;
        fyf fyfVar = qfg.f188199a;
        wpi0 wpi0Var = xwt.f266743a;
        this.f77599g = new cph(fyfVar, 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: e */
    public static final Object m43965e(g8v g8vVar, e8v e8vVar, ibk ibkVar) {
        f8v f8vVar;
        String strM35710h;
        q831 q831Var = g8vVar.f77595c;
        if (ibkVar instanceof f8v) {
            f8vVar = (f8v) ibkVar;
            int i = f8vVar.f67093c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f8vVar.f67093c = i - Integer.MIN_VALUE;
            } else {
                f8vVar = new f8v(g8vVar, ibkVar);
            }
        } else {
            f8vVar = new f8v(g8vVar, ibkVar);
        }
        Object objM96567o = f8vVar.f67091a;
        int i2 = f8vVar.f67093c;
        try {
            if (i2 == 0) {
                bga.m29073P(objM96567o);
                String str = e8vVar.f57283h;
                if (str != null) {
                    Set set = dd41.f47702f;
                    strM35710h = r46.m74726U(str).m35710h();
                } else {
                    strM35710h = null;
                }
                if (strM35710h == null) {
                    strM35710h = "";
                }
                Single<w8v> singleM90228a = ((x8v) g8vVar.f77594b.f260774b).m90228a(new t8v(strM35710h, e8vVar.f57281f));
                f8vVar.f67093c = 1;
                objM96567o = zn91.m96567o(singleM90228a, f8vVar);
                yuk yukVar = yuk.f276404a;
                if (objM96567o == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(objM96567o);
            }
            String str2 = ((w8v) objM96567o).f249016a;
            if (str2.length() > 0) {
                q831Var.m72305j(new g631(null, str2, null, null, null, null, null, null, false));
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            q831Var.m72305j(new g631(null, g8vVar.f77593a.getString(R.string.gated_content_bottom_sheet_engagement_error), null, null, null, null, null, null, false));
        }
        g8vVar.f77596d.dismiss();
        return w2a1.f247311a;
    }

    @Override // p204p.kzd1
    /* JADX INFO: renamed from: a */
    public final avt mo24358a() {
        return this.f77598f;
    }

    @Override // p204p.ry8
    /* JADX INFO: renamed from: c */
    public final pwt mo24359c() {
        return this.f77599g;
    }

    @Override // p204p.ry8
    public final uut getBehavior() {
        return this.f77597e;
    }
}
