package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes11.dex */
public final class xzs0 extends t110 {

    /* JADX INFO: renamed from: L0 */
    public List f267746L0;

    /* JADX INFO: renamed from: M0 */
    public List f267747M0;

    /* JADX INFO: renamed from: N0 */
    public List f267748N0;

    /* JADX INFO: renamed from: O0 */
    public List f267749O0;

    /* JADX INFO: renamed from: P0 */
    public List f267750P0;

    /* JADX INFO: renamed from: Q0 */
    public List f267751Q0;

    /* JADX INFO: renamed from: R0 */
    public int f267752R0;

    /* JADX INFO: renamed from: S0 */
    public j1t0 f267753S0;

    /* JADX INFO: renamed from: T0 */
    public int f267754T0;

    /* JADX INFO: renamed from: U0 */
    public List f267755U0;

    /* JADX INFO: renamed from: V0 */
    public p1t0 f267756V0;

    /* JADX INFO: renamed from: W0 */
    public List f267757W0;

    /* JADX INFO: renamed from: X */
    public List f267758X;

    /* JADX INFO: renamed from: X0 */
    public w1t0 f267759X0;

    /* JADX INFO: renamed from: Y */
    public List f267760Y;

    /* JADX INFO: renamed from: Y0 */
    public List f267761Y0;

    /* JADX INFO: renamed from: Z */
    public List f267762Z;

    /* JADX INFO: renamed from: d */
    public int f267763d;

    /* JADX INFO: renamed from: e */
    public int f267764e;

    /* JADX INFO: renamed from: f */
    public int f267765f;

    /* JADX INFO: renamed from: g */
    public int f267766g;

    /* JADX INFO: renamed from: h */
    public List f267767h;

    /* JADX INFO: renamed from: i */
    public List f267768i;

    /* JADX INFO: renamed from: t */
    public List f267769t;

    /* JADX INFO: renamed from: h */
    public static xzs0 m92487h() {
        xzs0 xzs0Var = new xzs0();
        xzs0Var.f267764e = 6;
        List list = Collections.EMPTY_LIST;
        xzs0Var.f267767h = list;
        xzs0Var.f267768i = list;
        xzs0Var.f267769t = list;
        xzs0Var.f267758X = list;
        xzs0Var.f267760Y = list;
        xzs0Var.f267762Z = list;
        xzs0Var.f267746L0 = list;
        xzs0Var.f267747M0 = list;
        xzs0Var.f267748N0 = list;
        xzs0Var.f267749O0 = list;
        xzs0Var.f267750P0 = list;
        xzs0Var.f267751Q0 = list;
        xzs0Var.f267753S0 = j1t0.f107844S0;
        xzs0Var.f267755U0 = list;
        xzs0Var.f267756V0 = p1t0.f173161g;
        xzs0Var.f267757W0 = list;
        xzs0Var.f267759X0 = w1t0.f247176e;
        xzs0Var.f267761Y0 = list;
        return xzs0Var;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: b */
    public final AbstractC2155n8 mo26645b() {
        zzs0 zzs0VarM92488g = m92488g();
        if (zzs0VarM92488g.isInitialized()) {
            return zzs0VarM92488g;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p204p.n110
    /* JADX INFO: renamed from: c */
    public final n110 mo26646c(pwe pweVar, bux buxVar) throws Throwable {
        zzs0 zzs0Var = null;
        try {
            try {
                zzs0.f288071f1.getClass();
                m92489i(new zzs0(pweVar, buxVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                zzs0 zzs0Var2 = (zzs0) e.f10912a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    zzs0Var = zzs0Var2;
                    if (zzs0Var != null) {
                        m92489i(zzs0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (zzs0Var != null) {
                m92489i(zzs0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        xzs0 xzs0VarM92487h = m92487h();
        xzs0VarM92487h.m92489i(m92488g());
        return xzs0VarM92487h;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ n110 mo26647d(a210 a210Var) {
        m92489i((zzs0) a210Var);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final zzs0 m92488g() {
        zzs0 zzs0Var = new zzs0(this);
        int i = this.f267763d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        zzs0Var.f288095d = this.f267764e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        zzs0Var.f288097e = this.f267765f;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        zzs0Var.f288098f = this.f267766g;
        if ((i & 8) == 8) {
            this.f267767h = Collections.unmodifiableList(this.f267767h);
            this.f267763d &= -9;
        }
        zzs0Var.f288099g = this.f267767h;
        if ((this.f267763d & 16) == 16) {
            this.f267768i = Collections.unmodifiableList(this.f267768i);
            this.f267763d &= -17;
        }
        zzs0Var.f288100h = this.f267768i;
        if ((this.f267763d & 32) == 32) {
            this.f267769t = Collections.unmodifiableList(this.f267769t);
            this.f267763d &= -33;
        }
        zzs0Var.f288101i = this.f267769t;
        if ((this.f267763d & 64) == 64) {
            this.f267758X = Collections.unmodifiableList(this.f267758X);
            this.f267763d &= -65;
        }
        zzs0Var.f288084X = this.f267758X;
        if ((this.f267763d & 128) == 128) {
            this.f267760Y = Collections.unmodifiableList(this.f267760Y);
            this.f267763d &= -129;
        }
        zzs0Var.f288088Z = this.f267760Y;
        if ((this.f267763d & 256) == 256) {
            this.f267762Z = Collections.unmodifiableList(this.f267762Z);
            this.f267763d &= -257;
        }
        zzs0Var.f288072L0 = this.f267762Z;
        if ((this.f267763d & 512) == 512) {
            this.f267746L0 = Collections.unmodifiableList(this.f267746L0);
            this.f267763d &= -513;
        }
        zzs0Var.f288074N0 = this.f267746L0;
        if ((this.f267763d & 1024) == 1024) {
            this.f267747M0 = Collections.unmodifiableList(this.f267747M0);
            this.f267763d &= -1025;
        }
        zzs0Var.f288075O0 = this.f267747M0;
        if ((this.f267763d & 2048) == 2048) {
            this.f267748N0 = Collections.unmodifiableList(this.f267748N0);
            this.f267763d &= -2049;
        }
        zzs0Var.f288076P0 = this.f267748N0;
        if ((this.f267763d & 4096) == 4096) {
            this.f267749O0 = Collections.unmodifiableList(this.f267749O0);
            this.f267763d &= -4097;
        }
        zzs0Var.f288077Q0 = this.f267749O0;
        if ((this.f267763d & 8192) == 8192) {
            this.f267750P0 = Collections.unmodifiableList(this.f267750P0);
            this.f267763d &= -8193;
        }
        zzs0Var.f288078R0 = this.f267750P0;
        if ((this.f267763d & 16384) == 16384) {
            this.f267751Q0 = Collections.unmodifiableList(this.f267751Q0);
            this.f267763d &= -16385;
        }
        zzs0Var.f288079S0 = this.f267751Q0;
        if ((i & 32768) == 32768) {
            i2 |= 8;
        }
        zzs0Var.f288081U0 = this.f267752R0;
        if ((i & 65536) == 65536) {
            i2 |= 16;
        }
        zzs0Var.f288082V0 = this.f267753S0;
        if ((i & 131072) == 131072) {
            i2 |= 32;
        }
        zzs0Var.f288083W0 = this.f267754T0;
        if ((this.f267763d & 262144) == 262144) {
            this.f267755U0 = Collections.unmodifiableList(this.f267755U0);
            this.f267763d &= -262145;
        }
        zzs0Var.f288085X0 = this.f267755U0;
        if ((i & 524288) == 524288) {
            i2 |= 64;
        }
        zzs0Var.f288087Y0 = this.f267756V0;
        if ((this.f267763d & 1048576) == 1048576) {
            this.f267757W0 = Collections.unmodifiableList(this.f267757W0);
            this.f267763d &= -1048577;
        }
        zzs0Var.f288089Z0 = this.f267757W0;
        if ((i & 2097152) == 2097152) {
            i2 |= 128;
        }
        zzs0Var.f288090a1 = this.f267759X0;
        if ((this.f267763d & 4194304) == 4194304) {
            this.f267761Y0 = Collections.unmodifiableList(this.f267761Y0);
            this.f267763d &= -4194305;
        }
        zzs0Var.f288092b1 = this.f267761Y0;
        zzs0Var.f288093c = i2;
        return zzs0Var;
    }

    /* JADX INFO: renamed from: i */
    public final void m92489i(zzs0 zzs0Var) {
        w1t0 w1t0Var;
        p1t0 p1t0Var;
        j1t0 j1t0Var;
        if (zzs0Var == zzs0.f288070e1) {
            return;
        }
        int i = zzs0Var.f288093c;
        if ((i & 1) == 1) {
            int i2 = zzs0Var.f288095d;
            this.f267763d = 1 | this.f267763d;
            this.f267764e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = zzs0Var.f288097e;
            this.f267763d = 2 | this.f267763d;
            this.f267765f = i3;
        }
        if ((i & 4) == 4) {
            int i4 = zzs0Var.f288098f;
            this.f267763d = 4 | this.f267763d;
            this.f267766g = i4;
        }
        if (!zzs0Var.f288099g.isEmpty()) {
            if (this.f267767h.isEmpty()) {
                this.f267767h = zzs0Var.f288099g;
                this.f267763d &= -9;
            } else {
                if ((this.f267763d & 8) != 8) {
                    this.f267767h = new ArrayList(this.f267767h);
                    this.f267763d |= 8;
                }
                this.f267767h.addAll(zzs0Var.f288099g);
            }
        }
        if (!zzs0Var.f288100h.isEmpty()) {
            if (this.f267768i.isEmpty()) {
                this.f267768i = zzs0Var.f288100h;
                this.f267763d &= -17;
            } else {
                if ((this.f267763d & 16) != 16) {
                    this.f267768i = new ArrayList(this.f267768i);
                    this.f267763d |= 16;
                }
                this.f267768i.addAll(zzs0Var.f288100h);
            }
        }
        if (!zzs0Var.f288101i.isEmpty()) {
            if (this.f267769t.isEmpty()) {
                this.f267769t = zzs0Var.f288101i;
                this.f267763d &= -33;
            } else {
                if ((this.f267763d & 32) != 32) {
                    this.f267769t = new ArrayList(this.f267769t);
                    this.f267763d |= 32;
                }
                this.f267769t.addAll(zzs0Var.f288101i);
            }
        }
        if (!zzs0Var.f288084X.isEmpty()) {
            if (this.f267758X.isEmpty()) {
                this.f267758X = zzs0Var.f288084X;
                this.f267763d &= -65;
            } else {
                if ((this.f267763d & 64) != 64) {
                    this.f267758X = new ArrayList(this.f267758X);
                    this.f267763d |= 64;
                }
                this.f267758X.addAll(zzs0Var.f288084X);
            }
        }
        if (!zzs0Var.f288088Z.isEmpty()) {
            if (this.f267760Y.isEmpty()) {
                this.f267760Y = zzs0Var.f288088Z;
                this.f267763d &= -129;
            } else {
                if ((this.f267763d & 128) != 128) {
                    this.f267760Y = new ArrayList(this.f267760Y);
                    this.f267763d |= 128;
                }
                this.f267760Y.addAll(zzs0Var.f288088Z);
            }
        }
        if (!zzs0Var.f288072L0.isEmpty()) {
            if (this.f267762Z.isEmpty()) {
                this.f267762Z = zzs0Var.f288072L0;
                this.f267763d &= -257;
            } else {
                if ((this.f267763d & 256) != 256) {
                    this.f267762Z = new ArrayList(this.f267762Z);
                    this.f267763d |= 256;
                }
                this.f267762Z.addAll(zzs0Var.f288072L0);
            }
        }
        if (!zzs0Var.f288074N0.isEmpty()) {
            if (this.f267746L0.isEmpty()) {
                this.f267746L0 = zzs0Var.f288074N0;
                this.f267763d &= -513;
            } else {
                if ((this.f267763d & 512) != 512) {
                    this.f267746L0 = new ArrayList(this.f267746L0);
                    this.f267763d |= 512;
                }
                this.f267746L0.addAll(zzs0Var.f288074N0);
            }
        }
        if (!zzs0Var.f288075O0.isEmpty()) {
            if (this.f267747M0.isEmpty()) {
                this.f267747M0 = zzs0Var.f288075O0;
                this.f267763d &= -1025;
            } else {
                if ((this.f267763d & 1024) != 1024) {
                    this.f267747M0 = new ArrayList(this.f267747M0);
                    this.f267763d |= 1024;
                }
                this.f267747M0.addAll(zzs0Var.f288075O0);
            }
        }
        if (!zzs0Var.f288076P0.isEmpty()) {
            if (this.f267748N0.isEmpty()) {
                this.f267748N0 = zzs0Var.f288076P0;
                this.f267763d &= -2049;
            } else {
                if ((this.f267763d & 2048) != 2048) {
                    this.f267748N0 = new ArrayList(this.f267748N0);
                    this.f267763d |= 2048;
                }
                this.f267748N0.addAll(zzs0Var.f288076P0);
            }
        }
        if (!zzs0Var.f288077Q0.isEmpty()) {
            if (this.f267749O0.isEmpty()) {
                this.f267749O0 = zzs0Var.f288077Q0;
                this.f267763d &= -4097;
            } else {
                if ((this.f267763d & 4096) != 4096) {
                    this.f267749O0 = new ArrayList(this.f267749O0);
                    this.f267763d |= 4096;
                }
                this.f267749O0.addAll(zzs0Var.f288077Q0);
            }
        }
        if (!zzs0Var.f288078R0.isEmpty()) {
            if (this.f267750P0.isEmpty()) {
                this.f267750P0 = zzs0Var.f288078R0;
                this.f267763d &= -8193;
            } else {
                if ((this.f267763d & 8192) != 8192) {
                    this.f267750P0 = new ArrayList(this.f267750P0);
                    this.f267763d |= 8192;
                }
                this.f267750P0.addAll(zzs0Var.f288078R0);
            }
        }
        if (!zzs0Var.f288079S0.isEmpty()) {
            if (this.f267751Q0.isEmpty()) {
                this.f267751Q0 = zzs0Var.f288079S0;
                this.f267763d &= -16385;
            } else {
                if ((this.f267763d & 16384) != 16384) {
                    this.f267751Q0 = new ArrayList(this.f267751Q0);
                    this.f267763d |= 16384;
                }
                this.f267751Q0.addAll(zzs0Var.f288079S0);
            }
        }
        int i5 = zzs0Var.f288093c;
        if ((i5 & 8) == 8) {
            int i6 = zzs0Var.f288081U0;
            this.f267763d |= 32768;
            this.f267752R0 = i6;
        }
        if ((i5 & 16) == 16) {
            j1t0 j1t0Var2 = zzs0Var.f288082V0;
            if ((this.f267763d & 65536) != 65536 || (j1t0Var = this.f267753S0) == j1t0.f107844S0) {
                this.f267753S0 = j1t0Var2;
            } else {
                i1t0 i1t0VarM52183p = j1t0.m52183p(j1t0Var);
                i1t0VarM52183p.m49425i(j1t0Var2);
                this.f267753S0 = i1t0VarM52183p.m49424g();
            }
            this.f267763d |= 65536;
        }
        if ((zzs0Var.f288093c & 32) == 32) {
            int i7 = zzs0Var.f288083W0;
            this.f267763d |= 131072;
            this.f267754T0 = i7;
        }
        if (!zzs0Var.f288085X0.isEmpty()) {
            if (this.f267755U0.isEmpty()) {
                this.f267755U0 = zzs0Var.f288085X0;
                this.f267763d &= -262145;
            } else {
                if ((this.f267763d & 262144) != 262144) {
                    this.f267755U0 = new ArrayList(this.f267755U0);
                    this.f267763d |= 262144;
                }
                this.f267755U0.addAll(zzs0Var.f288085X0);
            }
        }
        if ((zzs0Var.f288093c & 64) == 64) {
            p1t0 p1t0Var2 = zzs0Var.f288087Y0;
            if ((this.f267763d & 524288) != 524288 || (p1t0Var = this.f267756V0) == p1t0.f173161g) {
                this.f267756V0 = p1t0Var2;
            } else {
                vzs0 vzs0VarM68843g = p1t0.m68843g(p1t0Var);
                vzs0VarM68843g.m86913j(p1t0Var2);
                this.f267756V0 = vzs0VarM68843g.m86911g();
            }
            this.f267763d |= 524288;
        }
        if (!zzs0Var.f288089Z0.isEmpty()) {
            if (this.f267757W0.isEmpty()) {
                this.f267757W0 = zzs0Var.f288089Z0;
                this.f267763d &= -1048577;
            } else {
                if ((this.f267763d & 1048576) != 1048576) {
                    this.f267757W0 = new ArrayList(this.f267757W0);
                    this.f267763d |= 1048576;
                }
                this.f267757W0.addAll(zzs0Var.f288089Z0);
            }
        }
        if ((zzs0Var.f288093c & 128) == 128) {
            w1t0 w1t0Var2 = zzs0Var.f288090a1;
            if ((this.f267763d & 2097152) != 2097152 || (w1t0Var = this.f267759X0) == w1t0.f247176e) {
                this.f267759X0 = w1t0Var2;
            } else {
                d0t0 d0t0Var = new d0t0(2);
                d0t0Var.f44052d = Collections.EMPTY_LIST;
                d0t0Var.m34561m(w1t0Var);
                d0t0Var.m34561m(w1t0Var2);
                this.f267759X0 = d0t0Var.m34557i();
            }
            this.f267763d |= 2097152;
        }
        if (!zzs0Var.f288092b1.isEmpty()) {
            if (this.f267761Y0.isEmpty()) {
                this.f267761Y0 = zzs0Var.f288092b1;
                this.f267763d &= -4194305;
            } else {
                if ((this.f267763d & 4194304) != 4194304) {
                    this.f267761Y0 = new ArrayList(this.f267761Y0);
                    this.f267763d |= 4194304;
                }
                this.f267761Y0.addAll(zzs0Var.f288092b1);
            }
        }
        m79857e(zzs0Var);
        this.f149263a = this.f149263a.m48763b(zzs0Var.f288091b);
    }
}
