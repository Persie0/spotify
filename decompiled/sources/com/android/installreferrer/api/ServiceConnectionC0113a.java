package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.android.installreferrer.commons.InstallReferrerCommons;
import p204p.vu30;
import p204p.wu30;
import p204p.xu30;

/* JADX INFO: renamed from: com.android.installreferrer.api.a */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC0113a implements ServiceConnection {

    /* JADX INFO: renamed from: a */
    public final InstallReferrerStateListener f1498a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0114b f1499b;

    public ServiceConnectionC0113a(C0114b c0114b, InstallReferrerStateListener installReferrerStateListener) {
        this.f1499b = c0114b;
        if (installReferrerStateListener == null) {
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
        this.f1498a = installReferrerStateListener;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        xu30 vu30Var;
        InstallReferrerCommons.logVerbose("InstallReferrerClient", "Install Referrer service connected.");
        int i = wu30.f255097a;
        if (iBinder == null) {
            vu30Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            vu30Var = iInterfaceQueryLocalInterface instanceof xu30 ? (xu30) iInterfaceQueryLocalInterface : new vu30(iBinder);
        }
        C0114b c0114b = this.f1499b;
        c0114b.f1502c = vu30Var;
        c0114b.f1500a = 2;
        this.f1498a.onInstallReferrerSetupFinished(0);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        InstallReferrerCommons.logWarn("InstallReferrerClient", "Install Referrer service disconnected.");
        C0114b c0114b = this.f1499b;
        c0114b.f1502c = null;
        c0114b.f1500a = 0;
        this.f1498a.onInstallReferrerServiceDisconnected();
    }
}
