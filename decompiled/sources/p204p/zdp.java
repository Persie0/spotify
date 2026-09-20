package p204p;

import android.database.Cursor;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class zdp implements Closeable {

    /* JADX INFO: renamed from: a */
    public final Cursor f281774a;

    public zdp(Cursor cursor) {
        this.f281774a = cursor;
    }

    /* JADX INFO: renamed from: a */
    public final p2s m95949a() {
        return aep.m25737e(this.f281774a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f281774a.close();
    }

    public final boolean moveToNext() {
        Cursor cursor = this.f281774a;
        return cursor.moveToPosition(cursor.getPosition() + 1);
    }
}
