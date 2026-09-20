package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes11.dex */
public final class i1t0 extends t110 {

    /* JADX INFO: renamed from: L0 */
    public j1t0 f97590L0;

    /* JADX INFO: renamed from: M0 */
    public int f97591M0;

    /* JADX INFO: renamed from: N0 */
    public j1t0 f97592N0;

    /* JADX INFO: renamed from: O0 */
    public int f97593O0;

    /* JADX INFO: renamed from: P0 */
    public int f97594P0;

    /* JADX INFO: renamed from: Q0 */
    public List f97595Q0;

    /* JADX INFO: renamed from: X */
    public int f97596X;

    /* JADX INFO: renamed from: Y */
    public int f97597Y;

    /* JADX INFO: renamed from: Z */
    public int f97598Z;

    /* JADX INFO: renamed from: d */
    public int f97599d;

    /* JADX INFO: renamed from: e */
    public List f97600e;

    /* JADX INFO: renamed from: f */
    public boolean f97601f;

    /* JADX INFO: renamed from: g */
    public int f97602g;

    /* JADX INFO: renamed from: h */
    public j1t0 f97603h;

    /* JADX INFO: renamed from: i */
    public int f97604i;

    /* JADX INFO: renamed from: t */
    public int f97605t;

    /* JADX INFO: renamed from: h */
    public static i1t0 m49423h() {
        i1t0 i1t0Var = new i1t0();
        List list = Collections.EMPTY_LIST;
        i1t0Var.f97600e = list;
        j1t0 j1t0Var = j1t0.f107844S0;
        i1t0Var.f97603h = j1t0Var;
        i1t0Var.f97590L0 = j1t0Var;
        i1t0Var.f97592N0 = j1t0Var;
        i1t0Var.f97595Q0 = list;
        return i1t0Var;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: b */
    public final AbstractC2155n8 mo26645b() {
        j1t0 j1t0VarM49424g = m49424g();
        if (j1t0VarM49424g.isInitialized()) {
            return j1t0VarM49424g;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p204p.n110
    /* JADX INFO: renamed from: c */
    public final n110 mo26646c(pwe pweVar, bux buxVar) throws Throwable {
        j1t0 j1t0Var = null;
        try {
            try {
                j1t0.f107845T0.getClass();
                m49425i(new j1t0(pweVar, buxVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                j1t0 j1t0Var2 = (j1t0) e.f10912a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    j1t0Var = j1t0Var2;
                    if (j1t0Var != null) {
                        m49425i(j1t0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (j1t0Var != null) {
                m49425i(j1t0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        i1t0 i1t0VarM49423h = m49423h();
        i1t0VarM49423h.m49425i(m49424g());
        return i1t0VarM49423h;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ n110 mo26647d(a210 a210Var) {
        m49425i((j1t0) a210Var);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final j1t0 m49424g() {
        j1t0 j1t0Var = new j1t0(this);
        int i = this.f97599d;
        if ((i & 1) == 1) {
            this.f97600e = Collections.unmodifiableList(this.f97600e);
            this.f97599d &= -2;
        }
        j1t0Var.f107858d = this.f97600e;
        int i2 = (i & 2) != 2 ? 0 : 1;
        j1t0Var.f107859e = this.f97601f;
        if ((i & 4) == 4) {
            i2 |= 2;
        }
        j1t0Var.f107860f = this.f97602g;
        if ((i & 8) == 8) {
            i2 |= 4;
        }
        j1t0Var.f107861g = this.f97603h;
        if ((i & 16) == 16) {
            i2 |= 8;
        }
        j1t0Var.f107862h = this.f97604i;
        if ((i & 32) == 32) {
            i2 |= 16;
        }
        j1t0Var.f107863i = this.f97605t;
        if ((i & 64) == 64) {
            i2 |= 32;
        }
        j1t0Var.f107864t = this.f97596X;
        if ((i & 128) == 128) {
            i2 |= 64;
        }
        j1t0Var.f107853X = this.f97597Y;
        if ((i & 256) == 256) {
            i2 |= 128;
        }
        j1t0Var.f107854Y = this.f97598Z;
        if ((i & 512) == 512) {
            i2 |= 256;
        }
        j1t0Var.f107855Z = this.f97590L0;
        if ((i & 1024) == 1024) {
            i2 |= 512;
        }
        j1t0Var.f107846L0 = this.f97591M0;
        if ((i & 2048) == 2048) {
            i2 |= 1024;
        }
        j1t0Var.f107847M0 = this.f97592N0;
        if ((i & 4096) == 4096) {
            i2 |= 2048;
        }
        j1t0Var.f107848N0 = this.f97593O0;
        if ((i & 8192) == 8192) {
            i2 |= 4096;
        }
        j1t0Var.f107849O0 = this.f97594P0;
        if ((this.f97599d & 16384) == 16384) {
            this.f97595Q0 = Collections.unmodifiableList(this.f97595Q0);
            this.f97599d &= -16385;
        }
        j1t0Var.f107850P0 = this.f97595Q0;
        j1t0Var.f107857c = i2;
        return j1t0Var;
    }

    /* JADX INFO: renamed from: i */
    public final i1t0 m49425i(j1t0 j1t0Var) {
        j1t0 j1t0Var2;
        j1t0 j1t0Var3;
        j1t0 j1t0Var4;
        j1t0 j1t0Var5 = j1t0.f107844S0;
        if (j1t0Var == j1t0Var5) {
            return this;
        }
        if (!j1t0Var.f107858d.isEmpty()) {
            if (this.f97600e.isEmpty()) {
                this.f97600e = j1t0Var.f107858d;
                this.f97599d &= -2;
            } else {
                if ((this.f97599d & 1) != 1) {
                    this.f97600e = new ArrayList(this.f97600e);
                    this.f97599d |= 1;
                }
                this.f97600e.addAll(j1t0Var.f107858d);
            }
        }
        int i = j1t0Var.f107857c;
        if ((i & 1) == 1) {
            boolean z = j1t0Var.f107859e;
            this.f97599d |= 2;
            this.f97601f = z;
        }
        if ((i & 2) == 2) {
            int i2 = j1t0Var.f107860f;
            this.f97599d |= 4;
            this.f97602g = i2;
        }
        if ((i & 4) == 4) {
            j1t0 j1t0Var6 = j1t0Var.f107861g;
            if ((this.f97599d & 8) != 8 || (j1t0Var4 = this.f97603h) == j1t0Var5) {
                this.f97603h = j1t0Var6;
            } else {
                i1t0 i1t0VarM52183p = j1t0.m52183p(j1t0Var4);
                i1t0VarM52183p.m49425i(j1t0Var6);
                this.f97603h = i1t0VarM52183p.m49424g();
            }
            this.f97599d |= 8;
        }
        if ((j1t0Var.f107857c & 8) == 8) {
            int i3 = j1t0Var.f107862h;
            this.f97599d |= 16;
            this.f97604i = i3;
        }
        if (j1t0Var.m52184n()) {
            int i4 = j1t0Var.f107863i;
            this.f97599d |= 32;
            this.f97605t = i4;
        }
        int i5 = j1t0Var.f107857c;
        if ((i5 & 32) == 32) {
            int i6 = j1t0Var.f107864t;
            this.f97599d |= 64;
            this.f97596X = i6;
        }
        if ((i5 & 64) == 64) {
            int i7 = j1t0Var.f107853X;
            this.f97599d |= 128;
            this.f97597Y = i7;
        }
        if ((i5 & 128) == 128) {
            int i8 = j1t0Var.f107854Y;
            this.f97599d |= 256;
            this.f97598Z = i8;
        }
        if ((i5 & 256) == 256) {
            j1t0 j1t0Var7 = j1t0Var.f107855Z;
            if ((this.f97599d & 512) != 512 || (j1t0Var3 = this.f97590L0) == j1t0Var5) {
                this.f97590L0 = j1t0Var7;
            } else {
                i1t0 i1t0VarM52183p2 = j1t0.m52183p(j1t0Var3);
                i1t0VarM52183p2.m49425i(j1t0Var7);
                this.f97590L0 = i1t0VarM52183p2.m49424g();
            }
            this.f97599d |= 512;
        }
        int i9 = j1t0Var.f107857c;
        if ((i9 & 512) == 512) {
            int i10 = j1t0Var.f107846L0;
            this.f97599d |= 1024;
            this.f97591M0 = i10;
        }
        if ((i9 & 1024) == 1024) {
            j1t0 j1t0Var8 = j1t0Var.f107847M0;
            if ((this.f97599d & 2048) != 2048 || (j1t0Var2 = this.f97592N0) == j1t0Var5) {
                this.f97592N0 = j1t0Var8;
            } else {
                i1t0 i1t0VarM52183p3 = j1t0.m52183p(j1t0Var2);
                i1t0VarM52183p3.m49425i(j1t0Var8);
                this.f97592N0 = i1t0VarM52183p3.m49424g();
            }
            this.f97599d |= 2048;
        }
        int i11 = j1t0Var.f107857c;
        if ((i11 & 2048) == 2048) {
            int i12 = j1t0Var.f107848N0;
            this.f97599d |= 4096;
            this.f97593O0 = i12;
        }
        if ((i11 & 4096) == 4096) {
            int i13 = j1t0Var.f107849O0;
            this.f97599d |= 8192;
            this.f97594P0 = i13;
        }
        if (!j1t0Var.f107850P0.isEmpty()) {
            if (this.f97595Q0.isEmpty()) {
                this.f97595Q0 = j1t0Var.f107850P0;
                this.f97599d &= -16385;
            } else {
                if ((this.f97599d & 16384) != 16384) {
                    this.f97595Q0 = new ArrayList(this.f97595Q0);
                    this.f97599d |= 16384;
                }
                this.f97595Q0.addAll(j1t0Var.f107850P0);
            }
        }
        m79857e(j1t0Var);
        this.f149263a = this.f149263a.m48763b(j1t0Var.f107856b);
        return this;
    }
}
