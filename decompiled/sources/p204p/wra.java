package p204p;

import android.util.CloseGuard;
import android.view.autofill.AutofillValue;
import com.spotify.player.model.AudioStream;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Function;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wra implements f5y, egy, Function {

    /* JADX INFO: renamed from: b */
    public static final wra f254298b = new wra(0);

    /* JADX INFO: renamed from: c */
    public static final wra f254299c = new wra(1);

    /* JADX INFO: renamed from: d */
    public static final wra f254300d = new wra(2);

    /* JADX INFO: renamed from: e */
    public static final wra f254301e = new wra(3);

    /* JADX INFO: renamed from: f */
    public static final wra f254302f = new wra(4);

    /* JADX INFO: renamed from: g */
    public static final wra f254303g = new wra(5);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f254304a;

    public /* synthetic */ wra(int i) {
        this.f254304a = i;
    }

    /* JADX INFO: renamed from: e */
    public static /* bridge */ /* synthetic */ CloseGuard m88813e(Object obj) {
        return (CloseGuard) obj;
    }

    /* JADX INFO: renamed from: f */
    public static /* bridge */ /* synthetic */ AutofillValue m88814f(Object obj) {
        return (AutofillValue) obj;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        PlayerState playerState = (PlayerState) obj;
        if (!playerState.isPlaying() || playerState.isPaused()) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(playerState.audioStream() == AudioStream.ALARM);
    }

    /* JADX INFO: renamed from: b */
    public Object m88827b(Object obj, Object obj2) {
        l3n l3nVar = (l3n) obj;
        switch (this.f254304a) {
            case 11:
                esq esqVar = (esq) obj2;
                l3nVar.getClass();
                esqVar.getClass();
                kq80 kq80Var = esqVar.f62457e;
                jg31.m53271i(kq80Var);
                return new zx2(kq80Var, new en2(8));
            case 12:
                esq esqVar2 = (esq) obj2;
                l3nVar.getClass();
                esqVar2.getClass();
                kq80 kq80Var2 = esqVar2.f62457e;
                jg31.m53271i(kq80Var2);
                return new zx2(kq80Var2, new zy2(0));
            default:
                l3nVar.getClass();
                ((srq) obj2).getClass();
                return new o03(0);
        }
    }

    /* JADX INFO: renamed from: c */
    public List m88828c(String str, boolean z, boolean z2) {
        return zad0.m95776f(str, z, z2);
    }

    @Override // p204p.f5y
    /* JADX INFO: renamed from: g */
    public c5y[] mo25402g() {
        switch (this.f254304a) {
            case 6:
                return new c5y[]{new C2008ja()};
            case 7:
                return new c5y[]{new C2083la()};
            case 8:
            default:
                return new c5y[]{new fp3(0)};
            case 9:
                return new c5y[]{new c22(0)};
        }
    }

    @Override // p204p.egy
    /* JADX INFO: renamed from: i */
    public void mo25404i(boolean z) {
        if (z) {
            zwe zweVar = zwe.f286964a;
            if (p2l.f173365a.contains(zwe.class)) {
                return;
            }
            try {
                zwe.f286969f.set(true);
                return;
            } catch (Throwable th) {
                p2l.m68953a(zwe.class, th);
                return;
            }
        }
        zwe zweVar2 = zwe.f286964a;
        if (p2l.f173365a.contains(zwe.class)) {
            return;
        }
        try {
            zwe.f286969f.set(false);
        } catch (Throwable th2) {
            p2l.m68953a(zwe.class, th2);
        }
    }
}
