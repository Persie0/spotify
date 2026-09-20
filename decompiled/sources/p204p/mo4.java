package p204p;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Movie;
import androidx.media3.session.legacy.PlaybackStateCompat;
import com.ravelin.core.repository.broadcastsdb.BroadcastsDatabase_Impl;
import com.ravelin.core.repository.p008db.AppDatabase_Impl;
import java.io.File;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mo4 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f145568a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f145569b;

    public /* synthetic */ mo4(Object obj, int i) {
        this.f145568a = i;
        this.f145569b = obj;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        c581 state;
        Bitmap.Config config;
        int largeMemoryClass;
        switch (this.f145568a) {
            case 0:
                hvg1.m48859l((no4) this.f145569b);
                return w2a1.f247311a;
            case 1:
                return ((p471) this.f145569b).data();
            case 2:
                return new k2f1((AppDatabase_Impl) this.f145569b);
            case 3:
                return new C2042k7((Object[]) this.f145569b, 1);
            case 4:
                return (j15) this.f145569b;
            case 5:
                return lh9.m58959b((lh9) this.f145569b);
            case 6:
                return Float.valueOf(((zda) this.f145569b).f281656a.f250668e.m96964F());
            case 7:
                return (tiv0) this.f145569b;
            case 8:
                return new zue((BroadcastsDatabase_Impl) this.f145569b);
            case 9:
                xkk0 xkk0Var = (xkk0) ((mve) this.f145569b).f147565b.get("fingerprint emitter");
                if (xkk0Var != null) {
                    xkk0Var.f262390d = true;
                }
                return w2a1.f247311a;
            case 10:
                return ((Iterable) this.f145569b).iterator();
            case 11:
                eh00 eh00Var = ((waf) this.f145569b).f249469k1;
                if (eh00Var != null) {
                    eh00Var.invoke();
                }
                return Boolean.TRUE;
            case 12:
                return Collections.singletonList((pqm0) this.f145569b);
            case 13:
                return ((c97) this.f145569b).mo31885g(":memory:");
            case 14:
                return new c871((vvl0) this.f145569b, 0.0f);
            case 15:
                return ((n480) this.f145569b).m63660d();
            case 16:
                return ((w8m) this.f145569b).m87465a();
            case 17:
                zwp zwpVar = (zwp) this.f145569b;
                zwpVar.f287025X0.mo52254i(new twp(6), new twp(7), new twp(8), new twp(9), new twp(10), new uwp(zwpVar, 2), new twp(11), new uwp(zwpVar, 3));
                return w2a1.f247311a;
            case 18:
                ((c571) this.f145569b).close();
                return w2a1.f247311a;
            case 19:
                b581 b581Var = ((sm91) this.f145569b).f210604o;
                return Float.valueOf((b581Var == null || (state = b581Var.getState()) == null) ? 0.0f : state.m31457a());
            case 20:
                return Float.valueOf(((qgs) this.f145569b).m72762a().mo35989Z0(igs.f102046b));
            case 21:
                dk5 dk5Var = ((q8u) this.f145569b).f186398i;
                if (dk5Var != null) {
                    return dk5Var;
                }
                wj50.m88260d0("emojiPickerItems");
                throw null;
            case 22:
                ((xnx) this.f145569b).invoke();
                return Boolean.TRUE;
            case 23:
                da00 da00Var = (da00) this.f145569b;
                String str = da00Var.f46947b;
                ca00 ca00Var = (str == null || !da00Var.f46949d) ? new ca00(da00Var.f46946a, da00Var.f46947b, new oyz(1), da00Var.f46948c, da00Var.f46950e) : new ca00(da00Var.f46946a, new File(da00Var.f46946a.getNoBackupFilesDir(), str).getAbsolutePath(), new oyz(1), da00Var.f46948c, da00Var.f46950e);
                ca00Var.setWriteAheadLoggingEnabled(da00Var.f46952g);
                return ca00Var;
            case 24:
                return ((xq00) this.f145569b).m91782o();
            case 25:
                yu00 yu00Var = (yu00) this.f145569b;
                boolean z = yu00Var.f276240b;
                w2a1 w2a1Var = w2a1.f247311a;
                if (z) {
                    Object objMo30231j = yu00Var.f276239a.mo30231j(w2a1Var);
                    if (objMo30231j instanceof tnc) {
                        if (!(objMo30231j instanceof snc)) {
                            throw new IllegalStateException("Trying to call 'getOrThrow' on a failed result of a non-closed channel");
                        }
                        Throwable th = ((snc) objMo30231j).f210878a;
                        if (th != null) {
                            throw th;
                        }
                        throw new IllegalStateException("Trying to call 'getOrThrow' on a channel closed without a cause");
                    }
                }
                return w2a1Var;
            case 26:
                fd10 fd10Var = (fd10) this.f145569b;
                vc40 vc40Var = fd10Var.f68294a;
                ivl0 ivl0Var = fd10Var.f68295b;
                vc40 vc40VarM78072p = sgg1.m78072p(vc40Var, true);
                try {
                    Movie movieDecodeStream = Movie.decodeStream(vc40VarM78072p.mo34165C1().mo45416H1());
                    mif1.m61875i(vc40VarM78072p, null);
                    if (movieDecodeStream == null || movieDecodeStream.width() <= 0 || movieDecodeStream.height() <= 0) {
                        throw new IllegalStateException("Failed to decode GIF.");
                    }
                    if (movieDecodeStream.isOpaque() && ((Boolean) zuj0.m97055r(ivl0Var, zb40.f281242g)).booleanValue()) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = n0b1.m63384x(zb40.m95822a(ivl0Var)) ? Bitmap.Config.ARGB_8888 : (Bitmap.Config) zuj0.m97055r(ivl0Var, zb40.f281237b);
                    }
                    y3i0 y3i0Var = new y3i0(movieDecodeStream, config, ivl0Var.f106234c);
                    skp skpVar = el51.f60595a;
                    if (((Number) zuj0.m97055r(ivl0Var, skpVar)).intValue() != -2) {
                        int iIntValue = ((Number) zuj0.m97055r(ivl0Var, skpVar)).intValue();
                        if (iIntValue < -1) {
                            throw new IllegalArgumentException(s571.m77246e(iIntValue, "Invalid repeatCount: ").toString());
                        }
                        y3i0Var.f268934O0 = iIntValue;
                    }
                    eh00 eh00Var2 = (eh00) zuj0.m97055r(ivl0Var, el51.f60597c);
                    eh00 eh00Var3 = (eh00) zuj0.m97055r(ivl0Var, el51.f60598d);
                    if (eh00Var2 != null || eh00Var3 != null) {
                        y3i0Var.f268945e.add(new a1b1(eh00Var2, eh00Var3));
                    }
                    if (zuj0.m97055r(ivl0Var, el51.f60596b) != null) {
                        throw new ClassCastException();
                    }
                    y3i0Var.f268935P0 = null;
                    y3i0Var.f268936Q0 = 1;
                    y3i0Var.f268937R0 = false;
                    y3i0Var.invalidateSelf();
                    return new zqo(ufc1.m82967e(y3i0Var), false);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        mif1.m61875i(vc40VarM78072p, th2);
                        throw th3;
                    }
                }
            case 27:
                fg30 fg30Var = (fg30) this.f145569b;
                fg30Var.getClass();
                try {
                    fg30Var.f69196V0.m64374h(2, 0, false);
                    break;
                } catch (IOException e) {
                    fg30Var.m41564a(2, 2, e);
                }
                return w2a1.f247311a;
            case 28:
                Context context = (Context) ((uoa) this.f145569b).f232366f;
                double d = 0.2d;
                try {
                    Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                    wj50.m88279p(systemService);
                    if (((ActivityManager) systemService).isLowRamDevice()) {
                        d = 0.15d;
                    }
                } catch (Exception unused) {
                }
                if (0.0d > d || d > 1.0d) {
                    throw new IllegalArgumentException("percent must be in the range [0.0, 1.0].");
                }
                sgz sgzVar = new sgz(5, (byte) 0);
                try {
                    Object systemService2 = context.getSystemService((Class<Object>) ActivityManager.class);
                    wj50.m88279p(systemService2);
                    ActivityManager activityManager = (ActivityManager) systemService2;
                    largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    break;
                } catch (Exception unused2) {
                    largeMemoryClass = 256;
                }
                return new mvu0(new tvu0((long) (d * ((long) largeMemoryClass) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED), sgzVar), sgzVar);
            default:
                return Float.valueOf(mkg1.m62158t(((xuk) this.f145569b).mo31960M()));
        }
    }

    public /* synthetic */ mo4(xnx xnxVar, mk31 mk31Var) {
        this.f145568a = 22;
        this.f145569b = xnxVar;
    }
}
