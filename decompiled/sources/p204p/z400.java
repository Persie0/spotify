package p204p;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class z400 {

    /* JADX INFO: renamed from: e */
    public static final qti0 f279079e = qti0.m73843g("<root>");

    /* JADX INFO: renamed from: a */
    public final String f279080a;

    /* JADX INFO: renamed from: b */
    public transient y400 f279081b;

    /* JADX INFO: renamed from: c */
    public transient z400 f279082c;

    /* JADX INFO: renamed from: d */
    public transient qti0 f279083d;

    static {
        Pattern.compile("\\.");
    }

    public z400(String str, y400 y400Var) {
        this.f279080a = str;
        this.f279081b = y400Var;
    }

    /* JADX INFO: renamed from: f */
    public static final List m95300f(z400 z400Var) {
        if (z400Var.m95303c()) {
            return new ArrayList();
        }
        List listM95300f = m95300f(z400Var.m95305e());
        listM95300f.add(z400Var.m95306g());
        return listM95300f;
    }

    /* JADX INFO: renamed from: a */
    public final z400 m95301a(qti0 qti0Var) {
        String strM73844b;
        if (m95303c()) {
            strM73844b = qti0Var.m73844b();
        } else {
            strM73844b = this.f279080a + '.' + qti0Var.m73844b();
        }
        wj50.m88279p(strM73844b);
        return new z400(strM73844b, this, qti0Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m95302b() {
        String str = this.f279080a;
        int length = str.length() - 1;
        boolean z = false;
        while (true) {
            if (length < 0) {
                length = -1;
                break;
            }
            char cCharAt = str.charAt(length);
            if (cCharAt == '.' && !z) {
                break;
            }
            if (cCharAt == '`') {
                z = !z;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        if (length >= 0) {
            this.f279083d = qti0.m73840d(str.substring(length + 1));
            this.f279082c = new z400(str.substring(0, length));
        } else {
            this.f279083d = qti0.m73840d(str);
            this.f279082c = y400.f269047c.f269048a;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m95303c() {
        return this.f279080a.length() == 0;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m95304d() {
        return this.f279081b != null || wl51.m88457G0(this.f279080a, '<', 0, 6) < 0;
    }

    /* JADX INFO: renamed from: e */
    public final z400 m95305e() {
        z400 z400Var = this.f279082c;
        if (z400Var != null) {
            return z400Var;
        }
        if (m95303c()) {
            throw new IllegalStateException("root");
        }
        m95302b();
        z400 z400Var2 = this.f279082c;
        wj50.m88279p(z400Var2);
        return z400Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z400) {
            return wj50.m88271j(this.f279080a, ((z400) obj).f279080a);
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final qti0 m95306g() {
        qti0 qti0Var = this.f279083d;
        if (qti0Var != null) {
            return qti0Var;
        }
        if (m95303c()) {
            throw new IllegalStateException("root");
        }
        m95302b();
        qti0 qti0Var2 = this.f279083d;
        wj50.m88279p(qti0Var2);
        return qti0Var2;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m95307h(qti0 qti0Var) {
        if (!m95303c()) {
            String str = this.f279080a;
            int iM88457G0 = wl51.m88457G0(str, '.', 0, 6);
            if (iM88457G0 == -1) {
                iM88457G0 = str.length();
            }
            String strM73844b = qti0Var.m73844b();
            if (iM88457G0 == strM73844b.length() && str.regionMatches(0, strM73844b, 0, iM88457G0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f279080a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final y400 m95308i() {
        y400 y400Var = this.f279081b;
        if (y400Var != null) {
            return y400Var;
        }
        y400 y400Var2 = new y400(this);
        this.f279081b = y400Var2;
        return y400Var2;
    }

    public final String toString() {
        return m95303c() ? f279079e.m73844b() : this.f279080a;
    }

    public z400(String str) {
        this.f279080a = str;
    }

    public z400(String str, z400 z400Var, qti0 qti0Var) {
        this.f279080a = str;
        this.f279082c = z400Var;
        this.f279083d = qti0Var;
    }
}
