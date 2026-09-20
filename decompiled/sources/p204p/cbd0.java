package p204p;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.C0068b;
import androidx.media3.exoplayer.video.C0069c;

/* JADX INFO: loaded from: classes3.dex */
public final class cbd0 implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final Handler f36095a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0068b f36096b;

    public cbd0(C0068b c0068b, qad0 qad0Var) {
        this.f36096b = c0068b;
        Handler handlerM46330r = h0b1.m46330r(this);
        this.f36095a = handlerM46330r;
        qad0Var.mo28883d(this, handlerM46330r);
    }

    /* JADX INFO: renamed from: a */
    public final void m32156a(long j) {
        Surface surface;
        C0068b c0068b = this.f36096b;
        bka1 bka1Var = c0068b.f1062j2;
        if (this != c0068b.f1055X2 || c0068b.f239241m1 == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            c0068b.f239212U1 = true;
            return;
        }
        try {
            c0068b.m85065T0(j);
            k9c1 k9c1Var = c0068b.f1050S2;
            if (!k9c1Var.equals(k9c1.f120559d) && !k9c1Var.equals(c0068b.f1051T2)) {
                c0068b.f1051T2 = k9c1Var;
                bka1Var.m29662n(k9c1Var);
            }
            c0068b.f239216W1.f94497e++;
            C0069c c0069c = c0068b.f1065m2;
            boolean z = c0069c.f1083e != 3;
            c0069c.f1083e = 3;
            c0069c.f1089k.getClass();
            c0069c.f1085g = h0b1.m46295W(SystemClock.elapsedRealtime());
            if (z && (surface = c0068b.f1034C2) != null) {
                Handler handler = (Handler) bka1Var.f27887b;
                if (handler != null) {
                    handler.post(new vpo(bka1Var, surface, SystemClock.elapsedRealtime(), 3));
                }
                c0068b.f1037F2 = true;
            }
            c0068b.mo855y0(j);
        } catch (ExoPlaybackException e) {
            c0068b.f239214V1 = e;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        String str = h0b1.f86200a;
        m32156a(((((long) i) & 4294967295L) << 32) | (4294967295L & ((long) i2)));
        return true;
    }
}
