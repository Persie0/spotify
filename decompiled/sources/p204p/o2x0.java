package p204p;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class o2x0<T> {

    /* JADX INFO: renamed from: a */
    public final n2x0 f161171a;

    /* JADX INFO: renamed from: b */
    public final Object f161172b;

    /* JADX INFO: renamed from: c */
    public final p3x0 f161173c;

    public o2x0(n2x0 n2x0Var, Object obj, p3x0 p3x0Var) {
        this.f161171a = n2x0Var;
        this.f161172b = obj;
        this.f161173c = p3x0Var;
    }

    /* JADX INFO: renamed from: a */
    public static o2x0 m66138a(int i, p3x0 p3x0Var) {
        Objects.requireNonNull(p3x0Var, "body == null");
        if (i < 400) {
            throw new IllegalArgumentException(s571.m77246e(i, "code < 400: "));
        }
        o3x0 o3x0Var = p3x0.f173765a;
        ArrayList arrayList = new ArrayList(20);
        w4l0 w4l0Var = new w4l0(p3x0Var.mo28082f(), p3x0Var.mo28081e());
        ztw0 ztw0Var = new ztw0();
        ztw0Var.m96954g("http://localhost/");
        auw0 auw0Var = new auw0(ztw0Var);
        if (i < 0) {
            throw new IllegalStateException(s571.m77246e(i, "code < 0: ").toString());
        }
        return m66139b(p3x0Var, new n2x0(auw0Var, r3t0.HTTP_1_1, "Response.error()", i, null, new sn20((String[]) arrayList.toArray(new String[0])), w4l0Var, null, null, null, null, 0L, 0L, null, hw81.f95887w0));
    }

    /* JADX INFO: renamed from: b */
    public static o2x0 m66139b(p3x0 p3x0Var, n2x0 n2x0Var) {
        Objects.requireNonNull(p3x0Var, "body == null");
        if (n2x0Var.f149852O0) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new o2x0(n2x0Var, null, p3x0Var);
    }

    /* JADX INFO: renamed from: c */
    public static o2x0 m66140c(Boolean bool) {
        o3x0 o3x0Var = p3x0.f173765a;
        ArrayList arrayList = new ArrayList(20);
        ztw0 ztw0Var = new ztw0();
        ztw0Var.m96954g("http://localhost/");
        return m66141d(bool, new n2x0(new auw0(ztw0Var), r3t0.HTTP_1_1, "OK", 200, null, new sn20((String[]) arrayList.toArray(new String[0])), o3x0Var, null, null, null, null, 0L, 0L, null, hw81.f95887w0));
    }

    /* JADX INFO: renamed from: d */
    public static o2x0 m66141d(Object obj, n2x0 n2x0Var) {
        if (n2x0Var.f149852O0) {
            return new o2x0(n2x0Var, obj, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public final String toString() {
        return this.f161171a.toString();
    }
}
