package p204p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class l1t0 extends u110 {

    /* JADX INFO: renamed from: N0 */
    public static final l1t0 f128784N0;

    /* JADX INFO: renamed from: O0 */
    public static final uo60 f128785O0 = new uo60(24);

    /* JADX INFO: renamed from: L0 */
    public byte f128786L0;

    /* JADX INFO: renamed from: M0 */
    public int f128787M0;

    /* JADX INFO: renamed from: X */
    public List f128788X;

    /* JADX INFO: renamed from: Y */
    public List f128789Y;

    /* JADX INFO: renamed from: Z */
    public List f128790Z;

    /* JADX INFO: renamed from: b */
    public final hva f128791b;

    /* JADX INFO: renamed from: c */
    public int f128792c;

    /* JADX INFO: renamed from: d */
    public int f128793d;

    /* JADX INFO: renamed from: e */
    public int f128794e;

    /* JADX INFO: renamed from: f */
    public List f128795f;

    /* JADX INFO: renamed from: g */
    public j1t0 f128796g;

    /* JADX INFO: renamed from: h */
    public int f128797h;

    /* JADX INFO: renamed from: i */
    public j1t0 f128798i;

    /* JADX INFO: renamed from: t */
    public int f128799t;

    static {
        l1t0 l1t0Var = new l1t0();
        f128784N0 = l1t0Var;
        l1t0Var.f128793d = 6;
        l1t0Var.f128794e = 0;
        List list = Collections.EMPTY_LIST;
        l1t0Var.f128795f = list;
        j1t0 j1t0Var = j1t0.f107844S0;
        l1t0Var.f128796g = j1t0Var;
        l1t0Var.f128797h = 0;
        l1t0Var.f128798i = j1t0Var;
        l1t0Var.f128799t = 0;
        l1t0Var.f128788X = list;
        l1t0Var.f128789Y = list;
        l1t0Var.f128790Z = list;
    }

    public l1t0(k1t0 k1t0Var) {
        super(k1t0Var);
        this.f128786L0 = (byte) -1;
        this.f128787M0 = -1;
        this.f128791b = k1t0Var.f149263a;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        int i = this.f128787M0;
        if (i != -1) {
            return i;
        }
        int iM87319g = (this.f128792c & 1) == 1 ? w780.m87319g(1, this.f128793d) : 0;
        if ((this.f128792c & 2) == 2) {
            iM87319g += w780.m87319g(2, this.f128794e);
        }
        for (int i2 = 0; i2 < this.f128795f.size(); i2++) {
            iM87319g += w780.m87321i(3, (AbstractC2155n8) this.f128795f.get(i2));
        }
        if ((this.f128792c & 4) == 4) {
            iM87319g += w780.m87321i(4, this.f128796g);
        }
        if ((this.f128792c & 8) == 8) {
            iM87319g += w780.m87319g(5, this.f128797h);
        }
        if ((this.f128792c & 16) == 16) {
            iM87319g += w780.m87321i(6, this.f128798i);
        }
        if ((this.f128792c & 32) == 32) {
            iM87319g += w780.m87319g(7, this.f128799t);
        }
        for (int i3 = 0; i3 < this.f128788X.size(); i3++) {
            iM87319g += w780.m87321i(8, (AbstractC2155n8) this.f128788X.get(i3));
        }
        int iM87320h = 0;
        for (int i4 = 0; i4 < this.f128789Y.size(); i4++) {
            iM87320h += w780.m87320h(((Integer) this.f128789Y.get(i4)).intValue());
        }
        int size = (this.f128789Y.size() * 2) + iM87319g + iM87320h;
        for (int i5 = 0; i5 < this.f128790Z.size(); i5++) {
            size += w780.m87321i(32, (AbstractC2155n8) this.f128790Z.get(i5));
        }
        int size2 = this.f128791b.size() + m82139h() + size;
        this.f128787M0 = size2;
        return size2;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        return k1t0.m55135h();
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: c */
    public final n110 mo24392c() {
        k1t0 k1t0VarM55135h = k1t0.m55135h();
        k1t0VarM55135h.m55137i(this);
        return k1t0VarM55135h;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        mo24390a();
        tey teyVar = new tey(this);
        if ((this.f128792c & 1) == 1) {
            w780Var.m87344P(1, this.f128793d);
        }
        if ((this.f128792c & 2) == 2) {
            w780Var.m87344P(2, this.f128794e);
        }
        for (int i = 0; i < this.f128795f.size(); i++) {
            w780Var.m87346R(3, (AbstractC2155n8) this.f128795f.get(i));
        }
        if ((this.f128792c & 4) == 4) {
            w780Var.m87346R(4, this.f128796g);
        }
        if ((this.f128792c & 8) == 8) {
            w780Var.m87344P(5, this.f128797h);
        }
        if ((this.f128792c & 16) == 16) {
            w780Var.m87346R(6, this.f128798i);
        }
        if ((this.f128792c & 32) == 32) {
            w780Var.m87344P(7, this.f128799t);
        }
        for (int i2 = 0; i2 < this.f128788X.size(); i2++) {
            w780Var.m87346R(8, (AbstractC2155n8) this.f128788X.get(i2));
        }
        for (int i3 = 0; i3 < this.f128789Y.size(); i3++) {
            w780Var.m87344P(31, ((Integer) this.f128789Y.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.f128790Z.size(); i4++) {
            w780Var.m87346R(32, (AbstractC2155n8) this.f128790Z.get(i4));
        }
        teyVar.m80597y(200, w780Var);
        w780Var.m87349U(this.f128791b);
    }

    @Override // p204p.rre0
    public final AbstractC2155n8 getDefaultInstanceForType() {
        return f128784N0;
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        byte b = this.f128786L0;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.f128792c & 2) != 2) {
            this.f128786L0 = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.f128795f.size(); i++) {
            if (!((o1t0) this.f128795f.get(i)).isInitialized()) {
                this.f128786L0 = (byte) 0;
                return false;
            }
        }
        if ((this.f128792c & 4) == 4 && !this.f128796g.isInitialized()) {
            this.f128786L0 = (byte) 0;
            return false;
        }
        if ((this.f128792c & 16) == 16 && !this.f128798i.isInitialized()) {
            this.f128786L0 = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f128788X.size(); i2++) {
            if (!((wzs0) this.f128788X.get(i2)).isInitialized()) {
                this.f128786L0 = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f128790Z.size(); i3++) {
            if (!((a0t0) this.f128790Z.get(i3)).isInitialized()) {
                this.f128786L0 = (byte) 0;
                return false;
            }
        }
        if (m82138g()) {
            this.f128786L0 = (byte) 1;
            return true;
        }
        this.f128786L0 = (byte) 0;
        return false;
    }

    public l1t0() {
        this.f128786L0 = (byte) -1;
        this.f128787M0 = -1;
        this.f128791b = hva.f95637a;
    }

    public l1t0(pwe pweVar, bux buxVar) {
        this.f128786L0 = (byte) -1;
        this.f128787M0 = -1;
        this.f128793d = 6;
        boolean z = false;
        this.f128794e = 0;
        List list = Collections.EMPTY_LIST;
        this.f128795f = list;
        j1t0 j1t0Var = j1t0.f107844S0;
        this.f128796g = j1t0Var;
        this.f128797h = 0;
        this.f128798i = j1t0Var;
        this.f128799t = 0;
        this.f128788X = list;
        this.f128789Y = list;
        this.f128790Z = list;
        eva evaVar = new eva(0);
        w780 w780VarM87328y = w780.m87328y(evaVar, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    int iM71249o = pweVar.m71249o();
                    i1t0 i1t0VarM52183p = null;
                    switch (iM71249o) {
                        case 0:
                            break;
                        case 8:
                            this.f128792c |= 1;
                            this.f128793d = pweVar.m71246l();
                            continue;
                        case 16:
                            this.f128792c |= 2;
                            this.f128794e = pweVar.m71246l();
                            continue;
                        case 26:
                            if ((i & 4) != 4) {
                                this.f128795f = new ArrayList();
                                i |= 4;
                            }
                            this.f128795f.add(pweVar.m71242h(o1t0.f160848M0, buxVar));
                            continue;
                        case 34:
                            if ((this.f128792c & 4) == 4) {
                                j1t0 j1t0Var2 = this.f128796g;
                                j1t0Var2.getClass();
                                i1t0VarM52183p = j1t0.m52183p(j1t0Var2);
                            }
                            j1t0 j1t0Var3 = (j1t0) pweVar.m71242h(j1t0.f107845T0, buxVar);
                            this.f128796g = j1t0Var3;
                            if (i1t0VarM52183p != null) {
                                i1t0VarM52183p.m49425i(j1t0Var3);
                                this.f128796g = i1t0VarM52183p.m49424g();
                            }
                            this.f128792c |= 4;
                            continue;
                        case 40:
                            this.f128792c |= 8;
                            this.f128797h = pweVar.m71246l();
                            continue;
                        case 50:
                            if ((this.f128792c & 16) == 16) {
                                j1t0 j1t0Var4 = this.f128798i;
                                j1t0Var4.getClass();
                                i1t0VarM52183p = j1t0.m52183p(j1t0Var4);
                            }
                            j1t0 j1t0Var5 = (j1t0) pweVar.m71242h(j1t0.f107845T0, buxVar);
                            this.f128798i = j1t0Var5;
                            if (i1t0VarM52183p != null) {
                                i1t0VarM52183p.m49425i(j1t0Var5);
                                this.f128798i = i1t0VarM52183p.m49424g();
                            }
                            this.f128792c |= 16;
                            continue;
                        case 56:
                            this.f128792c |= 32;
                            this.f128799t = pweVar.m71246l();
                            continue;
                        case 66:
                            if ((i & 128) != 128) {
                                this.f128788X = new ArrayList();
                                i |= 128;
                            }
                            this.f128788X.add(pweVar.m71242h(wzs0.f256674h, buxVar));
                            continue;
                        case 248:
                            if ((i & 256) != 256) {
                                this.f128789Y = new ArrayList();
                                i |= 256;
                            }
                            this.f128789Y.add(Integer.valueOf(pweVar.m71246l()));
                            continue;
                        case 250:
                            int iM71239e = pweVar.m71239e(pweVar.m71246l());
                            if ((i & 256) != 256 && pweVar.m71237c() > 0) {
                                this.f128789Y = new ArrayList();
                                i |= 256;
                            }
                            while (pweVar.m71237c() > 0) {
                                this.f128789Y.add(Integer.valueOf(pweVar.m71246l()));
                            }
                            pweVar.m71238d(iM71239e);
                            continue;
                        case 258:
                            if ((i & 512) != 512) {
                                this.f128790Z = new ArrayList();
                                i |= 512;
                            }
                            this.f128790Z.add(pweVar.m71242h(a0t0.f11162h, buxVar));
                            continue;
                        default:
                            if (!m82143l(pweVar, w780VarM87328y, buxVar, iM71249o)) {
                                break;
                            }
                            break;
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
                if ((i & 4) == 4) {
                    this.f128795f = Collections.unmodifiableList(this.f128795f);
                }
                if ((i & 128) == 128) {
                    this.f128788X = Collections.unmodifiableList(this.f128788X);
                }
                if ((i & 256) == 256) {
                    this.f128789Y = Collections.unmodifiableList(this.f128789Y);
                }
                if ((i & 512) == 512) {
                    this.f128790Z = Collections.unmodifiableList(this.f128790Z);
                }
                try {
                    w780VarM87328y.m87375o();
                } catch (IOException unused) {
                } finally {
                    this.f128791b = evaVar.m40103e();
                }
                m82142k();
                throw th;
            }
        }
        if ((i & 4) == 4) {
            this.f128795f = Collections.unmodifiableList(this.f128795f);
        }
        if ((i & 128) == 128) {
            this.f128788X = Collections.unmodifiableList(this.f128788X);
        }
        if ((i & 256) == 256) {
            this.f128789Y = Collections.unmodifiableList(this.f128789Y);
        }
        if ((i & 512) == 512) {
            this.f128790Z = Collections.unmodifiableList(this.f128790Z);
        }
        try {
            w780VarM87328y.m87375o();
        } catch (IOException unused2) {
        } finally {
            this.f128791b = evaVar.m40103e();
        }
        m82142k();
    }
}
