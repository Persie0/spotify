package p204p;

import com.spotify.base.java.logging.Logger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class gd41 extends cnc0 {

    /* JADX INFO: renamed from: b */
    public static final Pattern f78727b = Pattern.compile("\\{\\}");

    /* JADX INFO: renamed from: b */
    public static String m44347b(String str) {
        return f78727b.matcher(str).replaceAll("%s");
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: a */
    public final void mo27132a(Object obj) {
        m44347b("Mobius ({}) - Initializing loop");
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: d */
    public final void mo27133d(String str, Object obj, Object obj2) {
        if (obj2 instanceof Throwable) {
            m44347b(str);
        } else {
            m44347b(str);
        }
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: e */
    public final void mo27134e(String str) {
        Logger.m3966b(str, new Object[0]);
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: f */
    public final void mo27135f(String str, Object... objArr) {
        if (objArr[objArr.length - 1] instanceof Throwable) {
            Logger.m3974j((Throwable) objArr[objArr.length - 1], m44347b(str), Arrays.copyOf(objArr, objArr.length - 1));
        } else {
            Logger.m3973i(m44347b(str), objArr);
        }
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: g */
    public final void mo27136g(Exception exc, String str) {
        Logger.m3967c(exc, str, new Object[0]);
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: h */
    public final boolean mo27137h() {
        return true;
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: i */
    public final void mo27138i(String str, Integer num, Object obj) {
        if (!(obj instanceof Throwable)) {
            m44347b(str);
            return;
        }
        Throwable th = (Throwable) obj;
        String strM44347b = m44347b(str);
        Object[] objArr = {num};
        Iterator it = Logger.f3009a.iterator();
        while (it.hasNext()) {
            Logger.m3972h(((mpa0) it.next()).mo51900d(), th, strM44347b, objArr);
        }
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: j */
    public final void mo27139j(String str, Throwable th) {
        Object[] objArr = new Object[0];
        Iterator it = Logger.f3009a.iterator();
        while (it.hasNext()) {
            Logger.m3972h(((mpa0) it.next()).mo51900d(), th, str, objArr);
        }
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: k */
    public final void mo27140k(Object obj, Exception exc) {
        Logger.m3967c(exc, m44347b("FATAL ERROR: exception during initialization from model {}"), obj);
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: l */
    public final void mo27141l(Object obj, String str) {
        m44347b(str);
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: m */
    public final void mo27142m(Object obj, String str) {
        Logger.m3973i(m44347b(str), obj);
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: n */
    public final void mo27143n(Object... objArr) {
        if (objArr[objArr.length - 1] instanceof Throwable) {
            Logger.m3967c((Throwable) objArr[objArr.length - 1], m44347b("FATAL ERROR: exception updating model '{}' with event '{}'"), Arrays.copyOf(objArr, objArr.length - 1));
        } else {
            Logger.m3966b(m44347b("FATAL ERROR: exception updating model '{}' with event '{}'"), objArr);
        }
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: o */
    public final void mo27144o(String str) {
        Logger.m3973i(str, new Object[0]);
    }

    @Override // p204p.xra0
    /* JADX INFO: renamed from: p */
    public final void mo27145p(String str) {
    }
}
