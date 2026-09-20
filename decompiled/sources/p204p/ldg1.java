package p204p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class ldg1 extends li10 {

    /* JADX INFO: renamed from: B */
    public final ExecutorService f132160B;

    /* JADX INFO: renamed from: C */
    public final iew0 f132161C;

    /* JADX INFO: renamed from: D */
    public final iew0 f132162D;

    /* JADX INFO: renamed from: E */
    public final iew0 f132163E;

    /* JADX INFO: renamed from: F */
    public final iew0 f132164F;

    /* JADX INFO: renamed from: G */
    public final iew0 f132165G;

    /* JADX INFO: renamed from: H */
    public final iew0 f132166H;

    /* JADX INFO: renamed from: I */
    public final iew0 f132167I;

    /* JADX INFO: renamed from: J */
    public final iew0 f132168J;

    /* JADX INFO: renamed from: K */
    public final iew0 f132169K;

    /* JADX INFO: renamed from: L */
    public final iew0 f132170L;

    /* JADX INFO: renamed from: M */
    public final feg1 f132171M;

    /* JADX INFO: renamed from: N */
    public final File f132172N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ldg1(Context context, Looper looper, twy twyVar, p3f1 p3f1Var, p3f1 p3f1Var2) {
        super(context, looper, 14, twyVar, p3f1Var, p3f1Var2, 0);
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        feg1 feg1VarM41445a = feg1.m41445a(context);
        this.f132161C = new iew0(2);
        this.f132162D = new iew0(2);
        this.f132163E = new iew0(2);
        this.f132164F = new iew0(2);
        this.f132165G = new iew0(2);
        this.f132166H = new iew0(2);
        this.f132167I = new iew0(2);
        this.f132168J = new iew0(2);
        this.f132169K = new iew0(2);
        this.f132170L = new iew0(2);
        ig31.m50506x(executorServiceUnconfigurableExecutorService);
        this.f132160B = executorServiceUnconfigurableExecutorService;
        this.f132171M = feg1VarM41445a;
        File file = new File(new File(context.getFilesDir(), "wearos_assets"), "streamtmp");
        file.mkdirs();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                file2.delete();
            }
        }
        this.f132172N = file;
    }

    @Override // p204p.dz8
    /* JADX INFO: renamed from: B */
    public final void mo37408B(int i, IBinder iBinder, Bundle bundle, int i2) {
        Log.isLoggable("WearableClient", 2);
        if (i == 0) {
            this.f132161C.m50402b(iBinder);
            this.f132162D.m50402b(iBinder);
            this.f132163E.m50402b(iBinder);
            this.f132165G.m50402b(iBinder);
            this.f132166H.m50402b(iBinder);
            this.f132167I.m50402b(iBinder);
            this.f132168J.m50402b(iBinder);
            this.f132169K.m50402b(iBinder);
            this.f132170L.m50402b(iBinder);
            this.f132164F.m50402b(iBinder);
            i = 0;
        }
        super.mo37408B(i, iBinder, bundle, i2);
    }

    @Override // p204p.dz8
    /* JADX INFO: renamed from: G */
    public final boolean mo28583G() {
        return true;
    }

    @Override // p204p.dz8, p204p.o35
    /* JADX INFO: renamed from: a */
    public final boolean mo37428a() {
        return !this.f132171M.m41448b();
    }

    @Override // p204p.dz8, p204p.o35
    /* JADX INFO: renamed from: c */
    public final void mo37429c(cz8 cz8Var) {
        if (!mo37428a()) {
            try {
                Bundle bundle = m37433k().getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                if ((bundle != null ? bundle.getInt("com.google.android.wearable.api.version", 0) : 0) < 8600000) {
                    Context contextM37433k = m37433k();
                    Context contextM37433k2 = m37433k();
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (contextM37433k2.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    m37412F((i82) cz8Var, 6, PendingIntent.getActivity(contextM37433k, 0, intent, irf1.f104983a));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                m37412F((i82) cz8Var, 16, null);
                return;
            }
        }
        super.mo37429c(cz8Var);
    }

    @Override // p204p.dz8, p204p.o35
    /* JADX INFO: renamed from: d */
    public final int mo24793d() {
        return 8600000;
    }

    @Override // p204p.dz8
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ IInterface mo24794e(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        return iInterfaceQueryLocalInterface instanceof o1g1 ? (o1g1) iInterfaceQueryLocalInterface : new o1g1(iBinder);
    }

    @Override // p204p.dz8
    /* JADX INFO: renamed from: h */
    public final gey[] mo24795h() {
        return mif1.f144022h;
    }

    @Override // p204p.dz8
    /* JADX INFO: renamed from: r */
    public final String mo24797r() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override // p204p.dz8
    /* JADX INFO: renamed from: s */
    public final String mo24798s() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override // p204p.dz8
    /* JADX INFO: renamed from: t */
    public final String mo37439t() {
        return this.f132171M.m41448b() ? "com.google.android.wearable.app.cn" : "com.google.android.gms";
    }
}
