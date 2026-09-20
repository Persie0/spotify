package p204p;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: loaded from: classes.dex */
public class ea00 implements x561 {

    /* JADX INFO: renamed from: a */
    public final SQLiteProgram f57561a;

    public ea00(SQLiteProgram sQLiteProgram) {
        this.f57561a = sQLiteProgram;
    }

    @Override // p204p.x561
    /* JADX INFO: renamed from: A */
    public final void mo38268A() {
        this.f57561a.clearBindings();
    }

    @Override // p204p.x561
    /* JADX INFO: renamed from: L0 */
    public final void mo38269L0(int i, String str) {
        this.f57561a.bindString(i, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f57561a.close();
    }

    @Override // p204p.x561
    /* JADX INFO: renamed from: l1 */
    public final void mo38270l1(double d, int i) {
        this.f57561a.bindDouble(i, d);
    }

    @Override // p204p.x561
    /* JADX INFO: renamed from: q */
    public final void mo38271q(byte[] bArr, int i) {
        this.f57561a.bindBlob(i, bArr);
    }

    @Override // p204p.x561
    /* JADX INFO: renamed from: u */
    public final void mo38272u(int i, long j) {
        this.f57561a.bindLong(i, j);
    }

    @Override // p204p.x561
    /* JADX INFO: renamed from: v */
    public final void mo38273v(int i) {
        this.f57561a.bindNull(i);
    }
}
