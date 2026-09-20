package p204p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class wzs0 extends a210 {

    /* JADX INFO: renamed from: g */
    public static final wzs0 f256673g;

    /* JADX INFO: renamed from: h */
    public static final uo60 f256674h = new uo60(5);

    /* JADX INFO: renamed from: a */
    public final hva f256675a;

    /* JADX INFO: renamed from: b */
    public int f256676b;

    /* JADX INFO: renamed from: c */
    public int f256677c;

    /* JADX INFO: renamed from: d */
    public List f256678d;

    /* JADX INFO: renamed from: e */
    public byte f256679e;

    /* JADX INFO: renamed from: f */
    public int f256680f;

    static {
        wzs0 wzs0Var = new wzs0();
        f256673g = wzs0Var;
        wzs0Var.f256677c = 0;
        wzs0Var.f256678d = Collections.EMPTY_LIST;
    }

    public wzs0() {
        this.f256679e = (byte) -1;
        this.f256680f = -1;
        this.f256675a = hva.f95637a;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        int i = this.f256680f;
        if (i != -1) {
            return i;
        }
        int iM87319g = (this.f256676b & 1) == 1 ? w780.m87319g(1, this.f256677c) : 0;
        for (int i2 = 0; i2 < this.f256678d.size(); i2++) {
            iM87319g += w780.m87321i(2, (AbstractC2155n8) this.f256678d.get(i2));
        }
        int size = this.f256675a.size() + iM87319g;
        this.f256680f = size;
        return size;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        vzs0 vzs0Var = new vzs0(0);
        vzs0Var.f246536d = Collections.EMPTY_LIST;
        return vzs0Var;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: c */
    public final n110 mo24392c() {
        vzs0 vzs0Var = new vzs0(0);
        vzs0Var.f246536d = Collections.EMPTY_LIST;
        vzs0Var.m86912i(this);
        return vzs0Var;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        mo24390a();
        if ((this.f256676b & 1) == 1) {
            w780Var.m87344P(1, this.f256677c);
        }
        for (int i = 0; i < this.f256678d.size(); i++) {
            w780Var.m87346R(2, (AbstractC2155n8) this.f256678d.get(i));
        }
        w780Var.m87349U(this.f256675a);
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        byte b = this.f256679e;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f256676b & 1) != 1) {
            this.f256679e = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f256678d.size(); i++) {
            if (!((uzs0) this.f256678d.get(i)).isInitialized()) {
                this.f256679e = (byte) 0;
                return false;
            }
        }
        this.f256679e = (byte) 1;
        return true;
    }

    public wzs0(pwe pweVar, bux buxVar) {
        this.f256679e = (byte) -1;
        this.f256680f = -1;
        boolean z = false;
        this.f256677c = 0;
        this.f256678d = Collections.EMPTY_LIST;
        eva evaVar = new eva(0);
        w780 w780VarM87328y = w780.m87328y(evaVar, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    int iM71249o = pweVar.m71249o();
                    if (iM71249o != 0) {
                        if (iM71249o == 8) {
                            this.f256676b |= 1;
                            this.f256677c = pweVar.m71246l();
                        } else if (iM71249o != 18) {
                            if (!pweVar.m71252r(iM71249o, w780VarM87328y)) {
                            }
                        } else {
                            if ((c & 2) != 2) {
                                this.f256678d = new ArrayList();
                                c = 2;
                            }
                            this.f256678d.add(pweVar.m71242h(uzs0.f235630h, buxVar));
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e) {
                    e.f10912a = this;
                    throw e;
                } catch (IOException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                    invalidProtocolBufferException.f10912a = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th) {
                if ((c & 2) == 2) {
                    this.f256678d = Collections.unmodifiableList(this.f256678d);
                }
                try {
                    w780VarM87328y.m87375o();
                } catch (IOException unused) {
                } finally {
                    this.f256675a = evaVar.m40103e();
                }
                throw th;
            }
        }
        if ((c & 2) == 2) {
            this.f256678d = Collections.unmodifiableList(this.f256678d);
        }
        try {
            w780VarM87328y.m87375o();
        } catch (IOException unused2) {
        } finally {
            this.f256675a = evaVar.m40103e();
        }
    }

    public wzs0(vzs0 vzs0Var) {
        this.f256679e = (byte) -1;
        this.f256680f = -1;
        this.f256675a = vzs0Var.f149263a;
    }
}
