package p204p;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class dc00 implements ogm0 {
    @Override // p204p.ogm0
    /* JADX INFO: renamed from: b */
    public final Set mo24411b() {
        return gbu.f78413a;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        return ac00.class;
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        String string;
        String string2;
        String strM35699F = dd41Var.m35699F();
        String str = "";
        if (strM35699F == null) {
            strM35699F = "";
        }
        Bundle extras = intent.getExtras();
        if (extras == null || (string = extras.getString("share_id")) == null) {
            string = "";
        }
        Bundle extras2 = intent.getExtras();
        if (extras2 != null && (string2 = extras2.getString("external_referrer")) != null) {
            str = string2;
        }
        return new cc00(strM35699F, string, str);
    }

    @Override // p204p.ogm0
    public final String getDescription() {
        return "Page API implementation of Free Tier Track page";
    }
}
