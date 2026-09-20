package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes11.dex */
public final class p0t0 extends t110 {

    /* JADX INFO: renamed from: L0 */
    public List f172763L0;

    /* JADX INFO: renamed from: M0 */
    public List f172764M0;

    /* JADX INFO: renamed from: N0 */
    public List f172765N0;

    /* JADX INFO: renamed from: O0 */
    public p1t0 f172766O0;

    /* JADX INFO: renamed from: P0 */
    public List f172767P0;

    /* JADX INFO: renamed from: Q0 */
    public e0t0 f172768Q0;

    /* JADX INFO: renamed from: R0 */
    public List f172769R0;

    /* JADX INFO: renamed from: S0 */
    public List f172770S0;

    /* JADX INFO: renamed from: T0 */
    public List f172771T0;

    /* JADX INFO: renamed from: X */
    public j1t0 f172772X;

    /* JADX INFO: renamed from: Y */
    public int f172773Y;

    /* JADX INFO: renamed from: Z */
    public List f172774Z;

    /* JADX INFO: renamed from: d */
    public int f172775d;

    /* JADX INFO: renamed from: e */
    public int f172776e;

    /* JADX INFO: renamed from: f */
    public int f172777f;

    /* JADX INFO: renamed from: g */
    public int f172778g;

    /* JADX INFO: renamed from: h */
    public j1t0 f172779h;

    /* JADX INFO: renamed from: i */
    public int f172780i;

    /* JADX INFO: renamed from: t */
    public List f172781t;

    /* JADX INFO: renamed from: h */
    public static p0t0 m68729h() {
        p0t0 p0t0Var = new p0t0();
        p0t0Var.f172776e = 6;
        p0t0Var.f172777f = 6;
        j1t0 j1t0Var = j1t0.f107844S0;
        p0t0Var.f172779h = j1t0Var;
        List list = Collections.EMPTY_LIST;
        p0t0Var.f172781t = list;
        p0t0Var.f172772X = j1t0Var;
        p0t0Var.f172774Z = list;
        p0t0Var.f172763L0 = list;
        p0t0Var.f172764M0 = list;
        p0t0Var.f172765N0 = list;
        p0t0Var.f172766O0 = p1t0.f173161g;
        p0t0Var.f172767P0 = list;
        p0t0Var.f172768Q0 = e0t0.f55031e;
        p0t0Var.f172769R0 = list;
        p0t0Var.f172770S0 = list;
        p0t0Var.f172771T0 = list;
        return p0t0Var;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: b */
    public final AbstractC2155n8 mo26645b() {
        q0t0 q0t0VarM68730g = m68730g();
        if (q0t0VarM68730g.isInitialized()) {
            return q0t0VarM68730g;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p204p.n110
    /* JADX INFO: renamed from: c */
    public final n110 mo26646c(pwe pweVar, bux buxVar) throws Throwable {
        q0t0 q0t0Var = null;
        try {
            try {
                q0t0.f184075X0.getClass();
                m68731i(new q0t0(pweVar, buxVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                q0t0 q0t0Var2 = (q0t0) e.f10912a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    q0t0Var = q0t0Var2;
                    if (q0t0Var != null) {
                        m68731i(q0t0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (q0t0Var != null) {
                m68731i(q0t0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        p0t0 p0t0VarM68729h = m68729h();
        p0t0VarM68729h.m68731i(m68730g());
        return p0t0VarM68729h;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ n110 mo26647d(a210 a210Var) {
        m68731i((q0t0) a210Var);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final q0t0 m68730g() {
        q0t0 q0t0Var = new q0t0(this);
        int i = this.f172775d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        q0t0Var.f184092d = this.f172776e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        q0t0Var.f184093e = this.f172777f;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        q0t0Var.f184094f = this.f172778g;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        q0t0Var.f184095g = this.f172779h;
        if ((i & 16) == 16) {
            i2 |= 16;
        }
        q0t0Var.f184096h = this.f172780i;
        if ((i & 32) == 32) {
            this.f172781t = Collections.unmodifiableList(this.f172781t);
            this.f172775d &= -33;
        }
        q0t0Var.f184097i = this.f172781t;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        q0t0Var.f184098t = this.f172772X;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        q0t0Var.f184087X = this.f172773Y;
        if ((this.f172775d & 256) == 256) {
            this.f172774Z = Collections.unmodifiableList(this.f172774Z);
            this.f172775d &= -257;
        }
        q0t0Var.f184088Y = this.f172774Z;
        if ((this.f172775d & 512) == 512) {
            this.f172763L0 = Collections.unmodifiableList(this.f172763L0);
            this.f172775d &= -513;
        }
        q0t0Var.f184089Z = this.f172763L0;
        if ((this.f172775d & 1024) == 1024) {
            this.f172764M0 = Collections.unmodifiableList(this.f172764M0);
            this.f172775d &= -1025;
        }
        q0t0Var.f184077M0 = this.f172764M0;
        if ((this.f172775d & 2048) == 2048) {
            this.f172765N0 = Collections.unmodifiableList(this.f172765N0);
            this.f172775d &= -2049;
        }
        q0t0Var.f184078N0 = this.f172765N0;
        if ((i & 4096) == 4096) {
            i2 |= 128;
        }
        q0t0Var.f184079O0 = this.f172766O0;
        if ((this.f172775d & 8192) == 8192) {
            this.f172767P0 = Collections.unmodifiableList(this.f172767P0);
            this.f172775d &= -8193;
        }
        q0t0Var.f184080P0 = this.f172767P0;
        if ((i & 16384) == 16384) {
            i2 |= 256;
        }
        q0t0Var.f184081Q0 = this.f172768Q0;
        if ((this.f172775d & 32768) == 32768) {
            this.f172769R0 = Collections.unmodifiableList(this.f172769R0);
            this.f172775d &= -32769;
        }
        q0t0Var.f184082R0 = this.f172769R0;
        if ((this.f172775d & 65536) == 65536) {
            this.f172770S0 = Collections.unmodifiableList(this.f172770S0);
            this.f172775d &= -65537;
        }
        q0t0Var.f184083S0 = this.f172770S0;
        if ((this.f172775d & 131072) == 131072) {
            this.f172771T0 = Collections.unmodifiableList(this.f172771T0);
            this.f172775d &= -131073;
        }
        q0t0Var.f184084T0 = this.f172771T0;
        q0t0Var.f184091c = i2;
        return q0t0Var;
    }

    /* JADX INFO: renamed from: i */
    public final void m68731i(q0t0 q0t0Var) {
        e0t0 e0t0Var;
        p1t0 p1t0Var;
        j1t0 j1t0Var;
        j1t0 j1t0Var2;
        if (q0t0Var == q0t0.f184074W0) {
            return;
        }
        int i = q0t0Var.f184091c;
        if ((i & 1) == 1) {
            int i2 = q0t0Var.f184092d;
            this.f172775d = 1 | this.f172775d;
            this.f172776e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = q0t0Var.f184093e;
            this.f172775d = 2 | this.f172775d;
            this.f172777f = i3;
        }
        if ((i & 4) == 4) {
            int i4 = q0t0Var.f184094f;
            this.f172775d = 4 | this.f172775d;
            this.f172778g = i4;
        }
        if ((i & 8) == 8) {
            j1t0 j1t0Var3 = q0t0Var.f184095g;
            if ((this.f172775d & 8) != 8 || (j1t0Var2 = this.f172779h) == j1t0.f107844S0) {
                this.f172779h = j1t0Var3;
            } else {
                i1t0 i1t0VarM52183p = j1t0.m52183p(j1t0Var2);
                i1t0VarM52183p.m49425i(j1t0Var3);
                this.f172779h = i1t0VarM52183p.m49424g();
            }
            this.f172775d |= 8;
        }
        if ((q0t0Var.f184091c & 16) == 16) {
            int i5 = q0t0Var.f184096h;
            this.f172775d = 16 | this.f172775d;
            this.f172780i = i5;
        }
        if (!q0t0Var.f184097i.isEmpty()) {
            if (this.f172781t.isEmpty()) {
                this.f172781t = q0t0Var.f184097i;
                this.f172775d &= -33;
            } else {
                if ((this.f172775d & 32) != 32) {
                    this.f172781t = new ArrayList(this.f172781t);
                    this.f172775d |= 32;
                }
                this.f172781t.addAll(q0t0Var.f184097i);
            }
        }
        if ((q0t0Var.f184091c & 32) == 32) {
            j1t0 j1t0Var4 = q0t0Var.f184098t;
            if ((this.f172775d & 64) != 64 || (j1t0Var = this.f172772X) == j1t0.f107844S0) {
                this.f172772X = j1t0Var4;
            } else {
                i1t0 i1t0VarM52183p2 = j1t0.m52183p(j1t0Var);
                i1t0VarM52183p2.m49425i(j1t0Var4);
                this.f172772X = i1t0VarM52183p2.m49424g();
            }
            this.f172775d |= 64;
        }
        if ((q0t0Var.f184091c & 64) == 64) {
            int i6 = q0t0Var.f184087X;
            this.f172775d |= 128;
            this.f172773Y = i6;
        }
        if (!q0t0Var.f184088Y.isEmpty()) {
            if (this.f172774Z.isEmpty()) {
                this.f172774Z = q0t0Var.f184088Y;
                this.f172775d &= -257;
            } else {
                if ((this.f172775d & 256) != 256) {
                    this.f172774Z = new ArrayList(this.f172774Z);
                    this.f172775d |= 256;
                }
                this.f172774Z.addAll(q0t0Var.f184088Y);
            }
        }
        if (!q0t0Var.f184089Z.isEmpty()) {
            if (this.f172763L0.isEmpty()) {
                this.f172763L0 = q0t0Var.f184089Z;
                this.f172775d &= -513;
            } else {
                if ((this.f172775d & 512) != 512) {
                    this.f172763L0 = new ArrayList(this.f172763L0);
                    this.f172775d |= 512;
                }
                this.f172763L0.addAll(q0t0Var.f184089Z);
            }
        }
        if (!q0t0Var.f184077M0.isEmpty()) {
            if (this.f172764M0.isEmpty()) {
                this.f172764M0 = q0t0Var.f184077M0;
                this.f172775d &= -1025;
            } else {
                if ((this.f172775d & 1024) != 1024) {
                    this.f172764M0 = new ArrayList(this.f172764M0);
                    this.f172775d |= 1024;
                }
                this.f172764M0.addAll(q0t0Var.f184077M0);
            }
        }
        if (!q0t0Var.f184078N0.isEmpty()) {
            if (this.f172765N0.isEmpty()) {
                this.f172765N0 = q0t0Var.f184078N0;
                this.f172775d &= -2049;
            } else {
                if ((this.f172775d & 2048) != 2048) {
                    this.f172765N0 = new ArrayList(this.f172765N0);
                    this.f172775d |= 2048;
                }
                this.f172765N0.addAll(q0t0Var.f184078N0);
            }
        }
        if ((q0t0Var.f184091c & 128) == 128) {
            p1t0 p1t0Var2 = q0t0Var.f184079O0;
            if ((this.f172775d & 4096) != 4096 || (p1t0Var = this.f172766O0) == p1t0.f173161g) {
                this.f172766O0 = p1t0Var2;
            } else {
                vzs0 vzs0VarM68843g = p1t0.m68843g(p1t0Var);
                vzs0VarM68843g.m86913j(p1t0Var2);
                this.f172766O0 = vzs0VarM68843g.m86911g();
            }
            this.f172775d |= 4096;
        }
        if (!q0t0Var.f184080P0.isEmpty()) {
            if (this.f172767P0.isEmpty()) {
                this.f172767P0 = q0t0Var.f184080P0;
                this.f172775d &= -8193;
            } else {
                if ((this.f172775d & 8192) != 8192) {
                    this.f172767P0 = new ArrayList(this.f172767P0);
                    this.f172775d |= 8192;
                }
                this.f172767P0.addAll(q0t0Var.f184080P0);
            }
        }
        if ((q0t0Var.f184091c & 256) == 256) {
            e0t0 e0t0Var2 = q0t0Var.f184081Q0;
            if ((this.f172775d & 16384) != 16384 || (e0t0Var = this.f172768Q0) == e0t0.f55031e) {
                this.f172768Q0 = e0t0Var2;
            } else {
                d0t0 d0t0Var = new d0t0(0);
                d0t0Var.f44052d = Collections.EMPTY_LIST;
                d0t0Var.m34558j(e0t0Var);
                d0t0Var.m34558j(e0t0Var2);
                this.f172768Q0 = d0t0Var.m34554e();
            }
            this.f172775d |= 16384;
        }
        if (!q0t0Var.f184082R0.isEmpty()) {
            if (this.f172769R0.isEmpty()) {
                this.f172769R0 = q0t0Var.f184082R0;
                this.f172775d &= -32769;
            } else {
                if ((this.f172775d & 32768) != 32768) {
                    this.f172769R0 = new ArrayList(this.f172769R0);
                    this.f172775d |= 32768;
                }
                this.f172769R0.addAll(q0t0Var.f184082R0);
            }
        }
        if (!q0t0Var.f184083S0.isEmpty()) {
            if (this.f172770S0.isEmpty()) {
                this.f172770S0 = q0t0Var.f184083S0;
                this.f172775d &= -65537;
            } else {
                if ((this.f172775d & 65536) != 65536) {
                    this.f172770S0 = new ArrayList(this.f172770S0);
                    this.f172775d |= 65536;
                }
                this.f172770S0.addAll(q0t0Var.f184083S0);
            }
        }
        if (!q0t0Var.f184084T0.isEmpty()) {
            if (this.f172771T0.isEmpty()) {
                this.f172771T0 = q0t0Var.f184084T0;
                this.f172775d &= -131073;
            } else {
                if ((this.f172775d & 131072) != 131072) {
                    this.f172771T0 = new ArrayList(this.f172771T0);
                    this.f172775d |= 131072;
                }
                this.f172771T0.addAll(q0t0Var.f184084T0);
            }
        }
        m79857e(q0t0Var);
        this.f149263a = this.f149263a.m48763b(q0t0Var.f184090b);
    }
}
