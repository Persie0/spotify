package androidx.glance.appwidget.protobuf;

import androidx.car.app.model.Alert;
import java.nio.charset.Charset;
import p204p.ava;
import p204p.ce50;
import p204p.g3t0;
import p204p.jgy0;
import p204p.jua;
import p204p.yd50;
import p204p.ytx;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C0058d {

    /* JADX INFO: renamed from: a */
    public final jua f910a;

    /* JADX INFO: renamed from: b */
    public int f911b;

    /* JADX INFO: renamed from: c */
    public int f912c;

    /* JADX INFO: renamed from: d */
    public int f913d = 0;

    public C0058d(jua juaVar) {
        Charset charset = ce50.f37010a;
        this.f910a = juaVar;
        juaVar.f116062b = this;
    }

    /* JADX INFO: renamed from: a */
    public static C0058d m643a(jua juaVar) {
        C0058d c0058d = (C0058d) juaVar.f116062b;
        return c0058d != null ? c0058d : new C0058d(juaVar);
    }

    /* JADX INFO: renamed from: b */
    public final int m644b() {
        int i = this.f913d;
        if (i != 0) {
            this.f911b = i;
            this.f913d = 0;
        } else {
            this.f911b = this.f910a.mo627u();
        }
        int i2 = this.f911b;
        return (i2 == 0 || i2 == this.f912c) ? Alert.DURATION_SHOW_INDEFINITELY : i2 >>> 3;
    }

    /* JADX INFO: renamed from: c */
    public final void m645c(Object obj, jgy0 jgy0Var, ytx ytxVar) {
        int i = this.f912c;
        this.f912c = ((this.f911b >>> 3) << 3) | 4;
        try {
            jgy0Var.mo704h(obj, this, ytxVar);
            if (this.f911b != this.f912c) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            this.f912c = i;
        } catch (Throwable th) {
            this.f912c = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m646d(Object obj, jgy0 jgy0Var, ytx ytxVar) throws InvalidProtocolBufferException {
        jua juaVar = this.f910a;
        int iMo628v = juaVar.mo628v();
        if (juaVar.f116061a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iMo611e = juaVar.mo611e(iMo628v);
        juaVar.f116061a++;
        jgy0Var.mo704h(obj, this, ytxVar);
        juaVar.mo607a(0);
        juaVar.f116061a--;
        juaVar.mo610d(iMo611e);
    }

    /* JADX INFO: renamed from: e */
    public final void m647e(yd50 yd50Var) throws InvalidProtocolBufferException {
        int iMo627u;
        int i = this.f911b & 7;
        jua juaVar = this.f910a;
        if (i == 0) {
            do {
                ((g3t0) yd50Var).add(Boolean.valueOf(juaVar.mo612f()));
                if (juaVar.mo609c()) {
                    return;
                } else {
                    iMo627u = juaVar.mo627u();
                }
            } while (iMo627u == this.f911b);
            this.f913d = iMo627u;
            return;
        }
        if (i != 2) {
            int i2 = InvalidProtocolBufferException.f893b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int iMo608b = juaVar.mo608b() + juaVar.mo628v();
        do {
            ((g3t0) yd50Var).add(Boolean.valueOf(juaVar.mo612f()));
        } while (juaVar.mo608b() < iMo608b);
        m664v(iMo608b);
    }

    /* JADX INFO: renamed from: f */
    public final ava m648f() throws InvalidProtocolBufferException.InvalidWireTypeException {
        m665w(2);
        return this.f910a.mo613g();
    }

    /* JADX INFO: renamed from: g */
    public final void m649g(yd50 yd50Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iMo627u;
        if ((this.f911b & 7) != 2) {
            int i = InvalidProtocolBufferException.f893b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        do {
            ((g3t0) yd50Var).add(m648f());
            jua juaVar = this.f910a;
            if (juaVar.mo609c()) {
                return;
            } else {
                iMo627u = juaVar.mo627u();
            }
        } while (iMo627u == this.f911b);
        this.f913d = iMo627u;
    }

    /* JADX INFO: renamed from: h */
    public final void m650h(yd50 yd50Var) throws InvalidProtocolBufferException {
        int iMo627u;
        int i = this.f911b & 7;
        jua juaVar = this.f910a;
        if (i == 1) {
            do {
                ((g3t0) yd50Var).add(Double.valueOf(juaVar.mo614h()));
                if (juaVar.mo609c()) {
                    return;
                } else {
                    iMo627u = juaVar.mo627u();
                }
            } while (iMo627u == this.f911b);
            this.f913d = iMo627u;
            return;
        }
        if (i != 2) {
            int i2 = InvalidProtocolBufferException.f893b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int iMo628v = juaVar.mo628v();
        if ((iMo628v & 7) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int iMo608b = juaVar.mo608b() + iMo628v;
        do {
            ((g3t0) yd50Var).add(Double.valueOf(juaVar.mo614h()));
        } while (juaVar.mo608b() < iMo608b);
    }

    /* JADX INFO: renamed from: i */
    public final void m651i(yd50 yd50Var) throws InvalidProtocolBufferException {
        int iMo627u;
        int i = this.f911b & 7;
        jua juaVar = this.f910a;
        if (i == 0) {
            do {
                ((g3t0) yd50Var).add(Integer.valueOf(juaVar.mo615i()));
                if (juaVar.mo609c()) {
                    return;
                } else {
                    iMo627u = juaVar.mo627u();
                }
            } while (iMo627u == this.f911b);
            this.f913d = iMo627u;
            return;
        }
        if (i != 2) {
            int i2 = InvalidProtocolBufferException.f893b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int iMo608b = juaVar.mo608b() + juaVar.mo628v();
        do {
            ((g3t0) yd50Var).add(Integer.valueOf(juaVar.mo615i()));
        } while (juaVar.mo608b() < iMo608b);
        m664v(iMo608b);
    }

    /* JADX INFO: renamed from: j */
    public final void m652j(yd50 yd50Var) throws InvalidProtocolBufferException {
        int iMo627u;
        int i = this.f911b & 7;
        jua juaVar = this.f910a;
        if (i == 2) {
            int iMo628v = juaVar.mo628v();
            if ((iMo628v & 3) != 0) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            int iMo608b = juaVar.mo608b() + iMo628v;
            do {
                ((g3t0) yd50Var).add(Integer.valueOf(juaVar.mo616j()));
            } while (juaVar.mo608b() < iMo608b);
            return;
        }
        if (i != 5) {
            int i2 = InvalidProtocolBufferException.f893b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        do {
            ((g3t0) yd50Var).add(Integer.valueOf(juaVar.mo616j()));
            if (juaVar.mo609c()) {
                return;
            } else {
                iMo627u = juaVar.mo627u();
            }
        } while (iMo627u == this.f911b);
        this.f913d = iMo627u;
    }

    /* JADX INFO: renamed from: k */
    public final void m653k(yd50 yd50Var) throws InvalidProtocolBufferException {
        int iMo627u;
        int i = this.f911b & 7;
        jua juaVar = this.f910a;
        if (i == 1) {
            do {
                ((g3t0) yd50Var).add(Long.valueOf(juaVar.mo617k()));
                if (juaVar.mo609c()) {
                    return;
                } else {
                    iMo627u = juaVar.mo627u();
                }
            } while (iMo627u == this.f911b);
            this.f913d = iMo627u;
            return;
        }
        if (i != 2) {
            int i2 = InvalidProtocolBufferException.f893b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int iMo628v = juaVar.mo628v();
        if ((iMo628v & 7) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int iMo608b = juaVar.mo608b() + iMo628v;
        do {
            ((g3t0) yd50Var).add(Long.valueOf(juaVar.mo617k()));
        } while (juaVar.mo608b() < iMo608b);
    }

    /* JADX INFO: renamed from: l */
    public final void m654l(yd50 yd50Var) throws InvalidProtocolBufferException {
        int iMo627u;
        int i = this.f911b & 7;
        jua juaVar = this.f910a;
        if (i == 2) {
            int iMo628v = juaVar.mo628v();
            if ((iMo628v & 3) != 0) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            int iMo608b = juaVar.mo608b() + iMo628v;
            do {
                ((g3t0) yd50Var).add(Float.valueOf(juaVar.mo618l()));
            } while (juaVar.mo608b() < iMo608b);
            return;
        }
        if (i != 5) {
            int i2 = InvalidProtocolBufferException.f893b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        do {
            ((g3t0) yd50Var).add(Float.valueOf(juaVar.mo618l()));
            if (juaVar.mo609c()) {
                return;
            } else {
                iMo627u = juaVar.mo627u();
            }
        } while (iMo627u == this.f911b);
        this.f913d = iMo627u;
    }

    /* JADX INFO: renamed from: m */
    public final void m655m(yd50 yd50Var) throws InvalidProtocolBufferException {
        int iMo627u;
        int i = this.f911b & 7;
        jua juaVar = this.f910a;
        if (i == 0) {
            do {
                ((g3t0) yd50Var).add(Integer.valueOf(juaVar.mo619m()));
                if (juaVar.mo609c()) {
                    return;
                } else {
                    iMo627u = juaVar.mo627u();
                }
            } while (iMo627u == this.f911b);
            this.f913d = iMo627u;
            return;
        }
        if (i != 2) {
            int i2 = InvalidProtocolBufferException.f893b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int iMo608b = juaVar.mo608b() + juaVar.mo628v();
        do {
            ((g3t0) yd50Var).add(Integer.valueOf(juaVar.mo619m()));
        } while (juaVar.mo608b() < iMo608b);
        m664v(iMo608b);
    }

    /* JADX INFO: renamed from: n */
    public final void m656n(yd50 yd50Var) throws InvalidProtocolBufferException {
        int iMo627u;
        int i = this.f911b & 7;
        jua juaVar = this.f910a;
        if (i == 0) {
            do {
                ((g3t0) yd50Var).add(Long.valueOf(juaVar.mo620n()));
                if (juaVar.mo609c()) {
                    return;
                } else {
                    iMo627u = juaVar.mo627u();
                }
            } while (iMo627u == this.f911b);
            this.f913d = iMo627u;
            return;
        }
        if (i != 2) {
            int i2 = InvalidProtocolBufferException.f893b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int iMo608b = juaVar.mo608b() + juaVar.mo628v();
        do {
            ((g3t0) yd50Var).add(Long.valueOf(juaVar.mo620n()));
        } while (juaVar.mo608b() < iMo608b);
        m664v(iMo608b);
    }

    /* JADX INFO: renamed from: o */
    public final void m657o(yd50 yd50Var) throws InvalidProtocolBufferException {
        int iMo627u;
        int i = this.f911b & 7;
        jua juaVar = this.f910a;
        if (i == 2) {
            int iMo628v = juaVar.mo628v();
            if ((iMo628v & 3) != 0) {
                throw new InvalidProtocolBufferException("Failed to parse the message.");
            }
            int iMo608b = juaVar.mo608b() + iMo628v;
            do {
                ((g3t0) yd50Var).add(Integer.valueOf(juaVar.mo621o()));
            } while (juaVar.mo608b() < iMo608b);
            return;
        }
        if (i != 5) {
            int i2 = InvalidProtocolBufferException.f893b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        do {
            ((g3t0) yd50Var).add(Integer.valueOf(juaVar.mo621o()));
            if (juaVar.mo609c()) {
                return;
            } else {
                iMo627u = juaVar.mo627u();
            }
        } while (iMo627u == this.f911b);
        this.f913d = iMo627u;
    }

    /* JADX INFO: renamed from: p */
    public final void m658p(yd50 yd50Var) throws InvalidProtocolBufferException {
        int iMo627u;
        int i = this.f911b & 7;
        jua juaVar = this.f910a;
        if (i == 1) {
            do {
                ((g3t0) yd50Var).add(Long.valueOf(juaVar.mo622p()));
                if (juaVar.mo609c()) {
                    return;
                } else {
                    iMo627u = juaVar.mo627u();
                }
            } while (iMo627u == this.f911b);
            this.f913d = iMo627u;
            return;
        }
        if (i != 2) {
            int i2 = InvalidProtocolBufferException.f893b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int iMo628v = juaVar.mo628v();
        if ((iMo628v & 7) != 0) {
            throw new InvalidProtocolBufferException("Failed to parse the message.");
        }
        int iMo608b = juaVar.mo608b() + iMo628v;
        do {
            ((g3t0) yd50Var).add(Long.valueOf(juaVar.mo622p()));
        } while (juaVar.mo608b() < iMo608b);
    }

    /* JADX INFO: renamed from: q */
    public final void m659q(yd50 yd50Var) throws InvalidProtocolBufferException {
        int iMo627u;
        int i = this.f911b & 7;
        jua juaVar = this.f910a;
        if (i == 0) {
            do {
                ((g3t0) yd50Var).add(Integer.valueOf(juaVar.mo623q()));
                if (juaVar.mo609c()) {
                    return;
                } else {
                    iMo627u = juaVar.mo627u();
                }
            } while (iMo627u == this.f911b);
            this.f913d = iMo627u;
            return;
        }
        if (i != 2) {
            int i2 = InvalidProtocolBufferException.f893b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int iMo608b = juaVar.mo608b() + juaVar.mo628v();
        do {
            ((g3t0) yd50Var).add(Integer.valueOf(juaVar.mo623q()));
        } while (juaVar.mo608b() < iMo608b);
        m664v(iMo608b);
    }

    /* JADX INFO: renamed from: r */
    public final void m660r(yd50 yd50Var) throws InvalidProtocolBufferException {
        int iMo627u;
        int i = this.f911b & 7;
        jua juaVar = this.f910a;
        if (i == 0) {
            do {
                ((g3t0) yd50Var).add(Long.valueOf(juaVar.mo624r()));
                if (juaVar.mo609c()) {
                    return;
                } else {
                    iMo627u = juaVar.mo627u();
                }
            } while (iMo627u == this.f911b);
            this.f913d = iMo627u;
            return;
        }
        if (i != 2) {
            int i2 = InvalidProtocolBufferException.f893b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int iMo608b = juaVar.mo608b() + juaVar.mo628v();
        do {
            ((g3t0) yd50Var).add(Long.valueOf(juaVar.mo624r()));
        } while (juaVar.mo608b() < iMo608b);
        m664v(iMo608b);
    }

    /* JADX INFO: renamed from: s */
    public final void m661s(yd50 yd50Var, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        String strMo625s;
        int iMo627u;
        if ((this.f911b & 7) != 2) {
            int i = InvalidProtocolBufferException.f893b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        do {
            jua juaVar = this.f910a;
            if (z) {
                m665w(2);
                strMo625s = juaVar.mo626t();
            } else {
                m665w(2);
                strMo625s = juaVar.mo625s();
            }
            ((g3t0) yd50Var).add(strMo625s);
            if (juaVar.mo609c()) {
                return;
            } else {
                iMo627u = juaVar.mo627u();
            }
        } while (iMo627u == this.f911b);
        this.f913d = iMo627u;
    }

    /* JADX INFO: renamed from: t */
    public final void m662t(yd50 yd50Var) throws InvalidProtocolBufferException {
        int iMo627u;
        int i = this.f911b & 7;
        jua juaVar = this.f910a;
        if (i == 0) {
            do {
                ((g3t0) yd50Var).add(Integer.valueOf(juaVar.mo628v()));
                if (juaVar.mo609c()) {
                    return;
                } else {
                    iMo627u = juaVar.mo627u();
                }
            } while (iMo627u == this.f911b);
            this.f913d = iMo627u;
            return;
        }
        if (i != 2) {
            int i2 = InvalidProtocolBufferException.f893b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int iMo608b = juaVar.mo608b() + juaVar.mo628v();
        do {
            ((g3t0) yd50Var).add(Integer.valueOf(juaVar.mo628v()));
        } while (juaVar.mo608b() < iMo608b);
        m664v(iMo608b);
    }

    /* JADX INFO: renamed from: u */
    public final void m663u(yd50 yd50Var) throws InvalidProtocolBufferException {
        int iMo627u;
        int i = this.f911b & 7;
        jua juaVar = this.f910a;
        if (i == 0) {
            do {
                ((g3t0) yd50Var).add(Long.valueOf(juaVar.mo629w()));
                if (juaVar.mo609c()) {
                    return;
                } else {
                    iMo627u = juaVar.mo627u();
                }
            } while (iMo627u == this.f911b);
            this.f913d = iMo627u;
            return;
        }
        if (i != 2) {
            int i2 = InvalidProtocolBufferException.f893b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int iMo608b = juaVar.mo608b() + juaVar.mo628v();
        do {
            ((g3t0) yd50Var).add(Long.valueOf(juaVar.mo629w()));
        } while (juaVar.mo608b() < iMo608b);
        m664v(iMo608b);
    }

    /* JADX INFO: renamed from: v */
    public final void m664v(int i) throws InvalidProtocolBufferException {
        if (this.f910a.mo608b() != i) {
            throw InvalidProtocolBufferException.m600d();
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m665w(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f911b & 7) == i) {
            return;
        }
        int i2 = InvalidProtocolBufferException.f893b;
        throw new InvalidProtocolBufferException.InvalidWireTypeException();
    }
}
