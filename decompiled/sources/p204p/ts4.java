package p204p;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.os.Looper;
import android.view.Choreographer;
import com.spotify.playbacknative.AudioDriver;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ts4 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f223205a;

    public /* synthetic */ ts4(int i) {
        this.f223205a = i;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        Class<?> returnType;
        Choreographer choreographer;
        switch (this.f223205a) {
            case 0:
                if (p1m0.m68830k()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    n5q n5qVar = xsr.f265651a;
                    choreographer = (Choreographer) x0h1.m89579v(pvb0.f181680a, new us4(0));
                }
                wj50.m88279p(choreographer);
                xs4 xs4Var = new xs4(choreographer, grl0.m45545r(Looper.getMainLooper()));
                return cct.m32296A(xs4Var, xs4Var.f265472Y);
            case 1:
                wy41 wy41Var = l39.f129237a;
                return null;
            case 2:
                return w8f.m87461f(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, AudioDriver.SPOTIFY_MAX_VOLUME);
            case 3:
                wy41 wy41Var2 = w8f.f248921a;
                return Boolean.TRUE;
            case 4:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 5:
                try {
                    String[] strArr = z900.f280631b;
                    Method methodM66931j = oh5.m66931j();
                    if (methodM66931j == null || (returnType = methodM66931j.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 6:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 7:
                bns bnsVar = eo40.f61293a;
                return zbp.f281355b;
            case 8:
                wy41 wy41Var3 = qz40.f194111a;
                return null;
            case 9:
                q630 q630Var = s850.f206556a;
                return Boolean.TRUE;
            case 10:
                return new ybs(48);
            case 11:
                wy41 wy41Var4 = raa0.f197244a;
                return mm6.f145055a;
            case 12:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 13:
                wy41 wy41Var5 = qea0.f187869a;
                return d7f0.f46177k1;
            case 14:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 15:
                wy41 wy41Var6 = p3d0.f173616a;
                return Boolean.FALSE;
            case 16:
                uty.m83964c();
                return w1i0.f247104a;
            case 17:
                return new a2m0();
            case 18:
                return new qgx0();
            case 19:
                wy41 wy41Var7 = g8y0.f77630a;
                return null;
            case 20:
                bns bnsVar2 = vnz0.f243278a;
                return null;
            case 21:
                return q0f1.m71825R(btz0.m30496T(btz0.m30477A(stz0.m79355i())));
            case 22:
                return q0f1.m71825R(btz0.m30496T(btz0.m30477A(stz0.m79359m())));
            case 23:
                return new hi01(ih01.f102099a, ih01.f102100b, ih01.f102101c, ih01.f102102d, ih01.f102104f);
            case 24:
                return yp91.f274882a;
            case 25:
                return tbq.m80406a();
            default:
                return new qp91(xp91.m91656d(), xp91.m91657e(), xp91.m91658f(), xp91.m91659g(), xp91.m91660h(), xp91.m91661i(), xp91.m91665m(), xp91.m91666n(), xp91.m91667o(), xp91.m91653a(), xp91.m91654b(), xp91.m91655c(), xp91.m91662j(), xp91.m91663k(), xp91.m91664l());
        }
    }
}
