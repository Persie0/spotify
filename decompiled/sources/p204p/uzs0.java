package p204p;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class uzs0 extends a210 {

    /* JADX INFO: renamed from: g */
    public static final uzs0 f235629g;

    /* JADX INFO: renamed from: h */
    public static final uo60 f235630h = new uo60(6);

    /* JADX INFO: renamed from: a */
    public final hva f235631a;

    /* JADX INFO: renamed from: b */
    public int f235632b;

    /* JADX INFO: renamed from: c */
    public int f235633c;

    /* JADX INFO: renamed from: d */
    public tzs0 f235634d;

    /* JADX INFO: renamed from: e */
    public byte f235635e;

    /* JADX INFO: renamed from: f */
    public int f235636f;

    static {
        uzs0 uzs0Var = new uzs0();
        f235629g = uzs0Var;
        uzs0Var.f235633c = 0;
        uzs0Var.f235634d = tzs0.f225293N0;
    }

    public uzs0() {
        this.f235635e = (byte) -1;
        this.f235636f = -1;
        this.f235631a = hva.f95637a;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        int i = this.f235636f;
        if (i != -1) {
            return i;
        }
        int iM87319g = (this.f235632b & 1) == 1 ? w780.m87319g(1, this.f235633c) : 0;
        if ((this.f235632b & 2) == 2) {
            iM87319g += w780.m87321i(2, this.f235634d);
        }
        int size = this.f235631a.size() + iM87319g;
        this.f235636f = size;
        return size;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        qzs0 qzs0Var = new qzs0(0);
        qzs0Var.f194263e = tzs0.f225293N0;
        return qzs0Var;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: c */
    public final n110 mo24392c() {
        qzs0 qzs0Var = new qzs0(0);
        qzs0Var.f194263e = tzs0.f225293N0;
        qzs0Var.m74352h(this);
        return qzs0Var;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        mo24390a();
        if ((this.f235632b & 1) == 1) {
            w780Var.m87344P(1, this.f235633c);
        }
        if ((this.f235632b & 2) == 2) {
            w780Var.m87346R(2, this.f235634d);
        }
        w780Var.m87349U(this.f235631a);
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        byte b = this.f235635e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f235632b;
        if ((i & 1) != 1) {
            this.f235635e = (byte) 0;
            return false;
        }
        if ((i & 2) != 2) {
            this.f235635e = (byte) 0;
            return false;
        }
        if (this.f235634d.isInitialized()) {
            this.f235635e = (byte) 1;
            return true;
        }
        this.f235635e = (byte) 0;
        return false;
    }

    public uzs0(pwe pweVar, bux buxVar) {
        rzs0 rzs0VarM82075h;
        this.f235635e = (byte) -1;
        this.f235636f = -1;
        boolean z = false;
        this.f235633c = 0;
        this.f235634d = tzs0.f225293N0;
        eva evaVar = new eva(0);
        w780 w780VarM87328y = w780.m87328y(evaVar, 1);
        while (!z) {
            try {
                try {
                    try {
                        int iM71249o = pweVar.m71249o();
                        if (iM71249o != 0) {
                            if (iM71249o == 8) {
                                this.f235632b |= 1;
                                this.f235633c = pweVar.m71246l();
                            } else if (iM71249o != 18) {
                                if (!pweVar.m71252r(iM71249o, w780VarM87328y)) {
                                }
                            } else {
                                if ((this.f235632b & 2) == 2) {
                                    tzs0 tzs0Var = this.f235634d;
                                    tzs0Var.getClass();
                                    rzs0VarM82075h = tzs0.m82075h(tzs0Var);
                                } else {
                                    rzs0VarM82075h = null;
                                }
                                tzs0 tzs0Var2 = (tzs0) pweVar.m71242h(tzs0.f225294O0, buxVar);
                                this.f235634d = tzs0Var2;
                                if (rzs0VarM82075h != null) {
                                    rzs0VarM82075h.m76833h(tzs0Var2);
                                    this.f235634d = rzs0VarM82075h.m76832e();
                                }
                                this.f235632b |= 2;
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        e.f10912a = this;
                        throw e;
                    }
                } catch (IOException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                    invalidProtocolBufferException.f10912a = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                try {
                    w780VarM87328y.m87375o();
                } catch (IOException unused) {
                } finally {
                    this.f235631a = evaVar.m40103e();
                }
                throw th;
            }
        }
        try {
            w780VarM87328y.m87375o();
        } catch (IOException unused2) {
        } finally {
            this.f235631a = evaVar.m40103e();
        }
    }

    public uzs0(qzs0 qzs0Var) {
        this.f235635e = (byte) -1;
        this.f235636f = -1;
        this.f235631a = qzs0Var.f149263a;
    }
}
