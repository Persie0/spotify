package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class fc9 {

    /* JADX INFO: renamed from: a */
    public volatile er3 f68031a;

    /* JADX INFO: renamed from: b */
    public final Context f68032b;

    /* JADX INFO: renamed from: c */
    public volatile tvx0 f68033c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f68034d;

    public /* synthetic */ fc9(Context context) {
        this.f68032b = context;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m41294a() {
        try {
            Context context = this.f68032b;
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception unused) {
            mmf1.m62315i("BillingClient");
            return false;
        }
    }
}
