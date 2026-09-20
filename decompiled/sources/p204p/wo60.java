package p204p;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: classes11.dex */
public final class wo60 extends a210 {

    /* JADX INFO: renamed from: g */
    public static final wo60 f253384g;

    /* JADX INFO: renamed from: h */
    public static final uo60 f253385h = new uo60(0);

    /* JADX INFO: renamed from: a */
    public final hva f253386a;

    /* JADX INFO: renamed from: b */
    public int f253387b;

    /* JADX INFO: renamed from: c */
    public int f253388c;

    /* JADX INFO: renamed from: d */
    public int f253389d;

    /* JADX INFO: renamed from: e */
    public byte f253390e;

    /* JADX INFO: renamed from: f */
    public int f253391f;

    static {
        wo60 wo60Var = new wo60();
        f253384g = wo60Var;
        wo60Var.f253388c = 0;
        wo60Var.f253389d = 0;
    }

    public wo60() {
        this.f253390e = (byte) -1;
        this.f253391f = -1;
        this.f253386a = hva.f95637a;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: a */
    public final int mo24390a() {
        int i = this.f253391f;
        if (i != -1) {
            return i;
        }
        int iM87319g = (this.f253387b & 1) == 1 ? w780.m87319g(1, this.f253388c) : 0;
        if ((this.f253387b & 2) == 2) {
            iM87319g += w780.m87319g(2, this.f253389d);
        }
        int size = this.f253386a.size() + iM87319g;
        this.f253391f = size;
        return size;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: b */
    public final n110 mo24391b() {
        return new vo60(0);
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: c */
    public final n110 mo24392c() {
        vo60 vo60Var = new vo60(0);
        vo60Var.m86085h(this);
        return vo60Var;
    }

    @Override // p204p.AbstractC2155n8
    /* JADX INFO: renamed from: d */
    public final void mo24393d(w780 w780Var) throws IOException {
        mo24390a();
        if ((this.f253387b & 1) == 1) {
            w780Var.m87344P(1, this.f253388c);
        }
        if ((this.f253387b & 2) == 2) {
            w780Var.m87344P(2, this.f253389d);
        }
        w780Var.m87349U(this.f253386a);
    }

    @Override // p204p.rre0
    public final boolean isInitialized() {
        if (this.f253390e == 1) {
            return true;
        }
        this.f253390e = (byte) 1;
        return true;
    }

    public wo60(pwe pweVar) {
        this.f253390e = (byte) -1;
        this.f253391f = -1;
        boolean z = false;
        this.f253388c = 0;
        this.f253389d = 0;
        eva evaVar = new eva(0);
        w780 w780VarM87328y = w780.m87328y(evaVar, 1);
        while (!z) {
            try {
                try {
                    try {
                        int iM71249o = pweVar.m71249o();
                        if (iM71249o != 0) {
                            if (iM71249o == 8) {
                                this.f253387b |= 1;
                                this.f253388c = pweVar.m71246l();
                            } else if (iM71249o != 16) {
                                if (!pweVar.m71252r(iM71249o, w780VarM87328y)) {
                                }
                            } else {
                                this.f253387b |= 2;
                                this.f253389d = pweVar.m71246l();
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
                    this.f253386a = evaVar.m40103e();
                }
                throw th;
            }
        }
        try {
            w780VarM87328y.m87375o();
        } catch (IOException unused2) {
        } finally {
            this.f253386a = evaVar.m40103e();
        }
    }

    public wo60(vo60 vo60Var) {
        this.f253390e = (byte) -1;
        this.f253391f = -1;
        this.f253386a = vo60Var.f149263a;
    }
}
