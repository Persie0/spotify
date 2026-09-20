package p204p;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.database.DatabaseIOException;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aep {

    /* JADX INFO: renamed from: d */
    public static final String f14929d = m25739g(3, 4);

    /* JADX INFO: renamed from: e */
    public static final String[] f14930e = {"id", "mime_type", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};

    /* JADX INFO: renamed from: a */
    public final elo f14931a;

    /* JADX INFO: renamed from: b */
    public final Object f14932b = new Object();

    /* JADX INFO: renamed from: c */
    public boolean f14933c;

    public aep(elo eloVar) {
        this.f14931a = eloVar;
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m25736a(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            String str2 = h0b1.f86200a;
            for (String str3 : str.split(",", -1)) {
                String[] strArrSplit = str3.split("\\.", -1);
                c95.m31855u(strArrSplit.length == 3);
                arrayList.add(new ji51(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2])));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public static p2s m25737e(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        umn umnVar = new umn(Uri.parse(string2), string);
        umnVar.m83487y(cursor.getString(1));
        umnVar.m83488z(m25736a(cursor.getString(3)));
        if (blob.length <= 0) {
            blob = null;
        }
        umnVar.m83486x(blob);
        umnVar.m83484v(cursor.getString(4));
        umnVar.m83485w(cursor.getBlob(5));
        j9s j9sVarM83472g = umnVar.m83472g();
        l8s l8sVar = new l8s();
        l8sVar.f130925a = cursor.getLong(13);
        l8sVar.f130926b = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new p2s(j9sVarM83472g, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, l8sVar);
    }

    /* JADX INFO: renamed from: f */
    public static p2s m25738f(Cursor cursor) {
        String str;
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        umn umnVar = new umn(Uri.parse(string2), string);
        String string3 = cursor.getString(1);
        if ("dash".equals(string3)) {
            str = "application/dash+xml";
        } else if ("hls".equals(string3)) {
            str = "application/x-mpegURL";
        } else {
            str = "ss".equals(string3) ? "application/vnd.ms-sstr+xml" : "video/x-unknown";
        }
        umnVar.m83487y(str);
        umnVar.m83488z(m25736a(cursor.getString(3)));
        umnVar.m83484v(cursor.getString(4));
        umnVar.m83485w(cursor.getBlob(5));
        j9s j9sVarM83472g = umnVar.m83472g();
        l8s l8sVar = new l8s();
        l8sVar.f130925a = cursor.getLong(13);
        l8sVar.f130926b = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new p2s(j9sVarM83472g, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, l8sVar);
    }

    /* JADX INFO: renamed from: g */
    public static String m25739g(int... iArr) {
        if (iArr.length == 0) {
            return "1";
        }
        StringBuilder sb = new StringBuilder("state IN (");
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                sb.append(',');
            }
            sb.append(iArr[i]);
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    public static ArrayList m25740h(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!h0b1.m46320k0(sQLiteDatabase, "ExoPlayerDownloads")) {
            return arrayList;
        }
        Cursor cursorQuery = sQLiteDatabase.query("ExoPlayerDownloads", new String[]{"id", ContextTrack.Metadata.KEY_TITLE, "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(m25738f(cursorQuery));
            } catch (Throwable th) {
                if (cursorQuery == null) {
                    throw th;
                }
                try {
                    cursorQuery.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final void m25741b() {
        synchronized (this.f14932b) {
            if (this.f14933c) {
                return;
            }
            try {
                int iM56260a = kfb1.m56260a(this.f14931a.getReadableDatabase(), 0, "");
                if (iM56260a != 3) {
                    SQLiteDatabase writableDatabase = this.f14931a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        kfb1.m56261b(writableDatabase, 0, "", 3);
                        ArrayList arrayListM25740h = iM56260a == 2 ? m25740h(writableDatabase) : new ArrayList();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS ExoPlayerDownloads");
                        writableDatabase.execSQL("CREATE TABLE ExoPlayerDownloads (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        Iterator it = arrayListM25740h.iterator();
                        while (it.hasNext()) {
                            m25745j((p2s) it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                this.f14933c = true;
            } catch (SQLException e) {
                throw new DatabaseIOException(e);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final Cursor m25742c(String str, String[] strArr) throws DatabaseIOException {
        try {
            return this.f14931a.getReadableDatabase().query("ExoPlayerDownloads", f14930e, str, strArr, null, null, "start_time_ms ASC");
        } catch (SQLiteException e) {
            throw new DatabaseIOException(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final p2s m25743d(String str) throws DatabaseIOException {
        m25741b();
        try {
            Cursor cursorM25742c = m25742c("id = ?", new String[]{str});
            try {
                if (cursorM25742c.getCount() == 0) {
                    cursorM25742c.close();
                    return null;
                }
                cursorM25742c.moveToNext();
                p2s p2sVarM25737e = m25737e(cursorM25742c);
                cursorM25742c.close();
                return p2sVarM25737e;
            } catch (Throwable th) {
                if (cursorM25742c != null) {
                    try {
                        cursorM25742c.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLiteException e) {
            throw new DatabaseIOException(e);
        }
        throw new DatabaseIOException(e);
    }

    /* JADX INFO: renamed from: i */
    public final void m25744i(p2s p2sVar) throws DatabaseIOException {
        m25741b();
        try {
            m25745j(p2sVar, this.f14931a.getWritableDatabase());
        } catch (SQLiteException e) {
            throw new DatabaseIOException(e);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m25745j(p2s p2sVar, SQLiteDatabase sQLiteDatabase) {
        j9s j9sVar = p2sVar.f173420a;
        byte[] bArr = j9sVar.f110238e;
        if (bArr == null) {
            bArr = h0b1.f86201b;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", j9sVar.f110234a);
        contentValues.put("mime_type", j9sVar.f110236c);
        contentValues.put("uri", j9sVar.f110235b.toString());
        List list = j9sVar.f110237d;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            ji51 ji51Var = (ji51) list.get(i);
            sb.append(ji51Var.f112668a);
            sb.append('.');
            sb.append(ji51Var.f112669b);
            sb.append('.');
            sb.append(ji51Var.f112670c);
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        contentValues.put("stream_keys", sb.toString());
        contentValues.put("custom_cache_key", j9sVar.f110239f);
        contentValues.put("data", j9sVar.f110240g);
        contentValues.put("state", Integer.valueOf(p2sVar.f173421b));
        contentValues.put("start_time_ms", Long.valueOf(p2sVar.f173422c));
        contentValues.put("update_time_ms", Long.valueOf(p2sVar.f173423d));
        contentValues.put("content_length", Long.valueOf(p2sVar.f173424e));
        contentValues.put("stop_reason", Integer.valueOf(p2sVar.f173425f));
        contentValues.put("failure_reason", Integer.valueOf(p2sVar.f173426g));
        contentValues.put("percent_downloaded", Float.valueOf(p2sVar.m68965b()));
        contentValues.put("bytes_downloaded", Long.valueOf(p2sVar.m68964a()));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow("ExoPlayerDownloads", null, contentValues);
    }

    /* JADX INFO: renamed from: k */
    public final void m25746k() throws DatabaseIOException {
        m25741b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.f14931a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, "state = 2", null);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m25747l() throws DatabaseIOException {
        m25741b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.f14931a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, null, null);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m25748m(int i, String str) throws DatabaseIOException {
        m25741b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i));
            this.f14931a.getWritableDatabase().update("ExoPlayerDownloads", contentValues, f14929d + " AND id = ?", new String[]{str});
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }
}
