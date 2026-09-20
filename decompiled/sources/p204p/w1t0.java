package p204p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class w1t0 extends a210 {

    /* JADX INFO: renamed from: e */
    public static final w1t0 f247176e;

    /* JADX INFO: renamed from: f */
    public static final uo60 f247177f = new uo60(29);

    /* JADX INFO: renamed from: a */
    public final hva f247178a;

    /* JADX INFO: renamed from: b */
    public List f247179b;

    /* JADX INFO: renamed from: c */
    public byte f247180c;

    /* JADX INFO: renamed from: d */
    public int f247181d;

    static {
        w1t0 w1t0Var = new w1t0();
        f247176e = w1t0Var;
        w1t0Var.f247179b = Collections.EMPTY_LIST;
    }

    public w1t0() {
        this.f247180c = (byte) -1;
        this.f247181d = -1;
        this.f247178a = hva.f95637a;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        int i = this.f247181d;
        if (i != -1) {
            return i;
        }
        int iM87321i = 0;
        for (int i2 = 0; i2 < this.f247179b.size(); i2++) {
            iM87321i += w780.m87321i(1, (AbstractC2155n8) this.f247179b.get(i2));
        }
        int size = this.f247178a.size() + iM87321i;
        this.f247181d = size;
        return size;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        d0t0 d0t0Var = new d0t0(2);
        d0t0Var.f44052d = Collections.EMPTY_LIST;
        return d0t0Var;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: c */
    public final n110 mo24392c() {
        d0t0 d0t0Var = new d0t0(2);
        d0t0Var.f44052d = Collections.EMPTY_LIST;
        d0t0Var.m34561m(this);
        return d0t0Var;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        mo24390a();
        for (int i = 0; i < this.f247179b.size(); i++) {
            w780Var.m87346R(1, (AbstractC2155n8) this.f247179b.get(i));
        }
        w780Var.m87349U(this.f247178a);
    }

    /* JADX INFO: renamed from: g */
    public final d0t0 m87018g() {
        d0t0 d0t0Var = new d0t0(2);
        d0t0Var.f44052d = Collections.EMPTY_LIST;
        d0t0Var.m34561m(this);
        return d0t0Var;
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        if (this.f247180c == 1) {
            return true;
        }
        this.f247180c = (byte) 1;
        return true;
    }

    public w1t0(pwe pweVar, bux buxVar) {
        this.f247180c = (byte) -1;
        this.f247181d = -1;
        this.f247179b = Collections.EMPTY_LIST;
        eva evaVar = new eva(0);
        w780 w780VarM87328y = w780.m87328y(evaVar, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iM71249o = pweVar.m71249o();
                    if (iM71249o != 0) {
                        if (iM71249o != 10) {
                            if (!pweVar.m71252r(iM71249o, w780VarM87328y)) {
                            }
                        } else {
                            if (!z2) {
                                this.f247179b = new ArrayList();
                                z2 = true;
                            }
                            this.f247179b.add(pweVar.m71242h(v1t0.f236465Y, buxVar));
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if (z2) {
                        this.f247179b = Collections.unmodifiableList(this.f247179b);
                    }
                    try {
                        w780VarM87328y.m87375o();
                    } catch (IOException unused) {
                    } finally {
                        this.f247178a = evaVar.m40103e();
                    }
                    throw th;
                }
            } catch (InvalidProtocolBufferException e) {
                e.f10912a = this;
                throw e;
            } catch (IOException e2) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                invalidProtocolBufferException.f10912a = this;
                throw invalidProtocolBufferException;
            }
        }
        if (z2) {
            this.f247179b = Collections.unmodifiableList(this.f247179b);
        }
        try {
            w780VarM87328y.m87375o();
        } catch (IOException unused2) {
        } finally {
            this.f247178a = evaVar.m40103e();
        }
    }

    public w1t0(d0t0 d0t0Var) {
        this.f247180c = (byte) -1;
        this.f247181d = -1;
        this.f247178a = d0t0Var.f149263a;
    }
}
