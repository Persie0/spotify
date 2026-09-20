package p204p;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import androidx.media3.session.legacy.MediaSessionManager;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class pgd0 extends nrd0 {

    /* JADX INFO: renamed from: d */
    public final dhd0 f177293d;

    public pgd0(dhd0 dhd0Var) {
        super(dhd0Var);
        this.f177293d = dhd0Var;
    }

    /* JADX INFO: renamed from: a */
    public static t601 m69876a(pgd0 pgd0Var, ca80 ca80Var) {
        Object obj;
        pgd0Var.getClass();
        c95.m31848n(ca80Var, "LibraryResult must not be null");
        t601 t601Var = new t601();
        if (ca80Var.f35772a != 0 || (obj = ca80Var.f35774c) == null) {
            t601Var.m28330u(null);
            return t601Var;
        }
        pf40 pf40Var = (pf40) obj;
        if (pf40Var.isEmpty()) {
            t601Var.m28330u(new ArrayList());
            return t601Var;
        }
        ArrayList arrayList = new ArrayList();
        zaz zazVar = new zaz(17, t601Var, arrayList);
        ckr ckrVar = ckr.f39074a;
        t601Var.mo28322a(zazVar, ckrVar);
        k39 k39Var = new k39(pgd0Var, new AtomicInteger(0), pf40Var, arrayList, t601Var, 2);
        for (int i = 0; i < pf40Var.size(); i++) {
            byte[] bArr = ((ufd0) pf40Var.get(i)).f229765d.f177617k;
            if (bArr == null) {
                arrayList.add(null);
                k39Var.run();
            } else {
                u790 u790VarMo60775j = pgd0Var.f177293d.f201553m.mo60775j(bArr);
                arrayList.add(u790VarMo60775j);
                u790VarMo60775j.mo28322a(k39Var, ckrVar);
            }
        }
        return t601Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m69877b(Runnable runnable) {
        h0b1.m46304c0(this.f177293d.f201552l, runnable);
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public final void onCustomAction(String str, Bundle bundle, MediaBrowserServiceCompat.Result result) {
        result.detach();
        m69877b(new jgd0(this, getCurrentBrowserInfo(), result, str, bundle, 0));
    }

    @Override // p204p.nrd0, androidx.media3.session.legacy.MediaBrowserServiceCompat
    public final MediaBrowserServiceCompat.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        if (super.onGetRoot(str, i, bundle) == null) {
            return null;
        }
        AtomicReference atomicReference = new AtomicReference();
        fhi fhiVar = new fhi();
        m69877b(new k39(this, getCurrentBrowserInfo(), bundle, atomicReference, fhiVar, 1));
        try {
            fhiVar.m41667a();
            return (MediaBrowserServiceCompat.BrowserRoot) atomicReference.get();
        } catch (InterruptedException e) {
            yif1.m93810s("Couldn't get a result from onGetRoot", e);
            return null;
        }
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public final void onLoadChildren(String str, MediaBrowserServiceCompat.Result result) {
        onLoadChildren(str, result, null);
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public final void onLoadItem(String str, MediaBrowserServiceCompat.Result result) {
        MediaSessionManager.RemoteUserInfo currentBrowserInfo = getCurrentBrowserInfo();
        if (!TextUtils.isEmpty(str)) {
            result.detach();
            m69877b(new zq4(this, currentBrowserInfo, result, str));
        } else {
            yif1.m93819w0("Ignoring empty itemId from " + currentBrowserInfo.getPackageName());
            result.sendResult(null);
        }
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public final void onSearch(String str, Bundle bundle, MediaBrowserServiceCompat.Result result) {
        MediaSessionManager.RemoteUserInfo currentBrowserInfo = getCurrentBrowserInfo();
        if (!TextUtils.isEmpty(str)) {
            result.detach();
            m69877b(new jgd0(this, currentBrowserInfo, result, str, bundle, 2));
        } else {
            yif1.m93819w0("Ignoring empty query from " + currentBrowserInfo.getPackageName());
            result.sendResult(null);
        }
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public final void onSubscribe(String str, Bundle bundle) {
        MediaSessionManager.RemoteUserInfo currentBrowserInfo = getCurrentBrowserInfo();
        if (!TextUtils.isEmpty(str)) {
            m69877b(new feb(this, currentBrowserInfo, bundle, str, 9));
            return;
        }
        yif1.m93819w0("onSubscribe(): Ignoring empty id from " + currentBrowserInfo.getPackageName());
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public final void onUnsubscribe(String str) {
        MediaSessionManager.RemoteUserInfo currentBrowserInfo = getCurrentBrowserInfo();
        if (!TextUtils.isEmpty(str)) {
            m69877b(new kgd0(this, currentBrowserInfo, str, 0));
            return;
        }
        yif1.m93819w0("onUnsubscribe(): Ignoring empty id from " + currentBrowserInfo.getPackageName());
    }

    @Override // androidx.media3.session.legacy.MediaBrowserServiceCompat
    public final void onLoadChildren(String str, MediaBrowserServiceCompat.Result result, Bundle bundle) {
        MediaSessionManager.RemoteUserInfo currentBrowserInfo = getCurrentBrowserInfo();
        if (!TextUtils.isEmpty(str)) {
            result.detach();
            m69877b(new jgd0(this, currentBrowserInfo, result, bundle, str));
        } else {
            yif1.m93819w0("onLoadChildren(): Ignoring empty parentId from " + currentBrowserInfo.getPackageName());
            result.sendResult(null);
        }
    }
}
