package p204p;

import android.content.Intent;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class kld0 extends zld0 {

    /* JADX INFO: renamed from: f */
    public final String f123863f;

    /* JADX INFO: renamed from: g */
    public final MediaRouter2.RoutingController f123864g;

    /* JADX INFO: renamed from: h */
    public final Messenger f123865h;

    /* JADX INFO: renamed from: i */
    public final Messenger f123866i;

    /* JADX INFO: renamed from: k */
    public final Handler f123868k;

    /* JADX INFO: renamed from: o */
    public tld0 f123872o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ old0 f123873p;

    /* JADX INFO: renamed from: j */
    public final SparseArray f123867j = new SparseArray();

    /* JADX INFO: renamed from: l */
    public final AtomicInteger f123869l = new AtomicInteger(1);

    /* JADX INFO: renamed from: m */
    public final ig10 f123870m = new ig10(this, 17);

    /* JADX INFO: renamed from: n */
    public int f123871n = -1;

    public kld0(old0 old0Var, MediaRouter2.RoutingController routingController, String str) {
        this.f123873p = old0Var;
        this.f123864g = routingController;
        this.f123863f = str;
        Messenger messengerM67285i = old0.m67285i(routingController);
        this.f123865h = messengerM67285i;
        this.f123866i = messengerM67285i == null ? null : new Messenger(new un6(this));
        this.f123868k = new Handler(Looper.getMainLooper());
    }

    @Override // p204p.amd0
    /* JADX INFO: renamed from: d */
    public final boolean mo26391d(Intent intent, smd0 smd0Var) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f123864g;
        if (routingController == null || routingController.isReleased() || (messenger = this.f123865h) == null) {
            return false;
        }
        int andIncrement = this.f123869l.getAndIncrement();
        Message messageObtain = Message.obtain();
        messageObtain.what = 9;
        messageObtain.arg1 = andIncrement;
        messageObtain.obj = intent;
        messageObtain.replyTo = this.f123866i;
        try {
            messenger.send(messageObtain);
            if (smd0Var == null) {
                return true;
            }
            this.f123867j.put(andIncrement, smd0Var);
            return true;
        } catch (DeadObjectException | RemoteException unused) {
            return false;
        }
    }

    @Override // p204p.amd0
    /* JADX INFO: renamed from: e */
    public final void mo26392e() {
        this.f123864g.release();
    }

    @Override // p204p.amd0
    /* JADX INFO: renamed from: g */
    public final void mo26394g(int i) {
        MediaRouter2.RoutingController routingController = this.f123864g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i);
        this.f123871n = i;
        Handler handler = this.f123868k;
        ig10 ig10Var = this.f123870m;
        handler.removeCallbacks(ig10Var);
        handler.postDelayed(ig10Var, 1000L);
    }

    @Override // p204p.amd0
    /* JADX INFO: renamed from: j */
    public final void mo26397j(int i) {
        MediaRouter2.RoutingController routingController = this.f123864g;
        if (routingController == null) {
            return;
        }
        int volume = this.f123871n;
        if (volume < 0) {
            volume = routingController.getVolume();
        }
        int iMax = Math.max(0, Math.min(volume + i, this.f123864g.getVolumeMax()));
        this.f123871n = iMax;
        this.f123864g.setVolume(iMax);
        Handler handler = this.f123868k;
        ig10 ig10Var = this.f123870m;
        handler.removeCallbacks(ig10Var);
        handler.postDelayed(ig10Var, 1000L);
    }

    @Override // p204p.zld0
    /* JADX INFO: renamed from: l */
    public final void mo39918l(String str) {
        MediaRoute2Info mediaRoute2InfoM67287j;
        if (str == null || str.isEmpty() || (mediaRoute2InfoM67287j = this.f123873p.m67287j(str)) == null) {
            return;
        }
        this.f123864g.selectRoute(mediaRoute2InfoM67287j);
    }

    @Override // p204p.zld0
    /* JADX INFO: renamed from: m */
    public final void mo39919m(String str) {
        MediaRoute2Info mediaRoute2InfoM67287j;
        if (str == null || str.isEmpty() || (mediaRoute2InfoM67287j = this.f123873p.m67287j(str)) == null) {
            return;
        }
        this.f123864g.deselectRoute(mediaRoute2InfoM67287j);
    }

    @Override // p204p.zld0
    /* JADX INFO: renamed from: n */
    public final void mo39920n(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        String str = (String) list.get(0);
        old0 old0Var = this.f123873p;
        MediaRoute2Info mediaRoute2InfoM67287j = old0Var.m67287j(str);
        if (mediaRoute2InfoM67287j == null) {
            return;
        }
        old0Var.f166832i.transferTo(mediaRoute2InfoM67287j);
    }

    /* JADX INFO: renamed from: p */
    public final String m56822p() {
        tld0 tld0Var = this.f123872o;
        return tld0Var != null ? tld0Var.m81050g() : this.f123864g.getId();
    }

    /* JADX INFO: renamed from: q */
    public final void m56823q(int i, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f123864g;
        if (routingController == null || routingController.isReleased() || (messenger = this.f123865h) == null) {
            return;
        }
        int andIncrement = this.f123869l.getAndIncrement();
        Message messageObtain = Message.obtain();
        messageObtain.what = 7;
        messageObtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        messageObtain.setData(bundle);
        messageObtain.replyTo = this.f123866i;
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException | RemoteException unused) {
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m56824r(int i, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f123864g;
        if (routingController == null || routingController.isReleased() || (messenger = this.f123865h) == null) {
            return;
        }
        int andIncrement = this.f123869l.getAndIncrement();
        Message messageObtain = Message.obtain();
        messageObtain.what = 8;
        messageObtain.arg1 = andIncrement;
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i);
        bundle.putString("routeId", str);
        messageObtain.setData(bundle);
        messageObtain.replyTo = this.f123866i;
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException | RemoteException unused) {
        }
    }
}
