package p204p;

import android.view.ContentInfo;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jec1 {
    /* JADX INFO: renamed from: a */
    public static String[] m53092a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* JADX INFO: renamed from: b */
    public static lij m53093b(View view, lij lijVar) {
        ContentInfo contentInfoM59098c = lijVar.m59098c();
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoM59098c);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoM59098c ? lijVar : new lij(new t1j(contentInfoPerformReceiveContent));
    }

    /* JADX INFO: renamed from: c */
    public static void m53094c(View view, String[] strArr, cdl0 cdl0Var) {
        if (cdl0Var == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new kec1(cdl0Var));
        }
    }
}
