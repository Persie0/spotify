package p204p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class l0t0 extends u110 {

    /* JADX INFO: renamed from: h */
    public static final l0t0 f128504h;

    /* JADX INFO: renamed from: i */
    public static final uo60 f128505i = new uo60(13);

    /* JADX INFO: renamed from: b */
    public final hva f128506b;

    /* JADX INFO: renamed from: c */
    public int f128507c;

    /* JADX INFO: renamed from: d */
    public int f128508d;

    /* JADX INFO: renamed from: e */
    public List f128509e;

    /* JADX INFO: renamed from: f */
    public byte f128510f;

    /* JADX INFO: renamed from: g */
    public int f128511g;

    static {
        l0t0 l0t0Var = new l0t0();
        f128504h = l0t0Var;
        l0t0Var.f128508d = 0;
        l0t0Var.f128509e = Collections.EMPTY_LIST;
    }

    public l0t0(k0t0 k0t0Var) {
        super(k0t0Var);
        this.f128510f = (byte) -1;
        this.f128511g = -1;
        this.f128506b = k0t0Var.f149263a;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        int i = this.f128511g;
        if (i != -1) {
            return i;
        }
        int iM87319g = (this.f128507c & 1) == 1 ? w780.m87319g(1, this.f128508d) : 0;
        for (int i2 = 0; i2 < this.f128509e.size(); i2++) {
            iM87319g += w780.m87321i(2, (AbstractC2155n8) this.f128509e.get(i2));
        }
        int size = this.f128506b.size() + m82139h() + iM87319g;
        this.f128511g = size;
        return size;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        k0t0 k0t0Var = new k0t0();
        k0t0Var.f118144f = Collections.EMPTY_LIST;
        return k0t0Var;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: c */
    public final n110 mo24392c() {
        k0t0 k0t0Var = new k0t0();
        k0t0Var.f118144f = Collections.EMPTY_LIST;
        k0t0Var.m55012h(this);
        return k0t0Var;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        mo24390a();
        tey teyVar = new tey(this);
        if ((this.f128507c & 1) == 1) {
            w780Var.m87344P(1, this.f128508d);
        }
        for (int i = 0; i < this.f128509e.size(); i++) {
            w780Var.m87346R(2, (AbstractC2155n8) this.f128509e.get(i));
        }
        teyVar.m80597y(200, w780Var);
        w780Var.m87349U(this.f128506b);
    }

    @Override // p204p.rre0
    public final AbstractC2155n8 getDefaultInstanceForType() {
        return f128504h;
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        byte b = this.f128510f;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f128509e.size(); i++) {
            if (!((wzs0) this.f128509e.get(i)).isInitialized()) {
                this.f128510f = (byte) 0;
                return false;
            }
        }
        if (m82138g()) {
            this.f128510f = (byte) 1;
            return true;
        }
        this.f128510f = (byte) 0;
        return false;
    }

    public l0t0() {
        this.f128510f = (byte) -1;
        this.f128511g = -1;
        this.f128506b = hva.f95637a;
    }

    public l0t0(pwe pweVar, bux buxVar) {
        this.f128510f = (byte) -1;
        this.f128511g = -1;
        boolean z = false;
        this.f128508d = 0;
        this.f128509e = Collections.EMPTY_LIST;
        eva evaVar = new eva(0);
        w780 w780VarM87328y = w780.m87328y(evaVar, 1);
        char c = 0;
        while (!z) {
            try {
                try {
                    int iM71249o = pweVar.m71249o();
                    if (iM71249o != 0) {
                        if (iM71249o == 8) {
                            this.f128507c |= 1;
                            this.f128508d = pweVar.m71246l();
                        } else if (iM71249o != 18) {
                            if (!m82143l(pweVar, w780VarM87328y, buxVar, iM71249o)) {
                            }
                        } else {
                            if ((c & 2) != 2) {
                                this.f128509e = new ArrayList();
                                c = 2;
                            }
                            this.f128509e.add(pweVar.m71242h(wzs0.f256674h, buxVar));
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
                    this.f128509e = Collections.unmodifiableList(this.f128509e);
                }
                try {
                    w780VarM87328y.m87375o();
                } catch (IOException unused) {
                } finally {
                    this.f128506b = evaVar.m40103e();
                }
                m82142k();
                throw th;
            }
        }
        if ((c & 2) == 2) {
            this.f128509e = Collections.unmodifiableList(this.f128509e);
        }
        try {
            w780VarM87328y.m87375o();
        } catch (IOException unused2) {
        } finally {
            this.f128506b = evaVar.m40103e();
        }
        m82142k();
    }
}
