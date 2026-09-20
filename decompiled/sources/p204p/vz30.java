package p204p;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class vz30 {

    /* JADX INFO: renamed from: g */
    public static final Pattern f246366g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h */
    public static final String f246367h = Pattern.quote("/");

    /* JADX INFO: renamed from: a */
    public final jbh1 f246368a;

    /* JADX INFO: renamed from: b */
    public final Context f246369b;

    /* JADX INFO: renamed from: c */
    public final String f246370c;

    /* JADX INFO: renamed from: d */
    public final vaz f246371d;

    /* JADX INFO: renamed from: e */
    public final mc7 f246372e;

    /* JADX INFO: renamed from: f */
    public d18 f246373f;

    public vz30(Context context, String str, vaz vazVar, mc7 mc7Var) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f246369b = context;
        this.f246370c = str;
        this.f246371d = vazVar;
        this.f246372e = mc7Var;
        this.f246368a = new jbh1();
    }

    /* JADX INFO: renamed from: a */
    public final synchronized String m86868a(SharedPreferences sharedPreferences, String str) {
        String lowerCase;
        lowerCase = f246366g.matcher(UUID.randomUUID().toString()).replaceAll("").toLowerCase(Locale.US);
        haz.f89320X.m46951r();
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    /* JADX INFO: renamed from: b */
    public final raz m86869b(boolean z) {
        String strM40528b;
        haz hazVar = haz.f89320X;
        if (!((Boolean) new ay0(29).invoke()).booleanValue()) {
            Thread.currentThread().getName();
            hazVar.m46947g();
        }
        vaz vazVar = this.f246371d;
        String str = null;
        if (z) {
            try {
                strM40528b = ((f18) bga.m29087i(((uaz) vazVar).m82703d(), 10000L, TimeUnit.MILLISECONDS)).m40528b();
            } catch (Exception unused) {
                hazVar.m46952s();
                strM40528b = null;
            }
        } else {
            strM40528b = null;
        }
        try {
            str = (String) bga.m29087i(((uaz) vazVar).m82702c(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception unused2) {
            hazVar.m46952s();
        }
        return new raz(str, strM40528b);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized d18 m86870c() {
        String str;
        d18 d18Var = this.f246373f;
        if (d18Var != null && (d18Var.f44184b != null || !this.f246372e.m61451o())) {
            return this.f246373f;
        }
        haz hazVar = haz.f89320X;
        hazVar.m46951r();
        SharedPreferences sharedPreferences = this.f246369b.getSharedPreferences("com.google.firebase.crashlytics", 0);
        String string = sharedPreferences.getString("firebase.installation.id", null);
        hazVar.m46951r();
        if (this.f246372e.m61451o()) {
            raz razVarM86869b = m86869b(false);
            hazVar.m46951r();
            if (razVarM86869b.f197410a == null) {
                if (string == null) {
                    str = "SYN_" + UUID.randomUUID().toString();
                } else {
                    str = string;
                }
                razVarM86869b = new raz(str, null);
            }
            if (Objects.equals(razVarM86869b.f197410a, string)) {
                this.f246373f = new d18(sharedPreferences.getString("crashlytics.installation.id", null), razVarM86869b.f197410a, razVarM86869b.f197411b);
            } else {
                this.f246373f = new d18(m86868a(sharedPreferences, razVarM86869b.f197410a), razVarM86869b.f197410a, razVarM86869b.f197411b);
            }
        } else if (string == null || !string.startsWith("SYN_")) {
            this.f246373f = new d18(m86868a(sharedPreferences, "SYN_" + UUID.randomUUID().toString()), null, null);
        } else {
            this.f246373f = new d18(sharedPreferences.getString("crashlytics.installation.id", null), null, null);
        }
        Objects.toString(this.f246373f);
        hazVar.m46951r();
        return this.f246373f;
    }
}
