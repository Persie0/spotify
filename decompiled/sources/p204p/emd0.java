package p204p;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class emd0 {

    /* JADX INFO: renamed from: a */
    public final Context f60887a;

    /* JADX INFO: renamed from: b */
    public final t180 f60888b;

    /* JADX INFO: renamed from: c */
    public final un6 f60889c = new un6(this, 6);

    /* JADX INFO: renamed from: d */
    public jwg1 f60890d;

    /* JADX INFO: renamed from: e */
    public uld0 f60891e;

    /* JADX INFO: renamed from: f */
    public boolean f60892f;

    /* JADX INFO: renamed from: g */
    public fmd0 f60893g;

    /* JADX INFO: renamed from: h */
    public boolean f60894h;

    public emd0(Context context, t180 t180Var) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        this.f60887a = context;
        if (t180Var == null) {
            this.f60888b = new t180(new ComponentName(context, getClass()), 18);
        } else {
            this.f60888b = t180Var;
        }
    }

    /* JADX INFO: renamed from: a */
    public zld0 mo36410a(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    /* JADX INFO: renamed from: b */
    public zld0 mo39413b(String str, cmd0 cmd0Var) {
        return mo36410a(str);
    }

    /* JADX INFO: renamed from: c */
    public amd0 mo36411c(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    /* JADX INFO: renamed from: d */
    public amd0 mo36412d(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 != null) {
            return mo39414e(str, cmd0.f39651b);
        }
        throw new IllegalArgumentException("routeGroupId cannot be null");
    }

    /* JADX INFO: renamed from: e */
    public amd0 mo39414e(String str, cmd0 cmd0Var) {
        return mo36411c(str);
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo36413f(uld0 uld0Var);

    /* JADX INFO: renamed from: g */
    public final void m39415g(fmd0 fmd0Var) {
        zmd0.m96426b();
        if (this.f60893g != fmd0Var) {
            this.f60893g = fmd0Var;
            if (this.f60894h) {
                return;
            }
            this.f60894h = true;
            this.f60889c.sendEmptyMessage(1);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m39416h(uld0 uld0Var) {
        zmd0.m96426b();
        if (p1m0.m68831l(this.f60891e, uld0Var)) {
            return;
        }
        this.f60891e = uld0Var;
        if (this.f60892f) {
            return;
        }
        this.f60892f = true;
        this.f60889c.sendEmptyMessage(2);
    }
}
