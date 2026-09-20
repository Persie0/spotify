package p204p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class o1t0 extends u110 {

    /* JADX INFO: renamed from: L0 */
    public static final o1t0 f160847L0;

    /* JADX INFO: renamed from: M0 */
    public static final uo60 f160848M0 = new uo60(25);

    /* JADX INFO: renamed from: X */
    public List f160849X;

    /* JADX INFO: renamed from: Y */
    public byte f160850Y;

    /* JADX INFO: renamed from: Z */
    public int f160851Z;

    /* JADX INFO: renamed from: b */
    public final hva f160852b;

    /* JADX INFO: renamed from: c */
    public int f160853c;

    /* JADX INFO: renamed from: d */
    public int f160854d;

    /* JADX INFO: renamed from: e */
    public int f160855e;

    /* JADX INFO: renamed from: f */
    public boolean f160856f;

    /* JADX INFO: renamed from: g */
    public n1t0 f160857g;

    /* JADX INFO: renamed from: h */
    public List f160858h;

    /* JADX INFO: renamed from: i */
    public List f160859i;

    /* JADX INFO: renamed from: t */
    public int f160860t;

    static {
        o1t0 o1t0Var = new o1t0();
        f160847L0 = o1t0Var;
        o1t0Var.f160854d = 0;
        o1t0Var.f160855e = 0;
        o1t0Var.f160856f = false;
        o1t0Var.f160857g = n1t0.INV;
        List list = Collections.EMPTY_LIST;
        o1t0Var.f160858h = list;
        o1t0Var.f160859i = list;
        o1t0Var.f160849X = list;
    }

    public o1t0(m1t0 m1t0Var) {
        super(m1t0Var);
        this.f160860t = -1;
        this.f160850Y = (byte) -1;
        this.f160851Z = -1;
        this.f160852b = m1t0Var.f149263a;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        int i = this.f160851Z;
        if (i != -1) {
            return i;
        }
        int iM87319g = (this.f160853c & 1) == 1 ? w780.m87319g(1, this.f160854d) : 0;
        if ((this.f160853c & 2) == 2) {
            iM87319g += w780.m87319g(2, this.f160855e);
        }
        if ((this.f160853c & 4) == 4) {
            iM87319g += w780.m87325m(3) + 1;
        }
        if ((this.f160853c & 8) == 8) {
            iM87319g += w780.m87318f(4, this.f160857g.f149512a);
        }
        for (int i2 = 0; i2 < this.f160858h.size(); i2++) {
            iM87319g += w780.m87321i(5, (AbstractC2155n8) this.f160858h.get(i2));
        }
        int iM87320h = 0;
        for (int i3 = 0; i3 < this.f160859i.size(); i3++) {
            iM87320h += w780.m87320h(((Integer) this.f160859i.get(i3)).intValue());
        }
        int iM87321i = iM87319g + iM87320h;
        if (!this.f160859i.isEmpty()) {
            iM87321i = iM87321i + 1 + w780.m87320h(iM87320h);
        }
        this.f160860t = iM87320h;
        for (int i4 = 0; i4 < this.f160849X.size(); i4++) {
            iM87321i += w780.m87321i(100, (AbstractC2155n8) this.f160849X.get(i4));
        }
        int size = this.f160852b.size() + m82139h() + iM87321i;
        this.f160851Z = size;
        return size;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        return m1t0.m60548h();
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: c */
    public final n110 mo24392c() {
        m1t0 m1t0VarM60548h = m1t0.m60548h();
        m1t0VarM60548h.m60550i(this);
        return m1t0VarM60548h;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        mo24390a();
        tey teyVar = new tey(this);
        if ((this.f160853c & 1) == 1) {
            w780Var.m87344P(1, this.f160854d);
        }
        if ((this.f160853c & 2) == 2) {
            w780Var.m87344P(2, this.f160855e);
        }
        if ((this.f160853c & 4) == 4) {
            boolean z = this.f160856f;
            w780Var.m87356a0(3, 0);
            w780Var.m87348T(z ? 1 : 0);
        }
        if ((this.f160853c & 8) == 8) {
            w780Var.m87343O(4, this.f160857g.f149512a);
        }
        for (int i = 0; i < this.f160858h.size(); i++) {
            w780Var.m87346R(5, (AbstractC2155n8) this.f160858h.get(i));
        }
        if (this.f160859i.size() > 0) {
            w780Var.m87353Y(50);
            w780Var.m87353Y(this.f160860t);
        }
        for (int i2 = 0; i2 < this.f160859i.size(); i2++) {
            w780Var.m87345Q(((Integer) this.f160859i.get(i2)).intValue());
        }
        for (int i3 = 0; i3 < this.f160849X.size(); i3++) {
            w780Var.m87346R(100, (AbstractC2155n8) this.f160849X.get(i3));
        }
        teyVar.m80597y(1000, w780Var);
        w780Var.m87349U(this.f160852b);
    }

    @Override // p204p.rre0
    public final AbstractC2155n8 getDefaultInstanceForType() {
        return f160847L0;
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        byte b = this.f160850Y;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        int i = this.f160853c;
        if ((i & 1) != 1) {
            this.f160850Y = (byte) 0;
            return false;
        }
        if ((i & 2) != 2) {
            this.f160850Y = (byte) 0;
            return false;
        }
        for (int i2 = 0; i2 < this.f160858h.size(); i2++) {
            if (!((j1t0) this.f160858h.get(i2)).isInitialized()) {
                this.f160850Y = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f160849X.size(); i3++) {
            if (!((wzs0) this.f160849X.get(i3)).isInitialized()) {
                this.f160850Y = (byte) 0;
                return false;
            }
        }
        if (m82138g()) {
            this.f160850Y = (byte) 1;
            return true;
        }
        this.f160850Y = (byte) 0;
        return false;
    }

    public o1t0() {
        this.f160860t = -1;
        this.f160850Y = (byte) -1;
        this.f160851Z = -1;
        this.f160852b = hva.f95637a;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    public o1t0(pwe pweVar, bux buxVar) {
        n1t0 n1t0Var;
        this.f160860t = -1;
        this.f160850Y = (byte) -1;
        this.f160851Z = -1;
        this.f160854d = 0;
        this.f160855e = 0;
        this.f160856f = false;
        n1t0 n1t0Var2 = n1t0.INV;
        this.f160857g = n1t0Var2;
        List list = Collections.EMPTY_LIST;
        this.f160858h = list;
        this.f160859i = list;
        this.f160849X = list;
        eva evaVar = new eva(0);
        w780 w780VarM87328y = w780.m87328y(evaVar, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iM71249o = pweVar.m71249o();
                    if (iM71249o == 0) {
                        z = true;
                    } else if (iM71249o == 8) {
                        this.f160853c |= 1;
                        this.f160854d = pweVar.m71246l();
                    } else if (iM71249o == 16) {
                        this.f160853c |= 2;
                        this.f160855e = pweVar.m71246l();
                    } else if (iM71249o == 24) {
                        this.f160853c |= 4;
                        this.f160856f = pweVar.m71247m() != 0;
                    } else if (iM71249o == 32) {
                        int iM71246l = pweVar.m71246l();
                        if (iM71246l == 0) {
                            n1t0Var = n1t0.IN;
                        } else if (iM71246l != 1) {
                            n1t0Var = iM71246l != 2 ? null : n1t0Var2;
                        } else {
                            n1t0Var = n1t0.OUT;
                        }
                        if (n1t0Var == null) {
                            w780VarM87328y.m87353Y(iM71249o);
                            w780VarM87328y.m87353Y(iM71246l);
                        } else {
                            this.f160853c |= 8;
                            this.f160857g = n1t0Var;
                        }
                    } else if (iM71249o == 42) {
                        if ((i & 16) != 16) {
                            this.f160858h = new ArrayList();
                            i |= 16;
                        }
                        this.f160858h.add(pweVar.m71242h(j1t0.f107845T0, buxVar));
                    } else if (iM71249o == 48) {
                        if ((i & 32) != 32) {
                            this.f160859i = new ArrayList();
                            i |= 32;
                        }
                        this.f160859i.add(Integer.valueOf(pweVar.m71246l()));
                    } else if (iM71249o == 50) {
                        int iM71239e = pweVar.m71239e(pweVar.m71246l());
                        if ((i & 32) != 32 && pweVar.m71237c() > 0) {
                            this.f160859i = new ArrayList();
                            i |= 32;
                        }
                        while (pweVar.m71237c() > 0) {
                            this.f160859i.add(Integer.valueOf(pweVar.m71246l()));
                        }
                        pweVar.m71238d(iM71239e);
                    } else if (iM71249o != 802) {
                        if (!m82143l(pweVar, w780VarM87328y, buxVar, iM71249o)) {
                            z = true;
                        }
                    } else {
                        if ((i & 64) != 64) {
                            this.f160849X = new ArrayList();
                            i |= 64;
                        }
                        this.f160849X.add(pweVar.m71242h(wzs0.f256674h, buxVar));
                    }
                } catch (Throwable th) {
                    if ((i & 16) == 16) {
                        this.f160858h = Collections.unmodifiableList(this.f160858h);
                    }
                    if ((i & 32) == 32) {
                        this.f160859i = Collections.unmodifiableList(this.f160859i);
                    }
                    if ((i & 64) == 64) {
                        this.f160849X = Collections.unmodifiableList(this.f160849X);
                    }
                    try {
                        w780VarM87328y.m87375o();
                    } catch (IOException unused) {
                    } finally {
                        this.f160852b = evaVar.m40103e();
                    }
                    m82142k();
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
        if ((i & 16) == 16) {
            this.f160858h = Collections.unmodifiableList(this.f160858h);
        }
        if ((i & 32) == 32) {
            this.f160859i = Collections.unmodifiableList(this.f160859i);
        }
        if ((i & 64) == 64) {
            this.f160849X = Collections.unmodifiableList(this.f160849X);
        }
        try {
            w780VarM87328y.m87375o();
        } catch (IOException unused2) {
        } finally {
            this.f160852b = evaVar.m40103e();
        }
        m82142k();
    }
}
