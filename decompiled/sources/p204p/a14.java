package p204p;

import android.os.Handler;
import android.os.Looper;
import com.spotify.base.java.logging.Logger;
import com.spotify.fitness.workoutimpl.domain.effecthandlers.CueAudioPlaybackCancelledException;

/* JADX INFO: loaded from: classes2.dex */
public final class a14 implements d0m {

    /* JADX INFO: renamed from: f */
    public static final xs6 f11316f;

    /* JADX INFO: renamed from: a */
    public final kix f11317a;

    /* JADX INFO: renamed from: b */
    public final Handler f11318b;

    /* JADX INFO: renamed from: c */
    public gjx f11319c;

    /* JADX INFO: renamed from: d */
    public volatile hqb f11320d;

    /* JADX INFO: renamed from: e */
    public volatile x04 f11321e;

    static {
        C2120ma c2120ma = new C2120ma();
        c2120ma.m61235c(1);
        c2120ma.m61240h(12);
        f11316f = c2120ma.m61233a();
    }

    public a14(kix kixVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f11317a = kixVar;
        this.f11318b = handler;
    }

    /* JADX INFO: renamed from: a */
    public static final void m24416a(a14 a14Var) {
        gjx gjxVar;
        hqb hqbVar = a14Var.f11320d;
        x04 x04Var = a14Var.f11321e;
        if (hqbVar == null && x04Var == null) {
            return;
        }
        a14Var.f11320d = null;
        a14Var.f11321e = null;
        if (x04Var != null && (gjxVar = a14Var.f11319c) != null) {
            gjxVar.mo43850O(x04Var);
        }
        if (hqbVar != null && hqbVar.isActive()) {
            hqbVar.resumeWith(new c6x0(new CueAudioPlaybackCancelledException()));
        }
        gjx gjxVar2 = a14Var.f11319c;
        if (gjxVar2 != null) {
            gjxVar2.stop();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m24417b(a14 a14Var, x04 x04Var, hqb hqbVar, Exception exc) {
        Logger.m3967c(exc, "AndroidCueAudioPlayer playback failed", new Object[0]);
        a14Var.m24418c(x04Var, true);
        if (hqbVar.isActive()) {
            hqbVar.resumeWith(new c6x0(exc));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m24418c(x04 x04Var, boolean z) {
        gjx gjxVar;
        if (this.f11321e != x04Var) {
            return;
        }
        this.f11320d = null;
        this.f11321e = null;
        gjx gjxVar2 = this.f11319c;
        if (gjxVar2 != null) {
            gjxVar2.mo43850O(x04Var);
        }
        if (z && (gjxVar = this.f11319c) != null) {
            gjxVar.stop();
        }
        gjx gjxVar3 = this.f11319c;
        if (gjxVar3 != null) {
            gjxVar3.mo43905s(xs6.f265509i, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m24419d(byte[] bArr, m07 m07Var) {
        v8s0 v8s0VarMo771a = new u8s0(new qgj0(bArr, 17)).mo771a(ufd0.m82983d("bytes:///cue.mp3"));
        hqb hqbVar = new hqb(1, seg1.m77914f(m07Var));
        hqbVar.m48222q();
        m24420e(new C2255pg(hqbVar, this, v8s0VarMo771a, 11));
        Object objM48221p = hqbVar.m48221p();
        return objM48221p == yuk.f276404a ? objM48221p : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: e */
    public final void m24420e(eh00 eh00Var) {
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = this.f11318b;
        if (wj50.m88271j(looperMyLooper, handler.getLooper())) {
            eh00Var.invoke();
        } else {
            handler.post(new z04(0, eh00Var));
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m24421f() {
        hqb hqbVar = this.f11320d;
        this.f11320d = null;
        if (hqbVar != null && hqbVar.isActive()) {
            hqbVar.resumeWith(new c6x0(new CueAudioPlaybackCancelledException()));
        }
        m24420e(new y04(this, 1));
    }
}
