package p204p;

import android.database.sqlite.SQLiteStatement;

/* JADX INFO: loaded from: classes.dex */
public final class fa00 extends ea00 implements x561 {

    /* JADX INFO: renamed from: b */
    public final SQLiteStatement f67402b;

    public fa00(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f67402b = sQLiteStatement;
    }

    /* JADX INFO: renamed from: a */
    public final int m41115a() {
        return this.f67402b.executeUpdateDelete();
    }
}
