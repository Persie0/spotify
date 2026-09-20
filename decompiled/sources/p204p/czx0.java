package p204p;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class czx0 implements w8x, qg61, zje {

    /* JADX INFO: renamed from: f */
    public static final keu f43652f = new keu("proto");

    /* JADX INFO: renamed from: a */
    public final ogy0 f43653a;

    /* JADX INFO: renamed from: b */
    public final wre f43654b;

    /* JADX INFO: renamed from: c */
    public final wre f43655c;

    /* JADX INFO: renamed from: d */
    public final u08 f43656d;

    /* JADX INFO: renamed from: e */
    public final i4t0 f43657e;

    public czx0(wre wreVar, wre wreVar2, u08 u08Var, ogy0 ogy0Var, i4t0 i4t0Var) {
        this.f43653a = ogy0Var;
        this.f43654b = wreVar;
        this.f43655c = wreVar2;
        this.f43656d = u08Var;
        this.f43657e = i4t0Var;
    }

    /* JADX INFO: renamed from: c */
    public static Long m34468c(SQLiteDatabase sQLiteDatabase, t28 t28Var) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(t28Var.f216447a, String.valueOf(ner0.m64271a(t28Var.f216449c))));
        byte[] bArr = t28Var.f216448b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m34469i(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((r18) it.next()).m74471a());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: k */
    public static Object m34470k(Cursor cursor, azx0 azx0Var) {
        try {
            return azx0Var.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    /* JADX INFO: renamed from: a */
    public final SQLiteDatabase m34471a() {
        ogy0 ogy0Var = this.f43653a;
        Objects.requireNonNull(ogy0Var);
        wre wreVar = this.f43655c;
        long jMo66379d = wreVar.mo66379d();
        while (true) {
            try {
                return ogy0Var.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (wreVar.mo66379d() >= ((long) this.f43656d.f225406c) + jMo66379d) {
                    throw new SynchronizationException("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f43653a.close();
    }

    /* JADX INFO: renamed from: e */
    public final Object m34472e(azx0 azx0Var) {
        SQLiteDatabase sQLiteDatabaseM34471a = m34471a();
        sQLiteDatabaseM34471a.beginTransaction();
        try {
            Object objApply = azx0Var.apply(sQLiteDatabaseM34471a);
            sQLiteDatabaseM34471a.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseM34471a.endTransaction();
        }
    }

    /* JADX INFO: renamed from: f */
    public final ArrayList m34473f(SQLiteDatabase sQLiteDatabase, t28 t28Var, int i) {
        ArrayList arrayList = new ArrayList();
        Long lM34468c = m34468c(sQLiteDatabase, t28Var);
        if (lM34468c == null) {
            return arrayList;
        }
        m34470k(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lM34468c.toString()}, null, null, null, String.valueOf(i)), new jt4(this, arrayList, t28Var, 25));
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public final void m34474g(long j, upa0 upa0Var, String str) {
        m34472e(new f3l(str, j, upa0Var));
    }

    /* JADX INFO: renamed from: h */
    public final Object m34475h(pg61 pg61Var) {
        SQLiteDatabase sQLiteDatabaseM34471a = m34471a();
        x4t0 x4t0Var = new x4t0(17);
        wre wreVar = this.f43655c;
        long jMo66379d = wreVar.mo66379d();
        while (true) {
            try {
                sQLiteDatabaseM34471a.beginTransaction();
                try {
                    Object objMo36422a = pg61Var.mo36422a();
                    sQLiteDatabaseM34471a.setTransactionSuccessful();
                    return objMo36422a;
                } finally {
                    sQLiteDatabaseM34471a.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (wreVar.mo66379d() >= ((long) this.f43656d.f225406c) + jMo66379d) {
                    x4t0Var.mo98394apply(e);
                    throw null;
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
