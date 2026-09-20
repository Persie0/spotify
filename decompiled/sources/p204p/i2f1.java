package p204p;

import android.app.Application;
import android.content.SharedPreferences;
import com.ravelin.core.repository.broadcastsdb.BroadcastsDatabase;
import com.ravelin.core.repository.p008db.AppDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final class i2f1 implements h4t0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f97836a;

    /* JADX INFO: renamed from: b */
    public final h4t0 f97837b;

    public /* synthetic */ i2f1(int i, Object obj, h4t0 h4t0Var) {
        this.f97836a = i;
        this.f97837b = h4t0Var;
    }

    @Override // p204p.i4t0
    public final Object get() {
        int i = this.f97836a;
        h4t0 h4t0Var = this.f97837b;
        switch (i) {
            case 0:
                return new mve((alk0) h4t0Var.get());
            case 1:
                return new u1f1((Application) h4t0Var.get());
            case 2:
                return new uue((yd70) h4t0Var.get());
            case 3:
                Application application = (Application) h4t0Var.get();
                try {
                    j7n0.m52630a(application);
                    SharedPreferences sharedPreferences = application.getSharedPreferences("my_com.ravelin.core_shared_pref_data", 0);
                    wj50.m88279p(sharedPreferences);
                    return sharedPreferences;
                } catch (Exception unused) {
                    SharedPreferences sharedPreferences2 = application.getSharedPreferences("my_com.ravelin.core_shared_pref_data", 0);
                    wj50.m88279p(sharedPreferences2);
                    return sharedPreferences2;
                }
            case 4:
                ijx0 ijx0VarM54070p = jq60.m54070p((Application) h4t0Var.get(), BroadcastsDatabase.class, "com.ravelin.sdk.broadcasts");
                ijx0VarM54070p.f102913i = true;
                return (BroadcastsDatabase) ijx0VarM54070p.m50846c();
            case 5:
                return new v1f1(((Application) h4t0Var.get()).getApplicationContext());
            case 6:
                ijx0 ijx0VarM54070p2 = jq60.m54070p((Application) h4t0Var.get(), AppDatabase.class, "com.ravelin.sdk.device");
                ijx0VarM54070p2.f102913i = true;
                ijx0VarM54070p2.m50844a(AppDatabase.f2665l, AppDatabase.f2666m, AppDatabase.f2667n, AppDatabase.f2668o);
                return (AppDatabase) ijx0VarM54070p2.m50846c();
            case 7:
                return new a3f1((wue) h4t0Var.get());
            default:
                return new b2f1((Application) h4t0Var.get());
        }
    }
}
