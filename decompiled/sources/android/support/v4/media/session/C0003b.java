package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import androidx.media3.session.legacy.MediaControllerCompat;
import androidx.media3.session.legacy.MediaSessionCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p204p.hv30;
import p204p.ikc0;
import p204p.mbd0;
import p204p.nfb1;
import p204p.xtm0;

/* JADX INFO: renamed from: android.support.v4.media.session.b */
/* JADX INFO: loaded from: classes.dex */
public class C0003b {

    /* JADX INFO: renamed from: a */
    public final MediaController f47a;

    /* JADX INFO: renamed from: b */
    public final Object f48b = new Object();

    /* JADX INFO: renamed from: c */
    public final ArrayList f49c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final HashMap f50d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final MediaSessionCompat$Token f51e;

    public C0003b(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f51e = mediaSessionCompat$Token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) mediaSessionCompat$Token.f22b);
        this.f47a = mediaController;
        if (mediaSessionCompat$Token.m34c() == null) {
            mediaController.sendCommand(MediaControllerCompat.COMMAND_GET_EXTRA_BINDER, null, new ResultReceiver(this) { // from class: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver

                /* JADX INFO: renamed from: a */
                public final WeakReference f16a;

                {
                    super(null);
                    this.f16a = new WeakReference(this);
                }

                @Override // android.os.ResultReceiver
                public final void onReceiveResult(int i, Bundle bundle) {
                    InterfaceC0002a interfaceC0002a;
                    C0003b c0003b = (C0003b) this.f16a.get();
                    if (c0003b == null || bundle == null) {
                        return;
                    }
                    synchronized (c0003b.f48b) {
                        try {
                            MediaSessionCompat$Token mediaSessionCompat$Token2 = c0003b.f51e;
                            IBinder binder = bundle.getBinder(MediaSessionCompat.KEY_EXTRA_BINDER);
                            int i2 = BinderC0004c.f52l;
                            if (binder == null) {
                                interfaceC0002a = null;
                            } else {
                                IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0002a)) {
                                    hv30 hv30Var = new hv30();
                                    hv30Var.f95579a = binder;
                                    interfaceC0002a = hv30Var;
                                } else {
                                    interfaceC0002a = (InterfaceC0002a) iInterfaceQueryLocalInterface;
                                }
                            }
                            synchronized (mediaSessionCompat$Token2.f21a) {
                                mediaSessionCompat$Token2.f23c = interfaceC0002a;
                            }
                            MediaSessionCompat$Token mediaSessionCompat$Token3 = c0003b.f51e;
                            nfb1 nfb1VarM92098s = xtm0.m92098s(bundle);
                            synchronized (mediaSessionCompat$Token3.f21a) {
                                mediaSessionCompat$Token3.f24d = nfb1VarM92098s;
                            }
                            ArrayList arrayList = c0003b.f49c;
                            if (c0003b.f51e.m34c() != null) {
                                Iterator it = arrayList.iterator();
                                if (it.hasNext()) {
                                    ikc0.m50942n(it.next());
                                    c0003b.f50d.put(null, new mbd0());
                                    throw null;
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }
    }
}
