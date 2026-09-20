package p204p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class owj0 implements Handler.Callback, ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final Context f170723a;

    /* JADX INFO: renamed from: b */
    public final Handler f170724b;

    /* JADX INFO: renamed from: c */
    public final HashMap f170725c = new HashMap();

    /* JADX INFO: renamed from: d */
    public HashSet f170726d = new HashSet();

    public owj0(Context context) {
        this.f170723a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f170724b = new Handler(handlerThread.getLooper(), this);
    }

    /* JADX INFO: renamed from: a */
    public final void m68170a(nwj0 nwj0Var) {
        boolean z;
        ArrayDeque arrayDeque = nwj0Var.f159225d;
        ComponentName componentName = nwj0Var.f159222a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
            arrayDeque.size();
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (nwj0Var.f159223b) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f170723a;
            boolean zBindService = context.bindService(component, this, 33);
            nwj0Var.f159223b = zBindService;
            if (zBindService) {
                nwj0Var.f159226e = 0;
            } else {
                Objects.toString(componentName);
                context.unbindService(this);
            }
            z = nwj0Var.f159223b;
        }
        if (!z || nwj0Var.f159224c == null) {
            m68172c(nwj0Var);
            return;
        }
        while (true) {
            lwj0 lwj0Var = (lwj0) arrayDeque.peek();
            if (lwj0Var == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    lwj0Var.toString();
                }
                lwj0Var.m60124a(nwj0Var.f159224c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Objects.toString(componentName);
                }
            } catch (RemoteException unused2) {
                Objects.toString(componentName);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        m68172c(nwj0Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m68171b(lwj0 lwj0Var) {
        this.f170724b.obtainMessage(0, lwj0Var).sendToTarget();
    }

    /* JADX INFO: renamed from: c */
    public final void m68172c(nwj0 nwj0Var) {
        ComponentName componentName = nwj0Var.f159222a;
        ArrayDeque arrayDeque = nwj0Var.f159225d;
        Handler handler = this.f170724b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = nwj0Var.f159226e;
        int i2 = i + 1;
        nwj0Var.f159226e = i2;
        if (i2 <= 6) {
            Log.isLoggable("NotifManCompat", 3);
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << i) * 1000);
        } else {
            arrayDeque.size();
            Objects.toString(componentName);
            arrayDeque.clear();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        qv30 qv30Var = null;
        if (i == 0) {
            lwj0 lwj0Var = (lwj0) message.obj;
            String string = Settings.Secure.getString(this.f170723a.getContentResolver(), "enabled_notification_listeners");
            synchronized (pwj0.f182062c) {
                if (string != null) {
                    try {
                        if (!string.equals(pwj0.f182063d)) {
                            String[] strArrSplit = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            pwj0.f182064e = hashSet2;
                            pwj0.f182063d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = pwj0.f182064e;
            }
            if (!hashSet.equals(this.f170726d)) {
                this.f170726d = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.f170723a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            componentName.toString();
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet3) {
                    if (!this.f170725c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(componentName2);
                        }
                        this.f170725c.put(componentName2, new nwj0(componentName2));
                    }
                }
                Iterator it = this.f170725c.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(entry.getKey());
                        }
                        nwj0 nwj0Var = (nwj0) entry.getValue();
                        if (nwj0Var.f159223b) {
                            this.f170723a.unbindService(this);
                            nwj0Var.f159223b = false;
                        }
                        nwj0Var.f159224c = null;
                        it.remove();
                    }
                }
            }
            for (nwj0 nwj0Var2 : this.f170725c.values()) {
                nwj0Var2.f159225d.add(lwj0Var);
                m68170a(nwj0Var2);
            }
        } else if (i == 1) {
            mwj0 mwj0Var = (mwj0) message.obj;
            ComponentName componentName3 = mwj0Var.f147800a;
            IBinder iBinder = mwj0Var.f147801b;
            nwj0 nwj0Var3 = (nwj0) this.f170725c.get(componentName3);
            if (nwj0Var3 != null) {
                int i2 = pv30.f181588a;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(qv30.f192860h);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof qv30)) {
                        ov30 ov30Var = new ov30();
                        ov30Var.f170414a = iBinder;
                        qv30Var = ov30Var;
                    } else {
                        qv30Var = (qv30) iInterfaceQueryLocalInterface;
                    }
                }
                nwj0Var3.f159224c = qv30Var;
                nwj0Var3.f159226e = 0;
                m68170a(nwj0Var3);
                return true;
            }
        } else if (i == 2) {
            nwj0 nwj0Var4 = (nwj0) this.f170725c.get((ComponentName) message.obj);
            if (nwj0Var4 != null) {
                if (nwj0Var4.f159223b) {
                    this.f170723a.unbindService(this);
                    nwj0Var4.f159223b = false;
                }
                nwj0Var4.f159224c = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            nwj0 nwj0Var5 = (nwj0) this.f170725c.get((ComponentName) message.obj);
            if (nwj0Var5 != null) {
                m68170a(nwj0Var5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.f170724b.obtainMessage(1, new mwj0(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.f170724b.obtainMessage(2, componentName).sendToTarget();
    }
}
