package p204p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class ep60 extends a210 {

    /* JADX INFO: renamed from: g */
    public static final ep60 f61553g;

    /* JADX INFO: renamed from: h */
    public static final uo60 f61554h = new uo60(3);

    /* JADX INFO: renamed from: a */
    public final hva f61555a;

    /* JADX INFO: renamed from: b */
    public List f61556b;

    /* JADX INFO: renamed from: c */
    public List f61557c;

    /* JADX INFO: renamed from: d */
    public int f61558d;

    /* JADX INFO: renamed from: e */
    public byte f61559e;

    /* JADX INFO: renamed from: f */
    public int f61560f;

    static {
        ep60 ep60Var = new ep60();
        f61553g = ep60Var;
        List list = Collections.EMPTY_LIST;
        ep60Var.f61556b = list;
        ep60Var.f61557c = list;
    }

    public ep60() {
        this.f61558d = -1;
        this.f61559e = (byte) -1;
        this.f61560f = -1;
        this.f61555a = hva.f95637a;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        int i = this.f61560f;
        if (i != -1) {
            return i;
        }
        int iM87321i = 0;
        for (int i2 = 0; i2 < this.f61556b.size(); i2++) {
            iM87321i += w780.m87321i(1, (AbstractC2155n8) this.f61556b.get(i2));
        }
        int iM87320h = 0;
        for (int i3 = 0; i3 < this.f61557c.size(); i3++) {
            iM87320h += w780.m87320h(((Integer) this.f61557c.get(i3)).intValue());
        }
        int iM87320h2 = iM87321i + iM87320h;
        if (!this.f61557c.isEmpty()) {
            iM87320h2 = iM87320h2 + 1 + w780.m87320h(iM87320h);
        }
        this.f61558d = iM87320h;
        int size = this.f61555a.size() + iM87320h2;
        this.f61560f = size;
        return size;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        ap60 ap60Var = new ap60();
        List list = Collections.EMPTY_LIST;
        ap60Var.f17843c = list;
        ap60Var.f17844d = list;
        return ap60Var;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: c */
    public final n110 mo24392c() {
        ap60 ap60Var = new ap60();
        List list = Collections.EMPTY_LIST;
        ap60Var.f17843c = list;
        ap60Var.f17844d = list;
        ap60Var.m26649g(this);
        return ap60Var;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        mo24390a();
        for (int i = 0; i < this.f61556b.size(); i++) {
            w780Var.m87346R(1, (AbstractC2155n8) this.f61556b.get(i));
        }
        if (this.f61557c.size() > 0) {
            w780Var.m87353Y(42);
            w780Var.m87353Y(this.f61558d);
        }
        for (int i2 = 0; i2 < this.f61557c.size(); i2++) {
            w780Var.m87345Q(((Integer) this.f61557c.get(i2)).intValue());
        }
        w780Var.m87349U(this.f61555a);
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        if (this.f61559e == 1) {
            return true;
        }
        this.f61559e = (byte) 1;
        return true;
    }

    public ep60(pwe pweVar, bux buxVar) {
        this.f61558d = -1;
        this.f61559e = (byte) -1;
        this.f61560f = -1;
        List list = Collections.EMPTY_LIST;
        this.f61556b = list;
        this.f61557c = list;
        eva evaVar = new eva(0);
        w780 w780VarM87328y = w780.m87328y(evaVar, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iM71249o = pweVar.m71249o();
                    if (iM71249o != 0) {
                        if (iM71249o == 10) {
                            if ((i & 1) != 1) {
                                this.f61556b = new ArrayList();
                                i |= 1;
                            }
                            this.f61556b.add(pweVar.m71242h(dp60.f51185L0, buxVar));
                        } else if (iM71249o == 40) {
                            if ((i & 2) != 2) {
                                this.f61557c = new ArrayList();
                                i |= 2;
                            }
                            this.f61557c.add(Integer.valueOf(pweVar.m71246l()));
                        } else if (iM71249o != 42) {
                            if (!pweVar.m71252r(iM71249o, w780VarM87328y)) {
                            }
                        } else {
                            int iM71239e = pweVar.m71239e(pweVar.m71246l());
                            if ((i & 2) != 2 && pweVar.m71237c() > 0) {
                                this.f61557c = new ArrayList();
                                i |= 2;
                            }
                            while (pweVar.m71237c() > 0) {
                                this.f61557c.add(Integer.valueOf(pweVar.m71246l()));
                            }
                            pweVar.m71238d(iM71239e);
                        }
                    }
                    z = true;
                } catch (Throwable th) {
                    if ((i & 1) == 1) {
                        this.f61556b = Collections.unmodifiableList(this.f61556b);
                    }
                    if ((i & 2) == 2) {
                        this.f61557c = Collections.unmodifiableList(this.f61557c);
                    }
                    try {
                        w780VarM87328y.m87375o();
                    } catch (IOException unused) {
                    } finally {
                        this.f61555a = evaVar.m40103e();
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
        if ((i & 1) == 1) {
            this.f61556b = Collections.unmodifiableList(this.f61556b);
        }
        if ((i & 2) == 2) {
            this.f61557c = Collections.unmodifiableList(this.f61557c);
        }
        try {
            w780VarM87328y.m87375o();
        } catch (IOException unused2) {
        } finally {
            this.f61555a = evaVar.m40103e();
        }
    }

    public ep60(ap60 ap60Var) {
        this.f61558d = -1;
        this.f61559e = (byte) -1;
        this.f61560f = -1;
        this.f61555a = ap60Var.f149263a;
    }
}
