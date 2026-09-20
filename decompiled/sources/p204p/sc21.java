package p204p;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class sc21 extends mjv0 {

    /* JADX INFO: renamed from: g */
    public boolean f207636g;

    public sc21() {
        this.f144345a = null;
        this.f144346b = new ArrayList();
        this.f144347c = 120L;
        this.f144348d = 120L;
        this.f144349e = 250L;
        this.f144350f = 250L;
        this.f207636g = true;
    }

    @Override // p204p.mjv0
    /* JADX INFO: renamed from: a */
    public boolean mo61991a(dkv0 dkv0Var, dkv0 dkv0Var2, qr8 qr8Var, qr8 qr8Var2) {
        int i;
        int i2;
        int i3 = qr8Var.f191759a;
        int i4 = qr8Var.f191760b;
        if (dkv0Var2.m36319B()) {
            int i5 = qr8Var.f191759a;
            i2 = qr8Var.f191760b;
            i = i5;
        } else {
            i = qr8Var2.f191759a;
            i2 = qr8Var2.f191760b;
        }
        return mo33400l(dkv0Var, dkv0Var2, i3, i4, i, i2);
    }

    /* JADX INFO: renamed from: k */
    public abstract void mo33399k(dkv0 dkv0Var);

    /* JADX INFO: renamed from: l */
    public abstract boolean mo33400l(dkv0 dkv0Var, dkv0 dkv0Var2, int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: m */
    public abstract boolean mo33401m(dkv0 dkv0Var, int i, int i2, int i3, int i4);

    /* JADX INFO: renamed from: n */
    public abstract void mo33402n(dkv0 dkv0Var);
}
