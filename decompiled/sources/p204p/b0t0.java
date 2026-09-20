package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: loaded from: classes11.dex */
public final class b0t0 extends t110 {

    /* JADX INFO: renamed from: d */
    public int f22095d;

    /* JADX INFO: renamed from: e */
    public int f22096e;

    /* JADX INFO: renamed from: f */
    public List f22097f;

    /* JADX INFO: renamed from: g */
    public List f22098g;

    /* JADX INFO: renamed from: h */
    public List f22099h;

    /* JADX INFO: renamed from: i */
    public List f22100i;

    /* JADX INFO: renamed from: h */
    public static b0t0 m27854h() {
        b0t0 b0t0Var = new b0t0();
        b0t0Var.f22096e = 6;
        List list = Collections.EMPTY_LIST;
        b0t0Var.f22097f = list;
        b0t0Var.f22098g = list;
        b0t0Var.f22099h = list;
        b0t0Var.f22100i = list;
        return b0t0Var;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: b */
    public final AbstractC2155n8 mo26645b() {
        c0t0 c0t0VarM27855g = m27855g();
        if (c0t0VarM27855g.isInitialized()) {
            return c0t0VarM27855g;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p204p.n110
    /* JADX INFO: renamed from: c */
    public final n110 mo26646c(pwe pweVar, bux buxVar) throws Throwable {
        c0t0 c0t0Var = null;
        try {
            try {
                c0t0.f32858Y.getClass();
                m27856i(new c0t0(pweVar, buxVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                c0t0 c0t0Var2 = (c0t0) e.f10912a;
                try {
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    c0t0Var = c0t0Var2;
                    if (c0t0Var != null) {
                        m27856i(c0t0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (c0t0Var != null) {
                m27856i(c0t0Var);
            }
            throw th;
        }
    }

    public final Object clone() {
        b0t0 b0t0VarM27854h = m27854h();
        b0t0VarM27854h.m27856i(m27855g());
        return b0t0VarM27854h;
    }

    @Override // p204p.n110
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ n110 mo26647d(a210 a210Var) {
        m27856i((c0t0) a210Var);
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final c0t0 m27855g() {
        c0t0 c0t0Var = new c0t0(this);
        int i = this.f22095d;
        int i2 = (i & 1) != 1 ? 0 : 1;
        c0t0Var.f32861d = this.f22096e;
        if ((i & 2) == 2) {
            this.f22097f = Collections.unmodifiableList(this.f22097f);
            this.f22095d &= -3;
        }
        c0t0Var.f32862e = this.f22097f;
        if ((this.f22095d & 4) == 4) {
            this.f22098g = Collections.unmodifiableList(this.f22098g);
            this.f22095d &= -5;
        }
        c0t0Var.f32863f = this.f22098g;
        if ((this.f22095d & 8) == 8) {
            this.f22099h = Collections.unmodifiableList(this.f22099h);
            this.f22095d &= -9;
        }
        c0t0Var.f32864g = this.f22099h;
        if ((this.f22095d & 16) == 16) {
            this.f22100i = Collections.unmodifiableList(this.f22100i);
            this.f22095d &= -17;
        }
        c0t0Var.f32865h = this.f22100i;
        c0t0Var.f32860c = i2;
        return c0t0Var;
    }

    /* JADX INFO: renamed from: i */
    public final void m27856i(c0t0 c0t0Var) {
        if (c0t0Var == c0t0.f32857X) {
            return;
        }
        if ((c0t0Var.f32860c & 1) == 1) {
            int i = c0t0Var.f32861d;
            this.f22095d = 1 | this.f22095d;
            this.f22096e = i;
        }
        if (!c0t0Var.f32862e.isEmpty()) {
            if (this.f22097f.isEmpty()) {
                this.f22097f = c0t0Var.f32862e;
                this.f22095d &= -3;
            } else {
                if ((this.f22095d & 2) != 2) {
                    this.f22097f = new ArrayList(this.f22097f);
                    this.f22095d |= 2;
                }
                this.f22097f.addAll(c0t0Var.f32862e);
            }
        }
        if (!c0t0Var.f32863f.isEmpty()) {
            if (this.f22098g.isEmpty()) {
                this.f22098g = c0t0Var.f32863f;
                this.f22095d &= -5;
            } else {
                if ((this.f22095d & 4) != 4) {
                    this.f22098g = new ArrayList(this.f22098g);
                    this.f22095d |= 4;
                }
                this.f22098g.addAll(c0t0Var.f32863f);
            }
        }
        if (!c0t0Var.f32864g.isEmpty()) {
            if (this.f22099h.isEmpty()) {
                this.f22099h = c0t0Var.f32864g;
                this.f22095d &= -9;
            } else {
                if ((this.f22095d & 8) != 8) {
                    this.f22099h = new ArrayList(this.f22099h);
                    this.f22095d |= 8;
                }
                this.f22099h.addAll(c0t0Var.f32864g);
            }
        }
        if (!c0t0Var.f32865h.isEmpty()) {
            if (this.f22100i.isEmpty()) {
                this.f22100i = c0t0Var.f32865h;
                this.f22095d &= -17;
            } else {
                if ((this.f22095d & 16) != 16) {
                    this.f22100i = new ArrayList(this.f22100i);
                    this.f22095d |= 16;
                }
                this.f22100i.addAll(c0t0Var.f32865h);
            }
        }
        m79857e(c0t0Var);
        this.f149263a = this.f149263a.m48763b(c0t0Var.f32859b);
    }
}
