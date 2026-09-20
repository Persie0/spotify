package p204p;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class zzx0 implements ze10 {

    /* JADX INFO: renamed from: a */
    public static final zzx0 f288153a = new zzx0();

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f288154b = new LinkedHashMap();

    @Override // p204p.ze10
    /* JADX INFO: renamed from: a */
    public final File mo94334a(Context context, String str) {
        return new File(context.getApplicationContext().getFilesDir(), s571.m77251j("datastore/", str, ".preferences_pb"));
    }

    @Override // p204p.ze10
    /* JADX INFO: renamed from: b */
    public final Object mo94335b(Context context, String str) {
        wko wkoVar;
        LinkedHashMap linkedHashMap = f288154b;
        synchronized (linkedHashMap) {
            try {
                Object objM79933a = linkedHashMap.get(str);
                if (objM79933a == null) {
                    objM79933a = t2z.m79933a(new pmw0(zix0.f283281X0), new xq70(2, context, str), 6);
                    linkedHashMap.put(str, objM79933a);
                }
                wkoVar = (wko) objM79933a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wkoVar;
    }
}
