package p204p;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class z900 implements u561 {

    /* JADX INFO: renamed from: b */
    public static final String[] f280631b;

    /* JADX INFO: renamed from: c */
    public static final String[] f280632c;

    /* JADX INFO: renamed from: d */
    public static final Object f280633d;

    /* JADX INFO: renamed from: e */
    public static final Object f280634e;

    /* JADX INFO: renamed from: a */
    public final SQLiteDatabase f280635a;

    static {
        new oh5();
        f280631b = new String[]{"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
        f280632c = new String[0];
        f280633d = q3d0.m72078I(2, new ts4(4));
        f280634e = q3d0.m72078I(2, new ts4(5));
    }

    public z900(SQLiteDatabase sQLiteDatabase) {
        this.f280635a = sQLiteDatabase;
    }

    @Override // p204p.u561
    /* JADX INFO: renamed from: C */
    public final void mo82384C() {
        this.f280635a.beginTransaction();
    }

    @Override // p204p.u561
    /* JADX INFO: renamed from: E */
    public final void mo82385E() {
        this.f280635a.disableWriteAheadLogging();
    }

    @Override // p204p.u561
    /* JADX INFO: renamed from: F */
    public final void mo82386F(String str) {
        this.f280635a.execSQL(str);
    }

    @Override // p204p.u561
    /* JADX INFO: renamed from: F1 */
    public final int mo82387F1(ContentValues contentValues, Object[] objArr) {
        if (contentValues.size() == 0) {
            throw new IllegalArgumentException("Empty values");
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(f280631b[3]);
        sb.append("WorkSpec SET ");
        int i = 0;
        for (String str : contentValues.keySet()) {
            sb.append(i > 0 ? "," : "");
            sb.append(str);
            objArr2[i] = contentValues.get(str);
            sb.append("=?");
            i++;
        }
        for (int i2 = size; i2 < length; i2++) {
            objArr2[i2] = objArr[i2 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        fa00 fa00VarMo82388N0 = mo82388N0(sb.toString());
        kgg1.m56347j(fa00VarMo82388N0, objArr2);
        return fa00VarMo82388N0.f67402b.executeUpdateDelete();
    }

    @Override // p204p.u561
    /* JADX INFO: renamed from: N0 */
    public final fa00 mo82388N0(String str) {
        return new fa00(this.f280635a.compileStatement(str));
    }

    @Override // p204p.u561
    /* JADX INFO: renamed from: Q0 */
    public final void mo82389Q0() throws IllegalAccessException, InvocationTargetException {
        if (oh5.m66929h() == null || oh5.m66931j() == null) {
            mo82384C();
            return;
        }
        Method methodM66929h = oh5.m66929h();
        wj50.m88279p(methodM66929h);
        Method methodM66931j = oh5.m66931j();
        wj50.m88279p(methodM66931j);
        Object objInvoke = methodM66931j.invoke(this.f280635a, null);
        if (objInvoke == null) {
            throw new IllegalStateException("Required value was null.");
        }
        methodM66929h.invoke(objInvoke, 0, null, 0, null);
    }

    @Override // p204p.u561
    /* JADX INFO: renamed from: T */
    public final boolean mo82390T() {
        return this.f280635a.enableWriteAheadLogging();
    }

    @Override // p204p.u561
    /* JADX INFO: renamed from: V0 */
    public final void mo82391V0(Object[] objArr) {
        this.f280635a.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    @Override // p204p.u561
    /* JADX INFO: renamed from: W */
    public final void mo82392W() {
        this.f280635a.setTransactionSuccessful();
    }

    /* JADX INFO: renamed from: a */
    public final Cursor m95613a(String str) {
        return mo82394d0(new u4l0(19, str, (Object) null));
    }

    @Override // p204p.u561
    /* JADX INFO: renamed from: a0 */
    public final void mo82393a0() {
        this.f280635a.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f280635a.close();
    }

    @Override // p204p.u561
    /* JADX INFO: renamed from: d0 */
    public final Cursor mo82394d0(y561 y561Var) {
        final x900 x900Var = new x900(y561Var);
        return this.f280635a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: p.y900
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) x900Var.mo24818M(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, y561Var.mo34938h(), f280632c, null);
    }

    @Override // p204p.u561
    /* JADX INFO: renamed from: f0 */
    public final void mo82395f0() {
        this.f280635a.endTransaction();
    }

    @Override // p204p.u561
    public final boolean isOpen() {
        return this.f280635a.isOpen();
    }

    @Override // p204p.u561
    /* JADX INFO: renamed from: w */
    public final boolean mo82396w() {
        return this.f280635a.inTransaction();
    }

    @Override // p204p.u561
    /* JADX INFO: renamed from: x1 */
    public final boolean mo82397x1() {
        return this.f280635a.isWriteAheadLoggingEnabled();
    }
}
