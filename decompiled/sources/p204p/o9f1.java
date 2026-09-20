package p204p;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class o9f1 extends o0f1 {

    /* JADX INFO: renamed from: b */
    public int f163027b;

    /* JADX INFO: renamed from: c */
    public final int f163028c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ s9f1 f163029d;

    public o9f1(s9f1 s9f1Var) {
        super(2);
        this.f163029d = s9f1Var;
        this.f163027b = 0;
        this.f163028c = s9f1Var.mo69377e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f163027b < this.f163028c;
    }

    @Override // p204p.o0f1
    public final byte zza() {
        int i = this.f163027b;
        if (i >= this.f163028c) {
            throw new NoSuchElementException();
        }
        this.f163027b = i + 1;
        return this.f163029d.mo69376d(i);
    }
}
