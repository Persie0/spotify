package p204p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import com.facebook.CustomTabActivity;
import com.facebook.CustomTabMainActivity;
import com.google.firebase.messaging.FirebaseMessaging;
import com.spotify.base.java.logging.Logger;
import com.spotify.storage.localstorage.DiskAlmostFullActivity;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class o4a extends BroadcastReceiver {

    /* JADX INFO: renamed from: c */
    public static o4a f161598c;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f161599a;

    /* JADX INFO: renamed from: b */
    public Object f161600b;

    public /* synthetic */ o4a(Object obj, int i) {
        this.f161599a = i;
        this.f161600b = obj;
    }

    /* JADX INFO: renamed from: a */
    public static final o4a m66236a() {
        if (p2l.f173365a.contains(o4a.class)) {
            return null;
        }
        try {
            return f161598c;
        } catch (Throwable th) {
            p2l.m68953a(o4a.class, th);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m66237b() {
        Log.isLoggable("FirebaseMessaging", 3);
        ((hg61) this.f161600b).f91053c.f2412b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public void finalize() throws Throwable {
        switch (this.f161599a) {
            case 0:
                Set set = p2l.f173365a;
                if (!set.contains(this)) {
                    try {
                        if (!set.contains(this)) {
                            try {
                                aba0.m25342a((Context) this.f161600b).m25345d(this);
                            } catch (Throwable th) {
                                p2l.m68953a(this, th);
                                return;
                            }
                            break;
                        }
                    } catch (Throwable th2) {
                        p2l.m68953a(this, th2);
                        return;
                    }
                }
                break;
            default:
                super.finalize();
                break;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        i3a i3aVar;
        KeyEvent keyEventM80900C;
        switch (this.f161599a) {
            case 0:
                if (!p2l.f173365a.contains(this)) {
                    try {
                        n95 n95Var = new n95(context, (String) null);
                        StringBuilder sb = new StringBuilder("bf_");
                        sb.append(intent != null ? intent.getStringExtra("event_name") : null);
                        String string = sb.toString();
                        Bundle bundleExtra = intent != null ? intent.getBundleExtra("event_args") : null;
                        Bundle bundle = new Bundle();
                        Set<String> setKeySet = bundleExtra != null ? bundleExtra.keySet() : null;
                        if (setKeySet != null) {
                            for (String str : setKeySet) {
                                bundle.putString(Pattern.compile("[ -]*$").matcher(Pattern.compile("^[ -]*").matcher(Pattern.compile("[^0-9a-zA-Z _-]").matcher(str).replaceAll("-")).replaceAll("")).replaceAll(""), (String) bundleExtra.get(str));
                            }
                        }
                        p8y p8yVar = p8y.f175080a;
                        if (dwa1.m37142c()) {
                            n95Var.m63907t(string, bundle);
                        }
                    } catch (Throwable th) {
                        p2l.m68953a(this, th);
                        return;
                    }
                    break;
                }
                break;
            case 1:
                hw3 hw3Var = (hw3) this.f161600b;
                hw3Var.f95848c.execute(new gw3(hw3Var, 2));
                break;
            case 2:
                ((AbstractC1895gf) this.f161600b).mo44559p();
                break;
            case 3:
                eu6 eu6Var = (eu6) this.f161600b;
                if (!isInitialStickyBroadcast()) {
                    eu6Var.m40034h(bu6.m30504b(context, intent, (xs6) eu6Var.f62886k, (AudioDeviceInfo) eu6Var.f62885j, eu6Var.m40033g()));
                }
                break;
            case 4:
                j3a j3aVar = (j3a) this.f161600b;
                if (wj50.m88271j(intent.getAction(), "android.bluetooth.adapter.action.STATE_CHANGED")) {
                    switch (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE)) {
                        case 10:
                            j3aVar.f108326c.getClass();
                            i3aVar = i3a.f98073a;
                            break;
                        case 11:
                            i3aVar = i3a.f98076d;
                            break;
                        case 12:
                            j3aVar.f108326c.getClass();
                            i3aVar = i3a.f98075c;
                            break;
                        case 13:
                            i3aVar = i3a.f98074b;
                            break;
                        default:
                            i3aVar = i3a.f98077e;
                            break;
                    }
                    j3aVar.f108327d.onNext(i3aVar);
                    break;
                }
                break;
            case 5:
                ((dla) this.f161600b).mo36351f(intent);
                break;
            case 6:
                ((fla) this.f161600b).f70732b.onNext(intent);
                break;
            case 7:
                ((fyb) this.f161600b).f74678Z.startQuery(42, null, fyb.f74675M0, new String[]{"CarConnectionState"}, null, null, null);
                break;
            case 8:
                ((CustomTabActivity) this.f161600b).finish();
                break;
            case 9:
                CustomTabMainActivity customTabMainActivity = (CustomTabMainActivity) this.f161600b;
                Intent intent2 = new Intent(customTabMainActivity, (Class<?>) CustomTabMainActivity.class);
                int i = CustomTabMainActivity.f1653c;
                intent2.setAction("CustomTabMainActivity.action_refresh");
                intent2.putExtra("CustomTabMainActivity.extra_url", intent.getStringExtra("CustomTabMainActivity.extra_url"));
                intent2.addFlags(603979776);
                customTabMainActivity.startActivity(intent2);
                break;
            case 10:
                jqr jqrVar = (jqr) this.f161600b;
                if (!jqrVar.f114950D1 && context != null) {
                    jqrVar.f114951E1 = true;
                    if (!"check_storage.diskspace.ok".equals(intent.getAction())) {
                        jqrVar.f114949C1 = new Intent(context, (Class<?>) DiskAlmostFullActivity.class);
                        khr khrVar = jqrVar.f194253A1;
                        if (khrVar != null) {
                            khrVar.m56452i1(jqrVar);
                            jqrVar.f114950D1 = true;
                        }
                        break;
                    }
                }
                break;
            case 11:
                mjx0.m62020X(intent, (sir0) this.f161600b);
                break;
            case 12:
                Logger.m3973i("Audio has become noisy - headset probably removed", new Object[0]);
                aed0 aed0Var = (aed0) this.f161600b;
                aed0Var.f14844e.m60127a(aed0Var.f14840a.m61227a().mo48412a(new u7p0("mediafocusmanagerplugin", true)).subscribe());
                break;
            case 13:
                if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (keyEventM80900C = ti5.m80900C(intent)) != null) {
                    ((pqd0) this.f161600b).f180275j.getController().dispatchMediaButtonEvent(keyEventM80900C);
                }
                break;
            case 14:
                ((Executor) ((jij0) this.f161600b).f112774c).execute(new mpd0(9, this, context));
                break;
            case 15:
                KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent != null) {
                    Logger.m3965a("[ALSM.FKS] MediaButtonActionHandlerApi: direct invocation", new Object[0]);
                    ((x9d0) ((clb) this.f161600b).f39233d).m90244c(keyEvent, new oh5());
                    break;
                }
                break;
            case 16:
                ((n890) this.f161600b).m63838i();
                break;
            case 17:
                if (!isInitialStickyBroadcast()) {
                    ((s18) this.f161600b).m76921d();
                }
                break;
            default:
                hg61 hg61Var = (hg61) this.f161600b;
                if (hg61Var != null && hg61Var.m47416a()) {
                    Log.isLoggable("FirebaseMessaging", 3);
                    hg61 hg61Var2 = (hg61) this.f161600b;
                    hg61Var2.f91053c.getClass();
                    FirebaseMessaging.m1892b(hg61Var2, 0L);
                    ((hg61) this.f161600b).f91053c.f2412b.unregisterReceiver(this);
                    this.f161600b = null;
                }
                break;
        }
    }

    public o4a(Context context) {
        this.f161599a = 0;
        this.f161600b = context.getApplicationContext();
    }

    public o4a(hg61 hg61Var) {
        this.f161599a = 18;
        this.f161600b = hg61Var;
    }
}
