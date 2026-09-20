package p204p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class c0t0 extends u110 {

    /* JADX INFO: renamed from: X */
    public static final c0t0 f32857X;

    /* JADX INFO: renamed from: Y */
    public static final uo60 f32858Y = new uo60(10);

    /* JADX INFO: renamed from: b */
    public final hva f32859b;

    /* JADX INFO: renamed from: c */
    public int f32860c;

    /* JADX INFO: renamed from: d */
    public int f32861d;

    /* JADX INFO: renamed from: e */
    public List f32862e;

    /* JADX INFO: renamed from: f */
    public List f32863f;

    /* JADX INFO: renamed from: g */
    public List f32864g;

    /* JADX INFO: renamed from: h */
    public List f32865h;

    /* JADX INFO: renamed from: i */
    public byte f32866i;

    /* JADX INFO: renamed from: t */
    public int f32867t;

    static {
        c0t0 c0t0Var = new c0t0();
        f32857X = c0t0Var;
        c0t0Var.f32861d = 6;
        List list = Collections.EMPTY_LIST;
        c0t0Var.f32862e = list;
        c0t0Var.f32863f = list;
        c0t0Var.f32864g = list;
        c0t0Var.f32865h = list;
    }

    public c0t0(b0t0 b0t0Var) {
        super(b0t0Var);
        this.f32866i = (byte) -1;
        this.f32867t = -1;
        this.f32859b = b0t0Var.f149263a;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        int i = this.f32867t;
        if (i != -1) {
            return i;
        }
        int iM87319g = (this.f32860c & 1) == 1 ? w780.m87319g(1, this.f32861d) : 0;
        for (int i2 = 0; i2 < this.f32862e.size(); i2++) {
            iM87319g += w780.m87321i(2, (AbstractC2155n8) this.f32862e.get(i2));
        }
        for (int i3 = 0; i3 < this.f32865h.size(); i3++) {
            iM87319g += w780.m87321i(3, (AbstractC2155n8) this.f32865h.get(i3));
        }
        int iM87320h = 0;
        for (int i4 = 0; i4 < this.f32863f.size(); i4++) {
            iM87320h += w780.m87320h(((Integer) this.f32863f.get(i4)).intValue());
        }
        int size = (this.f32863f.size() * 2) + iM87319g + iM87320h;
        for (int i5 = 0; i5 < this.f32864g.size(); i5++) {
            size += w780.m87321i(32, (AbstractC2155n8) this.f32864g.get(i5));
        }
        int size2 = this.f32859b.size() + m82139h() + size;
        this.f32867t = size2;
        return size2;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        return b0t0.m27854h();
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: c */
    public final n110 mo24392c() {
        b0t0 b0t0VarM27854h = b0t0.m27854h();
        b0t0VarM27854h.m27856i(this);
        return b0t0VarM27854h;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        mo24390a();
        tey teyVar = new tey(this);
        if ((this.f32860c & 1) == 1) {
            w780Var.m87344P(1, this.f32861d);
        }
        for (int i = 0; i < this.f32862e.size(); i++) {
            w780Var.m87346R(2, (AbstractC2155n8) this.f32862e.get(i));
        }
        for (int i2 = 0; i2 < this.f32865h.size(); i2++) {
            w780Var.m87346R(3, (AbstractC2155n8) this.f32865h.get(i2));
        }
        for (int i3 = 0; i3 < this.f32863f.size(); i3++) {
            w780Var.m87344P(31, ((Integer) this.f32863f.get(i3)).intValue());
        }
        for (int i4 = 0; i4 < this.f32864g.size(); i4++) {
            w780Var.m87346R(32, (AbstractC2155n8) this.f32864g.get(i4));
        }
        teyVar.m80597y(19000, w780Var);
        w780Var.m87349U(this.f32859b);
    }

    @Override // p204p.rre0
    public final AbstractC2155n8 getDefaultInstanceForType() {
        return f32857X;
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        byte b = this.f32866i;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < this.f32862e.size(); i++) {
            if (!((r1t0) this.f32862e.get(i)).isInitialized()) {
                this.f32866i = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.f32864g.size(); i2++) {
            if (!((a0t0) this.f32864g.get(i2)).isInitialized()) {
                this.f32866i = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.f32865h.size(); i3++) {
            if (!((wzs0) this.f32865h.get(i3)).isInitialized()) {
                this.f32866i = (byte) 0;
                return false;
            }
        }
        if (m82138g()) {
            this.f32866i = (byte) 1;
            return true;
        }
        this.f32866i = (byte) 0;
        return false;
    }

    public c0t0() {
        this.f32866i = (byte) -1;
        this.f32867t = -1;
        this.f32859b = hva.f95637a;
    }

    public c0t0(pwe pweVar, bux buxVar) {
        this.f32866i = (byte) -1;
        this.f32867t = -1;
        this.f32861d = 6;
        List list = Collections.EMPTY_LIST;
        this.f32862e = list;
        this.f32863f = list;
        this.f32864g = list;
        this.f32865h = list;
        eva evaVar = new eva(0);
        w780 w780VarM87328y = w780.m87328y(evaVar, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iM71249o = pweVar.m71249o();
                    if (iM71249o != 0) {
                        if (iM71249o == 8) {
                            this.f32860c |= 1;
                            this.f32861d = pweVar.m71246l();
                        } else if (iM71249o == 18) {
                            if ((i & 2) != 2) {
                                this.f32862e = new ArrayList();
                                i |= 2;
                            }
                            this.f32862e.add(pweVar.m71242h(r1t0.f194908M0, buxVar));
                        } else if (iM71249o == 26) {
                            if ((i & 16) != 16) {
                                this.f32865h = new ArrayList();
                                i |= 16;
                            }
                            this.f32865h.add(pweVar.m71242h(wzs0.f256674h, buxVar));
                        } else if (iM71249o == 248) {
                            if ((i & 4) != 4) {
                                this.f32863f = new ArrayList();
                                i |= 4;
                            }
                            this.f32863f.add(Integer.valueOf(pweVar.m71246l()));
                        } else if (iM71249o == 250) {
                            int iM71239e = pweVar.m71239e(pweVar.m71246l());
                            if ((i & 4) != 4 && pweVar.m71237c() > 0) {
                                this.f32863f = new ArrayList();
                                i |= 4;
                            }
                            while (pweVar.m71237c() > 0) {
                                this.f32863f.add(Integer.valueOf(pweVar.m71246l()));
                            }
                            pweVar.m71238d(iM71239e);
                        } else if (iM71249o != 258) {
                            if (!m82143l(pweVar, w780VarM87328y, buxVar, iM71249o)) {
                            }
                        } else {
                            if ((i & 8) != 8) {
                                this.f32864g = new ArrayList();
                                i |= 8;
                            }
                            this.f32864g.add(pweVar.m71242h(a0t0.f11162h, buxVar));
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 2) == 2) {
                        this.f32862e = Collections.unmodifiableList(this.f32862e);
                    }
                    if ((i & 16) == 16) {
                        this.f32865h = Collections.unmodifiableList(this.f32865h);
                    }
                    if ((i & 4) == 4) {
                        this.f32863f = Collections.unmodifiableList(this.f32863f);
                    }
                    if ((i & 8) == 8) {
                        this.f32864g = Collections.unmodifiableList(this.f32864g);
                    }
                    try {
                        w780VarM87328y.m87375o();
                    } catch (IOException unused) {
                    } finally {
                        this.f32859b = evaVar.m40103e();
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
        if ((i & 2) == 2) {
            this.f32862e = Collections.unmodifiableList(this.f32862e);
        }
        if ((i & 16) == 16) {
            this.f32865h = Collections.unmodifiableList(this.f32865h);
        }
        if ((i & 4) == 4) {
            this.f32863f = Collections.unmodifiableList(this.f32863f);
        }
        if ((i & 8) == 8) {
            this.f32864g = Collections.unmodifiableList(this.f32864g);
        }
        try {
            w780VarM87328y.m87375o();
        } catch (IOException unused2) {
        } finally {
            this.f32859b = evaVar.m40103e();
        }
        m82142k();
    }
}
