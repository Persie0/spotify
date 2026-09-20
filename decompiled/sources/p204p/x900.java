package p204p;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x900 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ y561 f259254a;

    public /* synthetic */ x900(y561 y561Var) {
        this.f259254a = y561Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        wj50.m88279p(sQLiteQuery);
        this.f259254a.mo34937e(new ea00(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
