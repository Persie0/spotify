package p204p;

import android.content.Context;
import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public final class irb {

    /* JADX INFO: renamed from: a */
    public final ci5 f104940a;

    public irb(ci5 ci5Var) {
        this.f104940a = ci5Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m51462a(Context context) {
        Configuration configuration = context.getResources().getConfiguration();
        boolean z = configuration.screenHeightDp > configuration.screenWidthDp;
        ci5 ci5Var = this.f104940a;
        if (z && ci5Var.m32872d()) {
            return true;
        }
        if (!z && ci5Var.m32871c()) {
            return true;
        }
        int i = configuration.screenWidthDp;
        return i < 600 && i / configuration.screenHeightDp < 1;
    }
}
