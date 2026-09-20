package p204p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public abstract class mo5 implements ogm0 {
    /* JADX INFO: renamed from: i */
    public static String m62386i(Uri uri, String str) {
        Object next;
        String query = uri.getQuery();
        if (query != null) {
            Iterator it = wl51.m88476Z0(query, new char[]{'&'}, 6).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!wl51.m88496t0((String) next, str, false));
            String str2 = (String) next;
            if (str2 != null) {
                return (String) g6f.m43689C0(wl51.m88476Z0(str2, new char[]{'='}, 6));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public abstract mlm0 mo35899a();

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: c */
    public final Class mo24412c() {
        return wk5.class;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00dc  */
    @Override // p204p.ogm0
    /* JADX INFO: renamed from: d */
    public final Parcelable mo24413d(Intent intent, dd41 dd41Var, e301 e301Var) {
        String str;
        String string;
        String string2;
        mlm0 mlm0Var;
        ohi ohiVar;
        String string3;
        Object next;
        Uri data = intent.getData();
        Object obj = null;
        if (data == null || (string = m62386i(data, "uri")) == null) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string4 = extras.getString("uri");
                str = string4;
            } else {
                str = null;
            }
        } else {
            str = string4;
        }
        Uri data2 = intent.getData();
        if (data2 == null || (string = m62386i(data2, "config")) == null) {
            Bundle extras2 = intent.getExtras();
            string = extras2 != null ? extras2.getString("config") : null;
        }
        Bundle extras3 = intent.getExtras();
        if (extras3 == null || (string2 = extras3.getString("errors")) == null) {
            string2 = "";
        }
        String str2 = string2;
        Bundle extras4 = intent.getExtras();
        String string5 = extras4 != null ? extras4.getString("initialPrompt") : null;
        Bundle extras5 = intent.getExtras();
        String string6 = extras5 != null ? extras5.getString("initialTitle") : null;
        Bundle extras6 = intent.getExtras();
        String string7 = extras6 != null ? extras6.getString("initialLocation") : null;
        Bundle extras7 = intent.getExtras();
        if (extras7 == null || (string3 = extras7.getString("pageType")) == null) {
            mlm0Var = null;
        } else {
            Iterator it = mlm0.f144866e.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!wj50.m88271j(((mlm0) next).name(), string3));
            mlm0Var = (mlm0) next;
        }
        if (mlm0Var != mlm0.f144864c) {
            return new ko5(str, e301Var.f55571a, mo35899a(), mo35900h(str, string), str2, string5, string6, string7);
        }
        if (string != null) {
            String upperCase = string.toUpperCase(Locale.ROOT);
            for (Object obj2 : ohi.f165466e) {
                if (wj50.m88271j(((ohi) obj2).name(), upperCase)) {
                    obj = obj2;
                    break;
                }
            }
            ohiVar = (ohi) obj;
            if (ohiVar == null) {
                ohiVar = ohi.f165464c;
            }
        } else {
            ohiVar = ohi.f165464c;
        }
        return new ko5(str, e301Var.f55571a, mlm0Var, ohiVar, str2, string5, string6, string7);
    }

    @Override // p204p.ogm0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public wzq0 mo24414e() {
        return new wzq0(false);
    }

    /* JADX INFO: renamed from: h */
    public abstract ohi mo35900h(String str, String str2);
}
