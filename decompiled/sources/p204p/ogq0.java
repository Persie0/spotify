package p204p;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes9.dex */
public final class ogq0 {

    /* JADX INFO: renamed from: a */
    public final Context f165202a;

    /* JADX INFO: renamed from: b */
    public final String f165203b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f165204c;

    /* JADX INFO: renamed from: d */
    public final vre f165205d;

    /* JADX INFO: renamed from: e */
    public final int f165206e;

    /* JADX INFO: renamed from: f */
    public final int f165207f;

    /* JADX INFO: renamed from: g */
    public final ziq0 f165208g;

    /* JADX INFO: renamed from: h */
    public final ziq0 f165209h;

    public ogq0(Context context, ziq0 ziq0Var, ziq0 ziq0Var2) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.spotify.music.pam.badge.SeeAllPlans", 0);
        vre vreVarM94419b = yre.m94419b();
        this.f165202a = context;
        this.f165203b = "com.spotify.music.pam.badge.SeeAllPlans";
        this.f165204c = sharedPreferences;
        this.f165205d = vreVarM94419b;
        this.f165206e = 3;
        this.f165207f = 30;
        this.f165208g = ziq0Var;
        this.f165209h = ziq0Var2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m66895a(boolean z) {
        jba0 jba0VarM52884x6 = jba0.m52884x6(this.f165205d);
        if (((Boolean) this.f165209h.invoke()).booleanValue()) {
            int iIntValue = ((Number) this.f165208g.invoke()).intValue();
            SharedPreferences sharedPreferences = this.f165204c;
            if (iIntValue > sharedPreferences.getInt("last_version", 0)) {
                sharedPreferences.edit().putInt("last_version", iIntValue).commit();
                sharedPreferences.edit().putInt("impression_count", 0).commit();
                sharedPreferences.edit().putBoolean("interacted", false).commit();
            }
            if (!sharedPreferences.getBoolean("interacted", false)) {
                if (z) {
                    sharedPreferences.edit().putInt("impression_count", sharedPreferences.getInt("impression_count", 0) + 1).commit();
                    if (sharedPreferences.getInt("impression_count", 0) == 1) {
                        sharedPreferences.edit().putLong("first_impression_ts", jba0VarM52884x6.toEpochDay()).commit();
                    }
                }
                if (sharedPreferences.getInt("impression_count", 0) != 0) {
                    long jMo27576m = jba0.m52878A6(sharedPreferences.getLong("first_impression_ts", 0L)).mo27576m(jba0VarM52884x6, gce.DAYS);
                    boolean z2 = sharedPreferences.getInt("impression_count", 0) > this.f165206e;
                    boolean z3 = jMo27576m > ((long) this.f165207f);
                    if (z2 || z3) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogq0)) {
            return false;
        }
        ogq0 ogq0Var = (ogq0) obj;
        return wj50.m88271j(this.f165202a, ogq0Var.f165202a) && wj50.m88271j(this.f165203b, ogq0Var.f165203b) && wj50.m88271j(this.f165204c, ogq0Var.f165204c) && wj50.m88271j(this.f165205d, ogq0Var.f165205d) && this.f165206e == ogq0Var.f165206e && this.f165207f == ogq0Var.f165207f && wj50.m88271j(this.f165208g, ogq0Var.f165208g) && wj50.m88271j(this.f165209h, ogq0Var.f165209h);
    }

    public final int hashCode() {
        return this.f165209h.hashCode() + ((this.f165208g.hashCode() + mt60.m62800g(this.f165207f, mt60.m62800g(this.f165206e, (this.f165205d.hashCode() + ((this.f165204c.hashCode() + s571.m77243b(this.f165202a.hashCode() * 31, 31, this.f165203b)) * 31)) * 31, 31), 31)) * 31);
    }
}
