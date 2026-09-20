package p204p;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public class g45 {

    /* JADX INFO: renamed from: b */
    public static final HashSet f76345b = new HashSet();

    /* JADX INFO: renamed from: a */
    public final String f76346a;

    public g45(String str) {
        this.f76346a = str;
        f76345b.add(this);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m43518a() {
        HashSet hashSet = f45.f65675a;
        String str = this.f76346a;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        if (!"eng".equals(str2) && !"userdebug".equals(str2)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":dev");
        return hashSet.contains(sb.toString());
    }
}
