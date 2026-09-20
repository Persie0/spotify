package p204p;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class dp60 extends a210 {

    /* JADX INFO: renamed from: L0 */
    public static final uo60 f51185L0 = new uo60(4);

    /* JADX INFO: renamed from: Z */
    public static final dp60 f51186Z;

    /* JADX INFO: renamed from: X */
    public byte f51187X;

    /* JADX INFO: renamed from: Y */
    public int f51188Y;

    /* JADX INFO: renamed from: a */
    public final hva f51189a;

    /* JADX INFO: renamed from: b */
    public int f51190b;

    /* JADX INFO: renamed from: c */
    public int f51191c;

    /* JADX INFO: renamed from: d */
    public int f51192d;

    /* JADX INFO: renamed from: e */
    public Object f51193e;

    /* JADX INFO: renamed from: f */
    public cp60 f51194f;

    /* JADX INFO: renamed from: g */
    public List f51195g;

    /* JADX INFO: renamed from: h */
    public int f51196h;

    /* JADX INFO: renamed from: i */
    public List f51197i;

    /* JADX INFO: renamed from: t */
    public int f51198t;

    static {
        dp60 dp60Var = new dp60();
        f51186Z = dp60Var;
        dp60Var.f51191c = 1;
        dp60Var.f51192d = 0;
        dp60Var.f51193e = "";
        dp60Var.f51194f = cp60.NONE;
        List list = Collections.EMPTY_LIST;
        dp60Var.f51195g = list;
        dp60Var.f51197i = list;
    }

    public dp60() {
        this.f51196h = -1;
        this.f51198t = -1;
        this.f51187X = (byte) -1;
        this.f51188Y = -1;
        this.f51189a = hva.f95637a;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        hva xj90Var;
        int i = this.f51188Y;
        if (i != -1) {
            return i;
        }
        int iM87319g = (this.f51190b & 1) == 1 ? w780.m87319g(1, this.f51191c) : 0;
        if ((this.f51190b & 2) == 2) {
            iM87319g += w780.m87319g(2, this.f51192d);
        }
        if ((this.f51190b & 8) == 8) {
            iM87319g += w780.m87318f(3, this.f51194f.f40472a);
        }
        int iM87320h = 0;
        for (int i2 = 0; i2 < this.f51195g.size(); i2++) {
            iM87320h += w780.m87320h(((Integer) this.f51195g.get(i2)).intValue());
        }
        int iM87320h2 = iM87319g + iM87320h;
        if (!this.f51195g.isEmpty()) {
            iM87320h2 = iM87320h2 + 1 + w780.m87320h(iM87320h);
        }
        this.f51196h = iM87320h;
        int iM87320h3 = 0;
        for (int i3 = 0; i3 < this.f51197i.size(); i3++) {
            iM87320h3 += w780.m87320h(((Integer) this.f51197i.get(i3)).intValue());
        }
        int size = iM87320h2 + iM87320h3;
        if (!this.f51197i.isEmpty()) {
            size = size + 1 + w780.m87320h(iM87320h3);
        }
        this.f51198t = iM87320h3;
        if ((this.f51190b & 4) == 4) {
            Object obj = this.f51193e;
            if (obj instanceof String) {
                try {
                    xj90Var = new xj90(((String) obj).getBytes("UTF-8"));
                    this.f51193e = xj90Var;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported?", e);
                }
            } else {
                xj90Var = (hva) obj;
            }
            size += xj90Var.size() + w780.m87323k(xj90Var.size()) + w780.m87325m(6);
        }
        int size2 = this.f51189a.size() + size;
        this.f51188Y = size2;
        return size2;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        return bp60.m30101g();
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: c */
    public final n110 mo24392c() {
        bp60 bp60VarM30101g = bp60.m30101g();
        bp60VarM30101g.m30103h(this);
        return bp60VarM30101g;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        hva xj90Var;
        mo24390a();
        if ((this.f51190b & 1) == 1) {
            w780Var.m87344P(1, this.f51191c);
        }
        if ((this.f51190b & 2) == 2) {
            w780Var.m87344P(2, this.f51192d);
        }
        if ((this.f51190b & 8) == 8) {
            w780Var.m87343O(3, this.f51194f.f40472a);
        }
        if (this.f51195g.size() > 0) {
            w780Var.m87353Y(34);
            w780Var.m87353Y(this.f51196h);
        }
        for (int i = 0; i < this.f51195g.size(); i++) {
            w780Var.m87345Q(((Integer) this.f51195g.get(i)).intValue());
        }
        if (this.f51197i.size() > 0) {
            w780Var.m87353Y(42);
            w780Var.m87353Y(this.f51198t);
        }
        for (int i2 = 0; i2 < this.f51197i.size(); i2++) {
            w780Var.m87345Q(((Integer) this.f51197i.get(i2)).intValue());
        }
        if ((this.f51190b & 4) == 4) {
            Object obj = this.f51193e;
            if (obj instanceof String) {
                try {
                    xj90Var = new xj90(((String) obj).getBytes("UTF-8"));
                    this.f51193e = xj90Var;
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException("UTF-8 not supported?", e);
                }
            } else {
                xj90Var = (hva) obj;
            }
            w780Var.m87356a0(6, 2);
            w780Var.m87353Y(xj90Var.size());
            w780Var.m87349U(xj90Var);
        }
        w780Var.m87349U(this.f51189a);
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        if (this.f51187X == 1) {
            return true;
        }
        this.f51187X = (byte) 1;
        return true;
    }

    public dp60(pwe pweVar) {
        cp60 cp60Var;
        this.f51196h = -1;
        this.f51198t = -1;
        this.f51187X = (byte) -1;
        this.f51188Y = -1;
        this.f51191c = 1;
        boolean z = false;
        this.f51192d = 0;
        this.f51193e = "";
        cp60 cp60Var2 = cp60.NONE;
        this.f51194f = cp60Var2;
        List list = Collections.EMPTY_LIST;
        this.f51195g = list;
        this.f51197i = list;
        eva evaVar = new eva(0);
        w780 w780VarM87328y = w780.m87328y(evaVar, 1);
        int i = 0;
        while (!z) {
            try {
                try {
                    int iM71249o = pweVar.m71249o();
                    if (iM71249o != 0) {
                        if (iM71249o == 8) {
                            this.f51190b |= 1;
                            this.f51191c = pweVar.m71246l();
                        } else if (iM71249o == 16) {
                            this.f51190b |= 2;
                            this.f51192d = pweVar.m71246l();
                        } else if (iM71249o == 24) {
                            int iM71246l = pweVar.m71246l();
                            if (iM71246l == 0) {
                                cp60Var = cp60Var2;
                            } else if (iM71246l != 1) {
                                cp60Var = iM71246l != 2 ? null : cp60.DESC_TO_CLASS_ID;
                            } else {
                                cp60Var = cp60.INTERNAL_TO_CLASS_ID;
                            }
                            if (cp60Var == null) {
                                w780VarM87328y.m87353Y(iM71249o);
                                w780VarM87328y.m87353Y(iM71246l);
                            } else {
                                this.f51190b |= 8;
                                this.f51194f = cp60Var;
                            }
                        } else if (iM71249o == 32) {
                            if ((i & 16) != 16) {
                                this.f51195g = new ArrayList();
                                i |= 16;
                            }
                            this.f51195g.add(Integer.valueOf(pweVar.m71246l()));
                        } else if (iM71249o == 34) {
                            int iM71239e = pweVar.m71239e(pweVar.m71246l());
                            if ((i & 16) != 16 && pweVar.m71237c() > 0) {
                                this.f51195g = new ArrayList();
                                i |= 16;
                            }
                            while (pweVar.m71237c() > 0) {
                                this.f51195g.add(Integer.valueOf(pweVar.m71246l()));
                            }
                            pweVar.m71238d(iM71239e);
                        } else if (iM71249o == 40) {
                            if ((i & 32) != 32) {
                                this.f51197i = new ArrayList();
                                i |= 32;
                            }
                            this.f51197i.add(Integer.valueOf(pweVar.m71246l()));
                        } else if (iM71249o == 42) {
                            int iM71239e2 = pweVar.m71239e(pweVar.m71246l());
                            if ((i & 32) != 32 && pweVar.m71237c() > 0) {
                                this.f51197i = new ArrayList();
                                i |= 32;
                            }
                            while (pweVar.m71237c() > 0) {
                                this.f51197i.add(Integer.valueOf(pweVar.m71246l()));
                            }
                            pweVar.m71238d(iM71239e2);
                        } else if (iM71249o != 50) {
                            if (!pweVar.m71252r(iM71249o, w780VarM87328y)) {
                            }
                        } else {
                            xj90 xj90VarM71240f = pweVar.m71240f();
                            this.f51190b |= 4;
                            this.f51193e = xj90VarM71240f;
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 16) == 16) {
                        this.f51195g = Collections.unmodifiableList(this.f51195g);
                    }
                    if ((i & 32) == 32) {
                        this.f51197i = Collections.unmodifiableList(this.f51197i);
                    }
                    try {
                        w780VarM87328y.m87375o();
                    } catch (IOException unused) {
                    } finally {
                        this.f51189a = evaVar.m40103e();
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
        if ((i & 16) == 16) {
            this.f51195g = Collections.unmodifiableList(this.f51195g);
        }
        if ((i & 32) == 32) {
            this.f51197i = Collections.unmodifiableList(this.f51197i);
        }
        try {
            w780VarM87328y.m87375o();
        } catch (IOException unused2) {
        } finally {
            this.f51189a = evaVar.m40103e();
        }
    }

    public dp60(bp60 bp60Var) {
        this.f51196h = -1;
        this.f51198t = -1;
        this.f51187X = (byte) -1;
        this.f51188Y = -1;
        this.f51189a = bp60Var.f149263a;
    }
}
