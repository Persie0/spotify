package p204p;

import android.content.Intent;
import android.media.MediaCodec;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.session.legacy.MediaBrowserProtocol;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class un6 extends Handler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f232067a;

    /* JADX INFO: renamed from: b */
    public Object f232068b;

    public /* synthetic */ un6(Object obj, int i) {
        this.f232067a = i;
        this.f232068b = obj;
    }

    /* JADX INFO: renamed from: a */
    private final void m83526a(Message message) {
        m57 m57Var;
        Set set;
        Set set2;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i = message.what;
        if (i == 1) {
            iep iepVar = (iep) this.f232068b;
            p7o p7oVar = iepVar.f101489c;
            if (obj == iepVar.f101486A) {
                if (iepVar.f101503q == 2 || iepVar.m50390k()) {
                    iepVar.f101486A = null;
                    if (obj2 instanceof Exception) {
                        p7oVar.m69293m((Exception) obj2, false);
                        return;
                    }
                    try {
                        iepVar.f101488b.mo53479f(((ycd0) obj2).f271462a);
                        p7oVar.f174732b = null;
                        HashSet hashSet = (HashSet) p7oVar.f174733c;
                        pf40 pf40VarM69791p = pf40.m69791p(hashSet);
                        hashSet.clear();
                        kf40 kf40VarListIterator = pf40VarM69791p.listIterator(0);
                        while (kf40VarListIterator.hasNext()) {
                            iep iepVar2 = (iep) kf40VarListIterator.next();
                            if (iepVar2.m50393n()) {
                                iepVar2.m50389j(true);
                            }
                        }
                        return;
                    } catch (Exception e) {
                        p7oVar.m69293m(e, true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        iep iepVar3 = (iep) this.f232068b;
        if (obj == iepVar3.f101511y && iepVar3.m50390k()) {
            iepVar3.f101511y = null;
            synchronized (iepVar3.f101502p) {
                k9u k9uVar = iepVar3.f101512z;
                k9uVar.getClass();
                m57Var = new m57(14);
                ((jf40) k9uVar.f120692b).m53150g();
                iepVar3.f101512z = null;
            }
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                iepVar3.m50392m((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = ((ycd0) obj2).f271462a;
                if (iepVar3.f101491e == 3) {
                    jix jixVar = iepVar3.f101488b;
                    byte[] bArr2 = iepVar3.f101510x;
                    String str = h0b1.f86200a;
                    jixVar.mo53484l(bArr2, bArr);
                    jrk jrkVar = iepVar3.f101495i;
                    synchronized (jrkVar.f115209a) {
                        set2 = jrkVar.f115211c;
                    }
                    Iterator it = set2.iterator();
                    while (it.hasNext()) {
                        ((ehs) it.next()).m38999b();
                    }
                    return;
                }
                byte[] bArrMo53484l = iepVar3.f101488b.mo53484l(iepVar3.f101509w, bArr);
                int i2 = iepVar3.f101491e;
                if ((i2 == 2 || (i2 == 0 && iepVar3.f101510x != null)) && bArrMo53484l != null && bArrMo53484l.length != 0) {
                    iepVar3.f101510x = bArrMo53484l;
                }
                iepVar3.f101503q = 4;
                jrk jrkVar2 = iepVar3.f101495i;
                synchronized (jrkVar2.f115209a) {
                    set = jrkVar2.f115211c;
                }
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    ((ehs) it2.next()).m38998a(m57Var);
                }
            } catch (Exception e2) {
                e = e2;
                iepVar3.m50392m(e, true);
            } catch (NoSuchMethodError e3) {
                e = e3;
                iepVar3.m50392m(e, true);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m83527b(Runnable runnable) {
        if (Thread.currentThread() == getLooper().getThread()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m83528c() {
        this.f232068b = null;
    }

    /* JADX WARN: Code duplicated, block: B:211:0x0447  */
    /* JADX WARN: Code duplicated, block: B:219:0x0452 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:235:0x044a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [p.fbk] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        vn6 vn6Var;
        ArrayDeque arrayDeque;
        int size;
        ia70[] ia70VarArr;
        xpo xpoVar;
        int iM91711j;
        jod0 jod0Var;
        iod0 iod0Var;
        un6 un6Var;
        String string;
        ?? r7 = 0;
        r7 = 0;
        r7 = 0;
        r7 = 0;
        r7 = 0;
        r7 = 0;
        int i = 0;
        ?? r8 = 0;
        ?? r9 = 0;
        switch (this.f232067a) {
            case 0:
                wn6 wn6Var = (wn6) this.f232068b;
                int i2 = message.what;
                if (i2 != 1) {
                    if (i2 == 2) {
                        vn6Var = (vn6) message.obj;
                        int i3 = vn6Var.f243002a;
                        MediaCodec.CryptoInfo cryptoInfo = vn6Var.f243004c;
                        long j = vn6Var.f243005d;
                        int i4 = vn6Var.f243006e;
                        try {
                            if (Build.VERSION.SDK_INT < 31) {
                                synchronized (wn6.f253072h) {
                                    wn6Var.f253073a.queueSecureInputBuffer(i3, 0, cryptoInfo, j, i4);
                                }
                            } else {
                                wn6Var.f253073a.queueSecureInputBuffer(i3, 0, cryptoInfo, j, i4);
                            }
                            break;
                        } catch (RuntimeException e) {
                            AtomicReference atomicReference = wn6Var.f253076d;
                            while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                            }
                        }
                    } else if (i2 == 3) {
                        wn6Var.f253077e.m41672f();
                    } else if (i2 != 4) {
                        AtomicReference atomicReference2 = wn6Var.f253076d;
                        IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                        while (!atomicReference2.compareAndSet(null, illegalStateException) && atomicReference2.get() == null) {
                        }
                    } else {
                        try {
                            wn6Var.f253073a.setParameters((Bundle) message.obj);
                            break;
                        } catch (RuntimeException e2) {
                            AtomicReference atomicReference3 = wn6Var.f253076d;
                            while (!atomicReference3.compareAndSet(null, e2) && atomicReference3.get() == null) {
                            }
                        }
                    }
                    if (r7 != 0) {
                        arrayDeque = wn6.f253071g;
                        synchronized (arrayDeque) {
                            arrayDeque.add(r7);
                            break;
                        }
                        return;
                    }
                    return;
                }
                vn6Var = (vn6) message.obj;
                try {
                    wn6Var.f253073a.queueInputBuffer(vn6Var.f243002a, 0, vn6Var.f243003b, vn6Var.f243005d, vn6Var.f243006e);
                    break;
                } catch (RuntimeException e3) {
                    AtomicReference atomicReference4 = wn6Var.f253076d;
                    while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                    }
                }
                r7 = vn6Var;
                if (r7 != 0) {
                    arrayDeque = wn6.f253071g;
                    synchronized (arrayDeque) {
                        arrayDeque.add(r7);
                        return;
                    }
                }
                return;
            case 1:
                m83526a(message);
                return;
            case 2:
                byte[] bArr = (byte[]) message.obj;
                if (bArr == null) {
                    return;
                }
                for (iep iepVar : ((lep) this.f232068b).f132640m) {
                    iepVar.m50396q();
                    if (Arrays.equals(iepVar.f101509w, bArr)) {
                        if (message.what == 2 && iepVar.f101491e == 0 && iepVar.f101503q == 4) {
                            String str = h0b1.f86200a;
                            iepVar.m50389j(false);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 3:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                aba0 aba0Var = (aba0) this.f232068b;
                while (true) {
                    synchronized (aba0Var.f14080b) {
                        try {
                            size = aba0Var.f14082d.size();
                            if (size <= 0) {
                                return;
                            }
                            ia70VarArr = new ia70[size];
                            aba0Var.f14082d.toArray(ia70VarArr);
                            aba0Var.f14082d.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        ia70 ia70Var = ia70VarArr[i5];
                        int size2 = ((ArrayList) ia70Var.f100167c).size();
                        for (int i6 = 0; i6 < size2; i6++) {
                            zaa0 zaa0Var = (zaa0) ((ArrayList) ia70Var.f100167c).get(i6);
                            if (!zaa0Var.f281014d) {
                                zaa0Var.f281012b.onReceive(aba0Var.f14079a, (Intent) ia70Var.f100166b);
                            }
                        }
                    }
                }
                break;
            case 4:
                c9d0 c9d0Var = (c9d0) this.f232068b;
                if (c9d0Var == null) {
                    removeCallbacksAndMessages(null);
                    return;
                }
                mj70 mj70Var = c9d0Var.f35466b;
                Bundle data = message.getData();
                int i7 = 19;
                switch (message.what) {
                    case 1:
                        Bundle bundle = data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS);
                        ood0.m67479k(bundle);
                        String string2 = data.getString(MediaBrowserProtocol.DATA_PACKAGE_NAME);
                        int i8 = data.getInt(MediaBrowserProtocol.DATA_CALLING_PID);
                        int i9 = data.getInt(MediaBrowserProtocol.DATA_CALLING_UID);
                        pj70 pj70Var = new pj70(message.replyTo, i7);
                        c9d0 c9d0Var2 = (c9d0) mj70Var.f144173b;
                        if (string2 != null) {
                            String[] packagesForUid = c9d0Var2.getPackageManager().getPackagesForUid(i9);
                            int length = packagesForUid.length;
                            while (i < length) {
                                if (packagesForUid[i].equals(string2)) {
                                    c9d0Var2.f35470f.m83527b(new a9d0(i8, i9, bundle, string2, mj70Var, pj70Var));
                                    return;
                                } else {
                                    i++;
                                    string2 = string2;
                                }
                            }
                        }
                        throw new IllegalArgumentException(ikc0.m50939k("Package/uid mismatch: uid=", " package=", i9, string2));
                    case 2:
                        ((c9d0) mj70Var.f144173b).f35470f.m83527b(new uqf1(mj70Var, new pj70(message.replyTo, i7), r8 == true ? 1 : 0, 28));
                        return;
                    case 3:
                        Bundle bundle2 = data.getBundle(MediaBrowserProtocol.DATA_OPTIONS);
                        ood0.m67479k(bundle2);
                        ((c9d0) mj70Var.f144173b).f35470f.m83527b(new qxj(mj70Var, new pj70(message.replyTo, i7), data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), (Object) data.getBinder(MediaBrowserProtocol.DATA_CALLBACK_TOKEN), (Parcelable) bundle2, 2));
                        return;
                    case 4:
                        ((c9d0) mj70Var.f144173b).f35470f.m83527b(new qk8(mj70Var, new pj70(message.replyTo, i7), data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID), (Object) data.getBinder(MediaBrowserProtocol.DATA_CALLBACK_TOKEN), 9));
                        return;
                    case 5:
                        String string3 = data.getString(MediaBrowserProtocol.DATA_MEDIA_ITEM_ID);
                        ResultReceiver resultReceiver = (ResultReceiver) data.getParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER);
                        pj70 pj70Var2 = new pj70(message.replyTo, i7);
                        mj70Var.getClass();
                        if (TextUtils.isEmpty(string3) || resultReceiver == null) {
                            return;
                        }
                        ((c9d0) mj70Var.f144173b).f35470f.m83527b(new qk8(mj70Var, pj70Var2, string3, (Object) resultReceiver, 10));
                        return;
                    case 6:
                        Bundle bundle3 = data.getBundle(MediaBrowserProtocol.DATA_ROOT_HINTS);
                        ood0.m67479k(bundle3);
                        ((c9d0) mj70Var.f144173b).f35470f.m83527b(new b9d0(data.getInt(MediaBrowserProtocol.DATA_CALLING_UID), data.getInt(MediaBrowserProtocol.DATA_CALLING_PID), bundle3, data.getString(MediaBrowserProtocol.DATA_PACKAGE_NAME), mj70Var, new pj70(message.replyTo, i7)));
                        return;
                    case 7:
                        ((c9d0) mj70Var.f144173b).f35470f.m83527b(new lk00(mj70Var, new pj70(message.replyTo, i7), r9 == true ? 1 : 0, 29));
                        return;
                    case 8:
                        Bundle bundle4 = data.getBundle(MediaBrowserProtocol.DATA_SEARCH_EXTRAS);
                        ood0.m67479k(bundle4);
                        String string4 = data.getString(MediaBrowserProtocol.DATA_SEARCH_QUERY);
                        ResultReceiver resultReceiver2 = (ResultReceiver) data.getParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER);
                        pj70 pj70Var3 = new pj70(message.replyTo, i7);
                        mj70Var.getClass();
                        if (TextUtils.isEmpty(string4) || resultReceiver2 == null) {
                            return;
                        }
                        ((c9d0) mj70Var.f144173b).f35470f.m83527b(new qxj(mj70Var, pj70Var3, string4, (Object) bundle4, (Parcelable) resultReceiver2, 3));
                        return;
                    case 9:
                        Bundle bundle5 = data.getBundle(MediaBrowserProtocol.DATA_CUSTOM_ACTION_EXTRAS);
                        ood0.m67479k(bundle5);
                        String string5 = data.getString(MediaBrowserProtocol.DATA_CUSTOM_ACTION);
                        ResultReceiver resultReceiver3 = (ResultReceiver) data.getParcelable(MediaBrowserProtocol.DATA_RESULT_RECEIVER);
                        pj70 pj70Var4 = new pj70(message.replyTo, i7);
                        mj70Var.getClass();
                        if (TextUtils.isEmpty(string5) || resultReceiver3 == null) {
                            return;
                        }
                        ((c9d0) mj70Var.f144173b).f35470f.m83527b(new qk8(mj70Var, pj70Var4, string5, bundle5, resultReceiver3));
                        return;
                    default:
                        message.toString();
                        return;
                }
            case 5:
                int i10 = message.what;
                int i11 = message.arg1;
                Object obj = message.obj;
                Bundle bundlePeekData = message.peekData();
                kld0 kld0Var = (kld0) this.f232068b;
                smd0 smd0Var = (smd0) kld0Var.f123867j.get(i11);
                if (smd0Var == null) {
                    return;
                }
                kld0Var.f123867j.remove(i11);
                if (i10 == 3) {
                    smd0Var.mo36782b((Bundle) obj);
                    return;
                } else {
                    if (i10 != 4) {
                        return;
                    }
                    smd0Var.mo36781a(bundlePeekData != null ? bundlePeekData.getString("error") : null, (Bundle) obj);
                    return;
                }
            case 6:
                emd0 emd0Var = (emd0) this.f232068b;
                int i12 = message.what;
                if (i12 != 1) {
                    if (i12 != 2) {
                        return;
                    }
                    emd0Var.f60892f = false;
                    emd0Var.mo36413f(emd0Var.f60891e);
                    return;
                }
                emd0Var.f60894h = false;
                jwg1 jwg1Var = emd0Var.f60890d;
                if (jwg1Var != null) {
                    jwg1Var.mo47399z(emd0Var, emd0Var.f60893g);
                    return;
                }
                return;
            case 7:
                if (message.what == 1 && (iM91711j = (xpoVar = ((lmd0) this.f232068b).f134951e).m91711j((Messenger) message.obj)) >= 0) {
                    jmd0 jmd0Var = (jmd0) ((ArrayList) xpoVar.f264694d).remove(iM91711j);
                    xpoVar.m91714m();
                    int i13 = lmd0.f134946f;
                    jmd0Var.mo45231d();
                    return;
                }
                return;
            case 8:
                if (message.what == 1) {
                    synchronized (((iod0) this.f232068b).f104191a) {
                        jod0Var = (jod0) ((iod0) this.f232068b).f104194d.get();
                        iod0Var = (iod0) this.f232068b;
                        un6Var = iod0Var.f104195e;
                        break;
                    }
                    if (jod0Var == null || iod0Var != jod0Var.m53881b() || un6Var == null) {
                        return;
                    }
                    jod0Var.mo53885f((qqd0) message.obj);
                    ((iod0) this.f232068b).m51157a(jod0Var, un6Var);
                    jod0Var.mo53885f(null);
                    return;
                }
                return;
            case 9:
                if (p2l.f173365a.contains(this)) {
                    return;
                }
                try {
                    wb10 wb10Var = (wb10) this.f232068b;
                    if (message.what == wb10Var.f249671g) {
                        Bundle data2 = message.getData();
                        if (data2.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                            wb10Var.m87621a(null);
                        } else {
                            wb10Var.m87621a(data2);
                        }
                        try {
                            wb10Var.f249665a.unbindService(wb10Var);
                            return;
                        } catch (IllegalArgumentException unused) {
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    p2l.m68953a(this, th2);
                    return;
                }
            default:
                if (message.what != 3) {
                    message.toString();
                    super.handleMessage(message);
                    return;
                }
                Bundle data3 = message.getData();
                if (data3 == null || (string = data3.getString("SessionUpdateExtra")) == null) {
                    string = "";
                }
                x0h1.m89578u(kk40.m56661c((juk) this.f232068b), null, 0, new q2y0(string, r7, 13), 3);
                return;
        }
    }

    @Override // android.os.Handler
    public boolean sendMessageAtTime(Message message, long j) {
        switch (this.f232067a) {
            case 4:
                Bundle data = message.getData();
                data.setClassLoader(i8d0.class.getClassLoader());
                data.putInt(MediaBrowserProtocol.DATA_CALLING_UID, Binder.getCallingUid());
                int callingPid = Binder.getCallingPid();
                if (callingPid > 0) {
                    data.putInt(MediaBrowserProtocol.DATA_CALLING_PID, callingPid);
                } else if (!data.containsKey(MediaBrowserProtocol.DATA_CALLING_PID)) {
                    data.putInt(MediaBrowserProtocol.DATA_CALLING_PID, -1);
                }
                break;
        }
        return super.sendMessageAtTime(message, j);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ un6(Object obj, Looper looper, int i) {
        super(looper);
        this.f232067a = i;
        this.f232068b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un6(juk jukVar) {
        super(Looper.getMainLooper());
        this.f232067a = 10;
        this.f232068b = jukVar;
    }

    public un6(c9d0 c9d0Var) {
        this.f232067a = 4;
        this.f232068b = c9d0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un6(kld0 kld0Var) {
        super(Looper.getMainLooper());
        this.f232067a = 5;
        this.f232068b = kld0Var;
    }
}
