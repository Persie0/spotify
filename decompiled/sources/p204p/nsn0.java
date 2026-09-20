package p204p;

import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class nsn0 {

    /* JADX INFO: renamed from: a */
    public CharSequence f157848a;

    /* JADX INFO: renamed from: b */
    public IconCompat f157849b;

    /* JADX INFO: renamed from: c */
    public String f157850c;

    /* JADX INFO: renamed from: d */
    public String f157851d;

    /* JADX INFO: renamed from: e */
    public boolean f157852e;

    /* JADX INFO: renamed from: f */
    public boolean f157853f;

    /* JADX INFO: renamed from: a */
    public static nsn0 m65570a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        CharSequence charSequence = bundle.getCharSequence("name");
        IconCompat iconCompatM387a = bundle2 != null ? IconCompat.m387a(bundle2) : null;
        String string = bundle.getString("uri");
        String string2 = bundle.getString("key");
        boolean z = bundle.getBoolean("isBot");
        boolean z2 = bundle.getBoolean("isImportant");
        nsn0 nsn0Var = new nsn0();
        nsn0Var.f157848a = charSequence;
        nsn0Var.f157849b = iconCompatM387a;
        nsn0Var.f157850c = string;
        nsn0Var.f157851d = string2;
        nsn0Var.f157852e = z;
        nsn0Var.f157853f = z2;
        return nsn0Var;
    }

    /* JADX INFO: renamed from: b */
    public final IconCompat m65571b() {
        return this.f157849b;
    }

    /* JADX INFO: renamed from: c */
    public final String m65572c() {
        return this.f157851d;
    }

    /* JADX INFO: renamed from: d */
    public final CharSequence m65573d() {
        return this.f157848a;
    }

    /* JADX INFO: renamed from: e */
    public final String m65574e() {
        return this.f157850c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof nsn0)) {
            return false;
        }
        nsn0 nsn0Var = (nsn0) obj;
        String str = this.f157851d;
        String str2 = nsn0Var.f157851d;
        if (str == null && str2 == null) {
            return Objects.equals(Objects.toString(this.f157848a), Objects.toString(nsn0Var.f157848a)) && Objects.equals(this.f157850c, nsn0Var.f157850c) && Boolean.valueOf(this.f157852e).equals(Boolean.valueOf(nsn0Var.f157852e)) && Boolean.valueOf(this.f157853f).equals(Boolean.valueOf(nsn0Var.f157853f));
        }
        return Objects.equals(str, str2);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m65575f() {
        return this.f157852e;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m65576g() {
        return this.f157853f;
    }

    /* JADX INFO: renamed from: h */
    public final Person m65577h() {
        return t35.m79963c(this);
    }

    public final int hashCode() {
        String str = this.f157851d;
        return str != null ? str.hashCode() : Objects.hash(this.f157848a, this.f157850c, Boolean.valueOf(this.f157852e), Boolean.valueOf(this.f157853f));
    }

    /* JADX INFO: renamed from: i */
    public final Bundle m65578i() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f157848a);
        IconCompat iconCompat = this.f157849b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.m399m() : null);
        bundle.putString("uri", this.f157850c);
        bundle.putString("key", this.f157851d);
        bundle.putBoolean("isBot", this.f157852e);
        bundle.putBoolean("isImportant", this.f157853f);
        return bundle;
    }

    /* JADX INFO: renamed from: j */
    public final PersistableBundle m65579j() {
        PersistableBundle persistableBundle = new PersistableBundle();
        CharSequence charSequence = this.f157848a;
        persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
        persistableBundle.putString("uri", this.f157850c);
        persistableBundle.putString("key", this.f157851d);
        persistableBundle.putBoolean("isBot", this.f157852e);
        persistableBundle.putBoolean("isImportant", this.f157853f);
        return persistableBundle;
    }
}
