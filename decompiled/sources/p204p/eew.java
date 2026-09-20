package p204p;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class eew {

    /* JADX INFO: renamed from: a */
    public final ab3 f58867a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f58868b = new ArrayList();

    public eew(xre xreVar, ab3 ab3Var) {
        this.f58867a = ab3Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m38711a(String str) {
        synchronized (this) {
            try {
                if (((Boolean) this.f58867a.invoke()).booleanValue()) {
                    if (this.f58868b.size() >= 25) {
                        this.f58868b.remove(0);
                    }
                    this.f58868b.add(new pqm0(new SimpleDateFormat("HH:mm:ss.SSS", Locale.getDefault()).format(Long.valueOf(System.currentTimeMillis())), str));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m38712b(String str, String str2, String str3) {
        if (((Boolean) this.f58867a.invoke()).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.concat(": "));
            sb.append(str2);
            if (str3 != null && str3.length() != 0) {
                sb.append(" | ");
                sb.append(str3);
            }
            m38711a(sb.toString());
        }
    }
}
