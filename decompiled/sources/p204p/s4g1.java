package p204p;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.play.core.crossdeviceprompt.CrossDevicePromptException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class s4g1 {

    /* JADX INFO: renamed from: c */
    public static final aqs f205585c = new aqs("CrossDevicePromptClient");

    /* JADX INFO: renamed from: a */
    public final qrg1 f205586a;

    /* JADX INFO: renamed from: b */
    public final String f205587b;

    public s4g1(Context context) {
        String strEncodeToString;
        this.f205587b = context.getPackageName();
        aqs aqsVar = o0h1.f160393a;
        try {
            if (!context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                aqsVar.m26900i("Play Store package is disabled.", new Object[0]);
                return;
            }
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (signatureArr.length) == 0) {
                    aqsVar.m26900i("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    byte[] byteArray = signature.toByteArray();
                    try {
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                        messageDigest.update(byteArray);
                        strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                    } catch (NoSuchAlgorithmException unused) {
                        strEncodeToString = "";
                    }
                    arrayList.add(strEncodeToString);
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strEncodeToString)) {
                        String str = Build.TAGS;
                        if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strEncodeToString)) {
                        }
                    }
                    this.f205586a = new qrg1(context, f205585c, new Intent("com.google.android.finsky.BIND_CROSS_DEVICE_PROMPT_SERVICE").setPackage("com.android.vending"));
                    return;
                }
                StringBuilder sb = new StringBuilder();
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        } else {
                            sb.append((CharSequence) ", ");
                        }
                    }
                }
                aqsVar.m26900i(s571.m77251j("Play Store package certs are not valid. Found these sha256 certs: [", sb.toString(), "]."), new Object[0]);
            } catch (PackageManager.NameNotFoundException unused2) {
                aqsVar.m26900i("Play Store package is not found.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            aqsVar.m26900i("Play Store package is not found.", new Object[0]);
        }
    }

    /* JADX INFO: renamed from: a */
    public final y7h1 m77198a() {
        Bundle bundle = new Bundle();
        bundle.putInt("cross_device_prompt_type", 1);
        Object[] objArr = {this.f205587b};
        aqs aqsVar = f205585c;
        aqsVar.m26899h("requestPromptLaunchInfo (%s)", objArr);
        qrg1 qrg1Var = this.f205586a;
        if (qrg1Var == null) {
            Object[] objArr2 = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                aqs.m26894j(aqsVar.f18776b, "Play Store app is either not installed or not the official version", objArr2);
            }
            return bga.m29101w(new CrossDevicePromptException(-1));
        }
        ev61 ev61Var = new ev61();
        qrg1Var.m73619a().post(new mrf1(qrg1Var, ev61Var, ev61Var, new mrf1(this, ev61Var, bundle, ev61Var)));
        return ev61Var.f63172a;
    }
}
