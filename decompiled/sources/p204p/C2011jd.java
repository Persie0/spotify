package p204p;

import android.app.Application;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: p.jd */
/* JADX INFO: loaded from: classes.dex */
public final class C2011jd {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f111211a;

    public C2011jd(Application application) {
        this.f111211a = application.getSharedPreferences("_GRECAPTCHA", 0);
    }

    public C2011jd(int i) {
        switch (i) {
            case 1:
                this.f111211a = p8y.m69343a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
                break;
            default:
                SharedPreferences sharedPreferences = p8y.m69343a().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
                new zkq0(29);
                this.f111211a = sharedPreferences;
                break;
        }
    }
}
