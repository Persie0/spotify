package p204p;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y65 {
    /* JADX INFO: renamed from: a */
    public static boolean m92947a(DragEvent dragEvent, TextView textView, Activity activity) {
        iij t1jVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                t1jVar = new t1j(clipData, 3);
            } else {
                jij jijVar = new jij();
                jijVar.f112766b = clipData;
                jijVar.f112767c = 3;
                t1jVar = jijVar;
            }
            mec1.m61558j(textView, t1jVar.build());
            return true;
        } finally {
            textView.endBatchEdit();
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m92948b(DragEvent dragEvent, View view, Activity activity) {
        iij t1jVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            t1jVar = new t1j(clipData, 3);
        } else {
            jij jijVar = new jij();
            jijVar.f112766b = clipData;
            jijVar.f112767c = 3;
            t1jVar = jijVar;
        }
        mec1.m61558j(view, t1jVar.build());
        return true;
    }
}
