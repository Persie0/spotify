package p204p;

import android.content.ContentResolver;
import android.provider.Settings;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class k6r implements j6r {

    /* JADX INFO: renamed from: e */
    public static final fv31 f119827e = fv31.f73628b.m78182S("installation_id");

    /* JADX INFO: renamed from: f */
    public static final Object f119828f = new Object();

    /* JADX INFO: renamed from: a */
    public final ContentResolver f119829a;

    /* JADX INFO: renamed from: b */
    public final hv31 f119830b;

    /* JADX INFO: renamed from: c */
    public String f119831c;

    /* JADX INFO: renamed from: d */
    public String f119832d;

    public k6r(ContentResolver contentResolver, hv31 hv31Var) {
        this.f119829a = contentResolver;
        this.f119830b = hv31Var;
    }

    /* JADX INFO: renamed from: a */
    public final String m55613a() {
        String string = Settings.Secure.getString(this.f119829a, "android_id");
        if (kgg1.m56363z(string)) {
            return "0";
        }
        wj50.m88279p(string);
        return string;
    }

    /* JADX INFO: renamed from: b */
    public final String m55614b() {
        if (kgg1.m56363z(this.f119831c)) {
            this.f119831c = UUID.randomUUID().toString();
        }
        String str = this.f119831c;
        wj50.m88279p(str);
        return str;
    }
}
