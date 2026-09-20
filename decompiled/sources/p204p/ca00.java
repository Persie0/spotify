package p204p;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class ca00 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f35684h = 0;

    /* JADX INFO: renamed from: a */
    public final Context f35685a;

    /* JADX INFO: renamed from: b */
    public final oyz f35686b;

    /* JADX INFO: renamed from: c */
    public final ov50 f35687c;

    /* JADX INFO: renamed from: d */
    public final boolean f35688d;

    /* JADX INFO: renamed from: e */
    public boolean f35689e;

    /* JADX INFO: renamed from: f */
    public final yhr0 f35690f;

    /* JADX INFO: renamed from: g */
    public boolean f35691g;

    public ca00(Context context, String str, final oyz oyzVar, final ov50 ov50Var, boolean z) {
        super(context, str, null, ov50Var.f170422b, new DatabaseErrorHandler() { // from class: p.aa00
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = ca00.f35684h;
                wj50.m88279p(sQLiteDatabase);
                z900 z900VarM90669O1 = xgg1.m90669O1(oyzVar, sQLiteDatabase);
                ov50Var.getClass();
                SQLiteDatabase sQLiteDatabase2 = z900VarM90669O1.f280635a;
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        ov50.m68119d(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        z900VarM90669O1.close();
                    } catch (IOException unused2) {
                    }
                    if (attachedDbs != null) {
                        return;
                    }
                } finally {
                    if (attachedDbs != null) {
                        Iterator<T> it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            ov50.m68119d((String) ((Pair) it.next()).second);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            ov50.m68119d(path2);
                        }
                    }
                }
            }
        });
        this.f35685a = context;
        this.f35686b = oyzVar;
        this.f35687c = ov50Var;
        this.f35688d = z;
        this.f35690f = new yhr0(str == null ? UUID.randomUUID().toString() : str, context.getCacheDir(), false);
    }

    /* JADX INFO: renamed from: a */
    public final u561 m31984a(boolean z) {
        yhr0 yhr0Var = this.f35690f;
        try {
            yhr0Var.m93692a((this.f35691g || getDatabaseName() == null) ? false : true);
            this.f35689e = false;
            SQLiteDatabase sQLiteDatabaseM31985c = m31985c(z);
            if (!this.f35689e) {
                return xgg1.m90669O1(this.f35686b, sQLiteDatabaseM31985c);
            }
            close();
            return m31984a(z);
        } finally {
            yhr0Var.m93693b();
        }
    }

    /* JADX INFO: renamed from: c */
    public final SQLiteDatabase m31985c(boolean z) throws Throwable {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.f35691g;
        Context context = this.f35685a;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                parentFile.toString();
            }
        }
        try {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                wj50.m88279p(writableDatabase);
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            wj50.m88279p(readableDatabase3);
            return readableDatabase3;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    readableDatabase2 = getWritableDatabase();
                    wj50.m88279p(readableDatabase2);
                } else {
                    readableDatabase2 = getReadableDatabase();
                    wj50.m88279p(readableDatabase2);
                }
                return readableDatabase2;
            } catch (Throwable th) {
                th = th;
                if (th instanceof ba00) {
                    ba00 ba00Var = (ba00) th;
                    int iM38547C = edb.m38547C(ba00Var.f25060a);
                    th = ba00Var.f25061b;
                    if (iM38547C == 0 || iM38547C == 1 || iM38547C == 2 || iM38547C == 3) {
                        throw th;
                    }
                    if (iM38547C != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.f35688d) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    if (z) {
                        readableDatabase = getWritableDatabase();
                        wj50.m88279p(readableDatabase);
                    } else {
                        readableDatabase = getReadableDatabase();
                        wj50.m88279p(readableDatabase);
                    }
                    return readableDatabase;
                } catch (ba00 e) {
                    throw e.f25061b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        yhr0 yhr0Var = this.f35690f;
        try {
            yhr0Var.m93692a(yhr0Var.f272954a);
            super.close();
            this.f35686b.m68570a();
            this.f35691g = false;
        } finally {
            yhr0Var.m93693b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        boolean z = this.f35689e;
        ov50 ov50Var = this.f35687c;
        if (!z && ov50Var.f170422b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            xgg1.m90669O1(this.f35686b, sQLiteDatabase);
            ov50Var.getClass();
        } catch (Throwable th) {
            throw new ba00(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.f35687c.mo41860k(xgg1.m90669O1(this.f35686b, sQLiteDatabase));
        } catch (Throwable th) {
            throw new ba00(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f35689e = true;
        try {
            this.f35687c.mo41861l(xgg1.m90669O1(this.f35686b, sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new ba00(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f35689e) {
            try {
                this.f35687c.mo41862n(xgg1.m90669O1(this.f35686b, sQLiteDatabase));
            } catch (Throwable th) {
                throw new ba00(5, th);
            }
        }
        this.f35691g = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f35689e = true;
        try {
            this.f35687c.mo41863q(xgg1.m90669O1(this.f35686b, sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new ba00(3, th);
        }
    }
}
