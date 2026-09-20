package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes11.dex */
public final class m1t0 extends t110 {

    /* JADX INFO: renamed from: X */
    public List f139087X;

    /* JADX INFO: renamed from: d */
    public int f139088d;

    /* JADX INFO: renamed from: e */
    public int f139089e;

    /* JADX INFO: renamed from: f */
    public int f139090f;

    /* JADX INFO: renamed from: g */
    public boolean f139091g;

    /* JADX INFO: renamed from: h */
    public n1t0 f139092h;

    /* JADX INFO: renamed from: i */
    public List f139093i;

    /* JADX INFO: renamed from: t */
    public List f139094t;

    /* JADX INFO: renamed from: h */
    public static m1t0 m60548h() {
        m1t0 m1t0Var = new m1t0();
        m1t0Var.f139092h = n1t0.INV;
        List list = Collections.EMPTY_LIST;
        m1t0Var.f139093i = list;
        m1t0Var.f139094t = list;
        m1t0Var.f139087X = list;
        return m1t0Var;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: b */
    public final AbstractC2155n8 mo26645b() {
        o1t0 o1t0VarM60549g = m60549g();
        if (o1t0VarM60549g.isInitialized()) {
            return o1t0VarM60549g;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p204p.n110
    /* JADX INFO: renamed from: c */
    public final n110 mo26646c(pwe pweVar, bux buxVar) throws Throwable {
        o1t0 o1t0Var = null;
        try {
            try {
                o1t0.f160848M0.getClass();
                m60550i(new o1t0(pweVar, buxVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                o1t0 o1t0Var2 = (o1t0) e.f10912a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    o1t0Var = o1t0Var2;
                    if (o1t0Var != null) {
                        m60550i(o1t0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (o1t0Var != null) {
                m60550i(o1t0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        m1t0 m1t0VarM60548h = m60548h();
        m1t0VarM60548h.m60550i(m60549g());
        return m1t0VarM60548h;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ n110 mo26647d(a210 a210Var) {
        m60550i((o1t0) a210Var);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final o1t0 m60549g() {
        o1t0 o1t0Var = new o1t0(this);
        int i = this.f139088d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        o1t0Var.f160854d = this.f139089e;
        if ((i & 2) == 2) {
            i2 |= 2;
        }
        o1t0Var.f160855e = this.f139090f;
        if ((i & 4) == 4) {
            i2 |= 4;
        }
        o1t0Var.f160856f = this.f139091g;
        if ((i & 8) == 8) {
            i2 |= 8;
        }
        o1t0Var.f160857g = this.f139092h;
        if ((i & 16) == 16) {
            this.f139093i = Collections.unmodifiableList(this.f139093i);
            this.f139088d &= -17;
        }
        o1t0Var.f160858h = this.f139093i;
        if ((this.f139088d & 32) == 32) {
            this.f139094t = Collections.unmodifiableList(this.f139094t);
            this.f139088d &= -33;
        }
        o1t0Var.f160859i = this.f139094t;
        if ((this.f139088d & 64) == 64) {
            this.f139087X = Collections.unmodifiableList(this.f139087X);
            this.f139088d &= -65;
        }
        o1t0Var.f160849X = this.f139087X;
        o1t0Var.f160853c = i2;
        return o1t0Var;
    }

    /* JADX INFO: renamed from: i */
    public final void m60550i(o1t0 o1t0Var) {
        if (o1t0Var == o1t0.f160847L0) {
            return;
        }
        int i = o1t0Var.f160853c;
        if ((i & 1) == 1) {
            int i2 = o1t0Var.f160854d;
            this.f139088d = 1 | this.f139088d;
            this.f139089e = i2;
        }
        if ((i & 2) == 2) {
            int i3 = o1t0Var.f160855e;
            this.f139088d = 2 | this.f139088d;
            this.f139090f = i3;
        }
        if ((i & 4) == 4) {
            boolean z = o1t0Var.f160856f;
            this.f139088d = 4 | this.f139088d;
            this.f139091g = z;
        }
        if ((i & 8) == 8) {
            n1t0 n1t0Var = o1t0Var.f160857g;
            n1t0Var.getClass();
            this.f139088d = 8 | this.f139088d;
            this.f139092h = n1t0Var;
        }
        if (!o1t0Var.f160858h.isEmpty()) {
            if (this.f139093i.isEmpty()) {
                this.f139093i = o1t0Var.f160858h;
                this.f139088d &= -17;
            } else {
                if ((this.f139088d & 16) != 16) {
                    this.f139093i = new ArrayList(this.f139093i);
                    this.f139088d |= 16;
                }
                this.f139093i.addAll(o1t0Var.f160858h);
            }
        }
        if (!o1t0Var.f160859i.isEmpty()) {
            if (this.f139094t.isEmpty()) {
                this.f139094t = o1t0Var.f160859i;
                this.f139088d &= -33;
            } else {
                if ((this.f139088d & 32) != 32) {
                    this.f139094t = new ArrayList(this.f139094t);
                    this.f139088d |= 32;
                }
                this.f139094t.addAll(o1t0Var.f160859i);
            }
        }
        if (!o1t0Var.f160849X.isEmpty()) {
            if (this.f139087X.isEmpty()) {
                this.f139087X = o1t0Var.f160849X;
                this.f139088d &= -65;
            } else {
                if ((this.f139088d & 64) != 64) {
                    this.f139087X = new ArrayList(this.f139087X);
                    this.f139088d |= 64;
                }
                this.f139087X.addAll(o1t0Var.f160849X);
            }
        }
        m79857e(o1t0Var);
        this.f149263a = this.f149263a.m48763b(o1t0Var.f160852b);
    }
}
