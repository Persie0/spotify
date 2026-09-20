package com.comscore.android.p005id;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.provider.Settings;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import p204p.bga;

/* JADX INFO: loaded from: classes.dex */
public class IdHelperAndroid {
    public static final String NO_ID_AVAILABLE = "none";
    public static final String[] INVALID_ID_VALUES = {"0123456789ABCDEF", "0123456789abcdef", "9774d56d682e549c", "9774D56D682E549C", "unknown", "UNKNOWN", "android_id", "ANDROID_ID"};
    public static final String[] INVALID_AD_ID_VALUES = {"00000000-0000-0000-0000-000000000000"};

    /* JADX INFO: renamed from: c */
    private static boolean f1540c = false;

    /* JADX INFO: renamed from: a */
    private static final String f1538a = "com.google.android.gms";

    /* JADX INFO: renamed from: b */
    private static final String f1539b = "com.google.android.gms.ads.identifier.service.START";

    /* JADX INFO: renamed from: com.comscore.android.id.IdHelperAndroid$a */
    public static final class ServiceConnectionC0118a implements ServiceConnection {

        /* JADX INFO: renamed from: a */
        boolean f1541a;

        /* JADX INFO: renamed from: b */
        private final LinkedBlockingQueue<IBinder> f1542b;

        public /* synthetic */ ServiceConnectionC0118a(int i) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public IBinder m1216a() {
            if (this.f1541a) {
                throw new IllegalStateException();
            }
            this.f1541a = true;
            return this.f1542b.take();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f1542b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        private ServiceConnectionC0118a() {
            this.f1541a = false;
            this.f1542b = new LinkedBlockingQueue<>(1);
        }
    }

    /* JADX INFO: renamed from: com.comscore.android.id.IdHelperAndroid$b */
    public static final class C0119b implements IInterface {

        /* JADX INFO: renamed from: a */
        private IBinder f1543a;

        public C0119b(IBinder iBinder) {
            this.f1543a = iBinder;
        }

        /* JADX INFO: renamed from: a */
        public boolean m1217a(boolean z) {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                parcelObtain.writeInt(z ? 1 : 0);
                this.f1543a.transact(2, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readInt() != 0;
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f1543a;
        }

        public String getId() {
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f1543a.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                return parcelObtain2.readString();
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static Boolean m1213a(Context context, boolean z) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        if (!z && f1540c) {
            return Boolean.FALSE;
        }
        try {
            boolean z2 = Settings.Secure.getInt(context.getContentResolver(), "limit_ad_tracking") == 0;
            if (!z && !z2) {
                f1540c = true;
            }
            return Boolean.valueOf(z2);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    private static boolean m1215b(Context context) {
        if (Build.MODEL.matches("AFTN")) {
            return true;
        }
        return context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
    }

    public static String getAmazonAdvertisingId(Context context, boolean z) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        Boolean boolM1213a = m1213a(context, z);
        if (boolM1213a == null) {
            return null;
        }
        return boolM1213a.booleanValue() ? m1214a(context) : "none";
    }

    public static AppSetIdInfo getAppSetID(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        try {
            Class.forName("com.google.android.gms.appset.AppSet");
            try {
                return (AppSetIdInfo) bga.m29087i(AppSet.getClient(context).getAppSetIdInfo(), 5L, TimeUnit.SECONDS);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        } catch (ClassNotFoundException unused) {
        }
    }

    public static CrossPublisherId getCrossPublisherDeviceId(Context context) {
        return getCrossPublisherDeviceId(context, false);
    }

    public static DeviceId getDeviceId(Context context) {
        AppSetIdInfo appSetID = getAppSetID(context);
        if (appSetID != null) {
            int scope = appSetID.getScope();
            if (scope == 1) {
                return new DeviceId("AppSetIdScopeApp", appSetID.getId(), 7, 2, 4);
            }
            if (scope == 2) {
                return new DeviceId("AppSetIdScopeDeveloper", appSetID.getId(), 6, 2, 3);
            }
        }
        return m1212a();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    public static DeviceId getGooglePlayAdvertisingDeviceId(Context context, boolean z) {
        String str;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        if (!isGooglePlayServicesAvailable(context)) {
            return null;
        }
        if (isAdvertisingIdEnabled(context, z)) {
            String googlePlayAdvertisingId = getGooglePlayAdvertisingId(context);
            if (isAdvertisementIdValid(googlePlayAdvertisingId)) {
                str = googlePlayAdvertisingId;
            } else {
                str = "none";
            }
        } else {
            str = "none";
        }
        return new DeviceId("googleplayapp", str, 0, 0, -1);
    }

    public static String getGooglePlayAdvertisingId(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        ServiceConnectionC0118a serviceConnectionC0118a = new ServiceConnectionC0118a(0);
        Intent intent = new Intent(f1539b);
        intent.setPackage(f1538a);
        if (context.bindService(intent, serviceConnectionC0118a, 1)) {
            try {
                return new C0119b(serviceConnectionC0118a.m1216a()).getId();
            } catch (Exception unused) {
            } finally {
                context.unbindService(serviceConnectionC0118a);
            }
        }
        return "";
    }

    public static boolean isAdvertisementIdValid(String str) {
        for (String str2 : INVALID_AD_ID_VALUES) {
            if (str2.equals(str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAdvertisingIdEnabled(Context context) {
        return isAdvertisingIdEnabled(context, false);
    }

    public static boolean isGooglePlayServicesAvailable(Context context) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        int i = 0;
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            ServiceConnectionC0118a serviceConnectionC0118a = new ServiceConnectionC0118a(i);
            Intent intent = new Intent(f1539b);
            intent.setPackage(f1538a);
            if (context.bindService(intent, serviceConnectionC0118a, 1)) {
                context.unbindService(serviceConnectionC0118a);
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static String md5(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
            for (byte b : bArrDigest) {
                int i = b & 255;
                if (i < 16) {
                    sb.append('0');
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Huh, MD5 should be supported?", e);
        }
    }

    public static CrossPublisherId getCrossPublisherDeviceId(Context context, boolean z) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        if (m1215b(context)) {
            String amazonAdvertisingId = getAmazonAdvertisingId(context, z);
            if (amazonAdvertisingId != null) {
                return new CrossPublisherId(amazonAdvertisingId, 1);
            }
        } else {
            DeviceId googlePlayAdvertisingDeviceId = getGooglePlayAdvertisingDeviceId(context, z);
            if (googlePlayAdvertisingDeviceId != null) {
                return new CrossPublisherId(googlePlayAdvertisingDeviceId.getId(), 1);
            }
        }
        return new CrossPublisherId(null, 0);
    }

    public static boolean isAdvertisingIdEnabled(Context context, boolean z) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
        boolean z2 = false;
        z2 = false;
        if (!z && f1540c) {
            return false;
        }
        ServiceConnectionC0118a serviceConnectionC0118a = new ServiceConnectionC0118a(z2 ? 1 : 0);
        Intent intent = new Intent(f1539b);
        intent.setPackage(f1538a);
        if (context.bindService(intent, serviceConnectionC0118a, 1)) {
            try {
                z2 = !new C0119b(serviceConnectionC0118a.m1216a()).m1217a(true);
            } catch (Exception unused) {
            } finally {
                context.unbindService(serviceConnectionC0118a);
            }
        }
        if (!z && !z2) {
            f1540c = true;
        }
        return z2;
    }

    /* JADX INFO: renamed from: a */
    private static String m1214a(Context context) {
        try {
            return Settings.Secure.getString(context.getContentResolver(), "advertising_id");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static DeviceId m1212a() {
        return new DeviceId("random", UUID.randomUUID().toString(), 7, 2, 0);
    }
}
