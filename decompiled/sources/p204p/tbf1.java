package p204p;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class tbf1 extends o0f1 {

    /* JADX INFO: renamed from: b */
    public final chc0 f218846b;

    /* JADX INFO: renamed from: c */
    public o0f1 f218847c;

    public tbf1(ubf1 ubf1Var) {
        super(2);
        this.f218846b = new chc0(ubf1Var);
        this.f218847c = m80394a();
    }

    /* JADX INFO: renamed from: a */
    public final o9f1 m80394a() {
        chc0 chc0Var = this.f218846b;
        if (chc0Var.hasNext()) {
            return new o9f1(chc0Var.m32763b());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f218847c != null;
    }

    @Override // p204p.o0f1
    public final byte zza() {
        o0f1 o0f1Var = this.f218847c;
        if (o0f1Var == null) {
            throw new NoSuchElementException();
        }
        byte bZza = o0f1Var.zza();
        if (!this.f218847c.hasNext()) {
            this.f218847c = m80394a();
        }
        return bZza;
    }
}
