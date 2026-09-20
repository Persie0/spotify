package p204p;

import android.app.Application;
import android.content.Context;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class jb6 extends oze1 {

    /* JADX INFO: renamed from: c */
    public final Context f110663c;

    public jb6(Application application) {
        this.f110663c = application;
    }

    @Override // p204p.oze1
    /* JADX INFO: renamed from: a */
    public final void mo52876a() {
        InputStream inputStreamOpen = null;
        try {
            try {
                inputStreamOpen = this.f110663c.getAssets().open("org/threeten/bp/TZDB.dat");
                aq91 aq91Var = new aq91(inputStreamOpen);
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused) {
                    }
                }
                aq91.m26762c(aq91Var);
            } catch (IOException e) {
                throw new IllegalStateException("org/threeten/bp/TZDB.dat missing from assets", e);
            }
        } catch (Throwable th) {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
