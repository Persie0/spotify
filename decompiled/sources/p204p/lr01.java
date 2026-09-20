package p204p;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes10.dex */
public final class lr01 {

    /* JADX INFO: renamed from: a */
    public final Context f136182a;

    /* JADX INFO: renamed from: b */
    public final m12 f136183b;

    public lr01(Context context, po11 po11Var) {
        this.f136182a = context;
        this.f136183b = ((zvy) po11Var.f179562b).m97098a();
    }

    /* JADX INFO: renamed from: a */
    public final ovy m59780a(String str) {
        File cacheDir = this.f136182a.getApplicationContext().getCacheDir();
        m12 m12Var = this.f136183b;
        ovy ovyVarM60515l = m12Var.m60515l(cacheDir, "videoshare");
        File file = ((ewy) ovyVarM60515l).f63623b;
        if (file.exists() || ovyVarM60515l.mkdirs()) {
            return m12Var.m60517p(ovyVarM60515l, str);
        }
        throw new IllegalStateException("Can't create directory ".concat(file.getAbsolutePath()).toString());
    }
}
