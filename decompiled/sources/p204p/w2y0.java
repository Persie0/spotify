package p204p;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class w2y0 implements r0f1 {

    /* JADX INFO: renamed from: b */
    public static final String[] f247444b = {"api_server_url", "auth_server_url"};

    /* JADX INFO: renamed from: a */
    public final Context f247445a;

    static {
        new jjd1();
    }

    public /* synthetic */ w2y0(Context context, boolean z) {
        this.f247445a = context;
    }

    /* JADX INFO: renamed from: c */
    public static Intent m87086c(String str) {
        Intent intent = new Intent(str);
        intent.putExtra("client_id", "q3voa1im9e");
        intent.putExtra("client_secret", "foo");
        return intent;
    }

    /* JADX INFO: renamed from: d */
    public static xrl m87087d(w2y0 w2y0Var) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            asl aslVar = new asl(w2y0Var.f247445a);
            asl aslVar2 = aslVar.m27098a() ? aslVar : null;
            return aslVar2 == null ? w2y0Var.m87093i() : aslVar2;
        }
        if (i <= 33) {
            return w2y0Var.m87093i();
        }
        return null;
    }

    @Override // p204p.x0f1
    /* JADX INFO: renamed from: a */
    public Object mo49415a() {
        return this.f247445a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m87088b(czz czzVar, ibk ibkVar) {
        i84 i84Var;
        if (ibkVar instanceof i84) {
            i84Var = (i84) ibkVar;
            int i = i84Var.f99690d;
            if ((i & Integer.MIN_VALUE) != 0) {
                i84Var.f99690d = i - Integer.MIN_VALUE;
            } else {
                i84Var = new i84(this, ibkVar);
            }
        } else {
            i84Var = new i84(this, ibkVar);
        }
        Object objM77666e = i84Var.f99688b;
        int i2 = i84Var.f99690d;
        Context context = this.f247445a;
        if (i2 == 0) {
            bga.m29073P(objM77666e);
            if (czzVar instanceof z74) {
                net netVar = net.f153100h;
                i84Var.f99690d = 1;
                netVar.m64275b();
                throw null;
            }
            if (!(czzVar instanceof g1x0)) {
                throw new IllegalArgumentException("Unknown font type: " + czzVar);
            }
            g1x0 g1x0Var = (g1x0) czzVar;
            i84Var.f99687a = g1x0Var;
            i84Var.f99690d = 2;
            objM77666e = sam.m77666e(g1x0Var, context, i84Var);
            yuk yukVar = yuk.f276404a;
            if (objM77666e == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 == 1) {
                bga.m29073P(objM77666e);
                return objM77666e;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            czzVar = i84Var.f99687a;
            bga.m29073P(objM77666e);
        }
        return s1h1.m76977r((Typeface) objM77666e, ((g1x0) czzVar).m43367c(), context);
    }

    /* JADX INFO: renamed from: e */
    public String m87089e(int i, Object... objArr) {
        return this.f247445a.getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: renamed from: f */
    public void m87090f(Uri uri) {
        String queryParameter;
        String queryParameter2;
        try {
            queryParameter = uri.getQueryParameter("redirect_uri");
        } catch (UnsupportedOperationException unused) {
            queryParameter = (String) uuf1.m84001u(uri).get("redirect_uri");
        }
        Uri uri2 = queryParameter == null ? null : Uri.parse(queryParameter);
        Context context = this.f247445a;
        if (uri2 != null) {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(uri2.toString());
            if (launchIntentForPackage != null) {
                try {
                    context.startActivity(launchIntentForPackage);
                    return;
                } catch (ActivityNotFoundException unused2) {
                }
            }
        }
        try {
            queryParameter2 = uri.getQueryParameter("origin_uri");
        } catch (UnsupportedOperationException unused3) {
            queryParameter2 = (String) uuf1.m84001u(uri).get("origin_uri");
        }
        Uri uri3 = queryParameter2 != null ? Uri.parse(queryParameter2) : null;
        if (uri3 == null) {
            return;
        }
        if (uuf1.m83995o(uri3)) {
            uri3.toString();
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri3);
        intent.addFlags(268435456);
        intent.setPackage(context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused4) {
            Objects.toString(uri3);
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m87091g() {
        boolean zM53534b;
        Context context = this.f247445a;
        String strM52162x = j1h1.m52162x(context);
        if (strM52162x == null) {
            zM53534b = false;
        } else {
            try {
                zM53534b = jjd1.m53534b(strM52162x);
            } catch (NumberFormatException e) {
                Logger.m3967c(e, "Unsupported version number: %s", strM52162x);
                zM53534b = false;
            }
        }
        if (zM53534b) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.waze&referrer=utm_source%3Dpartner%26utm_medium%3Ddirect%26utm_campaign%3Dcom.spotify.music"));
            intent.addFlags(268435456);
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.waze&referrer=utm_source%3Dpartner%26utm_medium%3Ddirect%26utm_campaign%3Dcom.spotify.music"));
            intent2.addFlags(268435456);
            context.startActivity(intent2);
            return true;
        }
    }

    /* JADX INFO: renamed from: h */
    public Typeface m87092h(czz czzVar) {
        Object c6x0Var;
        Typeface typefaceM77665d;
        boolean z = czzVar instanceof z74;
        Context context = this.f247445a;
        if (z) {
            return net.f153100h.m64276c(context, (z74) czzVar);
        }
        if (!(czzVar instanceof g1x0)) {
            return null;
        }
        g1x0 g1x0Var = (g1x0) czzVar;
        if (ybg1.m93274k(0, 0)) {
            typefaceM77665d = sam.m77665d(g1x0Var, context);
        } else {
            if (!ybg1.m93274k(0, 1)) {
                if (ybg1.m93274k(0, 2)) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) ybg1.m93285v(0)));
            }
            try {
                c6x0Var = sam.m77665d((g1x0) czzVar, context);
            } catch (Throwable th) {
                c6x0Var = new c6x0(th);
            }
            typefaceM77665d = (Typeface) (c6x0Var instanceof c6x0 ? null : c6x0Var);
        }
        return s1h1.m76977r(typefaceM77665d, g1x0Var.m43367c(), context);
    }

    /* JADX INFO: renamed from: i */
    public xrl m87093i() throws PackageManager.NameNotFoundException {
        String string;
        Context context = this.f247445a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List listM43728j1 = g6f.m43728j1(arrayList);
        if (listM43728j1.isEmpty()) {
            return null;
        }
        Iterator it = listM43728j1.iterator();
        xrl xrlVar = null;
        while (it.hasNext()) {
            try {
                xrl xrlVar2 = (xrl) Class.forName((String) it.next()).getConstructor(Context.class).newInstance(context);
                if (!((asl) xrlVar2).m27098a()) {
                    continue;
                } else {
                    if (xrlVar != null) {
                        return null;
                    }
                    xrlVar = xrlVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return xrlVar;
    }

    public w2y0(Context context) {
        this.f247445a = context.getApplicationContext();
    }
}
