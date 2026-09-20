package p204p;

import android.content.AsyncQueryHandler;
import android.content.ContentResolver;
import android.database.Cursor;

/* JADX INFO: loaded from: classes.dex */
public final class eyb extends AsyncQueryHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fyb f64005a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eyb(fyb fybVar, ContentResolver contentResolver) {
        super(contentResolver);
        this.f64005a = fybVar;
    }

    @Override // android.content.AsyncQueryHandler
    public final void onQueryComplete(int i, Object obj, Cursor cursor) {
        fyb fybVar = this.f64005a;
        if (cursor == null) {
            fybVar.m33101j(0);
            return;
        }
        int columnIndex = cursor.getColumnIndex("CarConnectionState");
        if (columnIndex < 0) {
            fybVar.m33101j(0);
        } else if (cursor.moveToNext()) {
            fybVar.m33101j(Integer.valueOf(cursor.getInt(columnIndex)));
        } else {
            fybVar.m33101j(0);
        }
    }
}
