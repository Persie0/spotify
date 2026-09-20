package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Purchase {

    /* JADX INFO: renamed from: a */
    public final String f1494a;

    /* JADX INFO: renamed from: b */
    public final String f1495b;

    /* JADX INFO: renamed from: c */
    public final JSONObject f1496c;

    public Purchase(String str, String str2) {
        this.f1494a = str;
        this.f1495b = str2;
        this.f1496c = new JSONObject(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f1494a, purchase.f1494a) && TextUtils.equals(this.f1495b, purchase.f1495b);
    }

    public final int hashCode() {
        return this.f1494a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f1494a));
    }
}
